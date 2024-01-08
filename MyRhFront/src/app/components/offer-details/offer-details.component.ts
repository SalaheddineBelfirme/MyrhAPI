import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Offer } from 'src/app/models/Offer';
import { OfferService } from 'src/app/services/offer.service';

@Component({
  selector: 'app-offer-details',
  templateUrl: './offer-details.component.html',
  styleUrls: ['./offer-details.component.css']
})
export class OfferDetailsComponent implements OnInit {

  id:String|null="";
  offer:any;

  constructor(private service:OfferService, private route:ActivatedRoute) {}
  ngOnInit(): void {
    this.id = this.route.snapshot.paramMap.get("id")
    this.louadOffer();
  
  }

  louadOffer(){
    this.service.getOneOffer(this.id).subscribe(
      {
        next:(data:Offer)=>{
          this.offer=data

        },
        error(err){
          console.log("erure when fetch the offer");
          console.log(err);

        }
      }
    );
  }

  switchStatus(status:boolean){
     this.service.switchStatus(this.id,status).subscribe(
      {
        next:(data:Offer)=>{
          this.offer=data;
        },
        error:(err)=>{
          console.log("erure when switch status of offer");
          console.log(err);
        }
      }
     )
     
  }

}
