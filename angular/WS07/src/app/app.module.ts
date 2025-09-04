import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BandPickerComponent } from './components/band-picker/band-picker.component';
import { BandImageComponent } from './components/band-image/band-image.component';

@NgModule({
  declarations: [
    AppComponent,
    BandPickerComponent,
    BandImageComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
