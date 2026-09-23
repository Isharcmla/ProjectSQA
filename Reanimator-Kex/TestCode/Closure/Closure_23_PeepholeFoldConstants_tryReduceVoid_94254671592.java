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

public class PeepholeFoldConstants_tryReduceVoid_94254671592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11875;
     Object term12025;
     Object term12491;
     Object term12493;
     Object term12451;

    public PeepholeFoldConstants_tryReduceVoid_94254671592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11875 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term11955 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term11875, term11875.getClass(), "compiler", term11955);
        term12025 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12095 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12095, term12095.getClass(), "type", 152);
        setField(term12025, term12025.getClass(), "first", term12095);
        setIntField(term12025, term12025.getClass(), "type", 152);
        term12491 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term12492 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setBooleanField(term12491, term12491.getClass(), "late", false);
        setField(term12492, term12492.getClass(), "options", null);
        setField(term12492, term12492.getClass(), "passes", null);
        setField(term12492, term12492.getClass(), "externs", null);
        setField(term12492, term12492.getClass(), "modules", null);
        setField(term12492, term12492.getClass(), "moduleGraph", null);
        setField(term12492, term12492.getClass(), "inputs", null);
        setField(term12492, term12492.getClass(), "errorManager", null);
        setField(term12492, term12492.getClass(), "warningsGuard", null);
        setField(term12492, term12492.getClass(), "injectedLibraries", null);
        setField(term12492, term12492.getClass(), "externsRoot", null);
        setField(term12492, term12492.getClass(), "jsRoot", null);
        setField(term12492, term12492.getClass(), "externAndJsRoot", null);
        setField(term12492, term12492.getClass(), "inputsById", null);
        setField(term12492, term12492.getClass(), "sourceMap", null);
        setField(term12492, term12492.getClass(), "externExports", null);
        setIntField(term12492, term12492.getClass(), "uniqueNameId", 0);
        setBooleanField(term12492, term12492.getClass(), "useThreads", false);
        setBooleanField(term12492, term12492.getClass(), "hasRegExpGlobalReferences", false);
        setField(term12492, term12492.getClass(), "functionInformationMap", null);
        setField(term12492, term12492.getClass(), "debugLog", null);
        setField(term12492, term12492.getClass(), "defaultCodingConvention", null);
        setField(term12492, term12492.getClass(), "typeRegistry", null);
        setField(term12492, term12492.getClass(), "parserConfig", null);
        setField(term12492, term12492.getClass(), "abstractInterpreter", null);
        setField(term12492, term12492.getClass(), "typeValidator", null);
        setField(term12492, term12492.getClass(), "tracker", null);
        setField(term12492, term12492.getClass(), "oldErrorReporter", null);
        setField(term12492, term12492.getClass(), "defaultErrorReporter", null);
        setField(term12492, term12492.getClass(), "outStream", null);
        setField(term12492, term12492.getClass(), "globalRefMap", null);
        setDoubleField(term12492, term12492.getClass(), "progress", 0.0);
        setField(term12492, term12492.getClass(), "sanityCheck", null);
        setField(term12492, term12492.getClass(), "currentTracer", null);
        setField(term12492, term12492.getClass(), "currentPassName", null);
        setIntField(term12492, term12492.getClass(), "syntheticCodeId", 0);
        setField(term12492, term12492.getClass(), "recentChange", null);
        setField(term12492, term12492.getClass(), "codeChangeHandlers", null);
        setField(term12492, term12492.getClass(), "synthesizedExternsInput", null);
        setField(term12492, term12492.getClass(), "stage", null);
        setField(term12491, term12491.getClass(), "compiler", term12492);
        term12493 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12493, term12493.getClass(), "type", 152);
        setField(term12493, term12493.getClass(), "next", null);
        setIntField(term12494, term12494.getClass(), "type", 152);
        setField(term12494, term12494.getClass(), "next", null);
        setField(term12494, term12494.getClass(), "first", null);
        setField(term12494, term12494.getClass(), "last", null);
        setField(term12494, term12494.getClass(), "propListHead", null);
        setIntField(term12494, term12494.getClass(), "sourcePosition", 0);
        setField(term12494, term12494.getClass(), "jsType", null);
        setField(term12494, term12494.getClass(), "parent", null);
        setField(term12493, term12493.getClass(), "first", term12494);
        setField(term12493, term12493.getClass(), "last", null);
        setField(term12493, term12493.getClass(), "propListHead", null);
        setIntField(term12493, term12493.getClass(), "sourcePosition", 0);
        setField(term12493, term12493.getClass(), "jsType", null);
        setField(term12493, term12493.getClass(), "parent", null);
        term12451 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12451, term12451.getClass(), "type", 152);
        setField(term12451, term12451.getClass(), "next", null);
        setIntField(term12453, term12453.getClass(), "type", 152);
        setField(term12453, term12453.getClass(), "next", null);
        setField(term12453, term12453.getClass(), "first", null);
        setField(term12453, term12453.getClass(), "last", null);
        setField(term12453, term12453.getClass(), "propListHead", null);
        setIntField(term12453, term12453.getClass(), "sourcePosition", 0);
        setField(term12453, term12453.getClass(), "jsType", null);
        setField(term12453, term12453.getClass(), "parent", null);
        setField(term12451, term12451.getClass(), "first", term12453);
        setField(term12451, term12451.getClass(), "last", null);
        setField(term12451, term12451.getClass(), "propListHead", null);
        setIntField(term12451, term12451.getClass(), "sourcePosition", 0);
        setField(term12451, term12451.getClass(), "jsType", null);
        setField(term12451, term12451.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term12025;
        Object retValue = callMethod(klass, "tryReduceVoid", argTypes, term11875, args);
        assertTrue(recursiveEquals(term11875, term12491));
        assertTrue(recursiveEquals(term12025, term12493));
        assertTrue(recursiveEquals(retValue, term12451));
    }

};


