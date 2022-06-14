import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EnqueueEventComponent } from './enqueue-event.component';

describe('EnqueueEventComponent', () => {
  let component: EnqueueEventComponent;
  let fixture: ComponentFixture<EnqueueEventComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EnqueueEventComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EnqueueEventComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
