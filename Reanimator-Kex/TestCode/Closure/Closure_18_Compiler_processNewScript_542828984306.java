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

public class Compiler_processNewScript_542828984306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term997558;

    public Compiler_processNewScript_542828984306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term997558 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term997558, term997558.getClass(), "options", null);
        setField(term997558, term997558.getClass(), "passes", null);
        setField(term997558, term997558.getClass(), "externs", null);
        setField(term997558, term997558.getClass(), "modules", null);
        setField(term997558, term997558.getClass(), "moduleGraph", null);
        setField(term997558, term997558.getClass(), "inputs", null);
        setField(term997558, term997558.getClass(), "errorManager", null);
        setField(term997558, term997558.getClass(), "warningsGuard", null);
        setField(term997558, term997558.getClass(), "injectedLibraries", null);
        setField(term997558, term997558.getClass(), "externsRoot", null);
        setField(term997558, term997558.getClass(), "jsRoot", null);
        setField(term997558, term997558.getClass(), "externAndJsRoot", null);
        setField(term997558, term997558.getClass(), "inputsById", null);
        setField(term997558, term997558.getClass(), "sourceMap", null);
        setField(term997558, term997558.getClass(), "externExports", null);
        setIntField(term997558, term997558.getClass(), "uniqueNameId", 0);
        setBooleanField(term997558, term997558.getClass(), "useThreads", false);
        setBooleanField(term997558, term997558.getClass(), "hasRegExpGlobalReferences", false);
        setField(term997558, term997558.getClass(), "functionInformationMap", null);
        setField(term997558, term997558.getClass(), "debugLog", null);
        setField(term997558, term997558.getClass(), "defaultCodingConvention", null);
        setField(term997558, term997558.getClass(), "typeRegistry", null);
        setField(term997558, term997558.getClass(), "parserConfig", null);
        setField(term997558, term997558.getClass(), "abstractInterpreter", null);
        setField(term997558, term997558.getClass(), "typeValidator", null);
        setField(term997558, term997558.getClass(), "tracker", null);
        setField(term997558, term997558.getClass(), "oldErrorReporter", null);
        setField(term997558, term997558.getClass(), "defaultErrorReporter", null);
        setField(term997558, term997558.getClass(), "outStream", null);
        setField(term997558, term997558.getClass(), "globalRefMap", null);
        setDoubleField(term997558, term997558.getClass(), "progress", 0.0);
        setField(term997558, term997558.getClass(), "sanityCheck", null);
        setField(term997558, term997558.getClass(), "currentTracer", null);
        setField(term997558, term997558.getClass(), "currentPassName", null);
        setIntField(term997558, term997558.getClass(), "syntheticCodeId", 0);
        setField(term997558, term997558.getClass(), "recentChange", null);
        setField(term997558, term997558.getClass(), "codeChangeHandlers", null);
        setField(term997558, term997558.getClass(), "synthesizedExternsInput", null);
        setField(term997558, term997558.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JsAst");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "processNewScript", argTypes, term997558, args);
    }

};


