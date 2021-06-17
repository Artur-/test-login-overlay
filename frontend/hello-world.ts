import '@vaadin/vaadin-login';
import { customElement, html, LitElement } from 'lit-element';

@customElement('hello-world')
export class HelloWorld extends LitElement {
  render() {
    return html` <vaadin-login-overlay id="login"> </vaadin-login-overlay>`;
  }
}
