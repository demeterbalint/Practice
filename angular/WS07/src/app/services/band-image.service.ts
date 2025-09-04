import { Injectable } from '@angular/core';
import {Subject} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class BandImageService {

  private imageUrlUpdate: Subject<string>;

  constructor() { }
}
