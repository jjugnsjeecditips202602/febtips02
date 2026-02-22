package io.github.futokiyo.febtips02.solution;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Initialized;
import jakarta.enterprise.event.Observes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ApplicationScoped
public class StartLoggerInitializer {

    private static final Logger logger = LoggerFactory.getLogger(StartLogger.class);

    public void handle(@Observes @Initialized(ApplicationScoped.class) Object event){

        StartLoggerDelegation.setStartLogger((object, methodName) -> {
            String clazzName = object.getClass().getCanonicalName();
            logger.info("{}#{} start.", clazzName, methodName);
        });
    }
}
