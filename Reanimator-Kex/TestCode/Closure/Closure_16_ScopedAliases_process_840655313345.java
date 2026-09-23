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

public class ScopedAliases_process_840655313345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234270;
     Object term234442;
     Object term234939;
     Object term234941;

    public ScopedAliases_process_840655313345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term234270 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term234350 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term234270, term234270.getClass(), "compiler", term234350);
        term234442 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term234534 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term234442, term234442.getClass(), "type", 0);
        setIntField(term234534, term234534.getClass(), "type", 132);
        setField(term234534, term234534.getClass(), "propListHead", null);
        setField(term234442, term234442.getClass(), "parent", term234534);
        setField(term234442, term234442.getClass(), "first", null);
        term234939 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term234940 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term234940, term234940.getClass(), "options", null);
        setField(term234940, term234940.getClass(), "passes", null);
        setField(term234940, term234940.getClass(), "externs", null);
        setField(term234940, term234940.getClass(), "modules", null);
        setField(term234940, term234940.getClass(), "moduleGraph", null);
        setField(term234940, term234940.getClass(), "inputs", null);
        setField(term234940, term234940.getClass(), "errorManager", null);
        setField(term234940, term234940.getClass(), "warningsGuard", null);
        setField(term234940, term234940.getClass(), "injectedLibraries", null);
        setField(term234940, term234940.getClass(), "externsRoot", null);
        setField(term234940, term234940.getClass(), "jsRoot", null);
        setField(term234940, term234940.getClass(), "externAndJsRoot", null);
        setField(term234940, term234940.getClass(), "inputsById", null);
        setField(term234940, term234940.getClass(), "sourceMap", null);
        setField(term234940, term234940.getClass(), "externExports", null);
        setIntField(term234940, term234940.getClass(), "uniqueNameId", 0);
        setBooleanField(term234940, term234940.getClass(), "useThreads", false);
        setBooleanField(term234940, term234940.getClass(), "hasRegExpGlobalReferences", false);
        setField(term234940, term234940.getClass(), "functionInformationMap", null);
        setField(term234940, term234940.getClass(), "debugLog", null);
        setField(term234940, term234940.getClass(), "defaultCodingConvention", null);
        setField(term234940, term234940.getClass(), "typeRegistry", null);
        setField(term234940, term234940.getClass(), "parserConfig", null);
        setField(term234940, term234940.getClass(), "abstractInterpreter", null);
        setField(term234940, term234940.getClass(), "typeValidator", null);
        setField(term234940, term234940.getClass(), "tracker", null);
        setField(term234940, term234940.getClass(), "oldErrorReporter", null);
        setField(term234940, term234940.getClass(), "defaultErrorReporter", null);
        setField(term234940, term234940.getClass(), "outStream", null);
        setField(term234940, term234940.getClass(), "globalRefMap", null);
        setDoubleField(term234940, term234940.getClass(), "progress", 0.0);
        setField(term234940, term234940.getClass(), "sanityCheck", null);
        setField(term234940, term234940.getClass(), "currentTracer", null);
        setField(term234940, term234940.getClass(), "currentPassName", null);
        setIntField(term234940, term234940.getClass(), "syntheticCodeId", 0);
        setField(term234940, term234940.getClass(), "recentChange", null);
        setField(term234940, term234940.getClass(), "codeChangeHandlers", null);
        setField(term234940, term234940.getClass(), "synthesizedExternsInput", null);
        setField(term234940, term234940.getClass(), "stage", null);
        setField(term234939, term234939.getClass(), "compiler", term234940);
        setField(term234939, term234939.getClass(), "preprocessorSymbolTable", null);
        setField(term234939, term234939.getClass(), "transformationHandler", null);
        term234941 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term234942 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term234941, term234941.getClass(), "number", 0.0);
        setIntField(term234941, term234941.getClass(), "type", 0);
        setField(term234941, term234941.getClass(), "next", null);
        setField(term234941, term234941.getClass(), "first", null);
        setField(term234941, term234941.getClass(), "last", null);
        setField(term234941, term234941.getClass(), "propListHead", null);
        setIntField(term234941, term234941.getClass(), "sourcePosition", 0);
        setField(term234941, term234941.getClass(), "jsType", null);
        setDoubleField(term234942, term234942.getClass(), "number", 0.0);
        setIntField(term234942, term234942.getClass(), "type", 132);
        setField(term234942, term234942.getClass(), "next", null);
        setField(term234942, term234942.getClass(), "first", null);
        setField(term234942, term234942.getClass(), "last", null);
        setField(term234942, term234942.getClass(), "propListHead", null);
        setIntField(term234942, term234942.getClass(), "sourcePosition", 0);
        setField(term234942, term234942.getClass(), "jsType", null);
        setField(term234942, term234942.getClass(), "parent", null);
        setField(term234941, term234941.getClass(), "parent", term234942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term234442;
        callMethod(klass, "process", argTypes, term234270, args);
        assertTrue(recursiveEquals(term234270, term234939));
        assertTrue(recursiveEquals(term234442, null));
    }

};


