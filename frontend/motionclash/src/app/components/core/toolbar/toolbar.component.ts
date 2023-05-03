import { Component, OnInit } from '@angular/core';
import { Race, UserService } from 'src/app/api';

@Component({
  selector: 'app-toolbar',
  templateUrl: './toolbar.component.html',
  styleUrls: ['./toolbar.component.css']
})
export class ToolbarComponent implements OnInit {
  constructor(private authService: UserService){}

  ngOnInit(): void {
    this.authService.isAuthenticated.subscribe(value => {
      this.userIsAuthenticated = value
    })
  }

  userIsAuthenticated = false;
  races: Race[] = []
  onLoginClicked(){
    this.authService.isAuthenticated.next(!this.userIsAuthenticated)
  }
}
  