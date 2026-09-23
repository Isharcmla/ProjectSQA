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

public class ScopedAliases_process_840655313168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101336;
     Object term101508;
     Object term102671;
     Object term102673;

    public ScopedAliases_process_840655313168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101336 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term101416 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term101336, term101336.getClass(), "compiler", term101416);
        term101508 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term101600 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term101508, term101508.getClass(), "type", 0);
        setIntField(term101600, term101600.getClass(), "type", 0);
        setField(term101600, term101600.getClass(), "parent", null);
        setField(term101508, term101508.getClass(), "parent", term101600);
        setField(term101508, term101508.getClass(), "first", null);
        term102671 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term102672 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term102672, term102672.getClass(), "options", null);
        setField(term102672, term102672.getClass(), "passes", null);
        setField(term102672, term102672.getClass(), "externs", null);
        setField(term102672, term102672.getClass(), "modules", null);
        setField(term102672, term102672.getClass(), "moduleGraph", null);
        setField(term102672, term102672.getClass(), "inputs", null);
        setField(term102672, term102672.getClass(), "errorManager", null);
        setField(term102672, term102672.getClass(), "warningsGuard", null);
        setField(term102672, term102672.getClass(), "injectedLibraries", null);
        setField(term102672, term102672.getClass(), "externsRoot", null);
        setField(term102672, term102672.getClass(), "jsRoot", null);
        setField(term102672, term102672.getClass(), "externAndJsRoot", null);
        setField(term102672, term102672.getClass(), "inputsById", null);
        setField(term102672, term102672.getClass(), "sourceMap", null);
        setField(term102672, term102672.getClass(), "externExports", null);
        setIntField(term102672, term102672.getClass(), "uniqueNameId", 0);
        setBooleanField(term102672, term102672.getClass(), "useThreads", false);
        setBooleanField(term102672, term102672.getClass(), "hasRegExpGlobalReferences", false);
        setField(term102672, term102672.getClass(), "functionInformationMap", null);
        setField(term102672, term102672.getClass(), "debugLog", null);
        setField(term102672, term102672.getClass(), "defaultCodingConvention", null);
        setField(term102672, term102672.getClass(), "typeRegistry", null);
        setField(term102672, term102672.getClass(), "parserConfig", null);
        setField(term102672, term102672.getClass(), "abstractInterpreter", null);
        setField(term102672, term102672.getClass(), "typeValidator", null);
        setField(term102672, term102672.getClass(), "tracker", null);
        setField(term102672, term102672.getClass(), "oldErrorReporter", null);
        setField(term102672, term102672.getClass(), "defaultErrorReporter", null);
        setField(term102672, term102672.getClass(), "outStream", null);
        setField(term102672, term102672.getClass(), "globalRefMap", null);
        setDoubleField(term102672, term102672.getClass(), "progress", 0.0);
        setField(term102672, term102672.getClass(), "sanityCheck", null);
        setField(term102672, term102672.getClass(), "currentTracer", null);
        setField(term102672, term102672.getClass(), "currentPassName", null);
        setIntField(term102672, term102672.getClass(), "syntheticCodeId", 0);
        setField(term102672, term102672.getClass(), "recentChange", null);
        setField(term102672, term102672.getClass(), "codeChangeHandlers", null);
        setField(term102672, term102672.getClass(), "synthesizedExternsInput", null);
        setField(term102672, term102672.getClass(), "stage", null);
        setField(term102671, term102671.getClass(), "compiler", term102672);
        setField(term102671, term102671.getClass(), "preprocessorSymbolTable", null);
        setField(term102671, term102671.getClass(), "transformationHandler", null);
        term102673 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term102674 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term102673, term102673.getClass(), "str", null);
        setIntField(term102673, term102673.getClass(), "type", 0);
        setField(term102673, term102673.getClass(), "next", null);
        setField(term102673, term102673.getClass(), "first", null);
        setField(term102673, term102673.getClass(), "last", null);
        setField(term102673, term102673.getClass(), "propListHead", null);
        setIntField(term102673, term102673.getClass(), "sourcePosition", 0);
        setField(term102673, term102673.getClass(), "jsType", null);
        setField(term102674, term102674.getClass(), "str", null);
        setIntField(term102674, term102674.getClass(), "type", 0);
        setField(term102674, term102674.getClass(), "next", null);
        setField(term102674, term102674.getClass(), "first", null);
        setField(term102674, term102674.getClass(), "last", null);
        setField(term102674, term102674.getClass(), "propListHead", null);
        setIntField(term102674, term102674.getClass(), "sourcePosition", 0);
        setField(term102674, term102674.getClass(), "jsType", null);
        setField(term102674, term102674.getClass(), "parent", null);
        setField(term102673, term102673.getClass(), "parent", term102674);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term101508;
        callMethod(klass, "process", argTypes, term101336, args);
        assertTrue(recursiveEquals(term101336, term102671));
        assertTrue(recursiveEquals(term101508, null));
    }

};


