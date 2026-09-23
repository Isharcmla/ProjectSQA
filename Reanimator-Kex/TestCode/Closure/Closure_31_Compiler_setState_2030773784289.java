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

public class Compiler_setState_2030773784289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890519;

    public Compiler_setState_2030773784289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term890519 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term890519, term890519.getClass(), "options", null);
        setField(term890519, term890519.getClass(), "passes", null);
        setField(term890519, term890519.getClass(), "externs", null);
        setField(term890519, term890519.getClass(), "modules", null);
        setField(term890519, term890519.getClass(), "moduleGraph", null);
        setField(term890519, term890519.getClass(), "inputs", null);
        setField(term890519, term890519.getClass(), "errorManager", null);
        setField(term890519, term890519.getClass(), "warningsGuard", null);
        setField(term890519, term890519.getClass(), "injectedLibraries", null);
        setField(term890519, term890519.getClass(), "externsRoot", null);
        setField(term890519, term890519.getClass(), "jsRoot", null);
        setField(term890519, term890519.getClass(), "externAndJsRoot", null);
        setField(term890519, term890519.getClass(), "inputsById", null);
        setField(term890519, term890519.getClass(), "sourceMap", null);
        setField(term890519, term890519.getClass(), "externExports", null);
        setIntField(term890519, term890519.getClass(), "uniqueNameId", 0);
        setBooleanField(term890519, term890519.getClass(), "useThreads", false);
        setBooleanField(term890519, term890519.getClass(), "hasRegExpGlobalReferences", false);
        setField(term890519, term890519.getClass(), "functionInformationMap", null);
        setField(term890519, term890519.getClass(), "debugLog", null);
        setField(term890519, term890519.getClass(), "defaultCodingConvention", null);
        setField(term890519, term890519.getClass(), "typeRegistry", null);
        setField(term890519, term890519.getClass(), "parserConfig", null);
        setField(term890519, term890519.getClass(), "abstractInterpreter", null);
        setField(term890519, term890519.getClass(), "typeValidator", null);
        setField(term890519, term890519.getClass(), "tracker", null);
        setField(term890519, term890519.getClass(), "oldErrorReporter", null);
        setField(term890519, term890519.getClass(), "defaultErrorReporter", null);
        setField(term890519, term890519.getClass(), "outStream", null);
        setField(term890519, term890519.getClass(), "globalRefMap", null);
        setDoubleField(term890519, term890519.getClass(), "progress", 0.0);
        setField(term890519, term890519.getClass(), "sanityCheck", null);
        setField(term890519, term890519.getClass(), "currentTracer", null);
        setField(term890519, term890519.getClass(), "currentPassName", null);
        setIntField(term890519, term890519.getClass(), "syntheticCodeId", 0);
        setField(term890519, term890519.getClass(), "recentChange", null);
        setField(term890519, term890519.getClass(), "codeChangeHandlers", null);
        setField(term890519, term890519.getClass(), "synthesizedExternsInput", null);
        setField(term890519, term890519.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Compiler$IntermediateState");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setState", argTypes, term890519, args);
    }

};


