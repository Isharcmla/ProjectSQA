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

public class ScopedAliases_hotSwapScript_8834170999 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58729;
     Object term58879;
     Object term60128;
     Object term60130;

    public ScopedAliases_hotSwapScript_8834170999() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58729 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term58809 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term58729, term58729.getClass(), "compiler", term58809);
        term58879 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58949 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term58879, term58879.getClass(), "type", 0);
        setField(term58879, term58879.getClass(), "parent", null);
        setField(term58949, term58949.getClass(), "next", null);
        setIntField(term58949, term58949.getClass(), "type", 0);
        setField(term59089, term59089.getClass(), "next", null);
        setIntField(term59089, term59089.getClass(), "type", 0);
        setField(term59089, term59089.getClass(), "first", null);
        setField(term59019, term59019.getClass(), "next", term59089);
        setIntField(term59019, term59019.getClass(), "type", 105);
        setField(term58949, term58949.getClass(), "first", term59019);
        setField(term58879, term58879.getClass(), "first", term58949);
        term60128 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term60129 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term60129, term60129.getClass(), "options", null);
        setField(term60129, term60129.getClass(), "passes", null);
        setField(term60129, term60129.getClass(), "externs", null);
        setField(term60129, term60129.getClass(), "modules", null);
        setField(term60129, term60129.getClass(), "moduleGraph", null);
        setField(term60129, term60129.getClass(), "inputs", null);
        setField(term60129, term60129.getClass(), "errorManager", null);
        setField(term60129, term60129.getClass(), "warningsGuard", null);
        setField(term60129, term60129.getClass(), "injectedLibraries", null);
        setField(term60129, term60129.getClass(), "externsRoot", null);
        setField(term60129, term60129.getClass(), "jsRoot", null);
        setField(term60129, term60129.getClass(), "externAndJsRoot", null);
        setField(term60129, term60129.getClass(), "inputsById", null);
        setField(term60129, term60129.getClass(), "sourceMap", null);
        setField(term60129, term60129.getClass(), "externExports", null);
        setIntField(term60129, term60129.getClass(), "uniqueNameId", 0);
        setBooleanField(term60129, term60129.getClass(), "useThreads", false);
        setBooleanField(term60129, term60129.getClass(), "hasRegExpGlobalReferences", false);
        setField(term60129, term60129.getClass(), "functionInformationMap", null);
        setField(term60129, term60129.getClass(), "debugLog", null);
        setField(term60129, term60129.getClass(), "defaultCodingConvention", null);
        setField(term60129, term60129.getClass(), "typeRegistry", null);
        setField(term60129, term60129.getClass(), "parserConfig", null);
        setField(term60129, term60129.getClass(), "abstractInterpreter", null);
        setField(term60129, term60129.getClass(), "typeValidator", null);
        setField(term60129, term60129.getClass(), "tracker", null);
        setField(term60129, term60129.getClass(), "oldErrorReporter", null);
        setField(term60129, term60129.getClass(), "defaultErrorReporter", null);
        setField(term60129, term60129.getClass(), "outStream", null);
        setField(term60129, term60129.getClass(), "globalRefMap", null);
        setDoubleField(term60129, term60129.getClass(), "progress", 0.0);
        setField(term60129, term60129.getClass(), "sanityCheck", null);
        setField(term60129, term60129.getClass(), "currentTracer", null);
        setField(term60129, term60129.getClass(), "currentPassName", null);
        setIntField(term60129, term60129.getClass(), "syntheticCodeId", 0);
        setField(term60129, term60129.getClass(), "recentChange", null);
        setField(term60129, term60129.getClass(), "codeChangeHandlers", null);
        setField(term60129, term60129.getClass(), "synthesizedExternsInput", null);
        setField(term60129, term60129.getClass(), "stage", null);
        setField(term60128, term60128.getClass(), "compiler", term60129);
        setField(term60128, term60128.getClass(), "preprocessorSymbolTable", null);
        setField(term60128, term60128.getClass(), "transformationHandler", null);
        term60130 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60131 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60132 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term60130, term60130.getClass(), "type", 0);
        setField(term60130, term60130.getClass(), "next", null);
        setIntField(term60131, term60131.getClass(), "type", 0);
        setField(term60131, term60131.getClass(), "next", null);
        setIntField(term60132, term60132.getClass(), "type", 105);
        setIntField(term60133, term60133.getClass(), "type", 0);
        setField(term60133, term60133.getClass(), "next", null);
        setField(term60133, term60133.getClass(), "first", null);
        setField(term60133, term60133.getClass(), "last", null);
        setField(term60133, term60133.getClass(), "propListHead", null);
        setIntField(term60133, term60133.getClass(), "sourcePosition", 0);
        setField(term60133, term60133.getClass(), "jsType", null);
        setField(term60133, term60133.getClass(), "parent", null);
        setField(term60132, term60132.getClass(), "next", term60133);
        setField(term60132, term60132.getClass(), "first", null);
        setField(term60132, term60132.getClass(), "last", null);
        setField(term60132, term60132.getClass(), "propListHead", null);
        setIntField(term60132, term60132.getClass(), "sourcePosition", 0);
        setField(term60132, term60132.getClass(), "jsType", null);
        setField(term60132, term60132.getClass(), "parent", null);
        setField(term60131, term60131.getClass(), "first", term60132);
        setField(term60131, term60131.getClass(), "last", null);
        setField(term60131, term60131.getClass(), "propListHead", null);
        setIntField(term60131, term60131.getClass(), "sourcePosition", 0);
        setField(term60131, term60131.getClass(), "jsType", null);
        setField(term60131, term60131.getClass(), "parent", null);
        setField(term60130, term60130.getClass(), "first", term60131);
        setField(term60130, term60130.getClass(), "last", null);
        setField(term60130, term60130.getClass(), "propListHead", null);
        setIntField(term60130, term60130.getClass(), "sourcePosition", 0);
        setField(term60130, term60130.getClass(), "jsType", null);
        setField(term60130, term60130.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term58879;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term58729, args);
        assertTrue(recursiveEquals(term58729, term60128));
        assertTrue(recursiveEquals(term58879, term60130));
    }

};


