import { Component, OnInit } from '@angular/core';
import {EmployeeService} from '../services/employee.service';
import {Employee} from '../models/Employee';

@Component({
  selector: 'app-onboarding',
  templateUrl: './onboarding.component.html',
  styleUrls: ['./onboarding.component.css']
})
export class OnboardingComponent implements OnInit {
  fname: string;
  lname: string;
  mname: string;

  constructor(private employeeService: EmployeeService) { }

  ngOnInit(): void {
  }

  register(): void {
    const employee: Employee = {employeeID: null, firstName: this.fname, lastName: this.lname, middleName: this.mname};
    this.employeeService.createEmployee(employee).subscribe();
  }
}
