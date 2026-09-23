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

public class ProcessCommonJSModules_process_62786604781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31977;
     Object term32127;
     Object term32930;
     Object term32932;

    public ProcessCommonJSModules_process_62786604781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31977 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term32057 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term31977, term31977.getClass(), "compiler", term32057);
        term32127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32219 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term32311 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term32403 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term32473 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32127, term32127.getClass(), "type", 0);
        setField(term32127, term32127.getClass(), "parent", null);
        setField(term32219, term32219.getClass(), "next", term32311);
        setIntField(term32219, term32219.getClass(), "type", 0);
        setField(term32403, term32403.getClass(), "next", term32473);
        setIntField(term32403, term32403.getClass(), "type", 0);
        setField(term32403, term32403.getClass(), "first", null);
        setField(term32219, term32219.getClass(), "first", term32403);
        setField(term32127, term32127.getClass(), "first", term32219);
        term32930 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term32931 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term32931, term32931.getClass(), "options", null);
        setField(term32931, term32931.getClass(), "passes", null);
        setField(term32931, term32931.getClass(), "externs", null);
        setField(term32931, term32931.getClass(), "modules", null);
        setField(term32931, term32931.getClass(), "moduleGraph", null);
        setField(term32931, term32931.getClass(), "inputs", null);
        setField(term32931, term32931.getClass(), "errorManager", null);
        setField(term32931, term32931.getClass(), "warningsGuard", null);
        setField(term32931, term32931.getClass(), "injectedLibraries", null);
        setField(term32931, term32931.getClass(), "externsRoot", null);
        setField(term32931, term32931.getClass(), "jsRoot", null);
        setField(term32931, term32931.getClass(), "externAndJsRoot", null);
        setField(term32931, term32931.getClass(), "inputsById", null);
        setField(term32931, term32931.getClass(), "sourceMap", null);
        setField(term32931, term32931.getClass(), "externExports", null);
        setIntField(term32931, term32931.getClass(), "uniqueNameId", 0);
        setBooleanField(term32931, term32931.getClass(), "hasRegExpGlobalReferences", false);
        setField(term32931, term32931.getClass(), "functionInformationMap", null);
        setField(term32931, term32931.getClass(), "debugLog", null);
        setField(term32931, term32931.getClass(), "defaultCodingConvention", null);
        setField(term32931, term32931.getClass(), "typeRegistry", null);
        setField(term32931, term32931.getClass(), "parserConfig", null);
        setField(term32931, term32931.getClass(), "abstractInterpreter", null);
        setField(term32931, term32931.getClass(), "typeValidator", null);
        setField(term32931, term32931.getClass(), "tracker", null);
        setField(term32931, term32931.getClass(), "oldErrorReporter", null);
        setField(term32931, term32931.getClass(), "defaultErrorReporter", null);
        setField(term32931, term32931.getClass(), "compilerThread", null);
        setBooleanField(term32931, term32931.getClass(), "useThreads", false);
        setField(term32931, term32931.getClass(), "outStream", null);
        setField(term32931, term32931.getClass(), "globalRefMap", null);
        setDoubleField(term32931, term32931.getClass(), "progress", 0.0);
        setField(term32931, term32931.getClass(), "lastPassName", null);
        setField(term32931, term32931.getClass(), "sanityCheck", null);
        setField(term32931, term32931.getClass(), "currentTracer", null);
        setField(term32931, term32931.getClass(), "currentPassName", null);
        setIntField(term32931, term32931.getClass(), "syntheticCodeId", 0);
        setField(term32931, term32931.getClass(), "recentChange", null);
        setField(term32931, term32931.getClass(), "codeChangeHandlers", null);
        setField(term32931, term32931.getClass(), "synthesizedExternsInput", null);
        setField(term32931, term32931.getClass(), "stage", null);
        setField(term32930, term32930.getClass(), "compiler", term32931);
        setField(term32930, term32930.getClass(), "filenamePrefix", null);
        setBooleanField(term32930, term32930.getClass(), "reportDependencies", false);
        setField(term32930, term32930.getClass(), "module", null);
        term32932 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32933 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term32934 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term32935 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term32936 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32932, term32932.getClass(), "type", 0);
        setField(term32932, term32932.getClass(), "next", null);
        setDoubleField(term32933, term32933.getClass(), "number", 0.0);
        setIntField(term32933, term32933.getClass(), "type", 0);
        setDoubleField(term32934, term32934.getClass(), "number", 0.0);
        setIntField(term32934, term32934.getClass(), "type", 0);
        setField(term32934, term32934.getClass(), "next", null);
        setField(term32934, term32934.getClass(), "first", null);
        setField(term32934, term32934.getClass(), "last", null);
        setField(term32934, term32934.getClass(), "propListHead", null);
        setIntField(term32934, term32934.getClass(), "sourcePosition", 0);
        setField(term32934, term32934.getClass(), "jsType", null);
        setField(term32934, term32934.getClass(), "parent", null);
        setField(term32933, term32933.getClass(), "next", term32934);
        setDoubleField(term32935, term32935.getClass(), "number", 0.0);
        setIntField(term32935, term32935.getClass(), "type", 0);
        setIntField(term32936, term32936.getClass(), "type", 0);
        setField(term32936, term32936.getClass(), "next", null);
        setField(term32936, term32936.getClass(), "first", null);
        setField(term32936, term32936.getClass(), "last", null);
        setField(term32936, term32936.getClass(), "propListHead", null);
        setIntField(term32936, term32936.getClass(), "sourcePosition", 0);
        setField(term32936, term32936.getClass(), "jsType", null);
        setField(term32936, term32936.getClass(), "parent", null);
        setField(term32935, term32935.getClass(), "next", term32936);
        setField(term32935, term32935.getClass(), "first", null);
        setField(term32935, term32935.getClass(), "last", null);
        setField(term32935, term32935.getClass(), "propListHead", null);
        setIntField(term32935, term32935.getClass(), "sourcePosition", 0);
        setField(term32935, term32935.getClass(), "jsType", null);
        setField(term32935, term32935.getClass(), "parent", null);
        setField(term32933, term32933.getClass(), "first", term32935);
        setField(term32933, term32933.getClass(), "last", null);
        setField(term32933, term32933.getClass(), "propListHead", null);
        setIntField(term32933, term32933.getClass(), "sourcePosition", 0);
        setField(term32933, term32933.getClass(), "jsType", null);
        setField(term32933, term32933.getClass(), "parent", null);
        setField(term32932, term32932.getClass(), "first", term32933);
        setField(term32932, term32932.getClass(), "last", null);
        setField(term32932, term32932.getClass(), "propListHead", null);
        setIntField(term32932, term32932.getClass(), "sourcePosition", 0);
        setField(term32932, term32932.getClass(), "jsType", null);
        setField(term32932, term32932.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term32127;
        callMethod(klass, "process", argTypes, term31977, args);
        assertTrue(recursiveEquals(term31977, term32930));
        assertTrue(recursiveEquals(term32127, null));
    }

};


