import {inject, Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import { Observable } from 'rxjs';
import { Offer } from '../models/Offer';
@Injectable({
  providedIn: 'root'
})
export class OfferService {

  constructor() { }
  private http = inject(HttpClient);
  private url = "http://localhost:8080/api/v1/offer"; 

  getOffers(): Observable<Offer[]> {
    return this.http.get<Offer[]>(`${this.url}`);
    
    }

    getOneOffer(id:String|null):Observable<Offer>{
      return this.http.get<Offer>(`${this.url}/`+id)  
    }
    switchStatus(id:String|null,status:boolean):Observable<Offer>{
      return this.http.get<Offer>(`${this.url}/`+id+`/`+status)
    }
}
