package com.example.application.views.helloworld;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.login.LoginOverlay;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.router.Route;

@Route(value = "login-v1")
@JsModule("./login-v1.ts")
@Tag("login-v1")
public class LoginV1 extends LitTemplate {

    @Id
    private LoginOverlay login;

    public LoginV1() {
        login.setOpened(true);
    }

}
