import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  standalone: false,
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'WS07';

  protected genres = ['Pop', 'Rap', 'Rock', 'Metal'];
  protected chosenGenre!: string;

  choseGenre(genreIndex: number) {
    this.chosenGenre = this.genres[genreIndex];
  }
}
