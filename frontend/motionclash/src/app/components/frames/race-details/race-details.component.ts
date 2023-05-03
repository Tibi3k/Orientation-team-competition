import { Component, Inject, Input, OnInit } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { Race, UserService } from 'src/app/api';

@Component({
  selector: 'app-race-details',
  templateUrl: './race-details.component.html',
  styleUrls: ['./race-details.component.css']
})
export class RaceDetailsComponent implements OnInit {

  constructor(private route: ActivatedRoute,
              private authService: UserService) {}

  emailFormControl = new FormControl('', [Validators.required]);

  displayedColumns: string[] = ['name', 'latitude', 'longitude'];

  isUserAuthenticated = false;
  ngOnInit(): void {
    if(this.race == undefined)
    this.route.params.subscribe(params => {
      const raceId = params["raceId"];
      this.race = {
        id: "09000000-90900000",
        startDate: "2023.03.29",
        endDate: "2023.03.29",
        startHour: "10:00:00",
        endHour: "18:00:00",
        name: 'Bartók Béla emlékverseny',
        waypoints: [
          {latitude: 72.1231414, longitude: 72.1231414, name: "Old rock"},
          {latitude: 72.1231414, longitude: 72.1231414, name: "Old rock"},
          {latitude: 72.1231414, longitude: 72.1231414, name: "Old rock"},
          {latitude: 72.1231414, longitude: 72.1231414, name: "Old rock"},
          {latitude: 72.1231414, longitude: 72.1231414, name: "Old rock"},
          {latitude: 72.1231414, longitude: 72.1231414, name: "Old rock"},
        ]
      }
    })

    this.authService.isAuthenticated.subscribe(value => {
      this.isUserAuthenticated = value
    })
  }

  race: Race | undefined;

  
}
