import { TestBed } from '@angular/core/testing';

import { PersistantQueueService } from './persistant-queue.service';

describe('PersistantQueueService', () => {
  let service: PersistantQueueService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PersistantQueueService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
