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

public class CheckSideEffects_process_152266774633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14338;
     Object term14488;
     Object term15340;
     Object term15342;

    public CheckSideEffects_process_152266774633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14338 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        Object term14418 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term14338, term14338.getClass(), "compiler", term14418);
        term14488 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14558 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14628 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14488, term14488.getClass(), "type", 0);
        setField(term14488, term14488.getClass(), "parent", null);
        setField(term14558, term14558.getClass(), "next", null);
        setIntField(term14558, term14558.getClass(), "type", 0);
        setField(term14628, term14628.getClass(), "next", null);
        setIntField(term14628, term14628.getClass(), "type", 0);
        setField(term14628, term14628.getClass(), "first", null);
        setField(term14558, term14558.getClass(), "first", term14628);
        setField(term14488, term14488.getClass(), "first", term14558);
        term15340 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        Object term15341 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term15340, term15340.getClass(), "level", null);
        setField(term15340, term15340.getClass(), "problemNodes", null);
        setField(term15341, term15341.getClass(), "options", null);
        setField(term15341, term15341.getClass(), "passes", null);
        setField(term15341, term15341.getClass(), "externs", null);
        setField(term15341, term15341.getClass(), "modules", null);
        setField(term15341, term15341.getClass(), "moduleGraph", null);
        setField(term15341, term15341.getClass(), "inputs", null);
        setField(term15341, term15341.getClass(), "errorManager", null);
        setField(term15341, term15341.getClass(), "warningsGuard", null);
        setField(term15341, term15341.getClass(), "injectedLibraries", null);
        setField(term15341, term15341.getClass(), "externsRoot", null);
        setField(term15341, term15341.getClass(), "jsRoot", null);
        setField(term15341, term15341.getClass(), "externAndJsRoot", null);
        setField(term15341, term15341.getClass(), "inputsById", null);
        setField(term15341, term15341.getClass(), "sourceMap", null);
        setField(term15341, term15341.getClass(), "externExports", null);
        setIntField(term15341, term15341.getClass(), "uniqueNameId", 0);
        setBooleanField(term15341, term15341.getClass(), "useThreads", false);
        setBooleanField(term15341, term15341.getClass(), "hasRegExpGlobalReferences", false);
        setField(term15341, term15341.getClass(), "functionInformationMap", null);
        setField(term15341, term15341.getClass(), "debugLog", null);
        setField(term15341, term15341.getClass(), "defaultCodingConvention", null);
        setField(term15341, term15341.getClass(), "typeRegistry", null);
        setField(term15341, term15341.getClass(), "parserConfig", null);
        setField(term15341, term15341.getClass(), "abstractInterpreter", null);
        setField(term15341, term15341.getClass(), "typeValidator", null);
        setField(term15341, term15341.getClass(), "tracker", null);
        setField(term15341, term15341.getClass(), "oldErrorReporter", null);
        setField(term15341, term15341.getClass(), "defaultErrorReporter", null);
        setField(term15341, term15341.getClass(), "outStream", null);
        setField(term15341, term15341.getClass(), "globalRefMap", null);
        setDoubleField(term15341, term15341.getClass(), "progress", 0.0);
        setField(term15341, term15341.getClass(), "sanityCheck", null);
        setField(term15341, term15341.getClass(), "currentTracer", null);
        setField(term15341, term15341.getClass(), "currentPassName", null);
        setIntField(term15341, term15341.getClass(), "syntheticCodeId", 0);
        setField(term15341, term15341.getClass(), "recentChange", null);
        setField(term15341, term15341.getClass(), "codeChangeHandlers", null);
        setField(term15341, term15341.getClass(), "synthesizedExternsInput", null);
        setField(term15341, term15341.getClass(), "stage", null);
        setField(term15340, term15340.getClass(), "compiler", term15341);
        setBooleanField(term15340, term15340.getClass(), "protectSideEffectFreeCode", false);
        term15342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15342, term15342.getClass(), "type", 0);
        setField(term15342, term15342.getClass(), "next", null);
        setIntField(term15343, term15343.getClass(), "type", 0);
        setField(term15343, term15343.getClass(), "next", null);
        setIntField(term15344, term15344.getClass(), "type", 0);
        setField(term15344, term15344.getClass(), "next", null);
        setField(term15344, term15344.getClass(), "first", null);
        setField(term15344, term15344.getClass(), "last", null);
        setField(term15344, term15344.getClass(), "propListHead", null);
        setIntField(term15344, term15344.getClass(), "sourcePosition", 0);
        setField(term15344, term15344.getClass(), "jsType", null);
        setField(term15344, term15344.getClass(), "parent", null);
        setField(term15343, term15343.getClass(), "first", term15344);
        setField(term15343, term15343.getClass(), "last", null);
        setField(term15343, term15343.getClass(), "propListHead", null);
        setIntField(term15343, term15343.getClass(), "sourcePosition", 0);
        setField(term15343, term15343.getClass(), "jsType", null);
        setField(term15343, term15343.getClass(), "parent", null);
        setField(term15342, term15342.getClass(), "first", term15343);
        setField(term15342, term15342.getClass(), "last", null);
        setField(term15342, term15342.getClass(), "propListHead", null);
        setIntField(term15342, term15342.getClass(), "sourcePosition", 0);
        setField(term15342, term15342.getClass(), "jsType", null);
        setField(term15342, term15342.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term14488;
        callMethod(klass, "process", argTypes, term14338, args);
        assertTrue(recursiveEquals(term14338, term15340));
        assertTrue(recursiveEquals(term14488, null));
    }

};


