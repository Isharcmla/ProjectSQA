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

public class ScopedAliases_hotSwapScript_88341709263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166146;
     Object term166296;
     Object term168232;
     Object term168234;

    public ScopedAliases_hotSwapScript_88341709263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166146 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term166226 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term166146, term166146.getClass(), "compiler", term166226);
        term166296 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term166366 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term166436 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term166506 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term166576 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term166646 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term166296, term166296.getClass(), "type", 0);
        setField(term166296, term166296.getClass(), "parent", null);
        setField(term166436, term166436.getClass(), "next", null);
        setIntField(term166436, term166436.getClass(), "type", 0);
        setField(term166436, term166436.getClass(), "first", null);
        setField(term166366, term166366.getClass(), "next", term166436);
        setIntField(term166366, term166366.getClass(), "type", 0);
        setField(term166646, term166646.getClass(), "next", null);
        setIntField(term166646, term166646.getClass(), "type", 0);
        setField(term166646, term166646.getClass(), "first", null);
        setField(term166576, term166576.getClass(), "next", term166646);
        setIntField(term166576, term166576.getClass(), "type", 105);
        setField(term166506, term166506.getClass(), "next", term166576);
        setIntField(term166506, term166506.getClass(), "type", 105);
        setField(term166366, term166366.getClass(), "first", term166506);
        setField(term166296, term166296.getClass(), "first", term166366);
        term168232 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term168233 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term168233, term168233.getClass(), "options", null);
        setField(term168233, term168233.getClass(), "passes", null);
        setField(term168233, term168233.getClass(), "externs", null);
        setField(term168233, term168233.getClass(), "modules", null);
        setField(term168233, term168233.getClass(), "moduleGraph", null);
        setField(term168233, term168233.getClass(), "inputs", null);
        setField(term168233, term168233.getClass(), "errorManager", null);
        setField(term168233, term168233.getClass(), "warningsGuard", null);
        setField(term168233, term168233.getClass(), "injectedLibraries", null);
        setField(term168233, term168233.getClass(), "externsRoot", null);
        setField(term168233, term168233.getClass(), "jsRoot", null);
        setField(term168233, term168233.getClass(), "externAndJsRoot", null);
        setField(term168233, term168233.getClass(), "inputsById", null);
        setField(term168233, term168233.getClass(), "sourceMap", null);
        setField(term168233, term168233.getClass(), "externExports", null);
        setIntField(term168233, term168233.getClass(), "uniqueNameId", 0);
        setBooleanField(term168233, term168233.getClass(), "useThreads", false);
        setBooleanField(term168233, term168233.getClass(), "hasRegExpGlobalReferences", false);
        setField(term168233, term168233.getClass(), "functionInformationMap", null);
        setField(term168233, term168233.getClass(), "debugLog", null);
        setField(term168233, term168233.getClass(), "defaultCodingConvention", null);
        setField(term168233, term168233.getClass(), "typeRegistry", null);
        setField(term168233, term168233.getClass(), "parserConfig", null);
        setField(term168233, term168233.getClass(), "abstractInterpreter", null);
        setField(term168233, term168233.getClass(), "typeValidator", null);
        setField(term168233, term168233.getClass(), "tracker", null);
        setField(term168233, term168233.getClass(), "oldErrorReporter", null);
        setField(term168233, term168233.getClass(), "defaultErrorReporter", null);
        setField(term168233, term168233.getClass(), "outStream", null);
        setField(term168233, term168233.getClass(), "globalRefMap", null);
        setDoubleField(term168233, term168233.getClass(), "progress", 0.0);
        setField(term168233, term168233.getClass(), "sanityCheck", null);
        setField(term168233, term168233.getClass(), "currentTracer", null);
        setField(term168233, term168233.getClass(), "currentPassName", null);
        setIntField(term168233, term168233.getClass(), "syntheticCodeId", 0);
        setField(term168233, term168233.getClass(), "recentChange", null);
        setField(term168233, term168233.getClass(), "codeChangeHandlers", null);
        setField(term168233, term168233.getClass(), "synthesizedExternsInput", null);
        setField(term168233, term168233.getClass(), "stage", null);
        setField(term168232, term168232.getClass(), "compiler", term168233);
        setField(term168232, term168232.getClass(), "preprocessorSymbolTable", null);
        setField(term168232, term168232.getClass(), "transformationHandler", null);
        term168234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term168235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term168236 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term168237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term168238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term168239 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term168234, term168234.getClass(), "type", 0);
        setField(term168234, term168234.getClass(), "next", null);
        setIntField(term168235, term168235.getClass(), "type", 0);
        setIntField(term168236, term168236.getClass(), "type", 0);
        setField(term168236, term168236.getClass(), "next", null);
        setField(term168236, term168236.getClass(), "first", null);
        setField(term168236, term168236.getClass(), "last", null);
        setField(term168236, term168236.getClass(), "propListHead", null);
        setIntField(term168236, term168236.getClass(), "sourcePosition", 0);
        setField(term168236, term168236.getClass(), "jsType", null);
        setField(term168236, term168236.getClass(), "parent", null);
        setField(term168235, term168235.getClass(), "next", term168236);
        setIntField(term168237, term168237.getClass(), "type", 105);
        setIntField(term168238, term168238.getClass(), "type", 105);
        setIntField(term168239, term168239.getClass(), "type", 0);
        setField(term168239, term168239.getClass(), "next", null);
        setField(term168239, term168239.getClass(), "first", null);
        setField(term168239, term168239.getClass(), "last", null);
        setField(term168239, term168239.getClass(), "propListHead", null);
        setIntField(term168239, term168239.getClass(), "sourcePosition", 0);
        setField(term168239, term168239.getClass(), "jsType", null);
        setField(term168239, term168239.getClass(), "parent", null);
        setField(term168238, term168238.getClass(), "next", term168239);
        setField(term168238, term168238.getClass(), "first", null);
        setField(term168238, term168238.getClass(), "last", null);
        setField(term168238, term168238.getClass(), "propListHead", null);
        setIntField(term168238, term168238.getClass(), "sourcePosition", 0);
        setField(term168238, term168238.getClass(), "jsType", null);
        setField(term168238, term168238.getClass(), "parent", null);
        setField(term168237, term168237.getClass(), "next", term168238);
        setField(term168237, term168237.getClass(), "first", null);
        setField(term168237, term168237.getClass(), "last", null);
        setField(term168237, term168237.getClass(), "propListHead", null);
        setIntField(term168237, term168237.getClass(), "sourcePosition", 0);
        setField(term168237, term168237.getClass(), "jsType", null);
        setField(term168237, term168237.getClass(), "parent", null);
        setField(term168235, term168235.getClass(), "first", term168237);
        setField(term168235, term168235.getClass(), "last", null);
        setField(term168235, term168235.getClass(), "propListHead", null);
        setIntField(term168235, term168235.getClass(), "sourcePosition", 0);
        setField(term168235, term168235.getClass(), "jsType", null);
        setField(term168235, term168235.getClass(), "parent", null);
        setField(term168234, term168234.getClass(), "first", term168235);
        setField(term168234, term168234.getClass(), "last", null);
        setField(term168234, term168234.getClass(), "propListHead", null);
        setIntField(term168234, term168234.getClass(), "sourcePosition", 0);
        setField(term168234, term168234.getClass(), "jsType", null);
        setField(term168234, term168234.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term166296;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term166146, args);
        assertTrue(recursiveEquals(term166146, term168232));
        assertTrue(recursiveEquals(term166296, term168234));
    }

};


