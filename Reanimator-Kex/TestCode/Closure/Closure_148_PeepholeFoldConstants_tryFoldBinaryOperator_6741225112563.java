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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term725414;
     Object term725506;
     Object term726394;
     Object term726395;
     Object term726315;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term725414 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term725506 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term725598 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term725690 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term725782 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term725690, term725690.getClass(), "type", 64);
        setField(term725598, term725598.getClass(), "next", term725690);
        setIntField(term725598, term725598.getClass(), "type", 0);
        setField(term725506, term725506.getClass(), "first", term725598);
        setIntField(term725506, term725506.getClass(), "type", 101);
        setField(term725506, term725506.getClass(), "parent", term725782);
        term726394 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term726394, term726394.getClass(), "currentTraversal", null);
        term726395 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term726396 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term726397 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term726398 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term726395, term726395.getClass(), "number", 0.0);
        setIntField(term726395, term726395.getClass(), "type", 101);
        setField(term726395, term726395.getClass(), "next", null);
        setDoubleField(term726396, term726396.getClass(), "number", 0.0);
        setIntField(term726396, term726396.getClass(), "type", 0);
        setDoubleField(term726397, term726397.getClass(), "number", 0.0);
        setIntField(term726397, term726397.getClass(), "type", 64);
        setField(term726397, term726397.getClass(), "next", null);
        setField(term726397, term726397.getClass(), "first", null);
        setField(term726397, term726397.getClass(), "last", null);
        setField(term726397, term726397.getClass(), "propListHead", null);
        setIntField(term726397, term726397.getClass(), "sourcePosition", 0);
        setField(term726397, term726397.getClass(), "jsType", null);
        setField(term726397, term726397.getClass(), "parent", null);
        setField(term726396, term726396.getClass(), "next", term726397);
        setField(term726396, term726396.getClass(), "first", null);
        setField(term726396, term726396.getClass(), "last", null);
        setField(term726396, term726396.getClass(), "propListHead", null);
        setIntField(term726396, term726396.getClass(), "sourcePosition", 0);
        setField(term726396, term726396.getClass(), "jsType", null);
        setField(term726396, term726396.getClass(), "parent", null);
        setField(term726395, term726395.getClass(), "first", term726396);
        setField(term726395, term726395.getClass(), "last", null);
        setField(term726395, term726395.getClass(), "propListHead", null);
        setIntField(term726395, term726395.getClass(), "sourcePosition", 0);
        setField(term726395, term726395.getClass(), "jsType", null);
        setDoubleField(term726398, term726398.getClass(), "number", 0.0);
        setIntField(term726398, term726398.getClass(), "type", 0);
        setField(term726398, term726398.getClass(), "next", null);
        setField(term726398, term726398.getClass(), "first", null);
        setField(term726398, term726398.getClass(), "last", null);
        setField(term726398, term726398.getClass(), "propListHead", null);
        setIntField(term726398, term726398.getClass(), "sourcePosition", 0);
        setField(term726398, term726398.getClass(), "jsType", null);
        setField(term726398, term726398.getClass(), "parent", null);
        setField(term726395, term726395.getClass(), "parent", term726398);
        term726315 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term726318 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term726321 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term726327 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term726315, term726315.getClass(), "number", 0.0);
        setIntField(term726315, term726315.getClass(), "type", 101);
        setField(term726315, term726315.getClass(), "next", null);
        setDoubleField(term726318, term726318.getClass(), "number", 0.0);
        setIntField(term726318, term726318.getClass(), "type", 0);
        setDoubleField(term726321, term726321.getClass(), "number", 0.0);
        setIntField(term726321, term726321.getClass(), "type", 64);
        setField(term726321, term726321.getClass(), "next", null);
        setField(term726321, term726321.getClass(), "first", null);
        setField(term726321, term726321.getClass(), "last", null);
        setField(term726321, term726321.getClass(), "propListHead", null);
        setIntField(term726321, term726321.getClass(), "sourcePosition", 0);
        setField(term726321, term726321.getClass(), "jsType", null);
        setField(term726321, term726321.getClass(), "parent", null);
        setField(term726318, term726318.getClass(), "next", term726321);
        setField(term726318, term726318.getClass(), "first", null);
        setField(term726318, term726318.getClass(), "last", null);
        setField(term726318, term726318.getClass(), "propListHead", null);
        setIntField(term726318, term726318.getClass(), "sourcePosition", 0);
        setField(term726318, term726318.getClass(), "jsType", null);
        setField(term726318, term726318.getClass(), "parent", null);
        setField(term726315, term726315.getClass(), "first", term726318);
        setField(term726315, term726315.getClass(), "last", null);
        setField(term726315, term726315.getClass(), "propListHead", null);
        setIntField(term726315, term726315.getClass(), "sourcePosition", 0);
        setField(term726315, term726315.getClass(), "jsType", null);
        setDoubleField(term726327, term726327.getClass(), "number", 0.0);
        setIntField(term726327, term726327.getClass(), "type", 0);
        setField(term726327, term726327.getClass(), "next", null);
        setField(term726327, term726327.getClass(), "first", null);
        setField(term726327, term726327.getClass(), "last", null);
        setField(term726327, term726327.getClass(), "propListHead", null);
        setIntField(term726327, term726327.getClass(), "sourcePosition", 0);
        setField(term726327, term726327.getClass(), "jsType", null);
        setField(term726327, term726327.getClass(), "parent", null);
        setField(term726315, term726315.getClass(), "parent", term726327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term725506;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term725414, args);
        assertTrue(recursiveEquals(term725414, term726394));
        assertTrue(recursiveEquals(term725506, term726395));
        assertTrue(recursiveEquals(retValue, term726315));
    }

};


