import { TestBed } from '@angular/core/testing';

import { BandImageService } from './band-image.service';

describe('BandImageService', () => {
  let service: BandImageService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(BandImageService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
