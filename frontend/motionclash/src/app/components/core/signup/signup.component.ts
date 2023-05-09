import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { CognitoUser, CognitoUserPool, CognitoUserAttribute } from 'amazon-cognito-identity-js';
import { CognitoService, IUser } from 'src/app/services/cognito.service';


@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent {
  email: string = "";
  password: string = "";
  code: string = ""
  verification: boolean = false;
  username: string = ""
  constructor(private router: Router, private cognitoService: CognitoService) { }

  onSubmit() {
    if(this.username == "")
      this.username = `${this.email}_${Date.now()}`;

    var user: IUser = {
      username: this.username,
      email: this.email,
      password: this.password,
      showPassword: false,
      code: this.code,
      name: this.email,
      SECRET_HASH: ''
    }
    if(!this.verification){
      this.cognitoService.signUp(user)
      this.verification = true
    } else {
      this.cognitoService.confirmSignUp(user)
    }
  }

}