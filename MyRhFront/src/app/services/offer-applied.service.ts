import { HttpClient } from '@angular/common/http';
import { Injectable, inject } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class OfferAppliedService {

  constructor() { }
  private http = inject(HttpClient);
  private url = "http://localhost:8080/api/v1/";

  saveFile(file:File):Observable<any>{
    const formdata=new FormData ();
    formdata.append('file',file);
    return this.http.post(`${this.url}file/upload`, formdata,{ responseType: 'text' }); 
  }

  applied(nameFile:string,chercheur:string,offer:string):Observable<any>{
    const dataa={
      "status":false,
      "chercheur":chercheur,
      "offer":offer,
      "file":nameFile
    }
    console.log(nameFile);
    return this.http.post(`${this.url}chercheuroffer`, dataa);

  }

  formDataToJson(formData: FormData): string {
    const json: { [key: string]: any } = {};
    formData.forEach((value, key) => {
      json[key] = value;
    });
    return JSON.stringify(json);
  }

}
