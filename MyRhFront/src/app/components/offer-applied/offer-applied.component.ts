import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Offer } from 'src/app/models/Offer';
import { OfferAppliedService } from 'src/app/services/offer-applied.service';
import { OfferService } from 'src/app/services/offer.service';
import Swal from 'sweetalert2'


@Component({
  selector: 'app-offer-applied',
  templateUrl: './offer-applied.component.html',
  styleUrls: ['./offer-applied.component.css']
})
export class OfferAppliedComponent implements OnInit {

  id:String|null="";
  Offer:any;
  selectedFile:File|null=null;
  fileName:any;
  chercheur:string="";
  offer:string="";
  
  

  constructor(private service:OfferService,private serviceFile:OfferAppliedService, private activatedRoute:ActivatedRoute,private rout:Router) {}
  ngOnInit(): void {
    this.id = this.activatedRoute.snapshot.paramMap.get("id")
    this.offer = this.activatedRoute.snapshot.paramMap.get("id") || ""
    this.louadOffer();
    
  }

  louadOffer(){
    this.service.getOneOffer(this.id).subscribe(
      {
        next:(data:Offer)=>{
          this.Offer=data
        },
        error(err){
          console.log("erure when fetch the offer");
          console.log(err);
        }
      }
    );
  }

  async setCHerchour(){
    const { value: identify } = await Swal.fire({
      title: 'enter your identify',
      input: 'text',
      inputLabel: 'Your email address',
      inputPlaceholder: 'Enter your email address'
    })
    
    if (identify) {
      this.chercheur=identify;
      this.applied();
    }
  }

  applied(){
    this.serviceFile.applied (this.fileName,this.chercheur,this.offer).subscribe(
      {
        next:(data:any)=>{
         console.log("applied good",data.text)
        this.rout.navigateByUrl('/')
        },
        error(err){
          
          console.log("erure when save the file ");
          console.log(err.error.text);

      
        }
      }
      );
  }
  uploadFile() {
    if (this.selectedFile) {
      
    this.serviceFile.saveFile (this.selectedFile).subscribe(
      {
        next:(data:any)=>{
         console.log("file is saved good")
         this.fileName=data
        },
        error(err){
          console.log("erure whensave the file ",err);
          console.log(err.error.text);

        }
      }
      );
    }
  }


  onFileSelected(event: any) {
    this.selectedFile = event.target.files[0];
    this.uploadFile();
  }


  
}
