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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term484220;
     Object term484312;
     Object term484549;
     Object term484550;
     Object term484511;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term484220 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term484312 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term484404 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term484496 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term484404, term484404.getClass(), "next", term484496);
        setField(term484312, term484312.getClass(), "first", term484404);
        setIntField(term484312, term484312.getClass(), "type", 33);
        term484549 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term484549, term484549.getClass(), "currentTraversal", null);
        term484550 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term484551 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term484552 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term484550, term484550.getClass(), "number", 0.0);
        setIntField(term484550, term484550.getClass(), "type", 33);
        setField(term484550, term484550.getClass(), "next", null);
        setDoubleField(term484551, term484551.getClass(), "number", 0.0);
        setIntField(term484551, term484551.getClass(), "type", 0);
        setDoubleField(term484552, term484552.getClass(), "number", 0.0);
        setIntField(term484552, term484552.getClass(), "type", 0);
        setField(term484552, term484552.getClass(), "next", null);
        setField(term484552, term484552.getClass(), "first", null);
        setField(term484552, term484552.getClass(), "last", null);
        setField(term484552, term484552.getClass(), "propListHead", null);
        setIntField(term484552, term484552.getClass(), "sourcePosition", 0);
        setField(term484552, term484552.getClass(), "jsType", null);
        setField(term484552, term484552.getClass(), "parent", null);
        setField(term484551, term484551.getClass(), "next", term484552);
        setField(term484551, term484551.getClass(), "first", null);
        setField(term484551, term484551.getClass(), "last", null);
        setField(term484551, term484551.getClass(), "propListHead", null);
        setIntField(term484551, term484551.getClass(), "sourcePosition", 0);
        setField(term484551, term484551.getClass(), "jsType", null);
        setField(term484551, term484551.getClass(), "parent", null);
        setField(term484550, term484550.getClass(), "first", term484551);
        setField(term484550, term484550.getClass(), "last", null);
        setField(term484550, term484550.getClass(), "propListHead", null);
        setIntField(term484550, term484550.getClass(), "sourcePosition", 0);
        setField(term484550, term484550.getClass(), "jsType", null);
        setField(term484550, term484550.getClass(), "parent", null);
        term484511 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term484514 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term484517 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term484511, term484511.getClass(), "number", 0.0);
        setIntField(term484511, term484511.getClass(), "type", 33);
        setField(term484511, term484511.getClass(), "next", null);
        setDoubleField(term484514, term484514.getClass(), "number", 0.0);
        setIntField(term484514, term484514.getClass(), "type", 0);
        setDoubleField(term484517, term484517.getClass(), "number", 0.0);
        setIntField(term484517, term484517.getClass(), "type", 0);
        setField(term484517, term484517.getClass(), "next", null);
        setField(term484517, term484517.getClass(), "first", null);
        setField(term484517, term484517.getClass(), "last", null);
        setField(term484517, term484517.getClass(), "propListHead", null);
        setIntField(term484517, term484517.getClass(), "sourcePosition", 0);
        setField(term484517, term484517.getClass(), "jsType", null);
        setField(term484517, term484517.getClass(), "parent", null);
        setField(term484514, term484514.getClass(), "next", term484517);
        setField(term484514, term484514.getClass(), "first", null);
        setField(term484514, term484514.getClass(), "last", null);
        setField(term484514, term484514.getClass(), "propListHead", null);
        setIntField(term484514, term484514.getClass(), "sourcePosition", 0);
        setField(term484514, term484514.getClass(), "jsType", null);
        setField(term484514, term484514.getClass(), "parent", null);
        setField(term484511, term484511.getClass(), "first", term484514);
        setField(term484511, term484511.getClass(), "last", null);
        setField(term484511, term484511.getClass(), "propListHead", null);
        setIntField(term484511, term484511.getClass(), "sourcePosition", 0);
        setField(term484511, term484511.getClass(), "jsType", null);
        setField(term484511, term484511.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term484312;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term484220, args);
        assertTrue(recursiveEquals(term484220, term484549));
        assertTrue(recursiveEquals(term484312, term484550));
        assertTrue(recursiveEquals(retValue, term484511));
    }

};


