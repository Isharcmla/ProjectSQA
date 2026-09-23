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

public class CheckSideEffects_hotSwapScript_77035414220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8531;
     Object term8681;
     Object term10135;
     Object term10137;

    public CheckSideEffects_hotSwapScript_77035414220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8531 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        Object term8611 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term8531, term8531.getClass(), "compiler", term8611);
        term8681 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8751 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8821 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8681, term8681.getClass(), "type", 0);
        setField(term8681, term8681.getClass(), "parent", null);
        setField(term8751, term8751.getClass(), "next", null);
        setIntField(term8751, term8751.getClass(), "type", 0);
        setField(term8821, term8821.getClass(), "next", null);
        setIntField(term8821, term8821.getClass(), "type", 0);
        setField(term8821, term8821.getClass(), "first", null);
        setField(term8751, term8751.getClass(), "first", term8821);
        setField(term8681, term8681.getClass(), "first", term8751);
        term10135 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        Object term10136 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term10135, term10135.getClass(), "level", null);
        setField(term10135, term10135.getClass(), "problemNodes", null);
        setField(term10136, term10136.getClass(), "options", null);
        setField(term10136, term10136.getClass(), "passes", null);
        setField(term10136, term10136.getClass(), "externs", null);
        setField(term10136, term10136.getClass(), "modules", null);
        setField(term10136, term10136.getClass(), "moduleGraph", null);
        setField(term10136, term10136.getClass(), "inputs", null);
        setField(term10136, term10136.getClass(), "errorManager", null);
        setField(term10136, term10136.getClass(), "warningsGuard", null);
        setField(term10136, term10136.getClass(), "injectedLibraries", null);
        setField(term10136, term10136.getClass(), "externsRoot", null);
        setField(term10136, term10136.getClass(), "jsRoot", null);
        setField(term10136, term10136.getClass(), "externAndJsRoot", null);
        setField(term10136, term10136.getClass(), "inputsById", null);
        setField(term10136, term10136.getClass(), "sourceMap", null);
        setField(term10136, term10136.getClass(), "externExports", null);
        setIntField(term10136, term10136.getClass(), "uniqueNameId", 0);
        setBooleanField(term10136, term10136.getClass(), "useThreads", false);
        setBooleanField(term10136, term10136.getClass(), "hasRegExpGlobalReferences", false);
        setField(term10136, term10136.getClass(), "functionInformationMap", null);
        setField(term10136, term10136.getClass(), "debugLog", null);
        setField(term10136, term10136.getClass(), "defaultCodingConvention", null);
        setField(term10136, term10136.getClass(), "typeRegistry", null);
        setField(term10136, term10136.getClass(), "parserConfig", null);
        setField(term10136, term10136.getClass(), "abstractInterpreter", null);
        setField(term10136, term10136.getClass(), "typeValidator", null);
        setField(term10136, term10136.getClass(), "tracker", null);
        setField(term10136, term10136.getClass(), "oldErrorReporter", null);
        setField(term10136, term10136.getClass(), "defaultErrorReporter", null);
        setField(term10136, term10136.getClass(), "outStream", null);
        setField(term10136, term10136.getClass(), "globalRefMap", null);
        setDoubleField(term10136, term10136.getClass(), "progress", 0.0);
        setField(term10136, term10136.getClass(), "sanityCheck", null);
        setField(term10136, term10136.getClass(), "currentTracer", null);
        setField(term10136, term10136.getClass(), "currentPassName", null);
        setIntField(term10136, term10136.getClass(), "syntheticCodeId", 0);
        setField(term10136, term10136.getClass(), "recentChange", null);
        setField(term10136, term10136.getClass(), "codeChangeHandlers", null);
        setField(term10136, term10136.getClass(), "synthesizedExternsInput", null);
        setField(term10136, term10136.getClass(), "stage", null);
        setField(term10135, term10135.getClass(), "compiler", term10136);
        setBooleanField(term10135, term10135.getClass(), "protectSideEffectFreeCode", false);
        term10137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10138 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10137, term10137.getClass(), "type", 0);
        setField(term10137, term10137.getClass(), "next", null);
        setIntField(term10138, term10138.getClass(), "type", 0);
        setField(term10138, term10138.getClass(), "next", null);
        setIntField(term10139, term10139.getClass(), "type", 0);
        setField(term10139, term10139.getClass(), "next", null);
        setField(term10139, term10139.getClass(), "first", null);
        setField(term10139, term10139.getClass(), "last", null);
        setField(term10139, term10139.getClass(), "propListHead", null);
        setIntField(term10139, term10139.getClass(), "sourcePosition", 0);
        setField(term10139, term10139.getClass(), "jsType", null);
        setField(term10139, term10139.getClass(), "parent", null);
        setField(term10138, term10138.getClass(), "first", term10139);
        setField(term10138, term10138.getClass(), "last", null);
        setField(term10138, term10138.getClass(), "propListHead", null);
        setIntField(term10138, term10138.getClass(), "sourcePosition", 0);
        setField(term10138, term10138.getClass(), "jsType", null);
        setField(term10138, term10138.getClass(), "parent", null);
        setField(term10137, term10137.getClass(), "first", term10138);
        setField(term10137, term10137.getClass(), "last", null);
        setField(term10137, term10137.getClass(), "propListHead", null);
        setIntField(term10137, term10137.getClass(), "sourcePosition", 0);
        setField(term10137, term10137.getClass(), "jsType", null);
        setField(term10137, term10137.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term8681;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term8531, args);
        assertTrue(recursiveEquals(term8531, term10135));
        assertTrue(recursiveEquals(term8681, term10137));
    }

};


