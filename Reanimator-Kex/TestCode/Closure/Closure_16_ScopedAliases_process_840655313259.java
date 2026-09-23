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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class ScopedAliases_process_840655313259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163923;
     Object term164095;
     Object term164559;
     Object term164561;

    public ScopedAliases_process_840655313259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163923 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term164003 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term163923, term163923.getClass(), "compiler", term164003);
        term164095 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term164187 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term164095, term164095.getClass(), "type", 105);
        setIntField(term164187, term164187.getClass(), "type", 0);
        setField(term164187, term164187.getClass(), "parent", null);
        setField(term164095, term164095.getClass(), "parent", term164187);
        term164559 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term164560 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term164560, term164560.getClass(), "options", null);
        setField(term164560, term164560.getClass(), "passes", null);
        setField(term164560, term164560.getClass(), "externs", null);
        setField(term164560, term164560.getClass(), "modules", null);
        setField(term164560, term164560.getClass(), "moduleGraph", null);
        setField(term164560, term164560.getClass(), "inputs", null);
        setField(term164560, term164560.getClass(), "errorManager", null);
        setField(term164560, term164560.getClass(), "warningsGuard", null);
        setField(term164560, term164560.getClass(), "injectedLibraries", null);
        setField(term164560, term164560.getClass(), "externsRoot", null);
        setField(term164560, term164560.getClass(), "jsRoot", null);
        setField(term164560, term164560.getClass(), "externAndJsRoot", null);
        setField(term164560, term164560.getClass(), "inputsById", null);
        setField(term164560, term164560.getClass(), "sourceMap", null);
        setField(term164560, term164560.getClass(), "externExports", null);
        setIntField(term164560, term164560.getClass(), "uniqueNameId", 0);
        setBooleanField(term164560, term164560.getClass(), "useThreads", false);
        setBooleanField(term164560, term164560.getClass(), "hasRegExpGlobalReferences", false);
        setField(term164560, term164560.getClass(), "functionInformationMap", null);
        setField(term164560, term164560.getClass(), "debugLog", null);
        setField(term164560, term164560.getClass(), "defaultCodingConvention", null);
        setField(term164560, term164560.getClass(), "typeRegistry", null);
        setField(term164560, term164560.getClass(), "parserConfig", null);
        setField(term164560, term164560.getClass(), "abstractInterpreter", null);
        setField(term164560, term164560.getClass(), "typeValidator", null);
        setField(term164560, term164560.getClass(), "tracker", null);
        setField(term164560, term164560.getClass(), "oldErrorReporter", null);
        setField(term164560, term164560.getClass(), "defaultErrorReporter", null);
        setField(term164560, term164560.getClass(), "outStream", null);
        setField(term164560, term164560.getClass(), "globalRefMap", null);
        setDoubleField(term164560, term164560.getClass(), "progress", 0.0);
        setField(term164560, term164560.getClass(), "sanityCheck", null);
        setField(term164560, term164560.getClass(), "currentTracer", null);
        setField(term164560, term164560.getClass(), "currentPassName", null);
        setIntField(term164560, term164560.getClass(), "syntheticCodeId", 0);
        setField(term164560, term164560.getClass(), "recentChange", null);
        setField(term164560, term164560.getClass(), "codeChangeHandlers", null);
        setField(term164560, term164560.getClass(), "synthesizedExternsInput", null);
        setField(term164560, term164560.getClass(), "stage", null);
        setField(term164559, term164559.getClass(), "compiler", term164560);
        setField(term164559, term164559.getClass(), "preprocessorSymbolTable", null);
        setField(term164559, term164559.getClass(), "transformationHandler", null);
        term164561 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term164562 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term164561, term164561.getClass(), "number", 0.0);
        setIntField(term164561, term164561.getClass(), "type", 105);
        setField(term164561, term164561.getClass(), "next", null);
        setField(term164561, term164561.getClass(), "first", null);
        setField(term164561, term164561.getClass(), "last", null);
        setField(term164561, term164561.getClass(), "propListHead", null);
        setIntField(term164561, term164561.getClass(), "sourcePosition", 0);
        setField(term164561, term164561.getClass(), "jsType", null);
        setDoubleField(term164562, term164562.getClass(), "number", 0.0);
        setIntField(term164562, term164562.getClass(), "type", 0);
        setField(term164562, term164562.getClass(), "next", null);
        setField(term164562, term164562.getClass(), "first", null);
        setField(term164562, term164562.getClass(), "last", null);
        setField(term164562, term164562.getClass(), "propListHead", null);
        setIntField(term164562, term164562.getClass(), "sourcePosition", 0);
        setField(term164562, term164562.getClass(), "jsType", null);
        setField(term164562, term164562.getClass(), "parent", null);
        setField(term164561, term164561.getClass(), "parent", term164562);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term164095;
        callMethod(klass, "process", argTypes, term163923, args);
        assertTrue(recursiveEquals(term163923, term164559));
        assertTrue(recursiveEquals(term164095, null));
    }

};


