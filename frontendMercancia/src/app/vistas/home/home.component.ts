import { Component, OnInit } from '@angular/core';
import {ApiService} from '../../servicios/api/api.service';
import{Router}from '@angular/router';

import {ListamercanciaI} from '../../modelos/listamercancia.interface';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  
  mercancias:ListamercanciaI[]=[];
  constructor(private api:ApiService,private router:Router) { }

  

  ngOnInit(): void {
    this.api.getMercancia().subscribe(data=>{
      this.mercancias = data;
    })
  }

  editarMercancia(idMercancia:number){
    this.router.navigate(['editar',idMercancia]);
  }
  
  registrarMercancia(){
    this.router.navigate(['registrar']);
  }

  
  
}
