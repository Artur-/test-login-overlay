import '@vaadin/vaadin-login';
import { customElement, html, LitElement } from 'lit-element';

@customElement('login-v2')
export class LoginV2 extends LitElement {
  render() {
    return html` <vaadin-login-overlay opened> </vaadin-login-overlay>`;
  }
}
