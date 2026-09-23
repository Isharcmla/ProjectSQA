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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term888500;
     Object term888592;
     Object term889459;
     Object term889460;
     Object term889391;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term888500 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term888592 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term888684 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term888776 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term888846 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term888776, term888776.getClass(), "type", 47);
        setField(term888684, term888684.getClass(), "next", term888776);
        setIntField(term888684, term888684.getClass(), "type", 0);
        setField(term888592, term888592.getClass(), "first", term888684);
        setIntField(term888592, term888592.getClass(), "type", 101);
        setField(term888592, term888592.getClass(), "parent", term888846);
        term889459 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term889459, term889459.getClass(), "currentTraversal", null);
        term889460 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term889461 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term889462 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term889463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term889460, term889460.getClass(), "str", null);
        setIntField(term889460, term889460.getClass(), "type", 101);
        setField(term889460, term889460.getClass(), "next", null);
        setField(term889461, term889461.getClass(), "str", null);
        setIntField(term889461, term889461.getClass(), "type", 0);
        setField(term889462, term889462.getClass(), "str", null);
        setIntField(term889462, term889462.getClass(), "type", 47);
        setField(term889462, term889462.getClass(), "next", null);
        setField(term889462, term889462.getClass(), "first", null);
        setField(term889462, term889462.getClass(), "last", null);
        setField(term889462, term889462.getClass(), "propListHead", null);
        setIntField(term889462, term889462.getClass(), "sourcePosition", 0);
        setField(term889462, term889462.getClass(), "jsType", null);
        setField(term889462, term889462.getClass(), "parent", null);
        setField(term889461, term889461.getClass(), "next", term889462);
        setField(term889461, term889461.getClass(), "first", null);
        setField(term889461, term889461.getClass(), "last", null);
        setField(term889461, term889461.getClass(), "propListHead", null);
        setIntField(term889461, term889461.getClass(), "sourcePosition", 0);
        setField(term889461, term889461.getClass(), "jsType", null);
        setField(term889461, term889461.getClass(), "parent", null);
        setField(term889460, term889460.getClass(), "first", term889461);
        setField(term889460, term889460.getClass(), "last", null);
        setField(term889460, term889460.getClass(), "propListHead", null);
        setIntField(term889460, term889460.getClass(), "sourcePosition", 0);
        setField(term889460, term889460.getClass(), "jsType", null);
        setIntField(term889463, term889463.getClass(), "type", 0);
        setField(term889463, term889463.getClass(), "next", null);
        setField(term889463, term889463.getClass(), "first", null);
        setField(term889463, term889463.getClass(), "last", null);
        setField(term889463, term889463.getClass(), "propListHead", null);
        setIntField(term889463, term889463.getClass(), "sourcePosition", 0);
        setField(term889463, term889463.getClass(), "jsType", null);
        setField(term889463, term889463.getClass(), "parent", null);
        setField(term889460, term889460.getClass(), "parent", term889463);
        term889391 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term889393 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term889395 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term889400 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term889391, term889391.getClass(), "str", null);
        setIntField(term889391, term889391.getClass(), "type", 101);
        setField(term889391, term889391.getClass(), "next", null);
        setField(term889393, term889393.getClass(), "str", null);
        setIntField(term889393, term889393.getClass(), "type", 0);
        setField(term889395, term889395.getClass(), "str", null);
        setIntField(term889395, term889395.getClass(), "type", 47);
        setField(term889395, term889395.getClass(), "next", null);
        setField(term889395, term889395.getClass(), "first", null);
        setField(term889395, term889395.getClass(), "last", null);
        setField(term889395, term889395.getClass(), "propListHead", null);
        setIntField(term889395, term889395.getClass(), "sourcePosition", 0);
        setField(term889395, term889395.getClass(), "jsType", null);
        setField(term889395, term889395.getClass(), "parent", null);
        setField(term889393, term889393.getClass(), "next", term889395);
        setField(term889393, term889393.getClass(), "first", null);
        setField(term889393, term889393.getClass(), "last", null);
        setField(term889393, term889393.getClass(), "propListHead", null);
        setIntField(term889393, term889393.getClass(), "sourcePosition", 0);
        setField(term889393, term889393.getClass(), "jsType", null);
        setField(term889393, term889393.getClass(), "parent", null);
        setField(term889391, term889391.getClass(), "first", term889393);
        setField(term889391, term889391.getClass(), "last", null);
        setField(term889391, term889391.getClass(), "propListHead", null);
        setIntField(term889391, term889391.getClass(), "sourcePosition", 0);
        setField(term889391, term889391.getClass(), "jsType", null);
        setIntField(term889400, term889400.getClass(), "type", 0);
        setField(term889400, term889400.getClass(), "next", null);
        setField(term889400, term889400.getClass(), "first", null);
        setField(term889400, term889400.getClass(), "last", null);
        setField(term889400, term889400.getClass(), "propListHead", null);
        setIntField(term889400, term889400.getClass(), "sourcePosition", 0);
        setField(term889400, term889400.getClass(), "jsType", null);
        setField(term889400, term889400.getClass(), "parent", null);
        setField(term889391, term889391.getClass(), "parent", term889400);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term888592;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term888500, args);
        assertTrue(recursiveEquals(term888500, term889459));
        assertTrue(recursiveEquals(term888592, term889460));
        assertTrue(recursiveEquals(retValue, term889391));
    }

};


