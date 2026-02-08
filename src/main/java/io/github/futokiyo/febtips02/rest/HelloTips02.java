/*
 */
package io.github.futokiyo.febtips02.rest;


import io.github.futokiyo.febtips02.service.TodoService;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * インターセプターの挙動を確認する。
 *
 */

@Path("/")
@ApplicationScoped
public class HelloTips02 {

    private static Logger logger = LoggerFactory.getLogger(HelloTips02.class);

    @Inject
    private TodoService todoService;

    @GET
    @Path("/learn")
    @Produces(MediaType.TEXT_HTML)
    public String study() {

        StringBuilder returningSb = new StringBuilder("<html><body>");
        todoService.doLearn();

        returningSb.append("HelloTips02 # L</body></html>");

        return returningSb.toString();
    }

    @GET
    @Path("/prepare")
    @Produces(MediaType.TEXT_HTML)
    public String prepare() {
        StringBuilder returningSb = new StringBuilder("<html><body>");
        todoService.doPrepare();

        returningSb.append("HelloTips02 # P</body></html>");

        return returningSb.toString();
    }


}
