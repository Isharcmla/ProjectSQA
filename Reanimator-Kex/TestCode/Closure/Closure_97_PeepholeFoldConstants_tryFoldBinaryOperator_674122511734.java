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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187875;
     Object term187961;
     Object term188109;
     Object term188110;
     Object term188046;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term187875 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term187961 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term188031 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term187961, term187961.getClass(), "first", term187961);
        setField(term187961, term187961.getClass(), "next", term188031);
        setIntField(term187961, term187961.getClass(), "type", 100);
        term188109 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term188109, term188109.getClass(), "currentTraversal", null);
        term188110 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term188111 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term188110, term188110.getClass(), "functionName", null);
        setBooleanField(term188110, term188110.getClass(), "itsNeedsActivation", false);
        setIntField(term188110, term188110.getClass(), "itsFunctionType", 0);
        setBooleanField(term188110, term188110.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term188110, term188110.getClass(), "encodedSourceStart", 0);
        setIntField(term188110, term188110.getClass(), "encodedSourceEnd", 0);
        setField(term188110, term188110.getClass(), "sourceName", null);
        setIntField(term188110, term188110.getClass(), "baseLineno", 0);
        setIntField(term188110, term188110.getClass(), "endLineno", 0);
        setField(term188110, term188110.getClass(), "functions", null);
        setField(term188110, term188110.getClass(), "regexps", null);
        setField(term188110, term188110.getClass(), "itsVariables", null);
        setField(term188110, term188110.getClass(), "itsConst", null);
        setField(term188110, term188110.getClass(), "itsVariableNames", null);
        setIntField(term188110, term188110.getClass(), "varStart", 0);
        setField(term188110, term188110.getClass(), "compilerData", null);
        setIntField(term188110, term188110.getClass(), "type", 100);
        setIntField(term188111, term188111.getClass(), "type", 0);
        setField(term188111, term188111.getClass(), "next", null);
        setField(term188111, term188111.getClass(), "first", null);
        setField(term188111, term188111.getClass(), "last", null);
        setField(term188111, term188111.getClass(), "propListHead", null);
        setIntField(term188111, term188111.getClass(), "sourcePosition", 0);
        setField(term188111, term188111.getClass(), "jsType", null);
        setField(term188111, term188111.getClass(), "parent", null);
        setField(term188110, term188110.getClass(), "next", term188111);
        setField(term188110, term188110.getClass(), "first", term188110);
        setField(term188110, term188110.getClass(), "last", null);
        setField(term188110, term188110.getClass(), "propListHead", null);
        setIntField(term188110, term188110.getClass(), "sourcePosition", 0);
        setField(term188110, term188110.getClass(), "jsType", null);
        setField(term188110, term188110.getClass(), "parent", null);
        term188046 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term188056 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term188046, term188046.getClass(), "functionName", null);
        setBooleanField(term188046, term188046.getClass(), "itsNeedsActivation", false);
        setIntField(term188046, term188046.getClass(), "itsFunctionType", 0);
        setBooleanField(term188046, term188046.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term188046, term188046.getClass(), "encodedSourceStart", 0);
        setIntField(term188046, term188046.getClass(), "encodedSourceEnd", 0);
        setField(term188046, term188046.getClass(), "sourceName", null);
        setIntField(term188046, term188046.getClass(), "baseLineno", 0);
        setIntField(term188046, term188046.getClass(), "endLineno", 0);
        setField(term188046, term188046.getClass(), "functions", null);
        setField(term188046, term188046.getClass(), "regexps", null);
        setField(term188046, term188046.getClass(), "itsVariables", null);
        setField(term188046, term188046.getClass(), "itsConst", null);
        setField(term188046, term188046.getClass(), "itsVariableNames", null);
        setIntField(term188046, term188046.getClass(), "varStart", 0);
        setField(term188046, term188046.getClass(), "compilerData", null);
        setIntField(term188046, term188046.getClass(), "type", 100);
        setIntField(term188056, term188056.getClass(), "type", 0);
        setField(term188056, term188056.getClass(), "next", null);
        setField(term188056, term188056.getClass(), "first", null);
        setField(term188056, term188056.getClass(), "last", null);
        setField(term188056, term188056.getClass(), "propListHead", null);
        setIntField(term188056, term188056.getClass(), "sourcePosition", 0);
        setField(term188056, term188056.getClass(), "jsType", null);
        setField(term188056, term188056.getClass(), "parent", null);
        setField(term188046, term188046.getClass(), "next", term188056);
        setField(term188046, term188046.getClass(), "first", term188046);
        setField(term188046, term188046.getClass(), "last", null);
        setField(term188046, term188046.getClass(), "propListHead", null);
        setIntField(term188046, term188046.getClass(), "sourcePosition", 0);
        setField(term188046, term188046.getClass(), "jsType", null);
        setField(term188046, term188046.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term187961;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term187875, args);
        assertTrue(recursiveEquals(term187875, term188109));
        assertTrue(recursiveEquals(term187961, term188110));
        assertTrue(recursiveEquals(retValue, term188046));
    }

};


