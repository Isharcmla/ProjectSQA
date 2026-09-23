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

public class ScopedAliases_hotSwapScript_88341709307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201315;
     Object term201465;
     Object term202354;
     Object term202356;

    public ScopedAliases_hotSwapScript_88341709307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term201315 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term201395 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term201315, term201315.getClass(), "compiler", term201395);
        term201465 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term201535 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term201605 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term201675 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term201465, term201465.getClass(), "type", 0);
        setField(term201465, term201465.getClass(), "parent", null);
        setField(term201605, term201605.getClass(), "next", null);
        setIntField(term201605, term201605.getClass(), "type", 105);
        setField(term201535, term201535.getClass(), "next", term201605);
        setIntField(term201535, term201535.getClass(), "type", 0);
        setField(term201675, term201675.getClass(), "next", null);
        setIntField(term201675, term201675.getClass(), "type", 0);
        setField(term201675, term201675.getClass(), "first", null);
        setField(term201535, term201535.getClass(), "first", term201675);
        setField(term201465, term201465.getClass(), "first", term201535);
        term202354 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term202355 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term202355, term202355.getClass(), "options", null);
        setField(term202355, term202355.getClass(), "passes", null);
        setField(term202355, term202355.getClass(), "externs", null);
        setField(term202355, term202355.getClass(), "modules", null);
        setField(term202355, term202355.getClass(), "moduleGraph", null);
        setField(term202355, term202355.getClass(), "inputs", null);
        setField(term202355, term202355.getClass(), "errorManager", null);
        setField(term202355, term202355.getClass(), "warningsGuard", null);
        setField(term202355, term202355.getClass(), "injectedLibraries", null);
        setField(term202355, term202355.getClass(), "externsRoot", null);
        setField(term202355, term202355.getClass(), "jsRoot", null);
        setField(term202355, term202355.getClass(), "externAndJsRoot", null);
        setField(term202355, term202355.getClass(), "inputsById", null);
        setField(term202355, term202355.getClass(), "sourceMap", null);
        setField(term202355, term202355.getClass(), "externExports", null);
        setIntField(term202355, term202355.getClass(), "uniqueNameId", 0);
        setBooleanField(term202355, term202355.getClass(), "useThreads", false);
        setBooleanField(term202355, term202355.getClass(), "hasRegExpGlobalReferences", false);
        setField(term202355, term202355.getClass(), "functionInformationMap", null);
        setField(term202355, term202355.getClass(), "debugLog", null);
        setField(term202355, term202355.getClass(), "defaultCodingConvention", null);
        setField(term202355, term202355.getClass(), "typeRegistry", null);
        setField(term202355, term202355.getClass(), "parserConfig", null);
        setField(term202355, term202355.getClass(), "abstractInterpreter", null);
        setField(term202355, term202355.getClass(), "typeValidator", null);
        setField(term202355, term202355.getClass(), "tracker", null);
        setField(term202355, term202355.getClass(), "oldErrorReporter", null);
        setField(term202355, term202355.getClass(), "defaultErrorReporter", null);
        setField(term202355, term202355.getClass(), "outStream", null);
        setField(term202355, term202355.getClass(), "globalRefMap", null);
        setDoubleField(term202355, term202355.getClass(), "progress", 0.0);
        setField(term202355, term202355.getClass(), "sanityCheck", null);
        setField(term202355, term202355.getClass(), "currentTracer", null);
        setField(term202355, term202355.getClass(), "currentPassName", null);
        setIntField(term202355, term202355.getClass(), "syntheticCodeId", 0);
        setField(term202355, term202355.getClass(), "recentChange", null);
        setField(term202355, term202355.getClass(), "codeChangeHandlers", null);
        setField(term202355, term202355.getClass(), "synthesizedExternsInput", null);
        setField(term202355, term202355.getClass(), "stage", null);
        setField(term202354, term202354.getClass(), "compiler", term202355);
        setField(term202354, term202354.getClass(), "preprocessorSymbolTable", null);
        setField(term202354, term202354.getClass(), "transformationHandler", null);
        term202356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term202357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term202358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term202359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term202356, term202356.getClass(), "type", 0);
        setField(term202356, term202356.getClass(), "next", null);
        setIntField(term202357, term202357.getClass(), "type", 0);
        setIntField(term202358, term202358.getClass(), "type", 105);
        setField(term202358, term202358.getClass(), "next", null);
        setField(term202358, term202358.getClass(), "first", null);
        setField(term202358, term202358.getClass(), "last", null);
        setField(term202358, term202358.getClass(), "propListHead", null);
        setIntField(term202358, term202358.getClass(), "sourcePosition", 0);
        setField(term202358, term202358.getClass(), "jsType", null);
        setField(term202358, term202358.getClass(), "parent", null);
        setField(term202357, term202357.getClass(), "next", term202358);
        setIntField(term202359, term202359.getClass(), "type", 0);
        setField(term202359, term202359.getClass(), "next", null);
        setField(term202359, term202359.getClass(), "first", null);
        setField(term202359, term202359.getClass(), "last", null);
        setField(term202359, term202359.getClass(), "propListHead", null);
        setIntField(term202359, term202359.getClass(), "sourcePosition", 0);
        setField(term202359, term202359.getClass(), "jsType", null);
        setField(term202359, term202359.getClass(), "parent", null);
        setField(term202357, term202357.getClass(), "first", term202359);
        setField(term202357, term202357.getClass(), "last", null);
        setField(term202357, term202357.getClass(), "propListHead", null);
        setIntField(term202357, term202357.getClass(), "sourcePosition", 0);
        setField(term202357, term202357.getClass(), "jsType", null);
        setField(term202357, term202357.getClass(), "parent", null);
        setField(term202356, term202356.getClass(), "first", term202357);
        setField(term202356, term202356.getClass(), "last", null);
        setField(term202356, term202356.getClass(), "propListHead", null);
        setIntField(term202356, term202356.getClass(), "sourcePosition", 0);
        setField(term202356, term202356.getClass(), "jsType", null);
        setField(term202356, term202356.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term201465;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term201315, args);
        assertTrue(recursiveEquals(term201315, term202354));
        assertTrue(recursiveEquals(term201465, term202356));
    }

};


