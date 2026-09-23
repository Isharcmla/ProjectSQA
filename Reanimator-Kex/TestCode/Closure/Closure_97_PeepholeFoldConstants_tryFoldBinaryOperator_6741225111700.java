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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111700 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term672603;
     Object term672695;
     Object term672952;
     Object term672953;
     Object term672889;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111700() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term672603 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term672695 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term672781 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term672873 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term672781, term672781.getClass(), "next", term672873);
        setIntField(term672781, term672781.getClass(), "type", 108);
        setField(term672695, term672695.getClass(), "first", term672781);
        setIntField(term672695, term672695.getClass(), "type", 14);
        term672952 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term672952, term672952.getClass(), "currentTraversal", null);
        term672953 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term672954 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term672955 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term672953, term672953.getClass(), "str", null);
        setIntField(term672953, term672953.getClass(), "type", 14);
        setField(term672953, term672953.getClass(), "next", null);
        setField(term672954, term672954.getClass(), "functionName", null);
        setBooleanField(term672954, term672954.getClass(), "itsNeedsActivation", false);
        setIntField(term672954, term672954.getClass(), "itsFunctionType", 0);
        setBooleanField(term672954, term672954.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term672954, term672954.getClass(), "encodedSourceStart", 0);
        setIntField(term672954, term672954.getClass(), "encodedSourceEnd", 0);
        setField(term672954, term672954.getClass(), "sourceName", null);
        setIntField(term672954, term672954.getClass(), "baseLineno", 0);
        setIntField(term672954, term672954.getClass(), "endLineno", 0);
        setField(term672954, term672954.getClass(), "functions", null);
        setField(term672954, term672954.getClass(), "regexps", null);
        setField(term672954, term672954.getClass(), "itsVariables", null);
        setField(term672954, term672954.getClass(), "itsConst", null);
        setField(term672954, term672954.getClass(), "itsVariableNames", null);
        setIntField(term672954, term672954.getClass(), "varStart", 0);
        setField(term672954, term672954.getClass(), "compilerData", null);
        setIntField(term672954, term672954.getClass(), "type", 108);
        setDoubleField(term672955, term672955.getClass(), "number", 0.0);
        setIntField(term672955, term672955.getClass(), "type", 0);
        setField(term672955, term672955.getClass(), "next", null);
        setField(term672955, term672955.getClass(), "first", null);
        setField(term672955, term672955.getClass(), "last", null);
        setField(term672955, term672955.getClass(), "propListHead", null);
        setIntField(term672955, term672955.getClass(), "sourcePosition", 0);
        setField(term672955, term672955.getClass(), "jsType", null);
        setField(term672955, term672955.getClass(), "parent", null);
        setField(term672954, term672954.getClass(), "next", term672955);
        setField(term672954, term672954.getClass(), "first", null);
        setField(term672954, term672954.getClass(), "last", null);
        setField(term672954, term672954.getClass(), "propListHead", null);
        setIntField(term672954, term672954.getClass(), "sourcePosition", 0);
        setField(term672954, term672954.getClass(), "jsType", null);
        setField(term672954, term672954.getClass(), "parent", null);
        setField(term672953, term672953.getClass(), "first", term672954);
        setField(term672953, term672953.getClass(), "last", null);
        setField(term672953, term672953.getClass(), "propListHead", null);
        setIntField(term672953, term672953.getClass(), "sourcePosition", 0);
        setField(term672953, term672953.getClass(), "jsType", null);
        setField(term672953, term672953.getClass(), "parent", null);
        term672889 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term672891 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term672901 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term672889, term672889.getClass(), "str", null);
        setIntField(term672889, term672889.getClass(), "type", 14);
        setField(term672889, term672889.getClass(), "next", null);
        setField(term672891, term672891.getClass(), "functionName", null);
        setBooleanField(term672891, term672891.getClass(), "itsNeedsActivation", false);
        setIntField(term672891, term672891.getClass(), "itsFunctionType", 0);
        setBooleanField(term672891, term672891.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term672891, term672891.getClass(), "encodedSourceStart", 0);
        setIntField(term672891, term672891.getClass(), "encodedSourceEnd", 0);
        setField(term672891, term672891.getClass(), "sourceName", null);
        setIntField(term672891, term672891.getClass(), "baseLineno", 0);
        setIntField(term672891, term672891.getClass(), "endLineno", 0);
        setField(term672891, term672891.getClass(), "functions", null);
        setField(term672891, term672891.getClass(), "regexps", null);
        setField(term672891, term672891.getClass(), "itsVariables", null);
        setField(term672891, term672891.getClass(), "itsConst", null);
        setField(term672891, term672891.getClass(), "itsVariableNames", null);
        setIntField(term672891, term672891.getClass(), "varStart", 0);
        setField(term672891, term672891.getClass(), "compilerData", null);
        setIntField(term672891, term672891.getClass(), "type", 108);
        setDoubleField(term672901, term672901.getClass(), "number", 0.0);
        setIntField(term672901, term672901.getClass(), "type", 0);
        setField(term672901, term672901.getClass(), "next", null);
        setField(term672901, term672901.getClass(), "first", null);
        setField(term672901, term672901.getClass(), "last", null);
        setField(term672901, term672901.getClass(), "propListHead", null);
        setIntField(term672901, term672901.getClass(), "sourcePosition", 0);
        setField(term672901, term672901.getClass(), "jsType", null);
        setField(term672901, term672901.getClass(), "parent", null);
        setField(term672891, term672891.getClass(), "next", term672901);
        setField(term672891, term672891.getClass(), "first", null);
        setField(term672891, term672891.getClass(), "last", null);
        setField(term672891, term672891.getClass(), "propListHead", null);
        setIntField(term672891, term672891.getClass(), "sourcePosition", 0);
        setField(term672891, term672891.getClass(), "jsType", null);
        setField(term672891, term672891.getClass(), "parent", null);
        setField(term672889, term672889.getClass(), "first", term672891);
        setField(term672889, term672889.getClass(), "last", null);
        setField(term672889, term672889.getClass(), "propListHead", null);
        setIntField(term672889, term672889.getClass(), "sourcePosition", 0);
        setField(term672889, term672889.getClass(), "jsType", null);
        setField(term672889, term672889.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term672695;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term672603, args);
        assertTrue(recursiveEquals(term672603, term672952));
        assertTrue(recursiveEquals(term672695, term672953));
        assertTrue(recursiveEquals(retValue, term672889));
    }

};


