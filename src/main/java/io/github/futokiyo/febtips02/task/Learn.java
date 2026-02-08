package io.github.futokiyo.febtips02.task;

import io.github.futokiyo.febtips02.aop.Logging;
import jakarta.enterprise.context.RequestScoped;


@RequestScoped
public class Learn {
    private String msg;

    @Logging
    public void prepare() {
    	System.out.println("準備する");
    }

    @Logging
    public void study() {
        this.prepare();
        System.out.println("勉強する");
    }
}
