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

public class ScopedAliases_hotSwapScript_8834170969 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32433;
     Object term32605;
     Object term33488;
     Object term33490;

    public ScopedAliases_hotSwapScript_8834170969() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32433 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term32513 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term32433, term32433.getClass(), "compiler", term32513);
        term32605 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term32697 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term32767 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32859 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term32605, term32605.getClass(), "type", 0);
        setField(term32605, term32605.getClass(), "parent", null);
        setField(term32697, term32697.getClass(), "next", term32767);
        setIntField(term32697, term32697.getClass(), "type", 0);
        setField(term32697, term32697.getClass(), "first", term32859);
        setField(term32605, term32605.getClass(), "first", term32697);
        term33488 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term33489 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term33489, term33489.getClass(), "options", null);
        setField(term33489, term33489.getClass(), "passes", null);
        setField(term33489, term33489.getClass(), "externs", null);
        setField(term33489, term33489.getClass(), "modules", null);
        setField(term33489, term33489.getClass(), "moduleGraph", null);
        setField(term33489, term33489.getClass(), "inputs", null);
        setField(term33489, term33489.getClass(), "errorManager", null);
        setField(term33489, term33489.getClass(), "warningsGuard", null);
        setField(term33489, term33489.getClass(), "externsRoot", null);
        setField(term33489, term33489.getClass(), "jsRoot", null);
        setField(term33489, term33489.getClass(), "externAndJsRoot", null);
        setField(term33489, term33489.getClass(), "inputsById", null);
        setField(term33489, term33489.getClass(), "sourceMap", null);
        setField(term33489, term33489.getClass(), "externExports", null);
        setIntField(term33489, term33489.getClass(), "uniqueNameId", 0);
        setBooleanField(term33489, term33489.getClass(), "useThreads", false);
        setBooleanField(term33489, term33489.getClass(), "hasRegExpGlobalReferences", false);
        setField(term33489, term33489.getClass(), "functionInformationMap", null);
        setField(term33489, term33489.getClass(), "debugLog", null);
        setField(term33489, term33489.getClass(), "defaultCodingConvention", null);
        setField(term33489, term33489.getClass(), "typeRegistry", null);
        setField(term33489, term33489.getClass(), "parserConfig", null);
        setField(term33489, term33489.getClass(), "abstractInterpreter", null);
        setField(term33489, term33489.getClass(), "typeValidator", null);
        setField(term33489, term33489.getClass(), "tracker", null);
        setField(term33489, term33489.getClass(), "oldErrorReporter", null);
        setField(term33489, term33489.getClass(), "defaultErrorReporter", null);
        setField(term33489, term33489.getClass(), "outStream", null);
        setField(term33489, term33489.getClass(), "globalRefMap", null);
        setField(term33489, term33489.getClass(), "sanityCheck", null);
        setField(term33489, term33489.getClass(), "currentTracer", null);
        setField(term33489, term33489.getClass(), "currentPassName", null);
        setIntField(term33489, term33489.getClass(), "syntheticCodeId", 0);
        setField(term33489, term33489.getClass(), "recentChange", null);
        setField(term33489, term33489.getClass(), "codeChangeHandlers", null);
        setField(term33489, term33489.getClass(), "stage", null);
        setField(term33488, term33488.getClass(), "compiler", term33489);
        setField(term33488, term33488.getClass(), "preprocessorSymbolTable", null);
        setField(term33488, term33488.getClass(), "transformationHandler", null);
        term33490 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term33491 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term33492 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33493 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term33490, term33490.getClass(), "number", 0.0);
        setIntField(term33490, term33490.getClass(), "type", 0);
        setField(term33490, term33490.getClass(), "next", null);
        setDoubleField(term33491, term33491.getClass(), "number", 0.0);
        setIntField(term33491, term33491.getClass(), "type", 0);
        setIntField(term33492, term33492.getClass(), "type", 0);
        setField(term33492, term33492.getClass(), "next", null);
        setField(term33492, term33492.getClass(), "first", null);
        setField(term33492, term33492.getClass(), "last", null);
        setField(term33492, term33492.getClass(), "propListHead", null);
        setIntField(term33492, term33492.getClass(), "sourcePosition", 0);
        setField(term33492, term33492.getClass(), "jsType", null);
        setField(term33492, term33492.getClass(), "parent", null);
        setField(term33491, term33491.getClass(), "next", term33492);
        setDoubleField(term33493, term33493.getClass(), "number", 0.0);
        setIntField(term33493, term33493.getClass(), "type", 0);
        setField(term33493, term33493.getClass(), "next", null);
        setField(term33493, term33493.getClass(), "first", null);
        setField(term33493, term33493.getClass(), "last", null);
        setField(term33493, term33493.getClass(), "propListHead", null);
        setIntField(term33493, term33493.getClass(), "sourcePosition", 0);
        setField(term33493, term33493.getClass(), "jsType", null);
        setField(term33493, term33493.getClass(), "parent", null);
        setField(term33491, term33491.getClass(), "first", term33493);
        setField(term33491, term33491.getClass(), "last", null);
        setField(term33491, term33491.getClass(), "propListHead", null);
        setIntField(term33491, term33491.getClass(), "sourcePosition", 0);
        setField(term33491, term33491.getClass(), "jsType", null);
        setField(term33491, term33491.getClass(), "parent", null);
        setField(term33490, term33490.getClass(), "first", term33491);
        setField(term33490, term33490.getClass(), "last", null);
        setField(term33490, term33490.getClass(), "propListHead", null);
        setIntField(term33490, term33490.getClass(), "sourcePosition", 0);
        setField(term33490, term33490.getClass(), "jsType", null);
        setField(term33490, term33490.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term32605;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term32433, args);
        assertTrue(recursiveEquals(term32433, term33488));
        assertTrue(recursiveEquals(term32605, term33490));
    }

};


