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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term345380;
     Object term345472;
     Object term346122;
     Object term346123;
     Object term346085;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term345380 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term345472 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term345564 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term345656 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term345564, term345564.getClass(), "next", term345656);
        setIntField(term345564, term345564.getClass(), "type", 63);
        setField(term345472, term345472.getClass(), "first", term345564);
        setIntField(term345472, term345472.getClass(), "type", 35);
        term346122 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term346122, term346122.getClass(), "currentTraversal", null);
        term346123 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term346124 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term346125 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term346123, term346123.getClass(), "number", 0.0);
        setIntField(term346123, term346123.getClass(), "type", 35);
        setField(term346123, term346123.getClass(), "next", null);
        setDoubleField(term346124, term346124.getClass(), "number", 0.0);
        setIntField(term346124, term346124.getClass(), "type", 63);
        setField(term346125, term346125.getClass(), "str", null);
        setIntField(term346125, term346125.getClass(), "type", 0);
        setField(term346125, term346125.getClass(), "next", null);
        setField(term346125, term346125.getClass(), "first", null);
        setField(term346125, term346125.getClass(), "last", null);
        setField(term346125, term346125.getClass(), "propListHead", null);
        setIntField(term346125, term346125.getClass(), "sourcePosition", 0);
        setField(term346125, term346125.getClass(), "jsType", null);
        setField(term346125, term346125.getClass(), "parent", null);
        setField(term346124, term346124.getClass(), "next", term346125);
        setField(term346124, term346124.getClass(), "first", null);
        setField(term346124, term346124.getClass(), "last", null);
        setField(term346124, term346124.getClass(), "propListHead", null);
        setIntField(term346124, term346124.getClass(), "sourcePosition", 0);
        setField(term346124, term346124.getClass(), "jsType", null);
        setField(term346124, term346124.getClass(), "parent", null);
        setField(term346123, term346123.getClass(), "first", term346124);
        setField(term346123, term346123.getClass(), "last", null);
        setField(term346123, term346123.getClass(), "propListHead", null);
        setIntField(term346123, term346123.getClass(), "sourcePosition", 0);
        setField(term346123, term346123.getClass(), "jsType", null);
        setField(term346123, term346123.getClass(), "parent", null);
        term346085 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term346088 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term346091 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term346085, term346085.getClass(), "number", 0.0);
        setIntField(term346085, term346085.getClass(), "type", 35);
        setField(term346085, term346085.getClass(), "next", null);
        setDoubleField(term346088, term346088.getClass(), "number", 0.0);
        setIntField(term346088, term346088.getClass(), "type", 63);
        setField(term346091, term346091.getClass(), "str", null);
        setIntField(term346091, term346091.getClass(), "type", 0);
        setField(term346091, term346091.getClass(), "next", null);
        setField(term346091, term346091.getClass(), "first", null);
        setField(term346091, term346091.getClass(), "last", null);
        setField(term346091, term346091.getClass(), "propListHead", null);
        setIntField(term346091, term346091.getClass(), "sourcePosition", 0);
        setField(term346091, term346091.getClass(), "jsType", null);
        setField(term346091, term346091.getClass(), "parent", null);
        setField(term346088, term346088.getClass(), "next", term346091);
        setField(term346088, term346088.getClass(), "first", null);
        setField(term346088, term346088.getClass(), "last", null);
        setField(term346088, term346088.getClass(), "propListHead", null);
        setIntField(term346088, term346088.getClass(), "sourcePosition", 0);
        setField(term346088, term346088.getClass(), "jsType", null);
        setField(term346088, term346088.getClass(), "parent", null);
        setField(term346085, term346085.getClass(), "first", term346088);
        setField(term346085, term346085.getClass(), "last", null);
        setField(term346085, term346085.getClass(), "propListHead", null);
        setIntField(term346085, term346085.getClass(), "sourcePosition", 0);
        setField(term346085, term346085.getClass(), "jsType", null);
        setField(term346085, term346085.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term345472;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term345380, args);
        assertTrue(recursiveEquals(term345380, term346122));
        assertTrue(recursiveEquals(term345472, term346123));
        assertTrue(recursiveEquals(retValue, term346085));
    }

};


