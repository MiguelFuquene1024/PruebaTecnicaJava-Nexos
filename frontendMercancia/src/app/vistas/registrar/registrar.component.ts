import { Component, OnInit } from '@angular/core';
import { MercanciaI } from '../../modelos/mercancia.interface';
import {ResponseI}from '../../modelos/response.interface';
import { ActivatedRoute, Router } from '@angular/router';
import {AlertasService}from '../../servicios/alertas/alertas.service';
import { ApiService } from '../../servicios/api/api.service';
import { FormGroup, FormControl, Validators } from '@angular/forms';


@Component({
  selector: 'app-registrar',
  templateUrl: './registrar.component.html',
  styleUrls: ['./registrar.component.css']
})
export class RegistrarComponent implements OnInit {

  registroForm = new FormGroup({
    idMercancia:new FormControl(''),
    nombreProducto: new FormControl(''),
    cantidad: new FormControl(''),
    fechaIngreso: new FormControl(''),
    usuario: new FormControl('')
  });

  constructor(private api:ApiService,private router:Router,private alert:AlertasService) { }

  postForm(form:MercanciaI){
    this.api.postProducto(form).subscribe(data=>{
      console.log(data);
    })
  }
  ngOnInit(): void {
  }

  salir(){
    this.router.navigate(['home'])
  }
  
}
