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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term442819;
     Object term442911;
     Object term443306;
     Object term443307;
     Object term443229;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term442819 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term442911 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term442981 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term443073 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term443165 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term443073, term443073.getClass(), "type", 64);
        setField(term442981, term442981.getClass(), "next", term443073);
        setIntField(term442981, term442981.getClass(), "type", 0);
        setField(term442911, term442911.getClass(), "first", term442981);
        setIntField(term442911, term442911.getClass(), "type", 101);
        setField(term442911, term442911.getClass(), "parent", term443165);
        term443306 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term443306, term443306.getClass(), "currentTraversal", null);
        term443307 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term443308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term443309 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term443310 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term443307, term443307.getClass(), "number", 0.0);
        setIntField(term443307, term443307.getClass(), "type", 101);
        setField(term443307, term443307.getClass(), "next", null);
        setIntField(term443308, term443308.getClass(), "type", 0);
        setDoubleField(term443309, term443309.getClass(), "number", 0.0);
        setIntField(term443309, term443309.getClass(), "type", 64);
        setField(term443309, term443309.getClass(), "next", null);
        setField(term443309, term443309.getClass(), "first", null);
        setField(term443309, term443309.getClass(), "last", null);
        setField(term443309, term443309.getClass(), "propListHead", null);
        setIntField(term443309, term443309.getClass(), "sourcePosition", 0);
        setField(term443309, term443309.getClass(), "jsType", null);
        setField(term443309, term443309.getClass(), "parent", null);
        setField(term443308, term443308.getClass(), "next", term443309);
        setField(term443308, term443308.getClass(), "first", null);
        setField(term443308, term443308.getClass(), "last", null);
        setField(term443308, term443308.getClass(), "propListHead", null);
        setIntField(term443308, term443308.getClass(), "sourcePosition", 0);
        setField(term443308, term443308.getClass(), "jsType", null);
        setField(term443308, term443308.getClass(), "parent", null);
        setField(term443307, term443307.getClass(), "first", term443308);
        setField(term443307, term443307.getClass(), "last", null);
        setField(term443307, term443307.getClass(), "propListHead", null);
        setIntField(term443307, term443307.getClass(), "sourcePosition", 0);
        setField(term443307, term443307.getClass(), "jsType", null);
        setDoubleField(term443310, term443310.getClass(), "number", 0.0);
        setIntField(term443310, term443310.getClass(), "type", 0);
        setField(term443310, term443310.getClass(), "next", null);
        setField(term443310, term443310.getClass(), "first", null);
        setField(term443310, term443310.getClass(), "last", null);
        setField(term443310, term443310.getClass(), "propListHead", null);
        setIntField(term443310, term443310.getClass(), "sourcePosition", 0);
        setField(term443310, term443310.getClass(), "jsType", null);
        setField(term443310, term443310.getClass(), "parent", null);
        setField(term443307, term443307.getClass(), "parent", term443310);
        term443229 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term443232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term443234 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term443240 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term443229, term443229.getClass(), "number", 0.0);
        setIntField(term443229, term443229.getClass(), "type", 101);
        setField(term443229, term443229.getClass(), "next", null);
        setIntField(term443232, term443232.getClass(), "type", 0);
        setDoubleField(term443234, term443234.getClass(), "number", 0.0);
        setIntField(term443234, term443234.getClass(), "type", 64);
        setField(term443234, term443234.getClass(), "next", null);
        setField(term443234, term443234.getClass(), "first", null);
        setField(term443234, term443234.getClass(), "last", null);
        setField(term443234, term443234.getClass(), "propListHead", null);
        setIntField(term443234, term443234.getClass(), "sourcePosition", 0);
        setField(term443234, term443234.getClass(), "jsType", null);
        setField(term443234, term443234.getClass(), "parent", null);
        setField(term443232, term443232.getClass(), "next", term443234);
        setField(term443232, term443232.getClass(), "first", null);
        setField(term443232, term443232.getClass(), "last", null);
        setField(term443232, term443232.getClass(), "propListHead", null);
        setIntField(term443232, term443232.getClass(), "sourcePosition", 0);
        setField(term443232, term443232.getClass(), "jsType", null);
        setField(term443232, term443232.getClass(), "parent", null);
        setField(term443229, term443229.getClass(), "first", term443232);
        setField(term443229, term443229.getClass(), "last", null);
        setField(term443229, term443229.getClass(), "propListHead", null);
        setIntField(term443229, term443229.getClass(), "sourcePosition", 0);
        setField(term443229, term443229.getClass(), "jsType", null);
        setDoubleField(term443240, term443240.getClass(), "number", 0.0);
        setIntField(term443240, term443240.getClass(), "type", 0);
        setField(term443240, term443240.getClass(), "next", null);
        setField(term443240, term443240.getClass(), "first", null);
        setField(term443240, term443240.getClass(), "last", null);
        setField(term443240, term443240.getClass(), "propListHead", null);
        setIntField(term443240, term443240.getClass(), "sourcePosition", 0);
        setField(term443240, term443240.getClass(), "jsType", null);
        setField(term443240, term443240.getClass(), "parent", null);
        setField(term443229, term443229.getClass(), "parent", term443240);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term442911;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term442819, args);
        assertTrue(recursiveEquals(term442819, term443306));
        assertTrue(recursiveEquals(term442911, term443307));
        assertTrue(recursiveEquals(retValue, term443229));
    }

};


