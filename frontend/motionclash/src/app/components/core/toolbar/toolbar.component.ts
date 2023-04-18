import { Component } from '@angular/core';
import { Race } from 'src/app/api';

@Component({
  selector: 'app-toolbar',
  templateUrl: './toolbar.component.html',
  styleUrls: ['./toolbar.component.css']
})
export class ToolbarComponent {
  userIsAuthenticated = false;
  races: Race[] = []
  onLoginClicked(){
    this.userIsAuthenticated = !this.userIsAuthenticated;
  }
}
  