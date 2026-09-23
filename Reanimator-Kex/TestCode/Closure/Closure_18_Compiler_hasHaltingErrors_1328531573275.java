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

public class Compiler_hasHaltingErrors_1328531573275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term997364;

    public Compiler_hasHaltingErrors_1328531573275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term997364 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term997364, term997364.getClass(), "options", null);
        setField(term997364, term997364.getClass(), "passes", null);
        setField(term997364, term997364.getClass(), "externs", null);
        setField(term997364, term997364.getClass(), "modules", null);
        setField(term997364, term997364.getClass(), "moduleGraph", null);
        setField(term997364, term997364.getClass(), "inputs", null);
        setField(term997364, term997364.getClass(), "errorManager", null);
        setField(term997364, term997364.getClass(), "warningsGuard", null);
        setField(term997364, term997364.getClass(), "injectedLibraries", null);
        setField(term997364, term997364.getClass(), "externsRoot", null);
        setField(term997364, term997364.getClass(), "jsRoot", null);
        setField(term997364, term997364.getClass(), "externAndJsRoot", null);
        setField(term997364, term997364.getClass(), "inputsById", null);
        setField(term997364, term997364.getClass(), "sourceMap", null);
        setField(term997364, term997364.getClass(), "externExports", null);
        setIntField(term997364, term997364.getClass(), "uniqueNameId", 0);
        setBooleanField(term997364, term997364.getClass(), "useThreads", false);
        setBooleanField(term997364, term997364.getClass(), "hasRegExpGlobalReferences", false);
        setField(term997364, term997364.getClass(), "functionInformationMap", null);
        setField(term997364, term997364.getClass(), "debugLog", null);
        setField(term997364, term997364.getClass(), "defaultCodingConvention", null);
        setField(term997364, term997364.getClass(), "typeRegistry", null);
        setField(term997364, term997364.getClass(), "parserConfig", null);
        setField(term997364, term997364.getClass(), "abstractInterpreter", null);
        setField(term997364, term997364.getClass(), "typeValidator", null);
        setField(term997364, term997364.getClass(), "tracker", null);
        setField(term997364, term997364.getClass(), "oldErrorReporter", null);
        setField(term997364, term997364.getClass(), "defaultErrorReporter", null);
        setField(term997364, term997364.getClass(), "outStream", null);
        setField(term997364, term997364.getClass(), "globalRefMap", null);
        setDoubleField(term997364, term997364.getClass(), "progress", 0.0);
        setField(term997364, term997364.getClass(), "sanityCheck", null);
        setField(term997364, term997364.getClass(), "currentTracer", null);
        setField(term997364, term997364.getClass(), "currentPassName", null);
        setIntField(term997364, term997364.getClass(), "syntheticCodeId", 0);
        setField(term997364, term997364.getClass(), "recentChange", null);
        setField(term997364, term997364.getClass(), "codeChangeHandlers", null);
        setField(term997364, term997364.getClass(), "synthesizedExternsInput", null);
        setField(term997364, term997364.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasHaltingErrors", argTypes, term997364, args);
    }

};


