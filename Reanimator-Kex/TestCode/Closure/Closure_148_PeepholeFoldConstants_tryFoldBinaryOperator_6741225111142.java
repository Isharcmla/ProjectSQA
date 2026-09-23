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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269087;
     Object term269179;
     Object term269474;
     Object term269475;
     Object term269433;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term269087 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term269179 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term269271 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term269363 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term269271, term269271.getClass(), "next", term269363);
        setField(term269179, term269179.getClass(), "first", term269271);
        setIntField(term269179, term269179.getClass(), "type", 15);
        term269474 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term269474, term269474.getClass(), "currentTraversal", null);
        term269475 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term269476 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term269477 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term269475, term269475.getClass(), "number", 0.0);
        setIntField(term269475, term269475.getClass(), "type", 15);
        setField(term269475, term269475.getClass(), "next", null);
        setDoubleField(term269476, term269476.getClass(), "number", 0.0);
        setIntField(term269476, term269476.getClass(), "type", 0);
        setDoubleField(term269477, term269477.getClass(), "number", 0.0);
        setIntField(term269477, term269477.getClass(), "type", 0);
        setField(term269477, term269477.getClass(), "next", null);
        setField(term269477, term269477.getClass(), "first", null);
        setField(term269477, term269477.getClass(), "last", null);
        setField(term269477, term269477.getClass(), "propListHead", null);
        setIntField(term269477, term269477.getClass(), "sourcePosition", 0);
        setField(term269477, term269477.getClass(), "jsType", null);
        setField(term269477, term269477.getClass(), "parent", null);
        setField(term269476, term269476.getClass(), "next", term269477);
        setField(term269476, term269476.getClass(), "first", null);
        setField(term269476, term269476.getClass(), "last", null);
        setField(term269476, term269476.getClass(), "propListHead", null);
        setIntField(term269476, term269476.getClass(), "sourcePosition", 0);
        setField(term269476, term269476.getClass(), "jsType", null);
        setField(term269476, term269476.getClass(), "parent", null);
        setField(term269475, term269475.getClass(), "first", term269476);
        setField(term269475, term269475.getClass(), "last", null);
        setField(term269475, term269475.getClass(), "propListHead", null);
        setIntField(term269475, term269475.getClass(), "sourcePosition", 0);
        setField(term269475, term269475.getClass(), "jsType", null);
        setField(term269475, term269475.getClass(), "parent", null);
        term269433 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term269436 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term269439 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term269433, term269433.getClass(), "number", 0.0);
        setIntField(term269433, term269433.getClass(), "type", 15);
        setField(term269433, term269433.getClass(), "next", null);
        setDoubleField(term269436, term269436.getClass(), "number", 0.0);
        setIntField(term269436, term269436.getClass(), "type", 0);
        setDoubleField(term269439, term269439.getClass(), "number", 0.0);
        setIntField(term269439, term269439.getClass(), "type", 0);
        setField(term269439, term269439.getClass(), "next", null);
        setField(term269439, term269439.getClass(), "first", null);
        setField(term269439, term269439.getClass(), "last", null);
        setField(term269439, term269439.getClass(), "propListHead", null);
        setIntField(term269439, term269439.getClass(), "sourcePosition", 0);
        setField(term269439, term269439.getClass(), "jsType", null);
        setField(term269439, term269439.getClass(), "parent", null);
        setField(term269436, term269436.getClass(), "next", term269439);
        setField(term269436, term269436.getClass(), "first", null);
        setField(term269436, term269436.getClass(), "last", null);
        setField(term269436, term269436.getClass(), "propListHead", null);
        setIntField(term269436, term269436.getClass(), "sourcePosition", 0);
        setField(term269436, term269436.getClass(), "jsType", null);
        setField(term269436, term269436.getClass(), "parent", null);
        setField(term269433, term269433.getClass(), "first", term269436);
        setField(term269433, term269433.getClass(), "last", null);
        setField(term269433, term269433.getClass(), "propListHead", null);
        setIntField(term269433, term269433.getClass(), "sourcePosition", 0);
        setField(term269433, term269433.getClass(), "jsType", null);
        setField(term269433, term269433.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term269179;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term269087, args);
        assertTrue(recursiveEquals(term269087, term269474));
        assertTrue(recursiveEquals(term269179, term269475));
        assertTrue(recursiveEquals(retValue, term269433));
    }

};


