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
import java.lang.Integer;

public class Compiler_getSourceRegion_1542567742280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term997396;
     Object term997402;

    public Compiler_getSourceRegion_1542567742280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term997396 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term997396, term997396.getClass(), "options", null);
        setField(term997396, term997396.getClass(), "passes", null);
        setField(term997396, term997396.getClass(), "externs", null);
        setField(term997396, term997396.getClass(), "modules", null);
        setField(term997396, term997396.getClass(), "moduleGraph", null);
        setField(term997396, term997396.getClass(), "inputs", null);
        setField(term997396, term997396.getClass(), "errorManager", null);
        setField(term997396, term997396.getClass(), "warningsGuard", null);
        setField(term997396, term997396.getClass(), "injectedLibraries", null);
        setField(term997396, term997396.getClass(), "externsRoot", null);
        setField(term997396, term997396.getClass(), "jsRoot", null);
        setField(term997396, term997396.getClass(), "externAndJsRoot", null);
        setField(term997396, term997396.getClass(), "inputsById", null);
        setField(term997396, term997396.getClass(), "sourceMap", null);
        setField(term997396, term997396.getClass(), "externExports", null);
        setIntField(term997396, term997396.getClass(), "uniqueNameId", 0);
        setBooleanField(term997396, term997396.getClass(), "useThreads", false);
        setBooleanField(term997396, term997396.getClass(), "hasRegExpGlobalReferences", false);
        setField(term997396, term997396.getClass(), "functionInformationMap", null);
        setField(term997396, term997396.getClass(), "debugLog", null);
        setField(term997396, term997396.getClass(), "defaultCodingConvention", null);
        setField(term997396, term997396.getClass(), "typeRegistry", null);
        setField(term997396, term997396.getClass(), "parserConfig", null);
        setField(term997396, term997396.getClass(), "abstractInterpreter", null);
        setField(term997396, term997396.getClass(), "typeValidator", null);
        setField(term997396, term997396.getClass(), "tracker", null);
        setField(term997396, term997396.getClass(), "oldErrorReporter", null);
        setField(term997396, term997396.getClass(), "defaultErrorReporter", null);
        setField(term997396, term997396.getClass(), "outStream", null);
        setField(term997396, term997396.getClass(), "globalRefMap", null);
        setDoubleField(term997396, term997396.getClass(), "progress", 0.0);
        setField(term997396, term997396.getClass(), "sanityCheck", null);
        setField(term997396, term997396.getClass(), "currentTracer", null);
        setField(term997396, term997396.getClass(), "currentPassName", null);
        setIntField(term997396, term997396.getClass(), "syntheticCodeId", 0);
        setField(term997396, term997396.getClass(), "recentChange", null);
        setField(term997396, term997396.getClass(), "codeChangeHandlers", null);
        setField(term997396, term997396.getClass(), "synthesizedExternsInput", null);
        setField(term997396, term997396.getClass(), "stage", null);
        term997402 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term997402;
        callMethod(klass, "getSourceRegion", argTypes, term997396, args);
    }

};


