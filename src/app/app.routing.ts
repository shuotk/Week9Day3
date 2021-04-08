import {OnboardingComponent} from './onboarding/onboarding.component';
import {Routes} from '@angular/router';

export const AppRoutes: Routes = [
  {
    path: '**',
    component: OnboardingComponent
  }
];
