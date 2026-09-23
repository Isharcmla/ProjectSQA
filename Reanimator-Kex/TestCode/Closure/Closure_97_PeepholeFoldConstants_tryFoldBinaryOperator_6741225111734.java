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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term682651;
     Object term682743;
     Object term682985;
     Object term682986;
     Object term682937;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term682651 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term682743 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term682829 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term682921 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term682829, term682829.getClass(), "next", term682921);
        setIntField(term682829, term682829.getClass(), "type", 39);
        setField(term682743, term682743.getClass(), "first", term682829);
        setIntField(term682743, term682743.getClass(), "type", 18);
        term682985 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term682985, term682985.getClass(), "currentTraversal", null);
        term682986 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term682987 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term682988 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term682986, term682986.getClass(), "str", null);
        setIntField(term682986, term682986.getClass(), "type", 18);
        setField(term682986, term682986.getClass(), "next", null);
        setField(term682987, term682987.getClass(), "functionName", null);
        setBooleanField(term682987, term682987.getClass(), "itsNeedsActivation", false);
        setIntField(term682987, term682987.getClass(), "itsFunctionType", 0);
        setBooleanField(term682987, term682987.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term682987, term682987.getClass(), "encodedSourceStart", 0);
        setIntField(term682987, term682987.getClass(), "encodedSourceEnd", 0);
        setField(term682987, term682987.getClass(), "sourceName", null);
        setIntField(term682987, term682987.getClass(), "baseLineno", 0);
        setIntField(term682987, term682987.getClass(), "endLineno", 0);
        setField(term682987, term682987.getClass(), "functions", null);
        setField(term682987, term682987.getClass(), "regexps", null);
        setField(term682987, term682987.getClass(), "itsVariables", null);
        setField(term682987, term682987.getClass(), "itsConst", null);
        setField(term682987, term682987.getClass(), "itsVariableNames", null);
        setIntField(term682987, term682987.getClass(), "varStart", 0);
        setField(term682987, term682987.getClass(), "compilerData", null);
        setIntField(term682987, term682987.getClass(), "type", 39);
        setDoubleField(term682988, term682988.getClass(), "number", 0.0);
        setIntField(term682988, term682988.getClass(), "type", 0);
        setField(term682988, term682988.getClass(), "next", null);
        setField(term682988, term682988.getClass(), "first", null);
        setField(term682988, term682988.getClass(), "last", null);
        setField(term682988, term682988.getClass(), "propListHead", null);
        setIntField(term682988, term682988.getClass(), "sourcePosition", 0);
        setField(term682988, term682988.getClass(), "jsType", null);
        setField(term682988, term682988.getClass(), "parent", null);
        setField(term682987, term682987.getClass(), "next", term682988);
        setField(term682987, term682987.getClass(), "first", null);
        setField(term682987, term682987.getClass(), "last", null);
        setField(term682987, term682987.getClass(), "propListHead", null);
        setIntField(term682987, term682987.getClass(), "sourcePosition", 0);
        setField(term682987, term682987.getClass(), "jsType", null);
        setField(term682987, term682987.getClass(), "parent", null);
        setField(term682986, term682986.getClass(), "first", term682987);
        setField(term682986, term682986.getClass(), "last", null);
        setField(term682986, term682986.getClass(), "propListHead", null);
        setIntField(term682986, term682986.getClass(), "sourcePosition", 0);
        setField(term682986, term682986.getClass(), "jsType", null);
        setField(term682986, term682986.getClass(), "parent", null);
        term682937 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term682939 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term682949 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term682937, term682937.getClass(), "str", null);
        setIntField(term682937, term682937.getClass(), "type", 18);
        setField(term682937, term682937.getClass(), "next", null);
        setField(term682939, term682939.getClass(), "functionName", null);
        setBooleanField(term682939, term682939.getClass(), "itsNeedsActivation", false);
        setIntField(term682939, term682939.getClass(), "itsFunctionType", 0);
        setBooleanField(term682939, term682939.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term682939, term682939.getClass(), "encodedSourceStart", 0);
        setIntField(term682939, term682939.getClass(), "encodedSourceEnd", 0);
        setField(term682939, term682939.getClass(), "sourceName", null);
        setIntField(term682939, term682939.getClass(), "baseLineno", 0);
        setIntField(term682939, term682939.getClass(), "endLineno", 0);
        setField(term682939, term682939.getClass(), "functions", null);
        setField(term682939, term682939.getClass(), "regexps", null);
        setField(term682939, term682939.getClass(), "itsVariables", null);
        setField(term682939, term682939.getClass(), "itsConst", null);
        setField(term682939, term682939.getClass(), "itsVariableNames", null);
        setIntField(term682939, term682939.getClass(), "varStart", 0);
        setField(term682939, term682939.getClass(), "compilerData", null);
        setIntField(term682939, term682939.getClass(), "type", 39);
        setDoubleField(term682949, term682949.getClass(), "number", 0.0);
        setIntField(term682949, term682949.getClass(), "type", 0);
        setField(term682949, term682949.getClass(), "next", null);
        setField(term682949, term682949.getClass(), "first", null);
        setField(term682949, term682949.getClass(), "last", null);
        setField(term682949, term682949.getClass(), "propListHead", null);
        setIntField(term682949, term682949.getClass(), "sourcePosition", 0);
        setField(term682949, term682949.getClass(), "jsType", null);
        setField(term682949, term682949.getClass(), "parent", null);
        setField(term682939, term682939.getClass(), "next", term682949);
        setField(term682939, term682939.getClass(), "first", null);
        setField(term682939, term682939.getClass(), "last", null);
        setField(term682939, term682939.getClass(), "propListHead", null);
        setIntField(term682939, term682939.getClass(), "sourcePosition", 0);
        setField(term682939, term682939.getClass(), "jsType", null);
        setField(term682939, term682939.getClass(), "parent", null);
        setField(term682937, term682937.getClass(), "first", term682939);
        setField(term682937, term682937.getClass(), "last", null);
        setField(term682937, term682937.getClass(), "propListHead", null);
        setIntField(term682937, term682937.getClass(), "sourcePosition", 0);
        setField(term682937, term682937.getClass(), "jsType", null);
        setField(term682937, term682937.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term682743;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term682651, args);
        assertTrue(recursiveEquals(term682651, term682985));
        assertTrue(recursiveEquals(term682743, term682986));
        assertTrue(recursiveEquals(retValue, term682937));
    }

};


