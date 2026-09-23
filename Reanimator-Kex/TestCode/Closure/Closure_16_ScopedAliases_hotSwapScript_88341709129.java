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

public class ScopedAliases_hotSwapScript_88341709129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77909;
     Object term78059;
     Object term78925;
     Object term78927;

    public ScopedAliases_hotSwapScript_88341709129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77909 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term77989 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term77909, term77909.getClass(), "compiler", term77989);
        term78059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78129 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78269 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term78059, term78059.getClass(), "type", 0);
        setField(term78059, term78059.getClass(), "parent", null);
        setField(term78129, term78129.getClass(), "next", null);
        setIntField(term78129, term78129.getClass(), "type", 0);
        setField(term78269, term78269.getClass(), "next", null);
        setIntField(term78269, term78269.getClass(), "type", 0);
        setField(term78269, term78269.getClass(), "first", null);
        setField(term78199, term78199.getClass(), "next", term78269);
        setIntField(term78199, term78199.getClass(), "type", 105);
        setField(term78129, term78129.getClass(), "first", term78199);
        setField(term78059, term78059.getClass(), "first", term78129);
        term78925 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term78926 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term78926, term78926.getClass(), "options", null);
        setField(term78926, term78926.getClass(), "passes", null);
        setField(term78926, term78926.getClass(), "externs", null);
        setField(term78926, term78926.getClass(), "modules", null);
        setField(term78926, term78926.getClass(), "moduleGraph", null);
        setField(term78926, term78926.getClass(), "inputs", null);
        setField(term78926, term78926.getClass(), "errorManager", null);
        setField(term78926, term78926.getClass(), "warningsGuard", null);
        setField(term78926, term78926.getClass(), "injectedLibraries", null);
        setField(term78926, term78926.getClass(), "externsRoot", null);
        setField(term78926, term78926.getClass(), "jsRoot", null);
        setField(term78926, term78926.getClass(), "externAndJsRoot", null);
        setField(term78926, term78926.getClass(), "inputsById", null);
        setField(term78926, term78926.getClass(), "sourceMap", null);
        setField(term78926, term78926.getClass(), "externExports", null);
        setIntField(term78926, term78926.getClass(), "uniqueNameId", 0);
        setBooleanField(term78926, term78926.getClass(), "useThreads", false);
        setBooleanField(term78926, term78926.getClass(), "hasRegExpGlobalReferences", false);
        setField(term78926, term78926.getClass(), "functionInformationMap", null);
        setField(term78926, term78926.getClass(), "debugLog", null);
        setField(term78926, term78926.getClass(), "defaultCodingConvention", null);
        setField(term78926, term78926.getClass(), "typeRegistry", null);
        setField(term78926, term78926.getClass(), "parserConfig", null);
        setField(term78926, term78926.getClass(), "abstractInterpreter", null);
        setField(term78926, term78926.getClass(), "typeValidator", null);
        setField(term78926, term78926.getClass(), "tracker", null);
        setField(term78926, term78926.getClass(), "oldErrorReporter", null);
        setField(term78926, term78926.getClass(), "defaultErrorReporter", null);
        setField(term78926, term78926.getClass(), "outStream", null);
        setField(term78926, term78926.getClass(), "globalRefMap", null);
        setDoubleField(term78926, term78926.getClass(), "progress", 0.0);
        setField(term78926, term78926.getClass(), "sanityCheck", null);
        setField(term78926, term78926.getClass(), "currentTracer", null);
        setField(term78926, term78926.getClass(), "currentPassName", null);
        setIntField(term78926, term78926.getClass(), "syntheticCodeId", 0);
        setField(term78926, term78926.getClass(), "recentChange", null);
        setField(term78926, term78926.getClass(), "codeChangeHandlers", null);
        setField(term78926, term78926.getClass(), "synthesizedExternsInput", null);
        setField(term78926, term78926.getClass(), "stage", null);
        setField(term78925, term78925.getClass(), "compiler", term78926);
        setField(term78925, term78925.getClass(), "preprocessorSymbolTable", null);
        setField(term78925, term78925.getClass(), "transformationHandler", null);
        term78927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78928 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78930 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term78927, term78927.getClass(), "type", 0);
        setField(term78927, term78927.getClass(), "next", null);
        setIntField(term78928, term78928.getClass(), "type", 0);
        setField(term78928, term78928.getClass(), "next", null);
        setIntField(term78929, term78929.getClass(), "type", 105);
        setIntField(term78930, term78930.getClass(), "type", 0);
        setField(term78930, term78930.getClass(), "next", null);
        setField(term78930, term78930.getClass(), "first", null);
        setField(term78930, term78930.getClass(), "last", null);
        setField(term78930, term78930.getClass(), "propListHead", null);
        setIntField(term78930, term78930.getClass(), "sourcePosition", 0);
        setField(term78930, term78930.getClass(), "jsType", null);
        setField(term78930, term78930.getClass(), "parent", null);
        setField(term78929, term78929.getClass(), "next", term78930);
        setField(term78929, term78929.getClass(), "first", null);
        setField(term78929, term78929.getClass(), "last", null);
        setField(term78929, term78929.getClass(), "propListHead", null);
        setIntField(term78929, term78929.getClass(), "sourcePosition", 0);
        setField(term78929, term78929.getClass(), "jsType", null);
        setField(term78929, term78929.getClass(), "parent", null);
        setField(term78928, term78928.getClass(), "first", term78929);
        setField(term78928, term78928.getClass(), "last", null);
        setField(term78928, term78928.getClass(), "propListHead", null);
        setIntField(term78928, term78928.getClass(), "sourcePosition", 0);
        setField(term78928, term78928.getClass(), "jsType", null);
        setField(term78928, term78928.getClass(), "parent", null);
        setField(term78927, term78927.getClass(), "first", term78928);
        setField(term78927, term78927.getClass(), "last", null);
        setField(term78927, term78927.getClass(), "propListHead", null);
        setIntField(term78927, term78927.getClass(), "sourcePosition", 0);
        setField(term78927, term78927.getClass(), "jsType", null);
        setField(term78927, term78927.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term78059;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term77909, args);
        assertTrue(recursiveEquals(term77909, term78925));
        assertTrue(recursiveEquals(term78059, term78927));
    }

};


