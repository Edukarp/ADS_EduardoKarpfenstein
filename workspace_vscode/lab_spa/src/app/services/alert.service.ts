import { Injectable } from '@angular/core';
import Swal, {SweetAlertIcon} from 'sweetalert2'

@Injectable({
  providedIn: 'root'
})
export class AlertService {

  constructor() { }

  private showGenericAlert(
    title: string,
    mensage: string,
    icon: SweetAlertIcon
  ){
    Swal.fire(title, mensage, icon);
  }

  public error(title: string, mensage: string){
    this.showGenericAlert(title, mensage, 'error');
  }

  public sucess(title: string, mensage: string){
    this.showGenericAlert(title, mensage, 'success');
  }
}
