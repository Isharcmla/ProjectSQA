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

public class Compiler_setProgress_491665175303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term997538;
     Object term997544;

    public Compiler_setProgress_491665175303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term997538 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term997538, term997538.getClass(), "options", null);
        setField(term997538, term997538.getClass(), "passes", null);
        setField(term997538, term997538.getClass(), "externs", null);
        setField(term997538, term997538.getClass(), "modules", null);
        setField(term997538, term997538.getClass(), "moduleGraph", null);
        setField(term997538, term997538.getClass(), "inputs", null);
        setField(term997538, term997538.getClass(), "errorManager", null);
        setField(term997538, term997538.getClass(), "warningsGuard", null);
        setField(term997538, term997538.getClass(), "injectedLibraries", null);
        setField(term997538, term997538.getClass(), "externsRoot", null);
        setField(term997538, term997538.getClass(), "jsRoot", null);
        setField(term997538, term997538.getClass(), "externAndJsRoot", null);
        setField(term997538, term997538.getClass(), "inputsById", null);
        setField(term997538, term997538.getClass(), "sourceMap", null);
        setField(term997538, term997538.getClass(), "externExports", null);
        setIntField(term997538, term997538.getClass(), "uniqueNameId", 0);
        setBooleanField(term997538, term997538.getClass(), "useThreads", false);
        setBooleanField(term997538, term997538.getClass(), "hasRegExpGlobalReferences", false);
        setField(term997538, term997538.getClass(), "functionInformationMap", null);
        setField(term997538, term997538.getClass(), "debugLog", null);
        setField(term997538, term997538.getClass(), "defaultCodingConvention", null);
        setField(term997538, term997538.getClass(), "typeRegistry", null);
        setField(term997538, term997538.getClass(), "parserConfig", null);
        setField(term997538, term997538.getClass(), "abstractInterpreter", null);
        setField(term997538, term997538.getClass(), "typeValidator", null);
        setField(term997538, term997538.getClass(), "tracker", null);
        setField(term997538, term997538.getClass(), "oldErrorReporter", null);
        setField(term997538, term997538.getClass(), "defaultErrorReporter", null);
        setField(term997538, term997538.getClass(), "outStream", null);
        setField(term997538, term997538.getClass(), "globalRefMap", null);
        setDoubleField(term997538, term997538.getClass(), "progress", 0.0);
        setField(term997538, term997538.getClass(), "sanityCheck", null);
        setField(term997538, term997538.getClass(), "currentTracer", null);
        setField(term997538, term997538.getClass(), "currentPassName", null);
        setIntField(term997538, term997538.getClass(), "syntheticCodeId", 0);
        setField(term997538, term997538.getClass(), "recentChange", null);
        setField(term997538, term997538.getClass(), "codeChangeHandlers", null);
        setField(term997538, term997538.getClass(), "synthesizedExternsInput", null);
        setField(term997538, term997538.getClass(), "stage", null);
        term997544 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term997544;
        callMethod(klass, "setProgress", argTypes, term997538, args);
    }

};


