import { Component, OnInit } from '@angular/core';
import { Offer } from 'src/app/models/Offer';
import { OfferService } from 'src/app/services/offer.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  offers: Offer[] = [];
  isempty:boolean=false;


  constructor(private service: OfferService) {}

  ngOnInit(): void {
    this.loadOffers();
  }
  loadOffers() {
    this.service.getOffers().subscribe({
      next:(data)=>{
        this.offers=data
        if(this.offers.length==0){
         this.isempty=true;
        }
        console.log(this.offers)
      },
      error (err){
        console.log("an error occurred while fetching offerss");
        console.log(err)
      }
    }
    
    );
  }
}
