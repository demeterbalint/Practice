import {Component, OnInit} from '@angular/core';
import {BandImageService} from "../../services/band-image.service";

@Component({
  selector: 'app-band-image',
  standalone: false,
  templateUrl: './band-image.component.html',
  styleUrl: './band-image.component.css'
})
export class BandImageComponent implements OnInit{

  imageUrl!: string;

  constructor(private bandImageService: BandImageService) {
    this.bandImageService.imageUrlUpdate.subscribe(imageUrl => {
      this.imageUrl = imageUrl;
    });
  }

  ngOnInit(): void {
  }
}
