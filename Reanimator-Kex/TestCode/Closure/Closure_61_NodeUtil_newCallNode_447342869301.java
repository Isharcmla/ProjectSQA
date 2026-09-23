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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_newCallNode_447342869301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3451;
     Object term3472;

    public NodeUtil_newCallNode_447342869301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3451 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3458 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3461 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3465 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3468 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3451, term3451.getClass(), "type", 2092881418);
        setIntField(term3453, term3453.getClass(), "type", 1641342112);
        setIntField(term3455, term3455.getClass(), "type", 0);
        setField(term3455, term3455.getClass(), "next", null);
        setField(term3455, term3455.getClass(), "first", null);
        setField(term3455, term3455.getClass(), "last", null);
        setField(term3455, term3455.getClass(), "propListHead", null);
        setIntField(term3455, term3455.getClass(), "sourcePosition", 0);
        setField(term3455, term3455.getClass(), "jsType", null);
        setField(term3455, term3455.getClass(), "parent", null);
        setField(term3453, term3453.getClass(), "next", term3455);
        setIntField(term3458, term3458.getClass(), "type", 0);
        setField(term3458, term3458.getClass(), "next", null);
        setField(term3458, term3458.getClass(), "first", null);
        setField(term3458, term3458.getClass(), "last", null);
        setField(term3458, term3458.getClass(), "propListHead", null);
        setIntField(term3458, term3458.getClass(), "sourcePosition", 0);
        setField(term3458, term3458.getClass(), "jsType", null);
        setField(term3458, term3458.getClass(), "parent", null);
        setField(term3453, term3453.getClass(), "first", term3458);
        setIntField(term3461, term3461.getClass(), "type", 0);
        setField(term3461, term3461.getClass(), "next", null);
        setField(term3461, term3461.getClass(), "first", null);
        setField(term3461, term3461.getClass(), "last", null);
        setField(term3461, term3461.getClass(), "propListHead", null);
        setIntField(term3461, term3461.getClass(), "sourcePosition", 0);
        setField(term3461, term3461.getClass(), "jsType", null);
        setField(term3461, term3461.getClass(), "parent", null);
        setField(term3453, term3453.getClass(), "last", term3461);
        setField(term3453, term3453.getClass(), "propListHead", null);
        setIntField(term3453, term3453.getClass(), "sourcePosition", 0);
        setField(term3453, term3453.getClass(), "jsType", null);
        setField(term3453, term3453.getClass(), "parent", null);
        setField(term3451, term3451.getClass(), "next", term3453);
        setIntField(term3465, term3465.getClass(), "type", 0);
        setField(term3465, term3465.getClass(), "next", null);
        setField(term3465, term3465.getClass(), "first", null);
        setField(term3465, term3465.getClass(), "last", null);
        setField(term3465, term3465.getClass(), "propListHead", null);
        setIntField(term3465, term3465.getClass(), "sourcePosition", 0);
        setField(term3465, term3465.getClass(), "jsType", null);
        setField(term3465, term3465.getClass(), "parent", null);
        setField(term3451, term3451.getClass(), "first", term3465);
        setIntField(term3468, term3468.getClass(), "type", 0);
        setField(term3468, term3468.getClass(), "next", null);
        setField(term3468, term3468.getClass(), "first", null);
        setField(term3468, term3468.getClass(), "last", null);
        setField(term3468, term3468.getClass(), "propListHead", null);
        setIntField(term3468, term3468.getClass(), "sourcePosition", 0);
        setField(term3468, term3468.getClass(), "jsType", null);
        setField(term3468, term3468.getClass(), "parent", null);
        setField(term3451, term3451.getClass(), "last", term3468);
        setField(term3451, term3451.getClass(), "propListHead", null);
        setIntField(term3451, term3451.getClass(), "sourcePosition", 0);
        setField(term3451, term3451.getClass(), "jsType", null);
        setField(term3451, term3451.getClass(), "parent", null);
        term3472 = (Object[]) newArray("com.google.javascript.rhino.Node", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Array.newInstance(Class.forName("com.google.javascript.rhino.Node"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term3451;
        args[1] = term3472;
        try {
            callMethod(klass, "newCallNode", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


