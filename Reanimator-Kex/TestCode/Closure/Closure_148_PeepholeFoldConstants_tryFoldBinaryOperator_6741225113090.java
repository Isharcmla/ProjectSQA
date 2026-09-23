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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113090 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term913586;
     Object term913678;
     Object term914123;
     Object term914124;
     Object term914046;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113090() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term913586 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term913678 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term913748 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term913840 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term913932 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term913840, term913840.getClass(), "type", 63);
        setField(term913748, term913748.getClass(), "next", term913840);
        setIntField(term913748, term913748.getClass(), "type", 0);
        setField(term913678, term913678.getClass(), "first", term913748);
        setIntField(term913678, term913678.getClass(), "type", 101);
        setField(term913678, term913678.getClass(), "parent", term913932);
        term914123 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term914123, term914123.getClass(), "currentTraversal", null);
        term914124 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term914125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term914126 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term914127 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term914124, term914124.getClass(), "number", 0.0);
        setIntField(term914124, term914124.getClass(), "type", 101);
        setField(term914124, term914124.getClass(), "next", null);
        setIntField(term914125, term914125.getClass(), "type", 0);
        setDoubleField(term914126, term914126.getClass(), "number", 0.0);
        setIntField(term914126, term914126.getClass(), "type", 63);
        setField(term914126, term914126.getClass(), "next", null);
        setField(term914126, term914126.getClass(), "first", null);
        setField(term914126, term914126.getClass(), "last", null);
        setField(term914126, term914126.getClass(), "propListHead", null);
        setIntField(term914126, term914126.getClass(), "sourcePosition", 0);
        setField(term914126, term914126.getClass(), "jsType", null);
        setField(term914126, term914126.getClass(), "parent", null);
        setField(term914125, term914125.getClass(), "next", term914126);
        setField(term914125, term914125.getClass(), "first", null);
        setField(term914125, term914125.getClass(), "last", null);
        setField(term914125, term914125.getClass(), "propListHead", null);
        setIntField(term914125, term914125.getClass(), "sourcePosition", 0);
        setField(term914125, term914125.getClass(), "jsType", null);
        setField(term914125, term914125.getClass(), "parent", null);
        setField(term914124, term914124.getClass(), "first", term914125);
        setField(term914124, term914124.getClass(), "last", null);
        setField(term914124, term914124.getClass(), "propListHead", null);
        setIntField(term914124, term914124.getClass(), "sourcePosition", 0);
        setField(term914124, term914124.getClass(), "jsType", null);
        setDoubleField(term914127, term914127.getClass(), "number", 0.0);
        setIntField(term914127, term914127.getClass(), "type", 0);
        setField(term914127, term914127.getClass(), "next", null);
        setField(term914127, term914127.getClass(), "first", null);
        setField(term914127, term914127.getClass(), "last", null);
        setField(term914127, term914127.getClass(), "propListHead", null);
        setIntField(term914127, term914127.getClass(), "sourcePosition", 0);
        setField(term914127, term914127.getClass(), "jsType", null);
        setField(term914127, term914127.getClass(), "parent", null);
        setField(term914124, term914124.getClass(), "parent", term914127);
        term914046 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term914049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term914051 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term914057 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term914046, term914046.getClass(), "number", 0.0);
        setIntField(term914046, term914046.getClass(), "type", 101);
        setField(term914046, term914046.getClass(), "next", null);
        setIntField(term914049, term914049.getClass(), "type", 0);
        setDoubleField(term914051, term914051.getClass(), "number", 0.0);
        setIntField(term914051, term914051.getClass(), "type", 63);
        setField(term914051, term914051.getClass(), "next", null);
        setField(term914051, term914051.getClass(), "first", null);
        setField(term914051, term914051.getClass(), "last", null);
        setField(term914051, term914051.getClass(), "propListHead", null);
        setIntField(term914051, term914051.getClass(), "sourcePosition", 0);
        setField(term914051, term914051.getClass(), "jsType", null);
        setField(term914051, term914051.getClass(), "parent", null);
        setField(term914049, term914049.getClass(), "next", term914051);
        setField(term914049, term914049.getClass(), "first", null);
        setField(term914049, term914049.getClass(), "last", null);
        setField(term914049, term914049.getClass(), "propListHead", null);
        setIntField(term914049, term914049.getClass(), "sourcePosition", 0);
        setField(term914049, term914049.getClass(), "jsType", null);
        setField(term914049, term914049.getClass(), "parent", null);
        setField(term914046, term914046.getClass(), "first", term914049);
        setField(term914046, term914046.getClass(), "last", null);
        setField(term914046, term914046.getClass(), "propListHead", null);
        setIntField(term914046, term914046.getClass(), "sourcePosition", 0);
        setField(term914046, term914046.getClass(), "jsType", null);
        setDoubleField(term914057, term914057.getClass(), "number", 0.0);
        setIntField(term914057, term914057.getClass(), "type", 0);
        setField(term914057, term914057.getClass(), "next", null);
        setField(term914057, term914057.getClass(), "first", null);
        setField(term914057, term914057.getClass(), "last", null);
        setField(term914057, term914057.getClass(), "propListHead", null);
        setIntField(term914057, term914057.getClass(), "sourcePosition", 0);
        setField(term914057, term914057.getClass(), "jsType", null);
        setField(term914057, term914057.getClass(), "parent", null);
        setField(term914046, term914046.getClass(), "parent", term914057);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term913678;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term913586, args);
        assertTrue(recursiveEquals(term913586, term914123));
        assertTrue(recursiveEquals(term913678, term914124));
        assertTrue(recursiveEquals(retValue, term914046));
    }

};


