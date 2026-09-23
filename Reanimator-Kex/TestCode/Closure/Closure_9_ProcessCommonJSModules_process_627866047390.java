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

public class ProcessCommonJSModules_process_627866047390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211193;
     Object term211365;
     Object term212905;
     Object term212907;

    public ProcessCommonJSModules_process_627866047390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term211193 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term211273 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term211193, term211193.getClass(), "compiler", term211273);
        term211365 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term211457 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term211527 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term211619 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term211365, term211365.getClass(), "type", 33);
        setField(term211365, term211365.getClass(), "parent", null);
        setField(term211527, term211527.getClass(), "next", null);
        setIntField(term211527, term211527.getClass(), "type", 0);
        setField(term211527, term211527.getClass(), "first", null);
        setField(term211457, term211457.getClass(), "next", term211527);
        setIntField(term211457, term211457.getClass(), "type", 37);
        setField(term211619, term211619.getClass(), "next", null);
        setIntField(term211619, term211619.getClass(), "type", 37);
        setField(term211619, term211619.getClass(), "first", null);
        setField(term211457, term211457.getClass(), "first", term211619);
        setField(term211365, term211365.getClass(), "first", term211457);
        term212905 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term212906 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term212906, term212906.getClass(), "options", null);
        setField(term212906, term212906.getClass(), "passes", null);
        setField(term212906, term212906.getClass(), "externs", null);
        setField(term212906, term212906.getClass(), "modules", null);
        setField(term212906, term212906.getClass(), "moduleGraph", null);
        setField(term212906, term212906.getClass(), "inputs", null);
        setField(term212906, term212906.getClass(), "errorManager", null);
        setField(term212906, term212906.getClass(), "warningsGuard", null);
        setField(term212906, term212906.getClass(), "injectedLibraries", null);
        setField(term212906, term212906.getClass(), "externsRoot", null);
        setField(term212906, term212906.getClass(), "jsRoot", null);
        setField(term212906, term212906.getClass(), "externAndJsRoot", null);
        setField(term212906, term212906.getClass(), "inputsById", null);
        setField(term212906, term212906.getClass(), "sourceMap", null);
        setField(term212906, term212906.getClass(), "externExports", null);
        setIntField(term212906, term212906.getClass(), "uniqueNameId", 0);
        setBooleanField(term212906, term212906.getClass(), "hasRegExpGlobalReferences", false);
        setField(term212906, term212906.getClass(), "functionInformationMap", null);
        setField(term212906, term212906.getClass(), "debugLog", null);
        setField(term212906, term212906.getClass(), "defaultCodingConvention", null);
        setField(term212906, term212906.getClass(), "typeRegistry", null);
        setField(term212906, term212906.getClass(), "parserConfig", null);
        setField(term212906, term212906.getClass(), "abstractInterpreter", null);
        setField(term212906, term212906.getClass(), "typeValidator", null);
        setField(term212906, term212906.getClass(), "tracker", null);
        setField(term212906, term212906.getClass(), "oldErrorReporter", null);
        setField(term212906, term212906.getClass(), "defaultErrorReporter", null);
        setField(term212906, term212906.getClass(), "compilerThread", null);
        setBooleanField(term212906, term212906.getClass(), "useThreads", false);
        setField(term212906, term212906.getClass(), "outStream", null);
        setField(term212906, term212906.getClass(), "globalRefMap", null);
        setDoubleField(term212906, term212906.getClass(), "progress", 0.0);
        setField(term212906, term212906.getClass(), "lastPassName", null);
        setField(term212906, term212906.getClass(), "sanityCheck", null);
        setField(term212906, term212906.getClass(), "currentTracer", null);
        setField(term212906, term212906.getClass(), "currentPassName", null);
        setIntField(term212906, term212906.getClass(), "syntheticCodeId", 0);
        setField(term212906, term212906.getClass(), "recentChange", null);
        setField(term212906, term212906.getClass(), "codeChangeHandlers", null);
        setField(term212906, term212906.getClass(), "synthesizedExternsInput", null);
        setField(term212906, term212906.getClass(), "stage", null);
        setField(term212905, term212905.getClass(), "compiler", term212906);
        setField(term212905, term212905.getClass(), "filenamePrefix", null);
        setBooleanField(term212905, term212905.getClass(), "reportDependencies", false);
        setField(term212905, term212905.getClass(), "module", null);
        term212907 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term212908 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term212909 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term212910 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term212907, term212907.getClass(), "number", 0.0);
        setIntField(term212907, term212907.getClass(), "type", 33);
        setField(term212907, term212907.getClass(), "next", null);
        setDoubleField(term212908, term212908.getClass(), "number", 0.0);
        setIntField(term212908, term212908.getClass(), "type", 37);
        setIntField(term212909, term212909.getClass(), "type", 0);
        setField(term212909, term212909.getClass(), "next", null);
        setField(term212909, term212909.getClass(), "first", null);
        setField(term212909, term212909.getClass(), "last", null);
        setField(term212909, term212909.getClass(), "propListHead", null);
        setIntField(term212909, term212909.getClass(), "sourcePosition", 0);
        setField(term212909, term212909.getClass(), "jsType", null);
        setField(term212909, term212909.getClass(), "parent", null);
        setField(term212908, term212908.getClass(), "next", term212909);
        setDoubleField(term212910, term212910.getClass(), "number", 0.0);
        setIntField(term212910, term212910.getClass(), "type", 37);
        setField(term212910, term212910.getClass(), "next", null);
        setField(term212910, term212910.getClass(), "first", null);
        setField(term212910, term212910.getClass(), "last", null);
        setField(term212910, term212910.getClass(), "propListHead", null);
        setIntField(term212910, term212910.getClass(), "sourcePosition", 0);
        setField(term212910, term212910.getClass(), "jsType", null);
        setField(term212910, term212910.getClass(), "parent", null);
        setField(term212908, term212908.getClass(), "first", term212910);
        setField(term212908, term212908.getClass(), "last", null);
        setField(term212908, term212908.getClass(), "propListHead", null);
        setIntField(term212908, term212908.getClass(), "sourcePosition", 0);
        setField(term212908, term212908.getClass(), "jsType", null);
        setField(term212908, term212908.getClass(), "parent", null);
        setField(term212907, term212907.getClass(), "first", term212908);
        setField(term212907, term212907.getClass(), "last", null);
        setField(term212907, term212907.getClass(), "propListHead", null);
        setIntField(term212907, term212907.getClass(), "sourcePosition", 0);
        setField(term212907, term212907.getClass(), "jsType", null);
        setField(term212907, term212907.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term211365;
        callMethod(klass, "process", argTypes, term211193, args);
        assertTrue(recursiveEquals(term211193, term212905));
        assertTrue(recursiveEquals(term211365, null));
    }

};


