import { TestBed } from '@angular/core/testing';

import { OfferAppliedService } from './offer-applied.service';

describe('OfferAppliedService', () => {
  let service: OfferAppliedService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(OfferAppliedService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
