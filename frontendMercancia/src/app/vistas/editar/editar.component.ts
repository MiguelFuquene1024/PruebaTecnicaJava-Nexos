import { DeclareFunctionStmt, NONE_TYPE } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { MercanciaI } from '../../modelos/mercancia.interface';
import {ResponseI}from '../../modelos/response.interface';
import {AlertasService}from '../../servicios/alertas/alertas.service';
import { ApiService } from '../../servicios/api/api.service';
import { FormGroup, FormControl, Validators } from '@angular/forms';
@Component({
  selector: 'app-editar',
  templateUrl: './editar.component.html',
  styleUrls: ['./editar.component.css']
})
export class EditarComponent implements OnInit {

  constructor(private activerouter: ActivatedRoute, private router: Router, private api: ApiService,private alertas:AlertasService) { }

  /*datosProducto =():MercanciaI=>({
    id:'',
    nombreProducto:'',
    cantidad:'',
    fechaIngreso:'',
    usuario:''
  });*/
  datosProducto: MercanciaI = {} as MercanciaI;


  editarForm = new FormGroup({
    idMercancia:new FormControl(''),
    nombreProducto: new FormControl(''),
    cantidad: new FormControl(''),
    fechaIngreso: new FormControl(''),
    usuario: new FormControl('')
  });

  ngOnInit(): void {
    let mercanciaid = this.activerouter.snapshot.paramMap.get('id');
    if (mercanciaid) {
      this.api.getProducto(mercanciaid).subscribe(data => {
        this.datosProducto = data;
        this.editarForm.setValue({
          'idMercancia':this.activerouter.snapshot.paramMap.get('id'),
          'nombreProducto': this.datosProducto.nombreProducto,
          'cantidad': this.datosProducto.cantidad,
          'fechaIngreso': this.datosProducto.fechaIngreso,
          'usuario': this.datosProducto.usuario
        });
      })
    }
  }
  postForm(form: MercanciaI) {

    let mercanciaid = this.activerouter.snapshot.paramMap.get('id');
    if (mercanciaid) {
      this.api.putProducto(form, mercanciaid).subscribe(data => {
      let respuesta:ResponseI = data;
      console.log(data)
      console.log(respuesta.status);
      
      if(data){
        this.alertas.showSuccess('Datos modificados correctamente','Hecho');
      }else{
        this.alertas.showError('El nombre del producto debe ser unico','Error');
      }
      
      })
    }
  }
  eliminarMercancia() {
      let datos: MercanciaI = this.editarForm.value;
      this.api.deleteProducto(datos).subscribe(data => {
        console.log(data)
        console.log(data.status)
        let respuesta:ResponseI = data;
      if(data){
        this.alertas.showSuccess('Producto eliminado','Hecho');
        this.router.navigate(['home']);
      }else{
        this.alertas.showError('Solo puede eliminarlo el usuario que registro el producto','Error');
      }
      })
  }

  salir(){
    this.router.navigate(['home'])
  }
}
