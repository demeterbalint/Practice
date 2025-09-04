import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-band-picker',
  standalone: false,
  templateUrl: './band-picker.component.html',
  styleUrl: './band-picker.component.css'
})
export class BandPickerComponent implements OnInit {

  genre!: string;

  bands = [
    {genre: 'Pop', name: 'Michael Jackson', imgUrl: 'http://cdn.24.co.za/files/Cms/General/d/8643/8241de9073404c978f2558d8d48e0f14.png'},
    {genre: 'Pop', name: 'Rihanna', imgUrl: 'http://www.thetimes.co.uk/imageserver/image/methode%2Fsundaytimes%2Fprod%2Fweb%2Fbin%2Fff85b76c-8e52-11e7-a5a5-06bf2f3d8649.jpg?crop=2250%2C1266%2C0%2C117&resize=685'},
    {genre: 'Pop', name: 'Wellhello', imgUrl: 'https://welovebalaton.hu/i/fd/wellhello-mg-8967.exact1980w.jpg'},
    {genre: 'Rap', name: '2pac', imgUrl: 'https://images.complex.com/complex/images/c_limit,dpr_auto,q_90,w_720/fl_lossy,pg_1/ksihpjst147jvtxy8xn0/pac'},
    {genre: 'Rap', name: 'Ganxsta Döglégy Zoltán', imgUrl: 'https://ripost.hu/wp-content/uploads/kepadatbazis/thumbs/2017-10-06/e6eaadae4806a72d61019f8a9de8870b/web620.jpg'},
    {genre: 'Rap', name: '50cent', imgUrl: 'http://www.brooklynvegan.com/files/2019/02/50cent.jpg?zc=1&s=0&a=t&q=89&w=630'},
    {genre: 'Rock', name: 'AC/DC', imgUrl: 'https://townsquare.media/site/366/files/2014/11/83472616.jpg?w=980&q=75'},
    {genre: 'Rock', name: 'Guns \'n Roses', imgUrl: 'https://e3.365dm.com/19/05/768x432/guns-n-roses-rock-band-sky-news_4664679.jpg?20190510161439'},
    {genre: 'Rock', name: 'Tankcsapda', imgUrl: 'https://m.blog.hu/la/langologitarok/image/tankcsapda2017.jpg'},
    {genre: 'Metal', name: 'Darkest Hour', imgUrl: 'https://www.spirit-of-metal.com/les%20goupes/D/Darkest%20Hour/pics/c8eb_2.jpg'},
    {genre: 'Metal', name: 'Mastodon', imgUrl: 'https://vignette.wikia.nocookie.net/riffipedia/images/8/8c/Mastodon-2014.jpg/revision/latest?cb=20170321005333'},
    {genre: 'Metal', name: 'The Southern Oracle', imgUrl: 'https://zeneszoveg.hu/img/169852_101251926619256_100977143313401_6198_878121_o.jpg'},
  ];

  constructor() { }

  ngOnInit(): void {
  }

  displayBandImage(imageUrl: string) {

  }
}
