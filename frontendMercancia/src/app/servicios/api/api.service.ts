import { Injectable } from '@angular/core';

import {ListamercanciaI}from '../../modelos/listamercancia.interface';

import {Observable}from 'rxjs';

import {HttpClient,HttpHeaders} from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class ApiService {
  url:string = "http://localhost:8081/api/mercancia";
  constructor(private http:HttpClient) { }

  getMercancia():Observable<ListamercanciaI[]>{
    let direccion = this.url 
    return this.http.get<ListamercanciaI[]>(direccion);
  }
}

