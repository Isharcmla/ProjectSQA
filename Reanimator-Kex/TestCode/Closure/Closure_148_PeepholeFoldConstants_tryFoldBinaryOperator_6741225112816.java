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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term817347;
     Object term817439;
     Object term818165;
     Object term818166;
     Object term818090;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term817347 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term817439 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term817531 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term817623 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term817715 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term817623, term817623.getClass(), "type", 64);
        setField(term817531, term817531.getClass(), "next", term817623);
        setIntField(term817531, term817531.getClass(), "type", 0);
        setField(term817439, term817439.getClass(), "first", term817531);
        setIntField(term817439, term817439.getClass(), "type", 101);
        setField(term817439, term817439.getClass(), "parent", term817715);
        term818165 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term818165, term818165.getClass(), "currentTraversal", null);
        term818166 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term818167 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term818168 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term818169 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term818166, term818166.getClass(), "number", 0.0);
        setIntField(term818166, term818166.getClass(), "type", 101);
        setField(term818166, term818166.getClass(), "next", null);
        setDoubleField(term818167, term818167.getClass(), "number", 0.0);
        setIntField(term818167, term818167.getClass(), "type", 0);
        setDoubleField(term818168, term818168.getClass(), "number", 0.0);
        setIntField(term818168, term818168.getClass(), "type", 64);
        setField(term818168, term818168.getClass(), "next", null);
        setField(term818168, term818168.getClass(), "first", null);
        setField(term818168, term818168.getClass(), "last", null);
        setField(term818168, term818168.getClass(), "propListHead", null);
        setIntField(term818168, term818168.getClass(), "sourcePosition", 0);
        setField(term818168, term818168.getClass(), "jsType", null);
        setField(term818168, term818168.getClass(), "parent", null);
        setField(term818167, term818167.getClass(), "next", term818168);
        setField(term818167, term818167.getClass(), "first", null);
        setField(term818167, term818167.getClass(), "last", null);
        setField(term818167, term818167.getClass(), "propListHead", null);
        setIntField(term818167, term818167.getClass(), "sourcePosition", 0);
        setField(term818167, term818167.getClass(), "jsType", null);
        setField(term818167, term818167.getClass(), "parent", null);
        setField(term818166, term818166.getClass(), "first", term818167);
        setField(term818166, term818166.getClass(), "last", null);
        setField(term818166, term818166.getClass(), "propListHead", null);
        setIntField(term818166, term818166.getClass(), "sourcePosition", 0);
        setField(term818166, term818166.getClass(), "jsType", null);
        setField(term818169, term818169.getClass(), "str", null);
        setIntField(term818169, term818169.getClass(), "type", 0);
        setField(term818169, term818169.getClass(), "next", null);
        setField(term818169, term818169.getClass(), "first", null);
        setField(term818169, term818169.getClass(), "last", null);
        setField(term818169, term818169.getClass(), "propListHead", null);
        setIntField(term818169, term818169.getClass(), "sourcePosition", 0);
        setField(term818169, term818169.getClass(), "jsType", null);
        setField(term818169, term818169.getClass(), "parent", null);
        setField(term818166, term818166.getClass(), "parent", term818169);
        term818090 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term818093 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term818096 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term818102 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term818090, term818090.getClass(), "number", 0.0);
        setIntField(term818090, term818090.getClass(), "type", 101);
        setField(term818090, term818090.getClass(), "next", null);
        setDoubleField(term818093, term818093.getClass(), "number", 0.0);
        setIntField(term818093, term818093.getClass(), "type", 0);
        setDoubleField(term818096, term818096.getClass(), "number", 0.0);
        setIntField(term818096, term818096.getClass(), "type", 64);
        setField(term818096, term818096.getClass(), "next", null);
        setField(term818096, term818096.getClass(), "first", null);
        setField(term818096, term818096.getClass(), "last", null);
        setField(term818096, term818096.getClass(), "propListHead", null);
        setIntField(term818096, term818096.getClass(), "sourcePosition", 0);
        setField(term818096, term818096.getClass(), "jsType", null);
        setField(term818096, term818096.getClass(), "parent", null);
        setField(term818093, term818093.getClass(), "next", term818096);
        setField(term818093, term818093.getClass(), "first", null);
        setField(term818093, term818093.getClass(), "last", null);
        setField(term818093, term818093.getClass(), "propListHead", null);
        setIntField(term818093, term818093.getClass(), "sourcePosition", 0);
        setField(term818093, term818093.getClass(), "jsType", null);
        setField(term818093, term818093.getClass(), "parent", null);
        setField(term818090, term818090.getClass(), "first", term818093);
        setField(term818090, term818090.getClass(), "last", null);
        setField(term818090, term818090.getClass(), "propListHead", null);
        setIntField(term818090, term818090.getClass(), "sourcePosition", 0);
        setField(term818090, term818090.getClass(), "jsType", null);
        setField(term818102, term818102.getClass(), "str", null);
        setIntField(term818102, term818102.getClass(), "type", 0);
        setField(term818102, term818102.getClass(), "next", null);
        setField(term818102, term818102.getClass(), "first", null);
        setField(term818102, term818102.getClass(), "last", null);
        setField(term818102, term818102.getClass(), "propListHead", null);
        setIntField(term818102, term818102.getClass(), "sourcePosition", 0);
        setField(term818102, term818102.getClass(), "jsType", null);
        setField(term818102, term818102.getClass(), "parent", null);
        setField(term818090, term818090.getClass(), "parent", term818102);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term817439;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term817347, args);
        assertTrue(recursiveEquals(term817347, term818165));
        assertTrue(recursiveEquals(term817439, term818166));
        assertTrue(recursiveEquals(retValue, term818090));
    }

};


