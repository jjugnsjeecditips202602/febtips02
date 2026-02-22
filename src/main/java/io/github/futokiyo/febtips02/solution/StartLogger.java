package io.github.futokiyo.febtips02.solution;


@FunctionalInterface
public interface StartLogger {
    public void printMethodStart(Object object, String methodName);
}
