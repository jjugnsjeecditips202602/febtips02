package io.github.futokiyo.febtips02.task;

//import io.github.futokiyo.febtips02.aop.Logging;
import io.github.futokiyo.febtips02.solution.StartLoggerDelegation;
import jakarta.enterprise.context.RequestScoped;


@RequestScoped
public class Learn {
    private String msg;

    //@Logging
    public void prepare() {
        StartLoggerDelegation.printStartLog(this,"prepare");
    	System.out.println("準備する");
    }

    //@Logging
    public void study() {
        StartLoggerDelegation.printStartLog(this,"study");
        this.prepare();
        System.out.println("勉強する");
    }
}
