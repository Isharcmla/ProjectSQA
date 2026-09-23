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

public class ScopedAliases_hotSwapScript_8834170985 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49467;
     Object term49617;
     Object term50882;
     Object term50884;

    public ScopedAliases_hotSwapScript_8834170985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49467 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term49547 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term49467, term49467.getClass(), "compiler", term49547);
        term49617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term49617, term49617.getClass(), "type", 0);
        setField(term49617, term49617.getClass(), "parent", null);
        setField(term49757, term49757.getClass(), "next", null);
        setIntField(term49757, term49757.getClass(), "type", 0);
        setField(term49757, term49757.getClass(), "first", null);
        setField(term49687, term49687.getClass(), "next", term49757);
        setIntField(term49687, term49687.getClass(), "type", 0);
        setField(term49897, term49897.getClass(), "next", null);
        setIntField(term49897, term49897.getClass(), "type", 0);
        setField(term49897, term49897.getClass(), "first", null);
        setField(term49827, term49827.getClass(), "next", term49897);
        setIntField(term49827, term49827.getClass(), "type", 0);
        setField(term49967, term49967.getClass(), "next", null);
        setIntField(term49967, term49967.getClass(), "type", 0);
        setField(term49967, term49967.getClass(), "first", null);
        setField(term49827, term49827.getClass(), "first", term49967);
        setField(term49687, term49687.getClass(), "first", term49827);
        setField(term49617, term49617.getClass(), "first", term49687);
        term50882 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term50883 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term50883, term50883.getClass(), "options", null);
        setField(term50883, term50883.getClass(), "passes", null);
        setField(term50883, term50883.getClass(), "externs", null);
        setField(term50883, term50883.getClass(), "modules", null);
        setField(term50883, term50883.getClass(), "moduleGraph", null);
        setField(term50883, term50883.getClass(), "inputs", null);
        setField(term50883, term50883.getClass(), "errorManager", null);
        setField(term50883, term50883.getClass(), "warningsGuard", null);
        setField(term50883, term50883.getClass(), "injectedLibraries", null);
        setField(term50883, term50883.getClass(), "externsRoot", null);
        setField(term50883, term50883.getClass(), "jsRoot", null);
        setField(term50883, term50883.getClass(), "externAndJsRoot", null);
        setField(term50883, term50883.getClass(), "inputsById", null);
        setField(term50883, term50883.getClass(), "sourceMap", null);
        setField(term50883, term50883.getClass(), "externExports", null);
        setIntField(term50883, term50883.getClass(), "uniqueNameId", 0);
        setBooleanField(term50883, term50883.getClass(), "useThreads", false);
        setBooleanField(term50883, term50883.getClass(), "hasRegExpGlobalReferences", false);
        setField(term50883, term50883.getClass(), "functionInformationMap", null);
        setField(term50883, term50883.getClass(), "debugLog", null);
        setField(term50883, term50883.getClass(), "defaultCodingConvention", null);
        setField(term50883, term50883.getClass(), "typeRegistry", null);
        setField(term50883, term50883.getClass(), "parserConfig", null);
        setField(term50883, term50883.getClass(), "abstractInterpreter", null);
        setField(term50883, term50883.getClass(), "typeValidator", null);
        setField(term50883, term50883.getClass(), "tracker", null);
        setField(term50883, term50883.getClass(), "oldErrorReporter", null);
        setField(term50883, term50883.getClass(), "defaultErrorReporter", null);
        setField(term50883, term50883.getClass(), "outStream", null);
        setField(term50883, term50883.getClass(), "globalRefMap", null);
        setDoubleField(term50883, term50883.getClass(), "progress", 0.0);
        setField(term50883, term50883.getClass(), "sanityCheck", null);
        setField(term50883, term50883.getClass(), "currentTracer", null);
        setField(term50883, term50883.getClass(), "currentPassName", null);
        setIntField(term50883, term50883.getClass(), "syntheticCodeId", 0);
        setField(term50883, term50883.getClass(), "recentChange", null);
        setField(term50883, term50883.getClass(), "codeChangeHandlers", null);
        setField(term50883, term50883.getClass(), "synthesizedExternsInput", null);
        setField(term50883, term50883.getClass(), "stage", null);
        setField(term50882, term50882.getClass(), "compiler", term50883);
        setField(term50882, term50882.getClass(), "preprocessorSymbolTable", null);
        setField(term50882, term50882.getClass(), "transformationHandler", null);
        term50884 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50885 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50886 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50887 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50888 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50889 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term50884, term50884.getClass(), "type", 0);
        setField(term50884, term50884.getClass(), "next", null);
        setIntField(term50885, term50885.getClass(), "type", 0);
        setIntField(term50886, term50886.getClass(), "type", 0);
        setField(term50886, term50886.getClass(), "next", null);
        setField(term50886, term50886.getClass(), "first", null);
        setField(term50886, term50886.getClass(), "last", null);
        setField(term50886, term50886.getClass(), "propListHead", null);
        setIntField(term50886, term50886.getClass(), "sourcePosition", 0);
        setField(term50886, term50886.getClass(), "jsType", null);
        setField(term50886, term50886.getClass(), "parent", null);
        setField(term50885, term50885.getClass(), "next", term50886);
        setIntField(term50887, term50887.getClass(), "type", 0);
        setIntField(term50888, term50888.getClass(), "type", 0);
        setField(term50888, term50888.getClass(), "next", null);
        setField(term50888, term50888.getClass(), "first", null);
        setField(term50888, term50888.getClass(), "last", null);
        setField(term50888, term50888.getClass(), "propListHead", null);
        setIntField(term50888, term50888.getClass(), "sourcePosition", 0);
        setField(term50888, term50888.getClass(), "jsType", null);
        setField(term50888, term50888.getClass(), "parent", null);
        setField(term50887, term50887.getClass(), "next", term50888);
        setIntField(term50889, term50889.getClass(), "type", 0);
        setField(term50889, term50889.getClass(), "next", null);
        setField(term50889, term50889.getClass(), "first", null);
        setField(term50889, term50889.getClass(), "last", null);
        setField(term50889, term50889.getClass(), "propListHead", null);
        setIntField(term50889, term50889.getClass(), "sourcePosition", 0);
        setField(term50889, term50889.getClass(), "jsType", null);
        setField(term50889, term50889.getClass(), "parent", null);
        setField(term50887, term50887.getClass(), "first", term50889);
        setField(term50887, term50887.getClass(), "last", null);
        setField(term50887, term50887.getClass(), "propListHead", null);
        setIntField(term50887, term50887.getClass(), "sourcePosition", 0);
        setField(term50887, term50887.getClass(), "jsType", null);
        setField(term50887, term50887.getClass(), "parent", null);
        setField(term50885, term50885.getClass(), "first", term50887);
        setField(term50885, term50885.getClass(), "last", null);
        setField(term50885, term50885.getClass(), "propListHead", null);
        setIntField(term50885, term50885.getClass(), "sourcePosition", 0);
        setField(term50885, term50885.getClass(), "jsType", null);
        setField(term50885, term50885.getClass(), "parent", null);
        setField(term50884, term50884.getClass(), "first", term50885);
        setField(term50884, term50884.getClass(), "last", null);
        setField(term50884, term50884.getClass(), "propListHead", null);
        setIntField(term50884, term50884.getClass(), "sourcePosition", 0);
        setField(term50884, term50884.getClass(), "jsType", null);
        setField(term50884, term50884.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term49617;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term49467, args);
        assertTrue(recursiveEquals(term49467, term50882));
        assertTrue(recursiveEquals(term49617, term50884));
    }

};


