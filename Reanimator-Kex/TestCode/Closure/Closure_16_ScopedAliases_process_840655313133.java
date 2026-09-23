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

public class ScopedAliases_process_840655313133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81327;
     Object term81477;
     Object term82555;
     Object term82557;

    public ScopedAliases_process_840655313133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81327 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term81407 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term81327, term81327.getClass(), "compiler", term81407);
        term81477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81547 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term81477, term81477.getClass(), "type", 0);
        setField(term81477, term81477.getClass(), "parent", null);
        setField(term81687, term81687.getClass(), "next", null);
        setIntField(term81687, term81687.getClass(), "type", 0);
        setField(term81687, term81687.getClass(), "first", null);
        setField(term81617, term81617.getClass(), "next", term81687);
        setIntField(term81617, term81617.getClass(), "type", 0);
        setField(term81617, term81617.getClass(), "first", null);
        setField(term81547, term81547.getClass(), "next", term81617);
        setIntField(term81547, term81547.getClass(), "type", 0);
        setField(term81757, term81757.getClass(), "next", null);
        setIntField(term81757, term81757.getClass(), "type", 0);
        setField(term81757, term81757.getClass(), "first", null);
        setField(term81547, term81547.getClass(), "first", term81757);
        setField(term81477, term81477.getClass(), "first", term81547);
        term82555 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term82556 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term82556, term82556.getClass(), "options", null);
        setField(term82556, term82556.getClass(), "passes", null);
        setField(term82556, term82556.getClass(), "externs", null);
        setField(term82556, term82556.getClass(), "modules", null);
        setField(term82556, term82556.getClass(), "moduleGraph", null);
        setField(term82556, term82556.getClass(), "inputs", null);
        setField(term82556, term82556.getClass(), "errorManager", null);
        setField(term82556, term82556.getClass(), "warningsGuard", null);
        setField(term82556, term82556.getClass(), "injectedLibraries", null);
        setField(term82556, term82556.getClass(), "externsRoot", null);
        setField(term82556, term82556.getClass(), "jsRoot", null);
        setField(term82556, term82556.getClass(), "externAndJsRoot", null);
        setField(term82556, term82556.getClass(), "inputsById", null);
        setField(term82556, term82556.getClass(), "sourceMap", null);
        setField(term82556, term82556.getClass(), "externExports", null);
        setIntField(term82556, term82556.getClass(), "uniqueNameId", 0);
        setBooleanField(term82556, term82556.getClass(), "useThreads", false);
        setBooleanField(term82556, term82556.getClass(), "hasRegExpGlobalReferences", false);
        setField(term82556, term82556.getClass(), "functionInformationMap", null);
        setField(term82556, term82556.getClass(), "debugLog", null);
        setField(term82556, term82556.getClass(), "defaultCodingConvention", null);
        setField(term82556, term82556.getClass(), "typeRegistry", null);
        setField(term82556, term82556.getClass(), "parserConfig", null);
        setField(term82556, term82556.getClass(), "abstractInterpreter", null);
        setField(term82556, term82556.getClass(), "typeValidator", null);
        setField(term82556, term82556.getClass(), "tracker", null);
        setField(term82556, term82556.getClass(), "oldErrorReporter", null);
        setField(term82556, term82556.getClass(), "defaultErrorReporter", null);
        setField(term82556, term82556.getClass(), "outStream", null);
        setField(term82556, term82556.getClass(), "globalRefMap", null);
        setDoubleField(term82556, term82556.getClass(), "progress", 0.0);
        setField(term82556, term82556.getClass(), "sanityCheck", null);
        setField(term82556, term82556.getClass(), "currentTracer", null);
        setField(term82556, term82556.getClass(), "currentPassName", null);
        setIntField(term82556, term82556.getClass(), "syntheticCodeId", 0);
        setField(term82556, term82556.getClass(), "recentChange", null);
        setField(term82556, term82556.getClass(), "codeChangeHandlers", null);
        setField(term82556, term82556.getClass(), "synthesizedExternsInput", null);
        setField(term82556, term82556.getClass(), "stage", null);
        setField(term82555, term82555.getClass(), "compiler", term82556);
        setField(term82555, term82555.getClass(), "preprocessorSymbolTable", null);
        setField(term82555, term82555.getClass(), "transformationHandler", null);
        term82557 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term82558 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term82559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term82560 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term82561 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term82557, term82557.getClass(), "type", 0);
        setField(term82557, term82557.getClass(), "next", null);
        setIntField(term82558, term82558.getClass(), "type", 0);
        setIntField(term82559, term82559.getClass(), "type", 0);
        setIntField(term82560, term82560.getClass(), "type", 0);
        setField(term82560, term82560.getClass(), "next", null);
        setField(term82560, term82560.getClass(), "first", null);
        setField(term82560, term82560.getClass(), "last", null);
        setField(term82560, term82560.getClass(), "propListHead", null);
        setIntField(term82560, term82560.getClass(), "sourcePosition", 0);
        setField(term82560, term82560.getClass(), "jsType", null);
        setField(term82560, term82560.getClass(), "parent", null);
        setField(term82559, term82559.getClass(), "next", term82560);
        setField(term82559, term82559.getClass(), "first", null);
        setField(term82559, term82559.getClass(), "last", null);
        setField(term82559, term82559.getClass(), "propListHead", null);
        setIntField(term82559, term82559.getClass(), "sourcePosition", 0);
        setField(term82559, term82559.getClass(), "jsType", null);
        setField(term82559, term82559.getClass(), "parent", null);
        setField(term82558, term82558.getClass(), "next", term82559);
        setIntField(term82561, term82561.getClass(), "type", 0);
        setField(term82561, term82561.getClass(), "next", null);
        setField(term82561, term82561.getClass(), "first", null);
        setField(term82561, term82561.getClass(), "last", null);
        setField(term82561, term82561.getClass(), "propListHead", null);
        setIntField(term82561, term82561.getClass(), "sourcePosition", 0);
        setField(term82561, term82561.getClass(), "jsType", null);
        setField(term82561, term82561.getClass(), "parent", null);
        setField(term82558, term82558.getClass(), "first", term82561);
        setField(term82558, term82558.getClass(), "last", null);
        setField(term82558, term82558.getClass(), "propListHead", null);
        setIntField(term82558, term82558.getClass(), "sourcePosition", 0);
        setField(term82558, term82558.getClass(), "jsType", null);
        setField(term82558, term82558.getClass(), "parent", null);
        setField(term82557, term82557.getClass(), "first", term82558);
        setField(term82557, term82557.getClass(), "last", null);
        setField(term82557, term82557.getClass(), "propListHead", null);
        setIntField(term82557, term82557.getClass(), "sourcePosition", 0);
        setField(term82557, term82557.getClass(), "jsType", null);
        setField(term82557, term82557.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term81477;
        callMethod(klass, "process", argTypes, term81327, args);
        assertTrue(recursiveEquals(term81327, term82555));
        assertTrue(recursiveEquals(term81477, null));
    }

};


