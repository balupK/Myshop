
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {environment} from './../../environments/environment'
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class UserProfileService {

  httpOptions = {
    headers: new HttpHeaders({ 
      'Access-Control-Allow-Origin':'*',
      'Access-Control-Allow-Credentials':'true',
      'content-type':'application/json'
    })
  };
   
  
  BASE_URl = "http://localhost:8088/";
  constructor(private http: HttpClient) { }

  getUserProfile() {
    
    return this.http.get(this.BASE_URl + "customer/getAll");//, this.httpOptions);
  }

  postUserProfile(profile) {
    return this.http.post(this.BASE_URl + "myshop/customer/custdetails",profile);
  }

  postUserProfileWithFile(profile) {
    return this.http.post(this.BASE_URl + "user/addCustomerWithFile",profile);
  }

  postInvoice(invoiceData) {
    return this.http.post(this.BASE_URl + "invoice/new",invoiceData);
  }

}