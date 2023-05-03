import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LandingComponent } from './components/frames/landing/landing.component';
import { RacesComponent } from './components/frames/races/races.component';
import { RaceDetailsComponent } from './components/frames/race-details/race-details.component';
import { NewRaceComponent } from './components/frames/new-race/new-race.component';

const routes: Routes = [
  {path: '', component: LandingComponent},
  {path: 'myraces', component: RacesComponent},
  {path: 'upcoming', component: RacesComponent},
  {path: 'past', component: RacesComponent},
  {path: 'race/new', component: NewRaceComponent},
  {path: 'race/:raceId', component: RaceDetailsComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
