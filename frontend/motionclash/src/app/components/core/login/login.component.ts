import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { CognitoUserPool, AuthenticationDetails, CognitoUser } from 'amazon-cognito-identity-js';
import { CognitoService, IUser } from 'src/app/services/cognito.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  email: string = "";
  password: string = "";

  constructor(private cognitoService: CognitoService, private router: Router){ }


  onSubmit() {
    var user: IUser = {
      username: "",
      email: this.email,
      password: this.password,
      showPassword: false,
      code: '',
      name: this.email,
      SECRET_HASH: ''
    }
    this.cognitoService.signIn(user).then(res => {
      this.router.navigate(['/'])
    })
  }
}