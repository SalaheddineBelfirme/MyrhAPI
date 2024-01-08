import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OfferAppliedComponent } from './offer-applied.component';

describe('OfferAppliedComponent', () => {
  let component: OfferAppliedComponent;
  let fixture: ComponentFixture<OfferAppliedComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ OfferAppliedComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(OfferAppliedComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
