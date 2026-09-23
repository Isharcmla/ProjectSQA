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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243524;
     Object term243616;
     Object term244263;
     Object term244264;
     Object term244234;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term243524 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term243616 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term243708 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term243800 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term243708, term243708.getClass(), "next", term243800);
        setIntField(term243708, term243708.getClass(), "type", 39);
        setField(term243616, term243616.getClass(), "first", term243708);
        setIntField(term243616, term243616.getClass(), "type", 19);
        term244263 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term244263, term244263.getClass(), "currentTraversal", null);
        term244264 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term244265 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term244266 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term244264, term244264.getClass(), "str", null);
        setIntField(term244264, term244264.getClass(), "type", 19);
        setField(term244264, term244264.getClass(), "next", null);
        setField(term244265, term244265.getClass(), "str", null);
        setIntField(term244265, term244265.getClass(), "type", 39);
        setField(term244266, term244266.getClass(), "str", null);
        setIntField(term244266, term244266.getClass(), "type", 0);
        setField(term244266, term244266.getClass(), "next", null);
        setField(term244266, term244266.getClass(), "first", null);
        setField(term244266, term244266.getClass(), "last", null);
        setField(term244266, term244266.getClass(), "propListHead", null);
        setIntField(term244266, term244266.getClass(), "sourcePosition", 0);
        setField(term244266, term244266.getClass(), "jsType", null);
        setField(term244266, term244266.getClass(), "parent", null);
        setField(term244265, term244265.getClass(), "next", term244266);
        setField(term244265, term244265.getClass(), "first", null);
        setField(term244265, term244265.getClass(), "last", null);
        setField(term244265, term244265.getClass(), "propListHead", null);
        setIntField(term244265, term244265.getClass(), "sourcePosition", 0);
        setField(term244265, term244265.getClass(), "jsType", null);
        setField(term244265, term244265.getClass(), "parent", null);
        setField(term244264, term244264.getClass(), "first", term244265);
        setField(term244264, term244264.getClass(), "last", null);
        setField(term244264, term244264.getClass(), "propListHead", null);
        setIntField(term244264, term244264.getClass(), "sourcePosition", 0);
        setField(term244264, term244264.getClass(), "jsType", null);
        setField(term244264, term244264.getClass(), "parent", null);
        term244234 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term244236 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term244238 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term244234, term244234.getClass(), "str", null);
        setIntField(term244234, term244234.getClass(), "type", 19);
        setField(term244234, term244234.getClass(), "next", null);
        setField(term244236, term244236.getClass(), "str", null);
        setIntField(term244236, term244236.getClass(), "type", 39);
        setField(term244238, term244238.getClass(), "str", null);
        setIntField(term244238, term244238.getClass(), "type", 0);
        setField(term244238, term244238.getClass(), "next", null);
        setField(term244238, term244238.getClass(), "first", null);
        setField(term244238, term244238.getClass(), "last", null);
        setField(term244238, term244238.getClass(), "propListHead", null);
        setIntField(term244238, term244238.getClass(), "sourcePosition", 0);
        setField(term244238, term244238.getClass(), "jsType", null);
        setField(term244238, term244238.getClass(), "parent", null);
        setField(term244236, term244236.getClass(), "next", term244238);
        setField(term244236, term244236.getClass(), "first", null);
        setField(term244236, term244236.getClass(), "last", null);
        setField(term244236, term244236.getClass(), "propListHead", null);
        setIntField(term244236, term244236.getClass(), "sourcePosition", 0);
        setField(term244236, term244236.getClass(), "jsType", null);
        setField(term244236, term244236.getClass(), "parent", null);
        setField(term244234, term244234.getClass(), "first", term244236);
        setField(term244234, term244234.getClass(), "last", null);
        setField(term244234, term244234.getClass(), "propListHead", null);
        setIntField(term244234, term244234.getClass(), "sourcePosition", 0);
        setField(term244234, term244234.getClass(), "jsType", null);
        setField(term244234, term244234.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term243616;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term243524, args);
        assertTrue(recursiveEquals(term243524, term244263));
        assertTrue(recursiveEquals(term243616, term244264));
        assertTrue(recursiveEquals(retValue, term244234));
    }

};


