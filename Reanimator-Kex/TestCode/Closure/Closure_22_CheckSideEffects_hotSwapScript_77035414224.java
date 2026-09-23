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

public class CheckSideEffects_hotSwapScript_77035414224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11254;
     Object term11404;
     Object term11782;
     Object term11784;

    public CheckSideEffects_hotSwapScript_77035414224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11254 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        Object term11334 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term11254, term11254.getClass(), "compiler", term11334);
        term11404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11474 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11544 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11404, term11404.getClass(), "type", 115);
        setField(term11404, term11404.getClass(), "parent", null);
        setField(term11474, term11474.getClass(), "next", null);
        setIntField(term11474, term11474.getClass(), "type", 0);
        setField(term11544, term11544.getClass(), "next", null);
        setIntField(term11544, term11544.getClass(), "type", 0);
        setField(term11544, term11544.getClass(), "first", null);
        setField(term11474, term11474.getClass(), "first", term11544);
        setField(term11404, term11404.getClass(), "first", term11474);
        term11782 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        Object term11783 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term11782, term11782.getClass(), "level", null);
        setField(term11782, term11782.getClass(), "problemNodes", null);
        setField(term11783, term11783.getClass(), "options", null);
        setField(term11783, term11783.getClass(), "passes", null);
        setField(term11783, term11783.getClass(), "externs", null);
        setField(term11783, term11783.getClass(), "modules", null);
        setField(term11783, term11783.getClass(), "moduleGraph", null);
        setField(term11783, term11783.getClass(), "inputs", null);
        setField(term11783, term11783.getClass(), "errorManager", null);
        setField(term11783, term11783.getClass(), "warningsGuard", null);
        setField(term11783, term11783.getClass(), "injectedLibraries", null);
        setField(term11783, term11783.getClass(), "externsRoot", null);
        setField(term11783, term11783.getClass(), "jsRoot", null);
        setField(term11783, term11783.getClass(), "externAndJsRoot", null);
        setField(term11783, term11783.getClass(), "inputsById", null);
        setField(term11783, term11783.getClass(), "sourceMap", null);
        setField(term11783, term11783.getClass(), "externExports", null);
        setIntField(term11783, term11783.getClass(), "uniqueNameId", 0);
        setBooleanField(term11783, term11783.getClass(), "useThreads", false);
        setBooleanField(term11783, term11783.getClass(), "hasRegExpGlobalReferences", false);
        setField(term11783, term11783.getClass(), "functionInformationMap", null);
        setField(term11783, term11783.getClass(), "debugLog", null);
        setField(term11783, term11783.getClass(), "defaultCodingConvention", null);
        setField(term11783, term11783.getClass(), "typeRegistry", null);
        setField(term11783, term11783.getClass(), "parserConfig", null);
        setField(term11783, term11783.getClass(), "abstractInterpreter", null);
        setField(term11783, term11783.getClass(), "typeValidator", null);
        setField(term11783, term11783.getClass(), "tracker", null);
        setField(term11783, term11783.getClass(), "oldErrorReporter", null);
        setField(term11783, term11783.getClass(), "defaultErrorReporter", null);
        setField(term11783, term11783.getClass(), "outStream", null);
        setField(term11783, term11783.getClass(), "globalRefMap", null);
        setDoubleField(term11783, term11783.getClass(), "progress", 0.0);
        setField(term11783, term11783.getClass(), "sanityCheck", null);
        setField(term11783, term11783.getClass(), "currentTracer", null);
        setField(term11783, term11783.getClass(), "currentPassName", null);
        setIntField(term11783, term11783.getClass(), "syntheticCodeId", 0);
        setField(term11783, term11783.getClass(), "recentChange", null);
        setField(term11783, term11783.getClass(), "codeChangeHandlers", null);
        setField(term11783, term11783.getClass(), "synthesizedExternsInput", null);
        setField(term11783, term11783.getClass(), "stage", null);
        setField(term11782, term11782.getClass(), "compiler", term11783);
        setBooleanField(term11782, term11782.getClass(), "protectSideEffectFreeCode", false);
        term11784 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11785 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11786 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11784, term11784.getClass(), "type", 115);
        setField(term11784, term11784.getClass(), "next", null);
        setIntField(term11785, term11785.getClass(), "type", 0);
        setField(term11785, term11785.getClass(), "next", null);
        setIntField(term11786, term11786.getClass(), "type", 0);
        setField(term11786, term11786.getClass(), "next", null);
        setField(term11786, term11786.getClass(), "first", null);
        setField(term11786, term11786.getClass(), "last", null);
        setField(term11786, term11786.getClass(), "propListHead", null);
        setIntField(term11786, term11786.getClass(), "sourcePosition", 0);
        setField(term11786, term11786.getClass(), "jsType", null);
        setField(term11786, term11786.getClass(), "parent", null);
        setField(term11785, term11785.getClass(), "first", term11786);
        setField(term11785, term11785.getClass(), "last", null);
        setField(term11785, term11785.getClass(), "propListHead", null);
        setIntField(term11785, term11785.getClass(), "sourcePosition", 0);
        setField(term11785, term11785.getClass(), "jsType", null);
        setField(term11785, term11785.getClass(), "parent", null);
        setField(term11784, term11784.getClass(), "first", term11785);
        setField(term11784, term11784.getClass(), "last", null);
        setField(term11784, term11784.getClass(), "propListHead", null);
        setIntField(term11784, term11784.getClass(), "sourcePosition", 0);
        setField(term11784, term11784.getClass(), "jsType", null);
        setField(term11784, term11784.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term11404;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term11254, args);
        assertTrue(recursiveEquals(term11254, term11782));
        assertTrue(recursiveEquals(term11404, term11784));
    }

};


