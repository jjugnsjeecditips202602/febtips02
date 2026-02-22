package io.github.futokiyo.febtips02.solution;

public class StartLoggerDelegation {

    private static StartLogger startLogger;

    public static boolean hasStartLogger() {
        return startLogger!=null;
    }

    public static void setStartLogger(StartLogger sl){
        startLogger = sl;
    }

    public static void printStartLog(Object object, String methodName){
        if(startLogger==null){
            return;
        }
        startLogger.printMethodStart(object, methodName);
    }
}
