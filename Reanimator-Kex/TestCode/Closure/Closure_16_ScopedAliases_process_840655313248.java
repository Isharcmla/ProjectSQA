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

public class ScopedAliases_process_840655313248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156246;
     Object term156418;
     Object term158072;
     Object term158074;

    public ScopedAliases_process_840655313248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156246 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term156326 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term156246, term156246.getClass(), "compiler", term156326);
        term156418 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term156510 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term156602 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term156694 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term156786 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term156418, term156418.getClass(), "type", 0);
        setField(term156418, term156418.getClass(), "parent", null);
        setField(term156602, term156602.getClass(), "next", null);
        setIntField(term156602, term156602.getClass(), "type", 0);
        setField(term156602, term156602.getClass(), "first", null);
        setField(term156510, term156510.getClass(), "next", term156602);
        setIntField(term156510, term156510.getClass(), "type", 0);
        setField(term156786, term156786.getClass(), "next", null);
        setIntField(term156786, term156786.getClass(), "type", 0);
        setField(term156786, term156786.getClass(), "first", null);
        setField(term156694, term156694.getClass(), "next", term156786);
        setIntField(term156694, term156694.getClass(), "type", 105);
        setField(term156510, term156510.getClass(), "first", term156694);
        setField(term156418, term156418.getClass(), "first", term156510);
        term158072 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term158073 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term158073, term158073.getClass(), "options", null);
        setField(term158073, term158073.getClass(), "passes", null);
        setField(term158073, term158073.getClass(), "externs", null);
        setField(term158073, term158073.getClass(), "modules", null);
        setField(term158073, term158073.getClass(), "moduleGraph", null);
        setField(term158073, term158073.getClass(), "inputs", null);
        setField(term158073, term158073.getClass(), "errorManager", null);
        setField(term158073, term158073.getClass(), "warningsGuard", null);
        setField(term158073, term158073.getClass(), "injectedLibraries", null);
        setField(term158073, term158073.getClass(), "externsRoot", null);
        setField(term158073, term158073.getClass(), "jsRoot", null);
        setField(term158073, term158073.getClass(), "externAndJsRoot", null);
        setField(term158073, term158073.getClass(), "inputsById", null);
        setField(term158073, term158073.getClass(), "sourceMap", null);
        setField(term158073, term158073.getClass(), "externExports", null);
        setIntField(term158073, term158073.getClass(), "uniqueNameId", 0);
        setBooleanField(term158073, term158073.getClass(), "useThreads", false);
        setBooleanField(term158073, term158073.getClass(), "hasRegExpGlobalReferences", false);
        setField(term158073, term158073.getClass(), "functionInformationMap", null);
        setField(term158073, term158073.getClass(), "debugLog", null);
        setField(term158073, term158073.getClass(), "defaultCodingConvention", null);
        setField(term158073, term158073.getClass(), "typeRegistry", null);
        setField(term158073, term158073.getClass(), "parserConfig", null);
        setField(term158073, term158073.getClass(), "abstractInterpreter", null);
        setField(term158073, term158073.getClass(), "typeValidator", null);
        setField(term158073, term158073.getClass(), "tracker", null);
        setField(term158073, term158073.getClass(), "oldErrorReporter", null);
        setField(term158073, term158073.getClass(), "defaultErrorReporter", null);
        setField(term158073, term158073.getClass(), "outStream", null);
        setField(term158073, term158073.getClass(), "globalRefMap", null);
        setDoubleField(term158073, term158073.getClass(), "progress", 0.0);
        setField(term158073, term158073.getClass(), "sanityCheck", null);
        setField(term158073, term158073.getClass(), "currentTracer", null);
        setField(term158073, term158073.getClass(), "currentPassName", null);
        setIntField(term158073, term158073.getClass(), "syntheticCodeId", 0);
        setField(term158073, term158073.getClass(), "recentChange", null);
        setField(term158073, term158073.getClass(), "codeChangeHandlers", null);
        setField(term158073, term158073.getClass(), "synthesizedExternsInput", null);
        setField(term158073, term158073.getClass(), "stage", null);
        setField(term158072, term158072.getClass(), "compiler", term158073);
        setField(term158072, term158072.getClass(), "preprocessorSymbolTable", null);
        setField(term158072, term158072.getClass(), "transformationHandler", null);
        term158074 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term158075 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term158076 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term158077 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term158078 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term158074, term158074.getClass(), "number", 0.0);
        setIntField(term158074, term158074.getClass(), "type", 0);
        setField(term158074, term158074.getClass(), "next", null);
        setDoubleField(term158075, term158075.getClass(), "number", 0.0);
        setIntField(term158075, term158075.getClass(), "type", 0);
        setDoubleField(term158076, term158076.getClass(), "number", 0.0);
        setIntField(term158076, term158076.getClass(), "type", 0);
        setField(term158076, term158076.getClass(), "next", null);
        setField(term158076, term158076.getClass(), "first", null);
        setField(term158076, term158076.getClass(), "last", null);
        setField(term158076, term158076.getClass(), "propListHead", null);
        setIntField(term158076, term158076.getClass(), "sourcePosition", 0);
        setField(term158076, term158076.getClass(), "jsType", null);
        setField(term158076, term158076.getClass(), "parent", null);
        setField(term158075, term158075.getClass(), "next", term158076);
        setDoubleField(term158077, term158077.getClass(), "number", 0.0);
        setIntField(term158077, term158077.getClass(), "type", 105);
        setDoubleField(term158078, term158078.getClass(), "number", 0.0);
        setIntField(term158078, term158078.getClass(), "type", 0);
        setField(term158078, term158078.getClass(), "next", null);
        setField(term158078, term158078.getClass(), "first", null);
        setField(term158078, term158078.getClass(), "last", null);
        setField(term158078, term158078.getClass(), "propListHead", null);
        setIntField(term158078, term158078.getClass(), "sourcePosition", 0);
        setField(term158078, term158078.getClass(), "jsType", null);
        setField(term158078, term158078.getClass(), "parent", null);
        setField(term158077, term158077.getClass(), "next", term158078);
        setField(term158077, term158077.getClass(), "first", null);
        setField(term158077, term158077.getClass(), "last", null);
        setField(term158077, term158077.getClass(), "propListHead", null);
        setIntField(term158077, term158077.getClass(), "sourcePosition", 0);
        setField(term158077, term158077.getClass(), "jsType", null);
        setField(term158077, term158077.getClass(), "parent", null);
        setField(term158075, term158075.getClass(), "first", term158077);
        setField(term158075, term158075.getClass(), "last", null);
        setField(term158075, term158075.getClass(), "propListHead", null);
        setIntField(term158075, term158075.getClass(), "sourcePosition", 0);
        setField(term158075, term158075.getClass(), "jsType", null);
        setField(term158075, term158075.getClass(), "parent", null);
        setField(term158074, term158074.getClass(), "first", term158075);
        setField(term158074, term158074.getClass(), "last", null);
        setField(term158074, term158074.getClass(), "propListHead", null);
        setIntField(term158074, term158074.getClass(), "sourcePosition", 0);
        setField(term158074, term158074.getClass(), "jsType", null);
        setField(term158074, term158074.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term156418;
        callMethod(klass, "process", argTypes, term156246, args);
        assertTrue(recursiveEquals(term156246, term158072));
        assertTrue(recursiveEquals(term156418, null));
    }

};


