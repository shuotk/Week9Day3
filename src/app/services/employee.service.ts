import { Injectable } from '@angular/core';
import { ApiService } from './api.service';
import { Observable } from 'rxjs';
import {Employee} from '../models/Employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private apiService: ApiService) { }

  createEmployee(employee: any): Observable<Employee> {
    return this.apiService.create('employees/add', employee);
  }

}
