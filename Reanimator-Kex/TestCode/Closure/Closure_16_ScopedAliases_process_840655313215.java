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

public class ScopedAliases_process_840655313215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132753;
     Object term132925;
     Object term133881;
     Object term133883;

    public ScopedAliases_process_840655313215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132753 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term132833 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term132753, term132753.getClass(), "compiler", term132833);
        term132925 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term133017 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term133109 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term133179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term132925, term132925.getClass(), "type", 0);
        setField(term132925, term132925.getClass(), "parent", null);
        setField(term133109, term133109.getClass(), "next", null);
        setIntField(term133109, term133109.getClass(), "type", 0);
        setField(term133109, term133109.getClass(), "first", null);
        setField(term133017, term133017.getClass(), "next", term133109);
        setIntField(term133017, term133017.getClass(), "type", 0);
        setField(term133179, term133179.getClass(), "next", null);
        setIntField(term133179, term133179.getClass(), "type", 0);
        setField(term133179, term133179.getClass(), "first", null);
        setField(term133017, term133017.getClass(), "first", term133179);
        setField(term132925, term132925.getClass(), "first", term133017);
        term133881 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term133882 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term133882, term133882.getClass(), "options", null);
        setField(term133882, term133882.getClass(), "passes", null);
        setField(term133882, term133882.getClass(), "externs", null);
        setField(term133882, term133882.getClass(), "modules", null);
        setField(term133882, term133882.getClass(), "moduleGraph", null);
        setField(term133882, term133882.getClass(), "inputs", null);
        setField(term133882, term133882.getClass(), "errorManager", null);
        setField(term133882, term133882.getClass(), "warningsGuard", null);
        setField(term133882, term133882.getClass(), "injectedLibraries", null);
        setField(term133882, term133882.getClass(), "externsRoot", null);
        setField(term133882, term133882.getClass(), "jsRoot", null);
        setField(term133882, term133882.getClass(), "externAndJsRoot", null);
        setField(term133882, term133882.getClass(), "inputsById", null);
        setField(term133882, term133882.getClass(), "sourceMap", null);
        setField(term133882, term133882.getClass(), "externExports", null);
        setIntField(term133882, term133882.getClass(), "uniqueNameId", 0);
        setBooleanField(term133882, term133882.getClass(), "useThreads", false);
        setBooleanField(term133882, term133882.getClass(), "hasRegExpGlobalReferences", false);
        setField(term133882, term133882.getClass(), "functionInformationMap", null);
        setField(term133882, term133882.getClass(), "debugLog", null);
        setField(term133882, term133882.getClass(), "defaultCodingConvention", null);
        setField(term133882, term133882.getClass(), "typeRegistry", null);
        setField(term133882, term133882.getClass(), "parserConfig", null);
        setField(term133882, term133882.getClass(), "abstractInterpreter", null);
        setField(term133882, term133882.getClass(), "typeValidator", null);
        setField(term133882, term133882.getClass(), "tracker", null);
        setField(term133882, term133882.getClass(), "oldErrorReporter", null);
        setField(term133882, term133882.getClass(), "defaultErrorReporter", null);
        setField(term133882, term133882.getClass(), "outStream", null);
        setField(term133882, term133882.getClass(), "globalRefMap", null);
        setDoubleField(term133882, term133882.getClass(), "progress", 0.0);
        setField(term133882, term133882.getClass(), "sanityCheck", null);
        setField(term133882, term133882.getClass(), "currentTracer", null);
        setField(term133882, term133882.getClass(), "currentPassName", null);
        setIntField(term133882, term133882.getClass(), "syntheticCodeId", 0);
        setField(term133882, term133882.getClass(), "recentChange", null);
        setField(term133882, term133882.getClass(), "codeChangeHandlers", null);
        setField(term133882, term133882.getClass(), "synthesizedExternsInput", null);
        setField(term133882, term133882.getClass(), "stage", null);
        setField(term133881, term133881.getClass(), "compiler", term133882);
        setField(term133881, term133881.getClass(), "preprocessorSymbolTable", null);
        setField(term133881, term133881.getClass(), "transformationHandler", null);
        term133883 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term133884 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term133885 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term133886 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term133883, term133883.getClass(), "number", 0.0);
        setIntField(term133883, term133883.getClass(), "type", 0);
        setField(term133883, term133883.getClass(), "next", null);
        setDoubleField(term133884, term133884.getClass(), "number", 0.0);
        setIntField(term133884, term133884.getClass(), "type", 0);
        setDoubleField(term133885, term133885.getClass(), "number", 0.0);
        setIntField(term133885, term133885.getClass(), "type", 0);
        setField(term133885, term133885.getClass(), "next", null);
        setField(term133885, term133885.getClass(), "first", null);
        setField(term133885, term133885.getClass(), "last", null);
        setField(term133885, term133885.getClass(), "propListHead", null);
        setIntField(term133885, term133885.getClass(), "sourcePosition", 0);
        setField(term133885, term133885.getClass(), "jsType", null);
        setField(term133885, term133885.getClass(), "parent", null);
        setField(term133884, term133884.getClass(), "next", term133885);
        setIntField(term133886, term133886.getClass(), "type", 0);
        setField(term133886, term133886.getClass(), "next", null);
        setField(term133886, term133886.getClass(), "first", null);
        setField(term133886, term133886.getClass(), "last", null);
        setField(term133886, term133886.getClass(), "propListHead", null);
        setIntField(term133886, term133886.getClass(), "sourcePosition", 0);
        setField(term133886, term133886.getClass(), "jsType", null);
        setField(term133886, term133886.getClass(), "parent", null);
        setField(term133884, term133884.getClass(), "first", term133886);
        setField(term133884, term133884.getClass(), "last", null);
        setField(term133884, term133884.getClass(), "propListHead", null);
        setIntField(term133884, term133884.getClass(), "sourcePosition", 0);
        setField(term133884, term133884.getClass(), "jsType", null);
        setField(term133884, term133884.getClass(), "parent", null);
        setField(term133883, term133883.getClass(), "first", term133884);
        setField(term133883, term133883.getClass(), "last", null);
        setField(term133883, term133883.getClass(), "propListHead", null);
        setIntField(term133883, term133883.getClass(), "sourcePosition", 0);
        setField(term133883, term133883.getClass(), "jsType", null);
        setField(term133883, term133883.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term132925;
        callMethod(klass, "process", argTypes, term132753, args);
        assertTrue(recursiveEquals(term132753, term133881));
        assertTrue(recursiveEquals(term132925, null));
    }

};


