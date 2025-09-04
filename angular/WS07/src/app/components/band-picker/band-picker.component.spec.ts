import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BandPickerComponent } from './band-picker.component';

describe('BandPickerComponent', () => {
  let component: BandPickerComponent;
  let fixture: ComponentFixture<BandPickerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [BandPickerComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BandPickerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
