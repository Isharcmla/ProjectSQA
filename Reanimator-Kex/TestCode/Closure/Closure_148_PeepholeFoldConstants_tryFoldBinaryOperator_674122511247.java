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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46861;
     Object term46947;
     Object term47396;
     Object term47397;
     Object term47333;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46861 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term46947 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term47017 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term46947, term46947.getClass(), "first", term46947);
        setField(term46947, term46947.getClass(), "next", term47017);
        setIntField(term46947, term46947.getClass(), "type", 101);
        term47396 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term47396, term47396.getClass(), "currentTraversal", null);
        term47397 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term47398 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term47397, term47397.getClass(), "functionName", null);
        setBooleanField(term47397, term47397.getClass(), "itsNeedsActivation", false);
        setIntField(term47397, term47397.getClass(), "itsFunctionType", 0);
        setBooleanField(term47397, term47397.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term47397, term47397.getClass(), "encodedSourceStart", 0);
        setIntField(term47397, term47397.getClass(), "encodedSourceEnd", 0);
        setField(term47397, term47397.getClass(), "sourceName", null);
        setIntField(term47397, term47397.getClass(), "baseLineno", 0);
        setIntField(term47397, term47397.getClass(), "endLineno", 0);
        setField(term47397, term47397.getClass(), "functions", null);
        setField(term47397, term47397.getClass(), "regexps", null);
        setField(term47397, term47397.getClass(), "itsVariables", null);
        setField(term47397, term47397.getClass(), "itsConst", null);
        setField(term47397, term47397.getClass(), "itsVariableNames", null);
        setIntField(term47397, term47397.getClass(), "varStart", 0);
        setField(term47397, term47397.getClass(), "compilerData", null);
        setIntField(term47397, term47397.getClass(), "type", 101);
        setIntField(term47398, term47398.getClass(), "type", 0);
        setField(term47398, term47398.getClass(), "next", null);
        setField(term47398, term47398.getClass(), "first", null);
        setField(term47398, term47398.getClass(), "last", null);
        setField(term47398, term47398.getClass(), "propListHead", null);
        setIntField(term47398, term47398.getClass(), "sourcePosition", 0);
        setField(term47398, term47398.getClass(), "jsType", null);
        setField(term47398, term47398.getClass(), "parent", null);
        setField(term47397, term47397.getClass(), "next", term47398);
        setField(term47397, term47397.getClass(), "first", term47397);
        setField(term47397, term47397.getClass(), "last", null);
        setField(term47397, term47397.getClass(), "propListHead", null);
        setIntField(term47397, term47397.getClass(), "sourcePosition", 0);
        setField(term47397, term47397.getClass(), "jsType", null);
        setField(term47397, term47397.getClass(), "parent", null);
        term47333 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term47343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term47333, term47333.getClass(), "functionName", null);
        setBooleanField(term47333, term47333.getClass(), "itsNeedsActivation", false);
        setIntField(term47333, term47333.getClass(), "itsFunctionType", 0);
        setBooleanField(term47333, term47333.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term47333, term47333.getClass(), "encodedSourceStart", 0);
        setIntField(term47333, term47333.getClass(), "encodedSourceEnd", 0);
        setField(term47333, term47333.getClass(), "sourceName", null);
        setIntField(term47333, term47333.getClass(), "baseLineno", 0);
        setIntField(term47333, term47333.getClass(), "endLineno", 0);
        setField(term47333, term47333.getClass(), "functions", null);
        setField(term47333, term47333.getClass(), "regexps", null);
        setField(term47333, term47333.getClass(), "itsVariables", null);
        setField(term47333, term47333.getClass(), "itsConst", null);
        setField(term47333, term47333.getClass(), "itsVariableNames", null);
        setIntField(term47333, term47333.getClass(), "varStart", 0);
        setField(term47333, term47333.getClass(), "compilerData", null);
        setIntField(term47333, term47333.getClass(), "type", 101);
        setIntField(term47343, term47343.getClass(), "type", 0);
        setField(term47343, term47343.getClass(), "next", null);
        setField(term47343, term47343.getClass(), "first", null);
        setField(term47343, term47343.getClass(), "last", null);
        setField(term47343, term47343.getClass(), "propListHead", null);
        setIntField(term47343, term47343.getClass(), "sourcePosition", 0);
        setField(term47343, term47343.getClass(), "jsType", null);
        setField(term47343, term47343.getClass(), "parent", null);
        setField(term47333, term47333.getClass(), "next", term47343);
        setField(term47333, term47333.getClass(), "first", term47333);
        setField(term47333, term47333.getClass(), "last", null);
        setField(term47333, term47333.getClass(), "propListHead", null);
        setIntField(term47333, term47333.getClass(), "sourcePosition", 0);
        setField(term47333, term47333.getClass(), "jsType", null);
        setField(term47333, term47333.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term46947;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term46861, args);
        assertTrue(recursiveEquals(term46861, term47396));
        assertTrue(recursiveEquals(term46947, term47397));
        assertTrue(recursiveEquals(retValue, term47333));
    }

};


