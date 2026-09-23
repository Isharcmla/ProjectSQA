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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term606951;
     Object term607043;
     Object term608451;
     Object term608452;
     Object term608411;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term606951 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term607043 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term607135 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term607227 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term607135, term607135.getClass(), "next", term607227);
        setIntField(term607135, term607135.getClass(), "type", 63);
        setField(term607043, term607043.getClass(), "first", term607135);
        setIntField(term607043, term607043.getClass(), "type", 35);
        term608451 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term608451, term608451.getClass(), "currentTraversal", null);
        term608452 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term608453 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term608454 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term608452, term608452.getClass(), "number", 0.0);
        setIntField(term608452, term608452.getClass(), "type", 35);
        setField(term608452, term608452.getClass(), "next", null);
        setDoubleField(term608453, term608453.getClass(), "number", 0.0);
        setIntField(term608453, term608453.getClass(), "type", 63);
        setDoubleField(term608454, term608454.getClass(), "number", 0.0);
        setIntField(term608454, term608454.getClass(), "type", 0);
        setField(term608454, term608454.getClass(), "next", null);
        setField(term608454, term608454.getClass(), "first", null);
        setField(term608454, term608454.getClass(), "last", null);
        setField(term608454, term608454.getClass(), "propListHead", null);
        setIntField(term608454, term608454.getClass(), "sourcePosition", 0);
        setField(term608454, term608454.getClass(), "jsType", null);
        setField(term608454, term608454.getClass(), "parent", null);
        setField(term608453, term608453.getClass(), "next", term608454);
        setField(term608453, term608453.getClass(), "first", null);
        setField(term608453, term608453.getClass(), "last", null);
        setField(term608453, term608453.getClass(), "propListHead", null);
        setIntField(term608453, term608453.getClass(), "sourcePosition", 0);
        setField(term608453, term608453.getClass(), "jsType", null);
        setField(term608453, term608453.getClass(), "parent", null);
        setField(term608452, term608452.getClass(), "first", term608453);
        setField(term608452, term608452.getClass(), "last", null);
        setField(term608452, term608452.getClass(), "propListHead", null);
        setIntField(term608452, term608452.getClass(), "sourcePosition", 0);
        setField(term608452, term608452.getClass(), "jsType", null);
        setField(term608452, term608452.getClass(), "parent", null);
        term608411 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term608414 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term608417 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term608411, term608411.getClass(), "number", 0.0);
        setIntField(term608411, term608411.getClass(), "type", 35);
        setField(term608411, term608411.getClass(), "next", null);
        setDoubleField(term608414, term608414.getClass(), "number", 0.0);
        setIntField(term608414, term608414.getClass(), "type", 63);
        setDoubleField(term608417, term608417.getClass(), "number", 0.0);
        setIntField(term608417, term608417.getClass(), "type", 0);
        setField(term608417, term608417.getClass(), "next", null);
        setField(term608417, term608417.getClass(), "first", null);
        setField(term608417, term608417.getClass(), "last", null);
        setField(term608417, term608417.getClass(), "propListHead", null);
        setIntField(term608417, term608417.getClass(), "sourcePosition", 0);
        setField(term608417, term608417.getClass(), "jsType", null);
        setField(term608417, term608417.getClass(), "parent", null);
        setField(term608414, term608414.getClass(), "next", term608417);
        setField(term608414, term608414.getClass(), "first", null);
        setField(term608414, term608414.getClass(), "last", null);
        setField(term608414, term608414.getClass(), "propListHead", null);
        setIntField(term608414, term608414.getClass(), "sourcePosition", 0);
        setField(term608414, term608414.getClass(), "jsType", null);
        setField(term608414, term608414.getClass(), "parent", null);
        setField(term608411, term608411.getClass(), "first", term608414);
        setField(term608411, term608411.getClass(), "last", null);
        setField(term608411, term608411.getClass(), "propListHead", null);
        setIntField(term608411, term608411.getClass(), "sourcePosition", 0);
        setField(term608411, term608411.getClass(), "jsType", null);
        setField(term608411, term608411.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term607043;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term606951, args);
        assertTrue(recursiveEquals(term606951, term608451));
        assertTrue(recursiveEquals(term607043, term608452));
        assertTrue(recursiveEquals(retValue, term608411));
    }

};


