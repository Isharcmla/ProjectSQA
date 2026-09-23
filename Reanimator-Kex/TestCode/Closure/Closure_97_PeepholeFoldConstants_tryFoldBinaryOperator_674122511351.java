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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70085;
     Object term70177;
     Object term82052;
     Object term82053;
     Object term81999;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70085 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term70177 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term70247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70339 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term70247, term70247.getClass(), "next", term70339);
        setIntField(term70247, term70247.getClass(), "type", 0);
        setField(term70177, term70177.getClass(), "first", term70247);
        setIntField(term70177, term70177.getClass(), "type", 100);
        setField(term70177, term70177.getClass(), "parent", null);
        term82052 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term82052, term82052.getClass(), "currentTraversal", null);
        term82053 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term82054 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term82055 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term82053, term82053.getClass(), "str", null);
        setIntField(term82053, term82053.getClass(), "type", 100);
        setField(term82053, term82053.getClass(), "next", null);
        setIntField(term82054, term82054.getClass(), "type", 0);
        setField(term82055, term82055.getClass(), "str", null);
        setIntField(term82055, term82055.getClass(), "type", 0);
        setField(term82055, term82055.getClass(), "next", null);
        setField(term82055, term82055.getClass(), "first", null);
        setField(term82055, term82055.getClass(), "last", null);
        setField(term82055, term82055.getClass(), "propListHead", null);
        setIntField(term82055, term82055.getClass(), "sourcePosition", 0);
        setField(term82055, term82055.getClass(), "jsType", null);
        setField(term82055, term82055.getClass(), "parent", null);
        setField(term82054, term82054.getClass(), "next", term82055);
        setField(term82054, term82054.getClass(), "first", null);
        setField(term82054, term82054.getClass(), "last", null);
        setField(term82054, term82054.getClass(), "propListHead", null);
        setIntField(term82054, term82054.getClass(), "sourcePosition", 0);
        setField(term82054, term82054.getClass(), "jsType", null);
        setField(term82054, term82054.getClass(), "parent", null);
        setField(term82053, term82053.getClass(), "first", term82054);
        setField(term82053, term82053.getClass(), "last", null);
        setField(term82053, term82053.getClass(), "propListHead", null);
        setIntField(term82053, term82053.getClass(), "sourcePosition", 0);
        setField(term82053, term82053.getClass(), "jsType", null);
        setField(term82053, term82053.getClass(), "parent", null);
        term81999 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term82001 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term82003 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term81999, term81999.getClass(), "str", null);
        setIntField(term81999, term81999.getClass(), "type", 100);
        setField(term81999, term81999.getClass(), "next", null);
        setIntField(term82001, term82001.getClass(), "type", 0);
        setField(term82003, term82003.getClass(), "str", null);
        setIntField(term82003, term82003.getClass(), "type", 0);
        setField(term82003, term82003.getClass(), "next", null);
        setField(term82003, term82003.getClass(), "first", null);
        setField(term82003, term82003.getClass(), "last", null);
        setField(term82003, term82003.getClass(), "propListHead", null);
        setIntField(term82003, term82003.getClass(), "sourcePosition", 0);
        setField(term82003, term82003.getClass(), "jsType", null);
        setField(term82003, term82003.getClass(), "parent", null);
        setField(term82001, term82001.getClass(), "next", term82003);
        setField(term82001, term82001.getClass(), "first", null);
        setField(term82001, term82001.getClass(), "last", null);
        setField(term82001, term82001.getClass(), "propListHead", null);
        setIntField(term82001, term82001.getClass(), "sourcePosition", 0);
        setField(term82001, term82001.getClass(), "jsType", null);
        setField(term82001, term82001.getClass(), "parent", null);
        setField(term81999, term81999.getClass(), "first", term82001);
        setField(term81999, term81999.getClass(), "last", null);
        setField(term81999, term81999.getClass(), "propListHead", null);
        setIntField(term81999, term81999.getClass(), "sourcePosition", 0);
        setField(term81999, term81999.getClass(), "jsType", null);
        setField(term81999, term81999.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term70177;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term70085, args);
        assertTrue(recursiveEquals(term70085, term82052));
        assertTrue(recursiveEquals(term70177, term82053));
        assertTrue(recursiveEquals(retValue, term81999));
    }

};


