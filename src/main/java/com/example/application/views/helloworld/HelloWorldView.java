package com.example.application.views.helloworld;

import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.login.LoginOverlay;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.router.Route;

@Route(value = "")
@JsModule("./hello-world.ts")
public class HelloWorldView extends HorizontalLayout {

    @Id
    private LoginOverlay login;

    public HelloWorldView() {
        login.setOpened(true);
    }

}
