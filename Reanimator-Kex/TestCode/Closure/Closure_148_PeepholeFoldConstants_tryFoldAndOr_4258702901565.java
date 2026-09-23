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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term394288;
     Object term394374;
     Object term394466;
     Object term394946;
     Object term394947;
     Object term394948;
     Object term394907;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term394288 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term394374 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term394374, term394374.getClass(), "parent", null);
        setIntField(term394374, term394374.getClass(), "type", 64);
        term394466 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term394466, term394466.getClass(), "type", 64);
        term394946 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term394946, term394946.getClass(), "currentTraversal", null);
        term394947 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term394947, term394947.getClass(), "functionName", null);
        setBooleanField(term394947, term394947.getClass(), "itsNeedsActivation", false);
        setIntField(term394947, term394947.getClass(), "itsFunctionType", 0);
        setBooleanField(term394947, term394947.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term394947, term394947.getClass(), "encodedSourceStart", 0);
        setIntField(term394947, term394947.getClass(), "encodedSourceEnd", 0);
        setField(term394947, term394947.getClass(), "sourceName", null);
        setIntField(term394947, term394947.getClass(), "baseLineno", 0);
        setIntField(term394947, term394947.getClass(), "endLineno", 0);
        setField(term394947, term394947.getClass(), "functions", null);
        setField(term394947, term394947.getClass(), "regexps", null);
        setField(term394947, term394947.getClass(), "itsVariables", null);
        setField(term394947, term394947.getClass(), "itsConst", null);
        setField(term394947, term394947.getClass(), "itsVariableNames", null);
        setIntField(term394947, term394947.getClass(), "varStart", 0);
        setField(term394947, term394947.getClass(), "compilerData", null);
        setIntField(term394947, term394947.getClass(), "type", 64);
        setField(term394947, term394947.getClass(), "next", null);
        setField(term394947, term394947.getClass(), "first", null);
        setField(term394947, term394947.getClass(), "last", null);
        setField(term394947, term394947.getClass(), "propListHead", null);
        setIntField(term394947, term394947.getClass(), "sourcePosition", 0);
        setField(term394947, term394947.getClass(), "jsType", null);
        setField(term394947, term394947.getClass(), "parent", null);
        term394948 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term394948, term394948.getClass(), "str", null);
        setIntField(term394948, term394948.getClass(), "type", 64);
        setField(term394948, term394948.getClass(), "next", null);
        setField(term394948, term394948.getClass(), "first", null);
        setField(term394948, term394948.getClass(), "last", null);
        setField(term394948, term394948.getClass(), "propListHead", null);
        setIntField(term394948, term394948.getClass(), "sourcePosition", 0);
        setField(term394948, term394948.getClass(), "jsType", null);
        setField(term394948, term394948.getClass(), "parent", null);
        term394907 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term394907, term394907.getClass(), "functionName", null);
        setBooleanField(term394907, term394907.getClass(), "itsNeedsActivation", false);
        setIntField(term394907, term394907.getClass(), "itsFunctionType", 0);
        setBooleanField(term394907, term394907.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term394907, term394907.getClass(), "encodedSourceStart", 0);
        setIntField(term394907, term394907.getClass(), "encodedSourceEnd", 0);
        setField(term394907, term394907.getClass(), "sourceName", null);
        setIntField(term394907, term394907.getClass(), "baseLineno", 0);
        setIntField(term394907, term394907.getClass(), "endLineno", 0);
        setField(term394907, term394907.getClass(), "functions", null);
        setField(term394907, term394907.getClass(), "regexps", null);
        setField(term394907, term394907.getClass(), "itsVariables", null);
        setField(term394907, term394907.getClass(), "itsConst", null);
        setField(term394907, term394907.getClass(), "itsVariableNames", null);
        setIntField(term394907, term394907.getClass(), "varStart", 0);
        setField(term394907, term394907.getClass(), "compilerData", null);
        setIntField(term394907, term394907.getClass(), "type", 64);
        setField(term394907, term394907.getClass(), "next", null);
        setField(term394907, term394907.getClass(), "first", null);
        setField(term394907, term394907.getClass(), "last", null);
        setField(term394907, term394907.getClass(), "propListHead", null);
        setIntField(term394907, term394907.getClass(), "sourcePosition", 0);
        setField(term394907, term394907.getClass(), "jsType", null);
        setField(term394907, term394907.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term394374;
        args[1] = term394466;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term394288, args);
        assertTrue(recursiveEquals(term394288, term394946));
        assertTrue(recursiveEquals(term394374, term394947));
        assertTrue(recursiveEquals(term394466, term394948));
        assertTrue(recursiveEquals(retValue, term394907));
    }

};


