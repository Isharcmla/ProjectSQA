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

public class ScopedAliases_process_84065531343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21124;
     Object term21274;
     Object term21737;
     Object term21739;

    public ScopedAliases_process_84065531343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21124 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term21204 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term21124, term21124.getClass(), "compiler", term21204);
        term21274 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21274, term21274.getClass(), "type", 37);
        setField(term21274, term21274.getClass(), "parent", null);
        setField(term21344, term21344.getClass(), "next", null);
        setIntField(term21344, term21344.getClass(), "type", 42);
        setField(term21344, term21344.getClass(), "first", null);
        setField(term21274, term21274.getClass(), "first", term21344);
        term21737 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term21738 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term21738, term21738.getClass(), "options", null);
        setField(term21738, term21738.getClass(), "passes", null);
        setField(term21738, term21738.getClass(), "externs", null);
        setField(term21738, term21738.getClass(), "modules", null);
        setField(term21738, term21738.getClass(), "moduleGraph", null);
        setField(term21738, term21738.getClass(), "inputs", null);
        setField(term21738, term21738.getClass(), "errorManager", null);
        setField(term21738, term21738.getClass(), "warningsGuard", null);
        setField(term21738, term21738.getClass(), "externsRoot", null);
        setField(term21738, term21738.getClass(), "jsRoot", null);
        setField(term21738, term21738.getClass(), "externAndJsRoot", null);
        setField(term21738, term21738.getClass(), "inputsById", null);
        setField(term21738, term21738.getClass(), "sourceMap", null);
        setField(term21738, term21738.getClass(), "externExports", null);
        setIntField(term21738, term21738.getClass(), "uniqueNameId", 0);
        setBooleanField(term21738, term21738.getClass(), "useThreads", false);
        setBooleanField(term21738, term21738.getClass(), "hasRegExpGlobalReferences", false);
        setField(term21738, term21738.getClass(), "functionInformationMap", null);
        setField(term21738, term21738.getClass(), "debugLog", null);
        setField(term21738, term21738.getClass(), "defaultCodingConvention", null);
        setField(term21738, term21738.getClass(), "typeRegistry", null);
        setField(term21738, term21738.getClass(), "parserConfig", null);
        setField(term21738, term21738.getClass(), "abstractInterpreter", null);
        setField(term21738, term21738.getClass(), "typeValidator", null);
        setField(term21738, term21738.getClass(), "tracker", null);
        setField(term21738, term21738.getClass(), "oldErrorReporter", null);
        setField(term21738, term21738.getClass(), "defaultErrorReporter", null);
        setField(term21738, term21738.getClass(), "outStream", null);
        setField(term21738, term21738.getClass(), "globalRefMap", null);
        setField(term21738, term21738.getClass(), "sanityCheck", null);
        setField(term21738, term21738.getClass(), "currentTracer", null);
        setField(term21738, term21738.getClass(), "currentPassName", null);
        setIntField(term21738, term21738.getClass(), "syntheticCodeId", 0);
        setField(term21738, term21738.getClass(), "recentChange", null);
        setField(term21738, term21738.getClass(), "codeChangeHandlers", null);
        setField(term21738, term21738.getClass(), "stage", null);
        setField(term21737, term21737.getClass(), "compiler", term21738);
        setField(term21737, term21737.getClass(), "preprocessorSymbolTable", null);
        setField(term21737, term21737.getClass(), "transformationHandler", null);
        term21739 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21739, term21739.getClass(), "type", 37);
        setField(term21739, term21739.getClass(), "next", null);
        setIntField(term21740, term21740.getClass(), "type", 42);
        setField(term21740, term21740.getClass(), "next", null);
        setField(term21740, term21740.getClass(), "first", null);
        setField(term21740, term21740.getClass(), "last", null);
        setField(term21740, term21740.getClass(), "propListHead", null);
        setIntField(term21740, term21740.getClass(), "sourcePosition", 0);
        setField(term21740, term21740.getClass(), "jsType", null);
        setField(term21740, term21740.getClass(), "parent", null);
        setField(term21739, term21739.getClass(), "first", term21740);
        setField(term21739, term21739.getClass(), "last", null);
        setField(term21739, term21739.getClass(), "propListHead", null);
        setIntField(term21739, term21739.getClass(), "sourcePosition", 0);
        setField(term21739, term21739.getClass(), "jsType", null);
        setField(term21739, term21739.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term21274;
        callMethod(klass, "process", argTypes, term21124, args);
        assertTrue(recursiveEquals(term21124, term21737));
        assertTrue(recursiveEquals(term21274, null));
    }

};


