import { Component, OnInit } from '@angular/core';
import { Race } from 'src/app/api';

@Component({
  selector: 'app-race-list',
  templateUrl: './race-list.component.html',
  styleUrls: ['./race-list.component.css']
})
export class RaceListComponent implements OnInit {
  races: Race[] = []

  ngOnInit() {
    this.races = [
      {id: '00000000-000000000', name: 'Bartók Béla emlékverseny', startDate: '2023.11.12'},
      {id: '00000000-000000000', name: 'Bartók Béla emlékverseny', startDate: '2023.11.12'},
      {id: '00000000-000000000', name: 'Bartók Béla emlékverseny', startDate: '2023.11.12'},
      {id: '00000000-000000000', name: 'Bartók Béla emlékverseny', startDate: '2023.11.12'},
      {id: '00000000-000000000', name: 'Bartók Béla emlékverseny', startDate: '2023.11.12'},
    ]
  }


}
