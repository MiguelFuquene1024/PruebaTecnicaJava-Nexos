import { Injectable } from '@angular/core';

import {ListamercanciaI}from '../../modelos/listamercancia.interface';
import {MercanciaI}from '../../modelos/mercancia.interface';
import{ResponseI}from '../../modelos/response.interface';

import {HttpClient,HttpHeaders} from '@angular/common/http';

import {from, Observable}from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class ApiService {
  url:string = "http://localhost:8081/api/mercancia/";
  constructor(private http:HttpClient) { }

  getMercancia():Observable<ListamercanciaI[]>{
    let direccion = this.url 
    return this.http.get<ListamercanciaI[]>(direccion);
  }

  getProducto(idMercancia:string):Observable<MercanciaI>{
    let direccion =this.url+idMercancia;
    return this.http.get<MercanciaI>(direccion);

  }

  putProducto(form:MercanciaI,idMercancia:string):Observable<ResponseI>{
    let direccion = this.url+idMercancia;
    return this.http.put<ResponseI>(direccion,form); 
  }
  deleteProducto(form:MercanciaI):Observable<ResponseI>{
    let direccion = this.url;
    let options={
      headers: new HttpHeaders({
        'conten-type':'application/json'
      }),
      body:form
    }
    return this.http.delete<ResponseI>(direccion,options);
  }

  postProducto(form:MercanciaI):Observable<ResponseI>{
    let direccion = this.url;
    return this.http.post<ResponseI>(direccion,form);
  }
}

