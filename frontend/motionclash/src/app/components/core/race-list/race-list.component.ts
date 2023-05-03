import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Race } from 'src/app/api';

@Component({
  selector: 'app-race-list',
  templateUrl: './race-list.component.html',
  styleUrls: ['./race-list.component.css']
})
export class RaceListComponent implements OnInit {
  races: Race[] = []
  showCreateNew: boolean = false
  constructor(private activatedRoute: ActivatedRoute) {}
  ngOnInit() {
    this.races = [
      {id: '00000000-000000000', name: 'Bartók Béla emlékverseny', startDate: '2023.11.12'},
      {id: '00000000-000000000', name: 'Bartók Béla emlékverseny', startDate: '2023.11.12'},
      {id: '00000000-000000000', name: 'Bartók Béla emlékverseny', startDate: '2023.11.12'},
      {id: '00000000-000000000', name: 'Bartók Béla emlékverseny', startDate: '2023.11.12'},
      {id: '00000000-000000000', name: 'Bartók Béla emlékverseny', startDate: '2023.11.12'},
    ]
    this.activatedRoute.url.subscribe(url => {
      if(url[0].path == 'upcoming')
        this.showCreateNew = true 
    })
  }


}
