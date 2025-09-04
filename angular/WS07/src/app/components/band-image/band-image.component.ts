import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-band-image',
  standalone: false,
  templateUrl: './band-image.component.html',
  styleUrl: './band-image.component.css'
})
export class BandImageComponent implements OnInit{

  imageUrl!: string;

  constructor() { }

  ngOnInit(): void {
  }
}
