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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term869208;
     Object term869300;
     Object term869462;
     Object term869554;
     Object term870685;
     Object term870686;
     Object term870688;
     Object term870689;
     Object term870635;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term869208 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term869300 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term869370 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term869300, term869300.getClass(), "parent", term869370);
        setIntField(term869300, term869300.getClass(), "type", 0);
        term869462 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term869462, term869462.getClass(), "type", 0);
        term869554 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term869554, term869554.getClass(), "type", 63);
        term870685 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term870685, term870685.getClass(), "currentTraversal", null);
        term870686 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term870687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term870686, term870686.getClass(), "number", 0.0);
        setIntField(term870686, term870686.getClass(), "type", 0);
        setField(term870686, term870686.getClass(), "next", null);
        setField(term870686, term870686.getClass(), "first", null);
        setField(term870686, term870686.getClass(), "last", null);
        setField(term870686, term870686.getClass(), "propListHead", null);
        setIntField(term870686, term870686.getClass(), "sourcePosition", 0);
        setField(term870686, term870686.getClass(), "jsType", null);
        setIntField(term870687, term870687.getClass(), "type", 0);
        setField(term870687, term870687.getClass(), "next", null);
        setField(term870687, term870687.getClass(), "first", null);
        setField(term870687, term870687.getClass(), "last", null);
        setField(term870687, term870687.getClass(), "propListHead", null);
        setIntField(term870687, term870687.getClass(), "sourcePosition", 0);
        setField(term870687, term870687.getClass(), "jsType", null);
        setField(term870687, term870687.getClass(), "parent", null);
        setField(term870686, term870686.getClass(), "parent", term870687);
        term870688 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term870688, term870688.getClass(), "number", 0.0);
        setIntField(term870688, term870688.getClass(), "type", 0);
        setField(term870688, term870688.getClass(), "next", null);
        setField(term870688, term870688.getClass(), "first", null);
        setField(term870688, term870688.getClass(), "last", null);
        setField(term870688, term870688.getClass(), "propListHead", null);
        setIntField(term870688, term870688.getClass(), "sourcePosition", 0);
        setField(term870688, term870688.getClass(), "jsType", null);
        setField(term870688, term870688.getClass(), "parent", null);
        term870689 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term870689, term870689.getClass(), "number", 0.0);
        setIntField(term870689, term870689.getClass(), "type", 63);
        setField(term870689, term870689.getClass(), "next", null);
        setField(term870689, term870689.getClass(), "first", null);
        setField(term870689, term870689.getClass(), "last", null);
        setField(term870689, term870689.getClass(), "propListHead", null);
        setIntField(term870689, term870689.getClass(), "sourcePosition", 0);
        setField(term870689, term870689.getClass(), "jsType", null);
        setField(term870689, term870689.getClass(), "parent", null);
        term870635 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term870639 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term870635, term870635.getClass(), "number", 0.0);
        setIntField(term870635, term870635.getClass(), "type", 0);
        setField(term870635, term870635.getClass(), "next", null);
        setField(term870635, term870635.getClass(), "first", null);
        setField(term870635, term870635.getClass(), "last", null);
        setField(term870635, term870635.getClass(), "propListHead", null);
        setIntField(term870635, term870635.getClass(), "sourcePosition", 0);
        setField(term870635, term870635.getClass(), "jsType", null);
        setIntField(term870639, term870639.getClass(), "type", 0);
        setField(term870639, term870639.getClass(), "next", null);
        setField(term870639, term870639.getClass(), "first", null);
        setField(term870639, term870639.getClass(), "last", null);
        setField(term870639, term870639.getClass(), "propListHead", null);
        setIntField(term870639, term870639.getClass(), "sourcePosition", 0);
        setField(term870639, term870639.getClass(), "jsType", null);
        setField(term870639, term870639.getClass(), "parent", null);
        setField(term870635, term870635.getClass(), "parent", term870639);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term869300;
        args[1] = term869462;
        args[2] = term869554;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term869208, args);
        assertTrue(recursiveEquals(term869208, term870685));
        assertTrue(recursiveEquals(term869300, term870686));
        assertTrue(recursiveEquals(term869462, term870688));
        assertTrue(recursiveEquals(term869554, term870689));
        assertTrue(recursiveEquals(retValue, term870635));
    }

};


