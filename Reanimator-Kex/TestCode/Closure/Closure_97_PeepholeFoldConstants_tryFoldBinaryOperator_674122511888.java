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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511888 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251121;
     Object term251213;
     Object term251442;
     Object term251443;
     Object term251406;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511888() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term251121 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term251213 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term251305 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term251397 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term251305, term251305.getClass(), "next", term251397);
        setIntField(term251305, term251305.getClass(), "type", 39);
        setField(term251213, term251213.getClass(), "first", term251305);
        setIntField(term251213, term251213.getClass(), "type", 23);
        term251442 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term251442, term251442.getClass(), "currentTraversal", null);
        term251443 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term251444 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term251445 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term251443, term251443.getClass(), "number", 0.0);
        setIntField(term251443, term251443.getClass(), "type", 23);
        setField(term251443, term251443.getClass(), "next", null);
        setDoubleField(term251444, term251444.getClass(), "number", 0.0);
        setIntField(term251444, term251444.getClass(), "type", 39);
        setDoubleField(term251445, term251445.getClass(), "number", 0.0);
        setIntField(term251445, term251445.getClass(), "type", 0);
        setField(term251445, term251445.getClass(), "next", null);
        setField(term251445, term251445.getClass(), "first", null);
        setField(term251445, term251445.getClass(), "last", null);
        setField(term251445, term251445.getClass(), "propListHead", null);
        setIntField(term251445, term251445.getClass(), "sourcePosition", 0);
        setField(term251445, term251445.getClass(), "jsType", null);
        setField(term251445, term251445.getClass(), "parent", null);
        setField(term251444, term251444.getClass(), "next", term251445);
        setField(term251444, term251444.getClass(), "first", null);
        setField(term251444, term251444.getClass(), "last", null);
        setField(term251444, term251444.getClass(), "propListHead", null);
        setIntField(term251444, term251444.getClass(), "sourcePosition", 0);
        setField(term251444, term251444.getClass(), "jsType", null);
        setField(term251444, term251444.getClass(), "parent", null);
        setField(term251443, term251443.getClass(), "first", term251444);
        setField(term251443, term251443.getClass(), "last", null);
        setField(term251443, term251443.getClass(), "propListHead", null);
        setIntField(term251443, term251443.getClass(), "sourcePosition", 0);
        setField(term251443, term251443.getClass(), "jsType", null);
        setField(term251443, term251443.getClass(), "parent", null);
        term251406 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term251409 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term251412 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term251406, term251406.getClass(), "number", 0.0);
        setIntField(term251406, term251406.getClass(), "type", 23);
        setField(term251406, term251406.getClass(), "next", null);
        setDoubleField(term251409, term251409.getClass(), "number", 0.0);
        setIntField(term251409, term251409.getClass(), "type", 39);
        setDoubleField(term251412, term251412.getClass(), "number", 0.0);
        setIntField(term251412, term251412.getClass(), "type", 0);
        setField(term251412, term251412.getClass(), "next", null);
        setField(term251412, term251412.getClass(), "first", null);
        setField(term251412, term251412.getClass(), "last", null);
        setField(term251412, term251412.getClass(), "propListHead", null);
        setIntField(term251412, term251412.getClass(), "sourcePosition", 0);
        setField(term251412, term251412.getClass(), "jsType", null);
        setField(term251412, term251412.getClass(), "parent", null);
        setField(term251409, term251409.getClass(), "next", term251412);
        setField(term251409, term251409.getClass(), "first", null);
        setField(term251409, term251409.getClass(), "last", null);
        setField(term251409, term251409.getClass(), "propListHead", null);
        setIntField(term251409, term251409.getClass(), "sourcePosition", 0);
        setField(term251409, term251409.getClass(), "jsType", null);
        setField(term251409, term251409.getClass(), "parent", null);
        setField(term251406, term251406.getClass(), "first", term251409);
        setField(term251406, term251406.getClass(), "last", null);
        setField(term251406, term251406.getClass(), "propListHead", null);
        setIntField(term251406, term251406.getClass(), "sourcePosition", 0);
        setField(term251406, term251406.getClass(), "jsType", null);
        setField(term251406, term251406.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term251213;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term251121, args);
        assertTrue(recursiveEquals(term251121, term251442));
        assertTrue(recursiveEquals(term251213, term251443));
        assertTrue(recursiveEquals(retValue, term251406));
    }

};


