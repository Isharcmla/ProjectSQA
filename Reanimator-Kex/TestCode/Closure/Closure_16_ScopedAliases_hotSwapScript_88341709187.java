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

public class ScopedAliases_hotSwapScript_88341709187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113755;
     Object term113905;
     Object term115111;
     Object term115113;

    public ScopedAliases_hotSwapScript_88341709187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113755 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term113835 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term113755, term113755.getClass(), "compiler", term113835);
        term113905 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term113975 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term114045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term114115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term114185 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term114255 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term113905, term113905.getClass(), "type", 0);
        setField(term113905, term113905.getClass(), "parent", null);
        setField(term113975, term113975.getClass(), "next", term114045);
        setIntField(term113975, term113975.getClass(), "type", 0);
        setField(term114185, term114185.getClass(), "next", term114255);
        setIntField(term114185, term114185.getClass(), "type", 105);
        setField(term114115, term114115.getClass(), "next", term114185);
        setIntField(term114115, term114115.getClass(), "type", 105);
        setField(term113975, term113975.getClass(), "first", term114115);
        setField(term113905, term113905.getClass(), "first", term113975);
        term115111 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term115112 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term115112, term115112.getClass(), "options", null);
        setField(term115112, term115112.getClass(), "passes", null);
        setField(term115112, term115112.getClass(), "externs", null);
        setField(term115112, term115112.getClass(), "modules", null);
        setField(term115112, term115112.getClass(), "moduleGraph", null);
        setField(term115112, term115112.getClass(), "inputs", null);
        setField(term115112, term115112.getClass(), "errorManager", null);
        setField(term115112, term115112.getClass(), "warningsGuard", null);
        setField(term115112, term115112.getClass(), "injectedLibraries", null);
        setField(term115112, term115112.getClass(), "externsRoot", null);
        setField(term115112, term115112.getClass(), "jsRoot", null);
        setField(term115112, term115112.getClass(), "externAndJsRoot", null);
        setField(term115112, term115112.getClass(), "inputsById", null);
        setField(term115112, term115112.getClass(), "sourceMap", null);
        setField(term115112, term115112.getClass(), "externExports", null);
        setIntField(term115112, term115112.getClass(), "uniqueNameId", 0);
        setBooleanField(term115112, term115112.getClass(), "useThreads", false);
        setBooleanField(term115112, term115112.getClass(), "hasRegExpGlobalReferences", false);
        setField(term115112, term115112.getClass(), "functionInformationMap", null);
        setField(term115112, term115112.getClass(), "debugLog", null);
        setField(term115112, term115112.getClass(), "defaultCodingConvention", null);
        setField(term115112, term115112.getClass(), "typeRegistry", null);
        setField(term115112, term115112.getClass(), "parserConfig", null);
        setField(term115112, term115112.getClass(), "abstractInterpreter", null);
        setField(term115112, term115112.getClass(), "typeValidator", null);
        setField(term115112, term115112.getClass(), "tracker", null);
        setField(term115112, term115112.getClass(), "oldErrorReporter", null);
        setField(term115112, term115112.getClass(), "defaultErrorReporter", null);
        setField(term115112, term115112.getClass(), "outStream", null);
        setField(term115112, term115112.getClass(), "globalRefMap", null);
        setDoubleField(term115112, term115112.getClass(), "progress", 0.0);
        setField(term115112, term115112.getClass(), "sanityCheck", null);
        setField(term115112, term115112.getClass(), "currentTracer", null);
        setField(term115112, term115112.getClass(), "currentPassName", null);
        setIntField(term115112, term115112.getClass(), "syntheticCodeId", 0);
        setField(term115112, term115112.getClass(), "recentChange", null);
        setField(term115112, term115112.getClass(), "codeChangeHandlers", null);
        setField(term115112, term115112.getClass(), "synthesizedExternsInput", null);
        setField(term115112, term115112.getClass(), "stage", null);
        setField(term115111, term115111.getClass(), "compiler", term115112);
        setField(term115111, term115111.getClass(), "preprocessorSymbolTable", null);
        setField(term115111, term115111.getClass(), "transformationHandler", null);
        term115113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115114 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115116 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115117 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115118 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term115113, term115113.getClass(), "type", 0);
        setField(term115113, term115113.getClass(), "next", null);
        setIntField(term115114, term115114.getClass(), "type", 0);
        setIntField(term115115, term115115.getClass(), "type", 0);
        setField(term115115, term115115.getClass(), "next", null);
        setField(term115115, term115115.getClass(), "first", null);
        setField(term115115, term115115.getClass(), "last", null);
        setField(term115115, term115115.getClass(), "propListHead", null);
        setIntField(term115115, term115115.getClass(), "sourcePosition", 0);
        setField(term115115, term115115.getClass(), "jsType", null);
        setField(term115115, term115115.getClass(), "parent", null);
        setField(term115114, term115114.getClass(), "next", term115115);
        setIntField(term115116, term115116.getClass(), "type", 105);
        setIntField(term115117, term115117.getClass(), "type", 105);
        setIntField(term115118, term115118.getClass(), "type", 0);
        setField(term115118, term115118.getClass(), "next", null);
        setField(term115118, term115118.getClass(), "first", null);
        setField(term115118, term115118.getClass(), "last", null);
        setField(term115118, term115118.getClass(), "propListHead", null);
        setIntField(term115118, term115118.getClass(), "sourcePosition", 0);
        setField(term115118, term115118.getClass(), "jsType", null);
        setField(term115118, term115118.getClass(), "parent", null);
        setField(term115117, term115117.getClass(), "next", term115118);
        setField(term115117, term115117.getClass(), "first", null);
        setField(term115117, term115117.getClass(), "last", null);
        setField(term115117, term115117.getClass(), "propListHead", null);
        setIntField(term115117, term115117.getClass(), "sourcePosition", 0);
        setField(term115117, term115117.getClass(), "jsType", null);
        setField(term115117, term115117.getClass(), "parent", null);
        setField(term115116, term115116.getClass(), "next", term115117);
        setField(term115116, term115116.getClass(), "first", null);
        setField(term115116, term115116.getClass(), "last", null);
        setField(term115116, term115116.getClass(), "propListHead", null);
        setIntField(term115116, term115116.getClass(), "sourcePosition", 0);
        setField(term115116, term115116.getClass(), "jsType", null);
        setField(term115116, term115116.getClass(), "parent", null);
        setField(term115114, term115114.getClass(), "first", term115116);
        setField(term115114, term115114.getClass(), "last", null);
        setField(term115114, term115114.getClass(), "propListHead", null);
        setIntField(term115114, term115114.getClass(), "sourcePosition", 0);
        setField(term115114, term115114.getClass(), "jsType", null);
        setField(term115114, term115114.getClass(), "parent", null);
        setField(term115113, term115113.getClass(), "first", term115114);
        setField(term115113, term115113.getClass(), "last", null);
        setField(term115113, term115113.getClass(), "propListHead", null);
        setIntField(term115113, term115113.getClass(), "sourcePosition", 0);
        setField(term115113, term115113.getClass(), "jsType", null);
        setField(term115113, term115113.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term113905;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term113755, args);
        assertTrue(recursiveEquals(term113755, term115111));
        assertTrue(recursiveEquals(term113905, term115113));
    }

};


