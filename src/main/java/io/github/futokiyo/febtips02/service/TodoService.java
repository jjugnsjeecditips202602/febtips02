package io.github.futokiyo.febtips02.service;

import io.github.futokiyo.febtips02.task.Learn;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class TodoService  {

    @Inject
    private Learn learn;



    public void doLearn(){
        learn.study();
    }

    public void doPrepare(){
        learn.prepare();
    }

}
