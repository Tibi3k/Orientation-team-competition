import { Component, Inject, Input, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Race } from 'src/app/api';

@Component({
  selector: 'app-race-details',
  templateUrl: './race-details.component.html',
  styleUrls: ['./race-details.component.css']
})
export class RaceDetailsComponent implements OnInit {

  constructor(private route: ActivatedRoute) {}

  ngOnInit(): void {
    if(this.race == undefined)
    this.route.params.subscribe(params => {
      const raceId = params["raceId"];
    })
  }

  race: Race | undefined;

  
}
