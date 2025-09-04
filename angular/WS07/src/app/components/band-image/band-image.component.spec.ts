import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BandImageComponent } from './band-image.component';

describe('BandImageComponent', () => {
  let component: BandImageComponent;
  let fixture: ComponentFixture<BandImageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [BandImageComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BandImageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
