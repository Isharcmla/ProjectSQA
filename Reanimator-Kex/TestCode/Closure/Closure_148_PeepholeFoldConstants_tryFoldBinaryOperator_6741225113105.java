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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term918095;
     Object term918187;
     Object term919011;
     Object term919012;
     Object term918959;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term918095 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term918187 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term918273 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term918343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term918273, term918273.getClass(), "next", term918343);
        setField(term918187, term918187.getClass(), "first", term918273);
        setIntField(term918187, term918187.getClass(), "type", 45);
        term919011 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term919011, term919011.getClass(), "currentTraversal", null);
        term919012 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term919013 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term919014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term919012, term919012.getClass(), "number", 0.0);
        setIntField(term919012, term919012.getClass(), "type", 45);
        setField(term919012, term919012.getClass(), "next", null);
        setField(term919013, term919013.getClass(), "functionName", null);
        setBooleanField(term919013, term919013.getClass(), "itsNeedsActivation", false);
        setIntField(term919013, term919013.getClass(), "itsFunctionType", 0);
        setBooleanField(term919013, term919013.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term919013, term919013.getClass(), "encodedSourceStart", 0);
        setIntField(term919013, term919013.getClass(), "encodedSourceEnd", 0);
        setField(term919013, term919013.getClass(), "sourceName", null);
        setIntField(term919013, term919013.getClass(), "baseLineno", 0);
        setIntField(term919013, term919013.getClass(), "endLineno", 0);
        setField(term919013, term919013.getClass(), "functions", null);
        setField(term919013, term919013.getClass(), "regexps", null);
        setField(term919013, term919013.getClass(), "itsVariables", null);
        setField(term919013, term919013.getClass(), "itsConst", null);
        setField(term919013, term919013.getClass(), "itsVariableNames", null);
        setIntField(term919013, term919013.getClass(), "varStart", 0);
        setField(term919013, term919013.getClass(), "compilerData", null);
        setIntField(term919013, term919013.getClass(), "type", 0);
        setIntField(term919014, term919014.getClass(), "type", 0);
        setField(term919014, term919014.getClass(), "next", null);
        setField(term919014, term919014.getClass(), "first", null);
        setField(term919014, term919014.getClass(), "last", null);
        setField(term919014, term919014.getClass(), "propListHead", null);
        setIntField(term919014, term919014.getClass(), "sourcePosition", 0);
        setField(term919014, term919014.getClass(), "jsType", null);
        setField(term919014, term919014.getClass(), "parent", null);
        setField(term919013, term919013.getClass(), "next", term919014);
        setField(term919013, term919013.getClass(), "first", null);
        setField(term919013, term919013.getClass(), "last", null);
        setField(term919013, term919013.getClass(), "propListHead", null);
        setIntField(term919013, term919013.getClass(), "sourcePosition", 0);
        setField(term919013, term919013.getClass(), "jsType", null);
        setField(term919013, term919013.getClass(), "parent", null);
        setField(term919012, term919012.getClass(), "first", term919013);
        setField(term919012, term919012.getClass(), "last", null);
        setField(term919012, term919012.getClass(), "propListHead", null);
        setIntField(term919012, term919012.getClass(), "sourcePosition", 0);
        setField(term919012, term919012.getClass(), "jsType", null);
        setField(term919012, term919012.getClass(), "parent", null);
        term918959 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term918962 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term918972 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term918959, term918959.getClass(), "number", 0.0);
        setIntField(term918959, term918959.getClass(), "type", 45);
        setField(term918959, term918959.getClass(), "next", null);
        setField(term918962, term918962.getClass(), "functionName", null);
        setBooleanField(term918962, term918962.getClass(), "itsNeedsActivation", false);
        setIntField(term918962, term918962.getClass(), "itsFunctionType", 0);
        setBooleanField(term918962, term918962.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term918962, term918962.getClass(), "encodedSourceStart", 0);
        setIntField(term918962, term918962.getClass(), "encodedSourceEnd", 0);
        setField(term918962, term918962.getClass(), "sourceName", null);
        setIntField(term918962, term918962.getClass(), "baseLineno", 0);
        setIntField(term918962, term918962.getClass(), "endLineno", 0);
        setField(term918962, term918962.getClass(), "functions", null);
        setField(term918962, term918962.getClass(), "regexps", null);
        setField(term918962, term918962.getClass(), "itsVariables", null);
        setField(term918962, term918962.getClass(), "itsConst", null);
        setField(term918962, term918962.getClass(), "itsVariableNames", null);
        setIntField(term918962, term918962.getClass(), "varStart", 0);
        setField(term918962, term918962.getClass(), "compilerData", null);
        setIntField(term918962, term918962.getClass(), "type", 0);
        setIntField(term918972, term918972.getClass(), "type", 0);
        setField(term918972, term918972.getClass(), "next", null);
        setField(term918972, term918972.getClass(), "first", null);
        setField(term918972, term918972.getClass(), "last", null);
        setField(term918972, term918972.getClass(), "propListHead", null);
        setIntField(term918972, term918972.getClass(), "sourcePosition", 0);
        setField(term918972, term918972.getClass(), "jsType", null);
        setField(term918972, term918972.getClass(), "parent", null);
        setField(term918962, term918962.getClass(), "next", term918972);
        setField(term918962, term918962.getClass(), "first", null);
        setField(term918962, term918962.getClass(), "last", null);
        setField(term918962, term918962.getClass(), "propListHead", null);
        setIntField(term918962, term918962.getClass(), "sourcePosition", 0);
        setField(term918962, term918962.getClass(), "jsType", null);
        setField(term918962, term918962.getClass(), "parent", null);
        setField(term918959, term918959.getClass(), "first", term918962);
        setField(term918959, term918959.getClass(), "last", null);
        setField(term918959, term918959.getClass(), "propListHead", null);
        setIntField(term918959, term918959.getClass(), "sourcePosition", 0);
        setField(term918959, term918959.getClass(), "jsType", null);
        setField(term918959, term918959.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term918187;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term918095, args);
        assertTrue(recursiveEquals(term918095, term919011));
        assertTrue(recursiveEquals(term918187, term919012));
        assertTrue(recursiveEquals(retValue, term918959));
    }

};


