import '@vaadin/vaadin-login';
import { customElement, html, LitElement } from 'lit-element';

@customElement('login-v1')
export class LoginV1 extends LitElement {
  render() {
    return html` <vaadin-login-overlay id="login"> </vaadin-login-overlay>`;
  }
}
