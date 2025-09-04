import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  standalone: false,
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'WS07';

  private genres = ['Pop', 'Rap', 'Rock', 'Metal'];
  private chosenGenre!: string;

  choseGenre(genreIndex: number) {
    this.chosenGenre = this.genres[genreIndex];
  }
}
