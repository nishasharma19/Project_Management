import { TestBed } from '@angular/core/testing';

import { SubtaskServiceService } from './subtask-service.service';

describe('SubtaskServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: SubtaskServiceService = TestBed.get(SubtaskServiceService);
    expect(service).toBeTruthy();
  });
});
