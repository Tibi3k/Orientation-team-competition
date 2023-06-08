import { Component, OnInit } from '@angular/core';
import { ImageService } from 'src/app/api';

@Component({
  selector: 'app-landing',
  templateUrl: './landing.component.html',
  styleUrls: ['./landing.component.css']
})
export class LandingComponent implements OnInit{

  constructor(private imageService: ImageService){}

  ngOnInit(): void {
    this.imageService.apiImagesGet().subscribe(elements => console.log(elements))
  }


}
