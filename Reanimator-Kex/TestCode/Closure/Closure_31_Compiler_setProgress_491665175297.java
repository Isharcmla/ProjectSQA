package com.google.javascript.jscomp;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class Compiler_setProgress_491665175297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890567;
     Object term890573;

    public Compiler_setProgress_491665175297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term890567 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term890567, term890567.getClass(), "options", null);
        setField(term890567, term890567.getClass(), "passes", null);
        setField(term890567, term890567.getClass(), "externs", null);
        setField(term890567, term890567.getClass(), "modules", null);
        setField(term890567, term890567.getClass(), "moduleGraph", null);
        setField(term890567, term890567.getClass(), "inputs", null);
        setField(term890567, term890567.getClass(), "errorManager", null);
        setField(term890567, term890567.getClass(), "warningsGuard", null);
        setField(term890567, term890567.getClass(), "injectedLibraries", null);
        setField(term890567, term890567.getClass(), "externsRoot", null);
        setField(term890567, term890567.getClass(), "jsRoot", null);
        setField(term890567, term890567.getClass(), "externAndJsRoot", null);
        setField(term890567, term890567.getClass(), "inputsById", null);
        setField(term890567, term890567.getClass(), "sourceMap", null);
        setField(term890567, term890567.getClass(), "externExports", null);
        setIntField(term890567, term890567.getClass(), "uniqueNameId", 0);
        setBooleanField(term890567, term890567.getClass(), "useThreads", false);
        setBooleanField(term890567, term890567.getClass(), "hasRegExpGlobalReferences", false);
        setField(term890567, term890567.getClass(), "functionInformationMap", null);
        setField(term890567, term890567.getClass(), "debugLog", null);
        setField(term890567, term890567.getClass(), "defaultCodingConvention", null);
        setField(term890567, term890567.getClass(), "typeRegistry", null);
        setField(term890567, term890567.getClass(), "parserConfig", null);
        setField(term890567, term890567.getClass(), "abstractInterpreter", null);
        setField(term890567, term890567.getClass(), "typeValidator", null);
        setField(term890567, term890567.getClass(), "tracker", null);
        setField(term890567, term890567.getClass(), "oldErrorReporter", null);
        setField(term890567, term890567.getClass(), "defaultErrorReporter", null);
        setField(term890567, term890567.getClass(), "outStream", null);
        setField(term890567, term890567.getClass(), "globalRefMap", null);
        setDoubleField(term890567, term890567.getClass(), "progress", 0.0);
        setField(term890567, term890567.getClass(), "sanityCheck", null);
        setField(term890567, term890567.getClass(), "currentTracer", null);
        setField(term890567, term890567.getClass(), "currentPassName", null);
        setIntField(term890567, term890567.getClass(), "syntheticCodeId", 0);
        setField(term890567, term890567.getClass(), "recentChange", null);
        setField(term890567, term890567.getClass(), "codeChangeHandlers", null);
        setField(term890567, term890567.getClass(), "synthesizedExternsInput", null);
        setField(term890567, term890567.getClass(), "stage", null);
        term890573 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term890573;
        callMethod(klass, "setProgress", argTypes, term890567, args);
    }

};


