import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { OnboardingComponent } from './onboarding/onboarding.component';
import {FormsModule} from '@angular/forms';
import {RouterModule} from '@angular/router';
import {AppRoutes} from './app.routing';
import {HttpClientModule} from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    OnboardingComponent
  ],
    imports: [
        HttpClientModule,
        BrowserModule,
        FormsModule,
        RouterModule,
        RouterModule.forRoot(AppRoutes, {
          useHash: true,
          relativeLinkResolution: 'legacy'
        })
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
