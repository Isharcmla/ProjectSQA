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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110297;
     Object term110389;
     Object term111034;
     Object term111035;
     Object term110976;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110297 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term110389 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term110481 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term110573 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term110481, term110481.getClass(), "next", term110573);
        setField(term110389, term110389.getClass(), "first", term110481);
        setIntField(term110389, term110389.getClass(), "type", 21);
        term111034 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term111034, term111034.getClass(), "currentTraversal", null);
        term111035 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term111036 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term111037 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term111035, term111035.getClass(), "number", 0.0);
        setIntField(term111035, term111035.getClass(), "type", 21);
        setField(term111035, term111035.getClass(), "next", null);
        setDoubleField(term111036, term111036.getClass(), "number", 0.0);
        setIntField(term111036, term111036.getClass(), "type", 0);
        setDoubleField(term111037, term111037.getClass(), "number", 0.0);
        setIntField(term111037, term111037.getClass(), "type", 0);
        setField(term111037, term111037.getClass(), "next", null);
        setField(term111037, term111037.getClass(), "first", null);
        setField(term111037, term111037.getClass(), "last", null);
        setField(term111037, term111037.getClass(), "propListHead", null);
        setIntField(term111037, term111037.getClass(), "sourcePosition", 0);
        setField(term111037, term111037.getClass(), "jsType", null);
        setField(term111037, term111037.getClass(), "parent", null);
        setField(term111036, term111036.getClass(), "next", term111037);
        setField(term111036, term111036.getClass(), "first", null);
        setField(term111036, term111036.getClass(), "last", null);
        setField(term111036, term111036.getClass(), "propListHead", null);
        setIntField(term111036, term111036.getClass(), "sourcePosition", 0);
        setField(term111036, term111036.getClass(), "jsType", null);
        setField(term111036, term111036.getClass(), "parent", null);
        setField(term111035, term111035.getClass(), "first", term111036);
        setField(term111035, term111035.getClass(), "last", null);
        setField(term111035, term111035.getClass(), "propListHead", null);
        setIntField(term111035, term111035.getClass(), "sourcePosition", 0);
        setField(term111035, term111035.getClass(), "jsType", null);
        setField(term111035, term111035.getClass(), "parent", null);
        term110976 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term110979 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term110982 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term110976, term110976.getClass(), "number", 0.0);
        setIntField(term110976, term110976.getClass(), "type", 21);
        setField(term110976, term110976.getClass(), "next", null);
        setDoubleField(term110979, term110979.getClass(), "number", 0.0);
        setIntField(term110979, term110979.getClass(), "type", 0);
        setDoubleField(term110982, term110982.getClass(), "number", 0.0);
        setIntField(term110982, term110982.getClass(), "type", 0);
        setField(term110982, term110982.getClass(), "next", null);
        setField(term110982, term110982.getClass(), "first", null);
        setField(term110982, term110982.getClass(), "last", null);
        setField(term110982, term110982.getClass(), "propListHead", null);
        setIntField(term110982, term110982.getClass(), "sourcePosition", 0);
        setField(term110982, term110982.getClass(), "jsType", null);
        setField(term110982, term110982.getClass(), "parent", null);
        setField(term110979, term110979.getClass(), "next", term110982);
        setField(term110979, term110979.getClass(), "first", null);
        setField(term110979, term110979.getClass(), "last", null);
        setField(term110979, term110979.getClass(), "propListHead", null);
        setIntField(term110979, term110979.getClass(), "sourcePosition", 0);
        setField(term110979, term110979.getClass(), "jsType", null);
        setField(term110979, term110979.getClass(), "parent", null);
        setField(term110976, term110976.getClass(), "first", term110979);
        setField(term110976, term110976.getClass(), "last", null);
        setField(term110976, term110976.getClass(), "propListHead", null);
        setIntField(term110976, term110976.getClass(), "sourcePosition", 0);
        setField(term110976, term110976.getClass(), "jsType", null);
        setField(term110976, term110976.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term110389;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term110297, args);
        assertTrue(recursiveEquals(term110297, term111034));
        assertTrue(recursiveEquals(term110389, term111035));
        assertTrue(recursiveEquals(retValue, term110976));
    }

};


