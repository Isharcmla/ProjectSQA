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

public class ScopedAliases_process_840655313321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214020;
     Object term214192;
     Object term215368;
     Object term215370;

    public ScopedAliases_process_840655313321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term214020 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term214100 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term214020, term214020.getClass(), "compiler", term214100);
        term214192 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term214284 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term214376 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term214468 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term214560 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term214192, term214192.getClass(), "type", 0);
        setField(term214192, term214192.getClass(), "parent", null);
        setField(term214376, term214376.getClass(), "next", null);
        setIntField(term214376, term214376.getClass(), "type", 0);
        setField(term214376, term214376.getClass(), "first", null);
        setField(term214284, term214284.getClass(), "next", term214376);
        setIntField(term214284, term214284.getClass(), "type", 0);
        setField(term214560, term214560.getClass(), "next", null);
        setIntField(term214560, term214560.getClass(), "type", 0);
        setField(term214560, term214560.getClass(), "first", null);
        setField(term214468, term214468.getClass(), "next", term214560);
        setIntField(term214468, term214468.getClass(), "type", 105);
        setField(term214284, term214284.getClass(), "first", term214468);
        setField(term214192, term214192.getClass(), "first", term214284);
        term215368 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term215369 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term215369, term215369.getClass(), "options", null);
        setField(term215369, term215369.getClass(), "passes", null);
        setField(term215369, term215369.getClass(), "externs", null);
        setField(term215369, term215369.getClass(), "modules", null);
        setField(term215369, term215369.getClass(), "moduleGraph", null);
        setField(term215369, term215369.getClass(), "inputs", null);
        setField(term215369, term215369.getClass(), "errorManager", null);
        setField(term215369, term215369.getClass(), "warningsGuard", null);
        setField(term215369, term215369.getClass(), "injectedLibraries", null);
        setField(term215369, term215369.getClass(), "externsRoot", null);
        setField(term215369, term215369.getClass(), "jsRoot", null);
        setField(term215369, term215369.getClass(), "externAndJsRoot", null);
        setField(term215369, term215369.getClass(), "inputsById", null);
        setField(term215369, term215369.getClass(), "sourceMap", null);
        setField(term215369, term215369.getClass(), "externExports", null);
        setIntField(term215369, term215369.getClass(), "uniqueNameId", 0);
        setBooleanField(term215369, term215369.getClass(), "useThreads", false);
        setBooleanField(term215369, term215369.getClass(), "hasRegExpGlobalReferences", false);
        setField(term215369, term215369.getClass(), "functionInformationMap", null);
        setField(term215369, term215369.getClass(), "debugLog", null);
        setField(term215369, term215369.getClass(), "defaultCodingConvention", null);
        setField(term215369, term215369.getClass(), "typeRegistry", null);
        setField(term215369, term215369.getClass(), "parserConfig", null);
        setField(term215369, term215369.getClass(), "abstractInterpreter", null);
        setField(term215369, term215369.getClass(), "typeValidator", null);
        setField(term215369, term215369.getClass(), "tracker", null);
        setField(term215369, term215369.getClass(), "oldErrorReporter", null);
        setField(term215369, term215369.getClass(), "defaultErrorReporter", null);
        setField(term215369, term215369.getClass(), "outStream", null);
        setField(term215369, term215369.getClass(), "globalRefMap", null);
        setDoubleField(term215369, term215369.getClass(), "progress", 0.0);
        setField(term215369, term215369.getClass(), "sanityCheck", null);
        setField(term215369, term215369.getClass(), "currentTracer", null);
        setField(term215369, term215369.getClass(), "currentPassName", null);
        setIntField(term215369, term215369.getClass(), "syntheticCodeId", 0);
        setField(term215369, term215369.getClass(), "recentChange", null);
        setField(term215369, term215369.getClass(), "codeChangeHandlers", null);
        setField(term215369, term215369.getClass(), "synthesizedExternsInput", null);
        setField(term215369, term215369.getClass(), "stage", null);
        setField(term215368, term215368.getClass(), "compiler", term215369);
        setField(term215368, term215368.getClass(), "preprocessorSymbolTable", null);
        setField(term215368, term215368.getClass(), "transformationHandler", null);
        term215370 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term215371 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term215372 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term215373 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term215374 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term215370, term215370.getClass(), "number", 0.0);
        setIntField(term215370, term215370.getClass(), "type", 0);
        setField(term215370, term215370.getClass(), "next", null);
        setDoubleField(term215371, term215371.getClass(), "number", 0.0);
        setIntField(term215371, term215371.getClass(), "type", 0);
        setDoubleField(term215372, term215372.getClass(), "number", 0.0);
        setIntField(term215372, term215372.getClass(), "type", 0);
        setField(term215372, term215372.getClass(), "next", null);
        setField(term215372, term215372.getClass(), "first", null);
        setField(term215372, term215372.getClass(), "last", null);
        setField(term215372, term215372.getClass(), "propListHead", null);
        setIntField(term215372, term215372.getClass(), "sourcePosition", 0);
        setField(term215372, term215372.getClass(), "jsType", null);
        setField(term215372, term215372.getClass(), "parent", null);
        setField(term215371, term215371.getClass(), "next", term215372);
        setDoubleField(term215373, term215373.getClass(), "number", 0.0);
        setIntField(term215373, term215373.getClass(), "type", 105);
        setDoubleField(term215374, term215374.getClass(), "number", 0.0);
        setIntField(term215374, term215374.getClass(), "type", 0);
        setField(term215374, term215374.getClass(), "next", null);
        setField(term215374, term215374.getClass(), "first", null);
        setField(term215374, term215374.getClass(), "last", null);
        setField(term215374, term215374.getClass(), "propListHead", null);
        setIntField(term215374, term215374.getClass(), "sourcePosition", 0);
        setField(term215374, term215374.getClass(), "jsType", null);
        setField(term215374, term215374.getClass(), "parent", null);
        setField(term215373, term215373.getClass(), "next", term215374);
        setField(term215373, term215373.getClass(), "first", null);
        setField(term215373, term215373.getClass(), "last", null);
        setField(term215373, term215373.getClass(), "propListHead", null);
        setIntField(term215373, term215373.getClass(), "sourcePosition", 0);
        setField(term215373, term215373.getClass(), "jsType", null);
        setField(term215373, term215373.getClass(), "parent", null);
        setField(term215371, term215371.getClass(), "first", term215373);
        setField(term215371, term215371.getClass(), "last", null);
        setField(term215371, term215371.getClass(), "propListHead", null);
        setIntField(term215371, term215371.getClass(), "sourcePosition", 0);
        setField(term215371, term215371.getClass(), "jsType", null);
        setField(term215371, term215371.getClass(), "parent", null);
        setField(term215370, term215370.getClass(), "first", term215371);
        setField(term215370, term215370.getClass(), "last", null);
        setField(term215370, term215370.getClass(), "propListHead", null);
        setIntField(term215370, term215370.getClass(), "sourcePosition", 0);
        setField(term215370, term215370.getClass(), "jsType", null);
        setField(term215370, term215370.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term214192;
        callMethod(klass, "process", argTypes, term214020, args);
        assertTrue(recursiveEquals(term214020, term215368));
        assertTrue(recursiveEquals(term214192, null));
    }

};


