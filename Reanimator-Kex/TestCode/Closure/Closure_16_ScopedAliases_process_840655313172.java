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

public class ScopedAliases_process_840655313172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103615;
     Object term103787;
     Object term105346;
     Object term105348;

    public ScopedAliases_process_840655313172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103615 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term103695 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term103615, term103615.getClass(), "compiler", term103695);
        term103787 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term103879 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term103971 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term104063 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term103787, term103787.getClass(), "type", 0);
        setField(term103787, term103787.getClass(), "parent", null);
        setField(term103971, term103971.getClass(), "next", null);
        setIntField(term103971, term103971.getClass(), "type", 0);
        setField(term103971, term103971.getClass(), "first", null);
        setField(term103879, term103879.getClass(), "next", term103971);
        setIntField(term103879, term103879.getClass(), "type", 0);
        setField(term104063, term104063.getClass(), "next", null);
        setIntField(term104063, term104063.getClass(), "type", 0);
        setField(term104063, term104063.getClass(), "first", null);
        setField(term103879, term103879.getClass(), "first", term104063);
        setField(term103787, term103787.getClass(), "first", term103879);
        term105346 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term105347 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term105347, term105347.getClass(), "options", null);
        setField(term105347, term105347.getClass(), "passes", null);
        setField(term105347, term105347.getClass(), "externs", null);
        setField(term105347, term105347.getClass(), "modules", null);
        setField(term105347, term105347.getClass(), "moduleGraph", null);
        setField(term105347, term105347.getClass(), "inputs", null);
        setField(term105347, term105347.getClass(), "errorManager", null);
        setField(term105347, term105347.getClass(), "warningsGuard", null);
        setField(term105347, term105347.getClass(), "injectedLibraries", null);
        setField(term105347, term105347.getClass(), "externsRoot", null);
        setField(term105347, term105347.getClass(), "jsRoot", null);
        setField(term105347, term105347.getClass(), "externAndJsRoot", null);
        setField(term105347, term105347.getClass(), "inputsById", null);
        setField(term105347, term105347.getClass(), "sourceMap", null);
        setField(term105347, term105347.getClass(), "externExports", null);
        setIntField(term105347, term105347.getClass(), "uniqueNameId", 0);
        setBooleanField(term105347, term105347.getClass(), "useThreads", false);
        setBooleanField(term105347, term105347.getClass(), "hasRegExpGlobalReferences", false);
        setField(term105347, term105347.getClass(), "functionInformationMap", null);
        setField(term105347, term105347.getClass(), "debugLog", null);
        setField(term105347, term105347.getClass(), "defaultCodingConvention", null);
        setField(term105347, term105347.getClass(), "typeRegistry", null);
        setField(term105347, term105347.getClass(), "parserConfig", null);
        setField(term105347, term105347.getClass(), "abstractInterpreter", null);
        setField(term105347, term105347.getClass(), "typeValidator", null);
        setField(term105347, term105347.getClass(), "tracker", null);
        setField(term105347, term105347.getClass(), "oldErrorReporter", null);
        setField(term105347, term105347.getClass(), "defaultErrorReporter", null);
        setField(term105347, term105347.getClass(), "outStream", null);
        setField(term105347, term105347.getClass(), "globalRefMap", null);
        setDoubleField(term105347, term105347.getClass(), "progress", 0.0);
        setField(term105347, term105347.getClass(), "sanityCheck", null);
        setField(term105347, term105347.getClass(), "currentTracer", null);
        setField(term105347, term105347.getClass(), "currentPassName", null);
        setIntField(term105347, term105347.getClass(), "syntheticCodeId", 0);
        setField(term105347, term105347.getClass(), "recentChange", null);
        setField(term105347, term105347.getClass(), "codeChangeHandlers", null);
        setField(term105347, term105347.getClass(), "synthesizedExternsInput", null);
        setField(term105347, term105347.getClass(), "stage", null);
        setField(term105346, term105346.getClass(), "compiler", term105347);
        setField(term105346, term105346.getClass(), "preprocessorSymbolTable", null);
        setField(term105346, term105346.getClass(), "transformationHandler", null);
        term105348 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term105349 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term105350 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term105351 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term105348, term105348.getClass(), "number", 0.0);
        setIntField(term105348, term105348.getClass(), "type", 0);
        setField(term105348, term105348.getClass(), "next", null);
        setDoubleField(term105349, term105349.getClass(), "number", 0.0);
        setIntField(term105349, term105349.getClass(), "type", 0);
        setDoubleField(term105350, term105350.getClass(), "number", 0.0);
        setIntField(term105350, term105350.getClass(), "type", 0);
        setField(term105350, term105350.getClass(), "next", null);
        setField(term105350, term105350.getClass(), "first", null);
        setField(term105350, term105350.getClass(), "last", null);
        setField(term105350, term105350.getClass(), "propListHead", null);
        setIntField(term105350, term105350.getClass(), "sourcePosition", 0);
        setField(term105350, term105350.getClass(), "jsType", null);
        setField(term105350, term105350.getClass(), "parent", null);
        setField(term105349, term105349.getClass(), "next", term105350);
        setDoubleField(term105351, term105351.getClass(), "number", 0.0);
        setIntField(term105351, term105351.getClass(), "type", 0);
        setField(term105351, term105351.getClass(), "next", null);
        setField(term105351, term105351.getClass(), "first", null);
        setField(term105351, term105351.getClass(), "last", null);
        setField(term105351, term105351.getClass(), "propListHead", null);
        setIntField(term105351, term105351.getClass(), "sourcePosition", 0);
        setField(term105351, term105351.getClass(), "jsType", null);
        setField(term105351, term105351.getClass(), "parent", null);
        setField(term105349, term105349.getClass(), "first", term105351);
        setField(term105349, term105349.getClass(), "last", null);
        setField(term105349, term105349.getClass(), "propListHead", null);
        setIntField(term105349, term105349.getClass(), "sourcePosition", 0);
        setField(term105349, term105349.getClass(), "jsType", null);
        setField(term105349, term105349.getClass(), "parent", null);
        setField(term105348, term105348.getClass(), "first", term105349);
        setField(term105348, term105348.getClass(), "last", null);
        setField(term105348, term105348.getClass(), "propListHead", null);
        setIntField(term105348, term105348.getClass(), "sourcePosition", 0);
        setField(term105348, term105348.getClass(), "jsType", null);
        setField(term105348, term105348.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term103787;
        callMethod(klass, "process", argTypes, term103615, args);
        assertTrue(recursiveEquals(term103615, term105346));
        assertTrue(recursiveEquals(term103787, null));
    }

};


