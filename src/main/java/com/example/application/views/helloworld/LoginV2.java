package com.example.application.views.helloworld;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.router.Route;

@Route(value = "login-v2")
@JsModule("./login-v2.ts")
@Tag("login-v2")
public class LoginV2 extends LitTemplate {

    public LoginV2() {
    }

}
