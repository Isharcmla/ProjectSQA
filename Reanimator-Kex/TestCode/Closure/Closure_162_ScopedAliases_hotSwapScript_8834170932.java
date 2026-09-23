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

public class ScopedAliases_hotSwapScript_8834170932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14207;
     Object term14357;
     Object term15871;
     Object term15873;

    public ScopedAliases_hotSwapScript_8834170932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14207 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term14287 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term14207, term14207.getClass(), "compiler", term14287);
        term14357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14427 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14567 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14357, term14357.getClass(), "type", 0);
        setField(term14357, term14357.getClass(), "parent", null);
        setField(term14497, term14497.getClass(), "next", null);
        setIntField(term14497, term14497.getClass(), "type", 0);
        setField(term14497, term14497.getClass(), "first", null);
        setField(term14427, term14427.getClass(), "next", term14497);
        setIntField(term14427, term14427.getClass(), "type", 0);
        setField(term14567, term14567.getClass(), "next", null);
        setIntField(term14567, term14567.getClass(), "type", 0);
        setField(term14567, term14567.getClass(), "first", null);
        setField(term14427, term14427.getClass(), "first", term14567);
        setField(term14357, term14357.getClass(), "first", term14427);
        term15871 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term15872 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term15872, term15872.getClass(), "options", null);
        setField(term15872, term15872.getClass(), "passes", null);
        setField(term15872, term15872.getClass(), "externs", null);
        setField(term15872, term15872.getClass(), "modules", null);
        setField(term15872, term15872.getClass(), "moduleGraph", null);
        setField(term15872, term15872.getClass(), "inputs", null);
        setField(term15872, term15872.getClass(), "errorManager", null);
        setField(term15872, term15872.getClass(), "warningsGuard", null);
        setField(term15872, term15872.getClass(), "externsRoot", null);
        setField(term15872, term15872.getClass(), "jsRoot", null);
        setField(term15872, term15872.getClass(), "externAndJsRoot", null);
        setField(term15872, term15872.getClass(), "inputsById", null);
        setField(term15872, term15872.getClass(), "sourceMap", null);
        setField(term15872, term15872.getClass(), "externExports", null);
        setIntField(term15872, term15872.getClass(), "uniqueNameId", 0);
        setBooleanField(term15872, term15872.getClass(), "useThreads", false);
        setBooleanField(term15872, term15872.getClass(), "hasRegExpGlobalReferences", false);
        setField(term15872, term15872.getClass(), "functionInformationMap", null);
        setField(term15872, term15872.getClass(), "debugLog", null);
        setField(term15872, term15872.getClass(), "defaultCodingConvention", null);
        setField(term15872, term15872.getClass(), "typeRegistry", null);
        setField(term15872, term15872.getClass(), "parserConfig", null);
        setField(term15872, term15872.getClass(), "abstractInterpreter", null);
        setField(term15872, term15872.getClass(), "typeValidator", null);
        setField(term15872, term15872.getClass(), "tracker", null);
        setField(term15872, term15872.getClass(), "oldErrorReporter", null);
        setField(term15872, term15872.getClass(), "defaultErrorReporter", null);
        setField(term15872, term15872.getClass(), "outStream", null);
        setField(term15872, term15872.getClass(), "globalRefMap", null);
        setField(term15872, term15872.getClass(), "sanityCheck", null);
        setField(term15872, term15872.getClass(), "currentTracer", null);
        setField(term15872, term15872.getClass(), "currentPassName", null);
        setIntField(term15872, term15872.getClass(), "syntheticCodeId", 0);
        setField(term15872, term15872.getClass(), "recentChange", null);
        setField(term15872, term15872.getClass(), "codeChangeHandlers", null);
        setField(term15872, term15872.getClass(), "stage", null);
        setField(term15871, term15871.getClass(), "compiler", term15872);
        setField(term15871, term15871.getClass(), "preprocessorSymbolTable", null);
        setField(term15871, term15871.getClass(), "transformationHandler", null);
        term15873 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15874 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15875 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15876 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15873, term15873.getClass(), "type", 0);
        setField(term15873, term15873.getClass(), "next", null);
        setIntField(term15874, term15874.getClass(), "type", 0);
        setIntField(term15875, term15875.getClass(), "type", 0);
        setField(term15875, term15875.getClass(), "next", null);
        setField(term15875, term15875.getClass(), "first", null);
        setField(term15875, term15875.getClass(), "last", null);
        setField(term15875, term15875.getClass(), "propListHead", null);
        setIntField(term15875, term15875.getClass(), "sourcePosition", 0);
        setField(term15875, term15875.getClass(), "jsType", null);
        setField(term15875, term15875.getClass(), "parent", null);
        setField(term15874, term15874.getClass(), "next", term15875);
        setIntField(term15876, term15876.getClass(), "type", 0);
        setField(term15876, term15876.getClass(), "next", null);
        setField(term15876, term15876.getClass(), "first", null);
        setField(term15876, term15876.getClass(), "last", null);
        setField(term15876, term15876.getClass(), "propListHead", null);
        setIntField(term15876, term15876.getClass(), "sourcePosition", 0);
        setField(term15876, term15876.getClass(), "jsType", null);
        setField(term15876, term15876.getClass(), "parent", null);
        setField(term15874, term15874.getClass(), "first", term15876);
        setField(term15874, term15874.getClass(), "last", null);
        setField(term15874, term15874.getClass(), "propListHead", null);
        setIntField(term15874, term15874.getClass(), "sourcePosition", 0);
        setField(term15874, term15874.getClass(), "jsType", null);
        setField(term15874, term15874.getClass(), "parent", null);
        setField(term15873, term15873.getClass(), "first", term15874);
        setField(term15873, term15873.getClass(), "last", null);
        setField(term15873, term15873.getClass(), "propListHead", null);
        setIntField(term15873, term15873.getClass(), "sourcePosition", 0);
        setField(term15873, term15873.getClass(), "jsType", null);
        setField(term15873, term15873.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term14357;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term14207, args);
        assertTrue(recursiveEquals(term14207, term15871));
        assertTrue(recursiveEquals(term14357, term15873));
    }

};


