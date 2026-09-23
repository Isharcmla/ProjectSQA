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

public class ScopedAliases_process_840655313106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62132;
     Object term62304;
     Object term63370;
     Object term63372;

    public ScopedAliases_process_840655313106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62132 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term62212 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term62132, term62132.getClass(), "compiler", term62212);
        term62304 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term62396 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term62304, term62304.getClass(), "type", 0);
        setIntField(term62396, term62396.getClass(), "type", 0);
        setField(term62396, term62396.getClass(), "parent", null);
        setField(term62304, term62304.getClass(), "parent", term62396);
        setField(term62304, term62304.getClass(), "first", null);
        term63370 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term63371 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term63371, term63371.getClass(), "options", null);
        setField(term63371, term63371.getClass(), "passes", null);
        setField(term63371, term63371.getClass(), "externs", null);
        setField(term63371, term63371.getClass(), "modules", null);
        setField(term63371, term63371.getClass(), "moduleGraph", null);
        setField(term63371, term63371.getClass(), "inputs", null);
        setField(term63371, term63371.getClass(), "errorManager", null);
        setField(term63371, term63371.getClass(), "warningsGuard", null);
        setField(term63371, term63371.getClass(), "injectedLibraries", null);
        setField(term63371, term63371.getClass(), "externsRoot", null);
        setField(term63371, term63371.getClass(), "jsRoot", null);
        setField(term63371, term63371.getClass(), "externAndJsRoot", null);
        setField(term63371, term63371.getClass(), "inputsById", null);
        setField(term63371, term63371.getClass(), "sourceMap", null);
        setField(term63371, term63371.getClass(), "externExports", null);
        setIntField(term63371, term63371.getClass(), "uniqueNameId", 0);
        setBooleanField(term63371, term63371.getClass(), "useThreads", false);
        setBooleanField(term63371, term63371.getClass(), "hasRegExpGlobalReferences", false);
        setField(term63371, term63371.getClass(), "functionInformationMap", null);
        setField(term63371, term63371.getClass(), "debugLog", null);
        setField(term63371, term63371.getClass(), "defaultCodingConvention", null);
        setField(term63371, term63371.getClass(), "typeRegistry", null);
        setField(term63371, term63371.getClass(), "parserConfig", null);
        setField(term63371, term63371.getClass(), "abstractInterpreter", null);
        setField(term63371, term63371.getClass(), "typeValidator", null);
        setField(term63371, term63371.getClass(), "tracker", null);
        setField(term63371, term63371.getClass(), "oldErrorReporter", null);
        setField(term63371, term63371.getClass(), "defaultErrorReporter", null);
        setField(term63371, term63371.getClass(), "outStream", null);
        setField(term63371, term63371.getClass(), "globalRefMap", null);
        setDoubleField(term63371, term63371.getClass(), "progress", 0.0);
        setField(term63371, term63371.getClass(), "sanityCheck", null);
        setField(term63371, term63371.getClass(), "currentTracer", null);
        setField(term63371, term63371.getClass(), "currentPassName", null);
        setIntField(term63371, term63371.getClass(), "syntheticCodeId", 0);
        setField(term63371, term63371.getClass(), "recentChange", null);
        setField(term63371, term63371.getClass(), "codeChangeHandlers", null);
        setField(term63371, term63371.getClass(), "synthesizedExternsInput", null);
        setField(term63371, term63371.getClass(), "stage", null);
        setField(term63370, term63370.getClass(), "compiler", term63371);
        setField(term63370, term63370.getClass(), "preprocessorSymbolTable", null);
        setField(term63370, term63370.getClass(), "transformationHandler", null);
        term63372 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term63373 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term63372, term63372.getClass(), "str", null);
        setIntField(term63372, term63372.getClass(), "type", 0);
        setField(term63372, term63372.getClass(), "next", null);
        setField(term63372, term63372.getClass(), "first", null);
        setField(term63372, term63372.getClass(), "last", null);
        setField(term63372, term63372.getClass(), "propListHead", null);
        setIntField(term63372, term63372.getClass(), "sourcePosition", 0);
        setField(term63372, term63372.getClass(), "jsType", null);
        setField(term63373, term63373.getClass(), "str", null);
        setIntField(term63373, term63373.getClass(), "type", 0);
        setField(term63373, term63373.getClass(), "next", null);
        setField(term63373, term63373.getClass(), "first", null);
        setField(term63373, term63373.getClass(), "last", null);
        setField(term63373, term63373.getClass(), "propListHead", null);
        setIntField(term63373, term63373.getClass(), "sourcePosition", 0);
        setField(term63373, term63373.getClass(), "jsType", null);
        setField(term63373, term63373.getClass(), "parent", null);
        setField(term63372, term63372.getClass(), "parent", term63373);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term62304;
        callMethod(klass, "process", argTypes, term62132, args);
        assertTrue(recursiveEquals(term62132, term63370));
        assertTrue(recursiveEquals(term62304, null));
    }

};


