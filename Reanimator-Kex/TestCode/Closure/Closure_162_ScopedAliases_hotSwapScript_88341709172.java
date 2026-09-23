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

public class ScopedAliases_hotSwapScript_88341709172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97643;
     Object term97815;
     Object term98490;
     Object term98492;

    public ScopedAliases_hotSwapScript_88341709172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97643 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term97723 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term97643, term97643.getClass(), "compiler", term97723);
        term97815 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term97907 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term97999 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term97815, term97815.getClass(), "type", 0);
        setField(term97815, term97815.getClass(), "parent", null);
        setField(term97907, term97907.getClass(), "next", null);
        setIntField(term97907, term97907.getClass(), "type", 0);
        setField(term97999, term97999.getClass(), "next", null);
        setIntField(term97999, term97999.getClass(), "type", 0);
        setField(term97999, term97999.getClass(), "first", null);
        setField(term97907, term97907.getClass(), "first", term97999);
        setField(term97815, term97815.getClass(), "first", term97907);
        term98490 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term98491 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term98491, term98491.getClass(), "options", null);
        setField(term98491, term98491.getClass(), "passes", null);
        setField(term98491, term98491.getClass(), "externs", null);
        setField(term98491, term98491.getClass(), "modules", null);
        setField(term98491, term98491.getClass(), "moduleGraph", null);
        setField(term98491, term98491.getClass(), "inputs", null);
        setField(term98491, term98491.getClass(), "errorManager", null);
        setField(term98491, term98491.getClass(), "warningsGuard", null);
        setField(term98491, term98491.getClass(), "externsRoot", null);
        setField(term98491, term98491.getClass(), "jsRoot", null);
        setField(term98491, term98491.getClass(), "externAndJsRoot", null);
        setField(term98491, term98491.getClass(), "inputsById", null);
        setField(term98491, term98491.getClass(), "sourceMap", null);
        setField(term98491, term98491.getClass(), "externExports", null);
        setIntField(term98491, term98491.getClass(), "uniqueNameId", 0);
        setBooleanField(term98491, term98491.getClass(), "useThreads", false);
        setBooleanField(term98491, term98491.getClass(), "hasRegExpGlobalReferences", false);
        setField(term98491, term98491.getClass(), "functionInformationMap", null);
        setField(term98491, term98491.getClass(), "debugLog", null);
        setField(term98491, term98491.getClass(), "defaultCodingConvention", null);
        setField(term98491, term98491.getClass(), "typeRegistry", null);
        setField(term98491, term98491.getClass(), "parserConfig", null);
        setField(term98491, term98491.getClass(), "abstractInterpreter", null);
        setField(term98491, term98491.getClass(), "typeValidator", null);
        setField(term98491, term98491.getClass(), "tracker", null);
        setField(term98491, term98491.getClass(), "oldErrorReporter", null);
        setField(term98491, term98491.getClass(), "defaultErrorReporter", null);
        setField(term98491, term98491.getClass(), "outStream", null);
        setField(term98491, term98491.getClass(), "globalRefMap", null);
        setField(term98491, term98491.getClass(), "sanityCheck", null);
        setField(term98491, term98491.getClass(), "currentTracer", null);
        setField(term98491, term98491.getClass(), "currentPassName", null);
        setIntField(term98491, term98491.getClass(), "syntheticCodeId", 0);
        setField(term98491, term98491.getClass(), "recentChange", null);
        setField(term98491, term98491.getClass(), "codeChangeHandlers", null);
        setField(term98491, term98491.getClass(), "stage", null);
        setField(term98490, term98490.getClass(), "compiler", term98491);
        setField(term98490, term98490.getClass(), "preprocessorSymbolTable", null);
        setField(term98490, term98490.getClass(), "transformationHandler", null);
        term98492 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term98493 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term98494 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term98492, term98492.getClass(), "number", 0.0);
        setIntField(term98492, term98492.getClass(), "type", 0);
        setField(term98492, term98492.getClass(), "next", null);
        setDoubleField(term98493, term98493.getClass(), "number", 0.0);
        setIntField(term98493, term98493.getClass(), "type", 0);
        setField(term98493, term98493.getClass(), "next", null);
        setDoubleField(term98494, term98494.getClass(), "number", 0.0);
        setIntField(term98494, term98494.getClass(), "type", 0);
        setField(term98494, term98494.getClass(), "next", null);
        setField(term98494, term98494.getClass(), "first", null);
        setField(term98494, term98494.getClass(), "last", null);
        setField(term98494, term98494.getClass(), "propListHead", null);
        setIntField(term98494, term98494.getClass(), "sourcePosition", 0);
        setField(term98494, term98494.getClass(), "jsType", null);
        setField(term98494, term98494.getClass(), "parent", null);
        setField(term98493, term98493.getClass(), "first", term98494);
        setField(term98493, term98493.getClass(), "last", null);
        setField(term98493, term98493.getClass(), "propListHead", null);
        setIntField(term98493, term98493.getClass(), "sourcePosition", 0);
        setField(term98493, term98493.getClass(), "jsType", null);
        setField(term98493, term98493.getClass(), "parent", null);
        setField(term98492, term98492.getClass(), "first", term98493);
        setField(term98492, term98492.getClass(), "last", null);
        setField(term98492, term98492.getClass(), "propListHead", null);
        setIntField(term98492, term98492.getClass(), "sourcePosition", 0);
        setField(term98492, term98492.getClass(), "jsType", null);
        setField(term98492, term98492.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term97815;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term97643, args);
        assertTrue(recursiveEquals(term97643, term98490));
        assertTrue(recursiveEquals(term97815, term98492));
    }

};


