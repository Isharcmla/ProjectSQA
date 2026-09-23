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

public class ScopedAliases_process_840655313137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83954;
     Object term84126;
     Object term84448;
     Object term84450;

    public ScopedAliases_process_840655313137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83954 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term84034 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term83954, term83954.getClass(), "compiler", term84034);
        term84126 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term84126, term84126.getClass(), "type", 105);
        setField(term84126, term84126.getClass(), "parent", null);
        term84448 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term84449 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term84449, term84449.getClass(), "options", null);
        setField(term84449, term84449.getClass(), "passes", null);
        setField(term84449, term84449.getClass(), "externs", null);
        setField(term84449, term84449.getClass(), "modules", null);
        setField(term84449, term84449.getClass(), "moduleGraph", null);
        setField(term84449, term84449.getClass(), "inputs", null);
        setField(term84449, term84449.getClass(), "errorManager", null);
        setField(term84449, term84449.getClass(), "warningsGuard", null);
        setField(term84449, term84449.getClass(), "injectedLibraries", null);
        setField(term84449, term84449.getClass(), "externsRoot", null);
        setField(term84449, term84449.getClass(), "jsRoot", null);
        setField(term84449, term84449.getClass(), "externAndJsRoot", null);
        setField(term84449, term84449.getClass(), "inputsById", null);
        setField(term84449, term84449.getClass(), "sourceMap", null);
        setField(term84449, term84449.getClass(), "externExports", null);
        setIntField(term84449, term84449.getClass(), "uniqueNameId", 0);
        setBooleanField(term84449, term84449.getClass(), "useThreads", false);
        setBooleanField(term84449, term84449.getClass(), "hasRegExpGlobalReferences", false);
        setField(term84449, term84449.getClass(), "functionInformationMap", null);
        setField(term84449, term84449.getClass(), "debugLog", null);
        setField(term84449, term84449.getClass(), "defaultCodingConvention", null);
        setField(term84449, term84449.getClass(), "typeRegistry", null);
        setField(term84449, term84449.getClass(), "parserConfig", null);
        setField(term84449, term84449.getClass(), "abstractInterpreter", null);
        setField(term84449, term84449.getClass(), "typeValidator", null);
        setField(term84449, term84449.getClass(), "tracker", null);
        setField(term84449, term84449.getClass(), "oldErrorReporter", null);
        setField(term84449, term84449.getClass(), "defaultErrorReporter", null);
        setField(term84449, term84449.getClass(), "outStream", null);
        setField(term84449, term84449.getClass(), "globalRefMap", null);
        setDoubleField(term84449, term84449.getClass(), "progress", 0.0);
        setField(term84449, term84449.getClass(), "sanityCheck", null);
        setField(term84449, term84449.getClass(), "currentTracer", null);
        setField(term84449, term84449.getClass(), "currentPassName", null);
        setIntField(term84449, term84449.getClass(), "syntheticCodeId", 0);
        setField(term84449, term84449.getClass(), "recentChange", null);
        setField(term84449, term84449.getClass(), "codeChangeHandlers", null);
        setField(term84449, term84449.getClass(), "synthesizedExternsInput", null);
        setField(term84449, term84449.getClass(), "stage", null);
        setField(term84448, term84448.getClass(), "compiler", term84449);
        setField(term84448, term84448.getClass(), "preprocessorSymbolTable", null);
        setField(term84448, term84448.getClass(), "transformationHandler", null);
        term84450 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term84450, term84450.getClass(), "number", 0.0);
        setIntField(term84450, term84450.getClass(), "type", 105);
        setField(term84450, term84450.getClass(), "next", null);
        setField(term84450, term84450.getClass(), "first", null);
        setField(term84450, term84450.getClass(), "last", null);
        setField(term84450, term84450.getClass(), "propListHead", null);
        setIntField(term84450, term84450.getClass(), "sourcePosition", 0);
        setField(term84450, term84450.getClass(), "jsType", null);
        setField(term84450, term84450.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term84126;
        callMethod(klass, "process", argTypes, term83954, args);
        assertTrue(recursiveEquals(term83954, term84448));
        assertTrue(recursiveEquals(term84126, null));
    }

};


