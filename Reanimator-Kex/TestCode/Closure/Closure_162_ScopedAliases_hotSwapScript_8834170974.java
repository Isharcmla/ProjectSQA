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

public class ScopedAliases_hotSwapScript_8834170974 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36258;
     Object term36430;
     Object term37350;
     Object term37352;

    public ScopedAliases_hotSwapScript_8834170974() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36258 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term36338 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term36258, term36258.getClass(), "compiler", term36338);
        term36430 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term36522 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term36614 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term36706 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term36430, term36430.getClass(), "type", 0);
        setField(term36430, term36430.getClass(), "parent", null);
        setField(term36614, term36614.getClass(), "next", null);
        setIntField(term36614, term36614.getClass(), "type", 0);
        setField(term36614, term36614.getClass(), "first", null);
        setField(term36522, term36522.getClass(), "next", term36614);
        setIntField(term36522, term36522.getClass(), "type", 0);
        setField(term36706, term36706.getClass(), "next", null);
        setIntField(term36706, term36706.getClass(), "type", 0);
        setField(term36706, term36706.getClass(), "first", null);
        setField(term36522, term36522.getClass(), "first", term36706);
        setField(term36430, term36430.getClass(), "first", term36522);
        term37350 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term37351 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term37351, term37351.getClass(), "options", null);
        setField(term37351, term37351.getClass(), "passes", null);
        setField(term37351, term37351.getClass(), "externs", null);
        setField(term37351, term37351.getClass(), "modules", null);
        setField(term37351, term37351.getClass(), "moduleGraph", null);
        setField(term37351, term37351.getClass(), "inputs", null);
        setField(term37351, term37351.getClass(), "errorManager", null);
        setField(term37351, term37351.getClass(), "warningsGuard", null);
        setField(term37351, term37351.getClass(), "externsRoot", null);
        setField(term37351, term37351.getClass(), "jsRoot", null);
        setField(term37351, term37351.getClass(), "externAndJsRoot", null);
        setField(term37351, term37351.getClass(), "inputsById", null);
        setField(term37351, term37351.getClass(), "sourceMap", null);
        setField(term37351, term37351.getClass(), "externExports", null);
        setIntField(term37351, term37351.getClass(), "uniqueNameId", 0);
        setBooleanField(term37351, term37351.getClass(), "useThreads", false);
        setBooleanField(term37351, term37351.getClass(), "hasRegExpGlobalReferences", false);
        setField(term37351, term37351.getClass(), "functionInformationMap", null);
        setField(term37351, term37351.getClass(), "debugLog", null);
        setField(term37351, term37351.getClass(), "defaultCodingConvention", null);
        setField(term37351, term37351.getClass(), "typeRegistry", null);
        setField(term37351, term37351.getClass(), "parserConfig", null);
        setField(term37351, term37351.getClass(), "abstractInterpreter", null);
        setField(term37351, term37351.getClass(), "typeValidator", null);
        setField(term37351, term37351.getClass(), "tracker", null);
        setField(term37351, term37351.getClass(), "oldErrorReporter", null);
        setField(term37351, term37351.getClass(), "defaultErrorReporter", null);
        setField(term37351, term37351.getClass(), "outStream", null);
        setField(term37351, term37351.getClass(), "globalRefMap", null);
        setField(term37351, term37351.getClass(), "sanityCheck", null);
        setField(term37351, term37351.getClass(), "currentTracer", null);
        setField(term37351, term37351.getClass(), "currentPassName", null);
        setIntField(term37351, term37351.getClass(), "syntheticCodeId", 0);
        setField(term37351, term37351.getClass(), "recentChange", null);
        setField(term37351, term37351.getClass(), "codeChangeHandlers", null);
        setField(term37351, term37351.getClass(), "stage", null);
        setField(term37350, term37350.getClass(), "compiler", term37351);
        setField(term37350, term37350.getClass(), "preprocessorSymbolTable", null);
        setField(term37350, term37350.getClass(), "transformationHandler", null);
        term37352 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term37353 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term37354 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term37355 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term37352, term37352.getClass(), "number", 0.0);
        setIntField(term37352, term37352.getClass(), "type", 0);
        setField(term37352, term37352.getClass(), "next", null);
        setDoubleField(term37353, term37353.getClass(), "number", 0.0);
        setIntField(term37353, term37353.getClass(), "type", 0);
        setDoubleField(term37354, term37354.getClass(), "number", 0.0);
        setIntField(term37354, term37354.getClass(), "type", 0);
        setField(term37354, term37354.getClass(), "next", null);
        setField(term37354, term37354.getClass(), "first", null);
        setField(term37354, term37354.getClass(), "last", null);
        setField(term37354, term37354.getClass(), "propListHead", null);
        setIntField(term37354, term37354.getClass(), "sourcePosition", 0);
        setField(term37354, term37354.getClass(), "jsType", null);
        setField(term37354, term37354.getClass(), "parent", null);
        setField(term37353, term37353.getClass(), "next", term37354);
        setDoubleField(term37355, term37355.getClass(), "number", 0.0);
        setIntField(term37355, term37355.getClass(), "type", 0);
        setField(term37355, term37355.getClass(), "next", null);
        setField(term37355, term37355.getClass(), "first", null);
        setField(term37355, term37355.getClass(), "last", null);
        setField(term37355, term37355.getClass(), "propListHead", null);
        setIntField(term37355, term37355.getClass(), "sourcePosition", 0);
        setField(term37355, term37355.getClass(), "jsType", null);
        setField(term37355, term37355.getClass(), "parent", null);
        setField(term37353, term37353.getClass(), "first", term37355);
        setField(term37353, term37353.getClass(), "last", null);
        setField(term37353, term37353.getClass(), "propListHead", null);
        setIntField(term37353, term37353.getClass(), "sourcePosition", 0);
        setField(term37353, term37353.getClass(), "jsType", null);
        setField(term37353, term37353.getClass(), "parent", null);
        setField(term37352, term37352.getClass(), "first", term37353);
        setField(term37352, term37352.getClass(), "last", null);
        setField(term37352, term37352.getClass(), "propListHead", null);
        setIntField(term37352, term37352.getClass(), "sourcePosition", 0);
        setField(term37352, term37352.getClass(), "jsType", null);
        setField(term37352, term37352.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term36430;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term36258, args);
        assertTrue(recursiveEquals(term36258, term37350));
        assertTrue(recursiveEquals(term36430, term37352));
    }

};


