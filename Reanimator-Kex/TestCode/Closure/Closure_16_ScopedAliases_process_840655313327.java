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

public class ScopedAliases_process_840655313327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218389;
     Object term218561;
     Object term219824;
     Object term219826;

    public ScopedAliases_process_840655313327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term218389 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term218469 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term218389, term218389.getClass(), "compiler", term218469);
        term218561 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term218653 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term218745 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term218837 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term218929 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term218561, term218561.getClass(), "type", 0);
        setField(term218561, term218561.getClass(), "parent", null);
        setField(term218745, term218745.getClass(), "next", null);
        setIntField(term218745, term218745.getClass(), "type", 0);
        setField(term218745, term218745.getClass(), "first", null);
        setField(term218653, term218653.getClass(), "next", term218745);
        setIntField(term218653, term218653.getClass(), "type", 0);
        setField(term218929, term218929.getClass(), "next", null);
        setIntField(term218929, term218929.getClass(), "type", 0);
        setField(term218929, term218929.getClass(), "first", null);
        setField(term218837, term218837.getClass(), "next", term218929);
        setIntField(term218837, term218837.getClass(), "type", 0);
        setField(term218837, term218837.getClass(), "first", null);
        setField(term218653, term218653.getClass(), "first", term218837);
        setField(term218561, term218561.getClass(), "first", term218653);
        term219824 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term219825 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term219825, term219825.getClass(), "options", null);
        setField(term219825, term219825.getClass(), "passes", null);
        setField(term219825, term219825.getClass(), "externs", null);
        setField(term219825, term219825.getClass(), "modules", null);
        setField(term219825, term219825.getClass(), "moduleGraph", null);
        setField(term219825, term219825.getClass(), "inputs", null);
        setField(term219825, term219825.getClass(), "errorManager", null);
        setField(term219825, term219825.getClass(), "warningsGuard", null);
        setField(term219825, term219825.getClass(), "injectedLibraries", null);
        setField(term219825, term219825.getClass(), "externsRoot", null);
        setField(term219825, term219825.getClass(), "jsRoot", null);
        setField(term219825, term219825.getClass(), "externAndJsRoot", null);
        setField(term219825, term219825.getClass(), "inputsById", null);
        setField(term219825, term219825.getClass(), "sourceMap", null);
        setField(term219825, term219825.getClass(), "externExports", null);
        setIntField(term219825, term219825.getClass(), "uniqueNameId", 0);
        setBooleanField(term219825, term219825.getClass(), "useThreads", false);
        setBooleanField(term219825, term219825.getClass(), "hasRegExpGlobalReferences", false);
        setField(term219825, term219825.getClass(), "functionInformationMap", null);
        setField(term219825, term219825.getClass(), "debugLog", null);
        setField(term219825, term219825.getClass(), "defaultCodingConvention", null);
        setField(term219825, term219825.getClass(), "typeRegistry", null);
        setField(term219825, term219825.getClass(), "parserConfig", null);
        setField(term219825, term219825.getClass(), "abstractInterpreter", null);
        setField(term219825, term219825.getClass(), "typeValidator", null);
        setField(term219825, term219825.getClass(), "tracker", null);
        setField(term219825, term219825.getClass(), "oldErrorReporter", null);
        setField(term219825, term219825.getClass(), "defaultErrorReporter", null);
        setField(term219825, term219825.getClass(), "outStream", null);
        setField(term219825, term219825.getClass(), "globalRefMap", null);
        setDoubleField(term219825, term219825.getClass(), "progress", 0.0);
        setField(term219825, term219825.getClass(), "sanityCheck", null);
        setField(term219825, term219825.getClass(), "currentTracer", null);
        setField(term219825, term219825.getClass(), "currentPassName", null);
        setIntField(term219825, term219825.getClass(), "syntheticCodeId", 0);
        setField(term219825, term219825.getClass(), "recentChange", null);
        setField(term219825, term219825.getClass(), "codeChangeHandlers", null);
        setField(term219825, term219825.getClass(), "synthesizedExternsInput", null);
        setField(term219825, term219825.getClass(), "stage", null);
        setField(term219824, term219824.getClass(), "compiler", term219825);
        setField(term219824, term219824.getClass(), "preprocessorSymbolTable", null);
        setField(term219824, term219824.getClass(), "transformationHandler", null);
        term219826 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term219827 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term219828 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term219829 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term219830 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term219826, term219826.getClass(), "number", 0.0);
        setIntField(term219826, term219826.getClass(), "type", 0);
        setField(term219826, term219826.getClass(), "next", null);
        setDoubleField(term219827, term219827.getClass(), "number", 0.0);
        setIntField(term219827, term219827.getClass(), "type", 0);
        setDoubleField(term219828, term219828.getClass(), "number", 0.0);
        setIntField(term219828, term219828.getClass(), "type", 0);
        setField(term219828, term219828.getClass(), "next", null);
        setField(term219828, term219828.getClass(), "first", null);
        setField(term219828, term219828.getClass(), "last", null);
        setField(term219828, term219828.getClass(), "propListHead", null);
        setIntField(term219828, term219828.getClass(), "sourcePosition", 0);
        setField(term219828, term219828.getClass(), "jsType", null);
        setField(term219828, term219828.getClass(), "parent", null);
        setField(term219827, term219827.getClass(), "next", term219828);
        setDoubleField(term219829, term219829.getClass(), "number", 0.0);
        setIntField(term219829, term219829.getClass(), "type", 0);
        setDoubleField(term219830, term219830.getClass(), "number", 0.0);
        setIntField(term219830, term219830.getClass(), "type", 0);
        setField(term219830, term219830.getClass(), "next", null);
        setField(term219830, term219830.getClass(), "first", null);
        setField(term219830, term219830.getClass(), "last", null);
        setField(term219830, term219830.getClass(), "propListHead", null);
        setIntField(term219830, term219830.getClass(), "sourcePosition", 0);
        setField(term219830, term219830.getClass(), "jsType", null);
        setField(term219830, term219830.getClass(), "parent", null);
        setField(term219829, term219829.getClass(), "next", term219830);
        setField(term219829, term219829.getClass(), "first", null);
        setField(term219829, term219829.getClass(), "last", null);
        setField(term219829, term219829.getClass(), "propListHead", null);
        setIntField(term219829, term219829.getClass(), "sourcePosition", 0);
        setField(term219829, term219829.getClass(), "jsType", null);
        setField(term219829, term219829.getClass(), "parent", null);
        setField(term219827, term219827.getClass(), "first", term219829);
        setField(term219827, term219827.getClass(), "last", null);
        setField(term219827, term219827.getClass(), "propListHead", null);
        setIntField(term219827, term219827.getClass(), "sourcePosition", 0);
        setField(term219827, term219827.getClass(), "jsType", null);
        setField(term219827, term219827.getClass(), "parent", null);
        setField(term219826, term219826.getClass(), "first", term219827);
        setField(term219826, term219826.getClass(), "last", null);
        setField(term219826, term219826.getClass(), "propListHead", null);
        setIntField(term219826, term219826.getClass(), "sourcePosition", 0);
        setField(term219826, term219826.getClass(), "jsType", null);
        setField(term219826, term219826.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term218561;
        callMethod(klass, "process", argTypes, term218389, args);
        assertTrue(recursiveEquals(term218389, term219824));
        assertTrue(recursiveEquals(term218561, null));
    }

};


