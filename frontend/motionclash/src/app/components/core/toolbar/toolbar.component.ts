import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Race, UserService } from 'src/app/api';
import { CognitoService } from 'src/app/services/cognito.service';

@Component({
  selector: 'app-toolbar',
  templateUrl: './toolbar.component.html',
  styleUrls: ['./toolbar.component.css']
})
export class ToolbarComponent implements OnInit {
  constructor(private authService: UserService, private router: Router){}

  ngOnInit(): void {
    this.authService.isAuthenticated.subscribe(value => {
      this.userIsAuthenticated = value
    })
  }

  userIsAuthenticated = false;
  races: Race[] = []
  onLoginClicked(){
    if(!this.userIsAuthenticated)
      this.router.navigate(['/login'])
    this.authService.isAuthenticated.next(!this.userIsAuthenticated)
  }

  onSignUpClicked(){
    this.router.navigate(['/signup'])
  }
}
  