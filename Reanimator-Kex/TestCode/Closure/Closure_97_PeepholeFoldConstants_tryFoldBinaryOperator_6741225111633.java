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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term654575;
     Object term654667;
     Object term655425;
     Object term655426;
     Object term655383;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term654575 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term654667 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term654759 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term654851 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term654759, term654759.getClass(), "next", term654851);
        setIntField(term654759, term654759.getClass(), "type", 16);
        setField(term654667, term654667.getClass(), "first", term654759);
        setIntField(term654667, term654667.getClass(), "type", 16);
        term655425 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term655425, term655425.getClass(), "currentTraversal", null);
        term655426 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term655427 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term655428 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term655426, term655426.getClass(), "str", null);
        setIntField(term655426, term655426.getClass(), "type", 16);
        setField(term655426, term655426.getClass(), "next", null);
        setField(term655427, term655427.getClass(), "str", null);
        setIntField(term655427, term655427.getClass(), "type", 16);
        setField(term655428, term655428.getClass(), "str", null);
        setIntField(term655428, term655428.getClass(), "type", 0);
        setField(term655428, term655428.getClass(), "next", null);
        setField(term655428, term655428.getClass(), "first", null);
        setField(term655428, term655428.getClass(), "last", null);
        setField(term655428, term655428.getClass(), "propListHead", null);
        setIntField(term655428, term655428.getClass(), "sourcePosition", 0);
        setField(term655428, term655428.getClass(), "jsType", null);
        setField(term655428, term655428.getClass(), "parent", null);
        setField(term655427, term655427.getClass(), "next", term655428);
        setField(term655427, term655427.getClass(), "first", null);
        setField(term655427, term655427.getClass(), "last", null);
        setField(term655427, term655427.getClass(), "propListHead", null);
        setIntField(term655427, term655427.getClass(), "sourcePosition", 0);
        setField(term655427, term655427.getClass(), "jsType", null);
        setField(term655427, term655427.getClass(), "parent", null);
        setField(term655426, term655426.getClass(), "first", term655427);
        setField(term655426, term655426.getClass(), "last", null);
        setField(term655426, term655426.getClass(), "propListHead", null);
        setIntField(term655426, term655426.getClass(), "sourcePosition", 0);
        setField(term655426, term655426.getClass(), "jsType", null);
        setField(term655426, term655426.getClass(), "parent", null);
        term655383 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term655385 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term655387 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term655383, term655383.getClass(), "str", null);
        setIntField(term655383, term655383.getClass(), "type", 16);
        setField(term655383, term655383.getClass(), "next", null);
        setField(term655385, term655385.getClass(), "str", null);
        setIntField(term655385, term655385.getClass(), "type", 16);
        setField(term655387, term655387.getClass(), "str", null);
        setIntField(term655387, term655387.getClass(), "type", 0);
        setField(term655387, term655387.getClass(), "next", null);
        setField(term655387, term655387.getClass(), "first", null);
        setField(term655387, term655387.getClass(), "last", null);
        setField(term655387, term655387.getClass(), "propListHead", null);
        setIntField(term655387, term655387.getClass(), "sourcePosition", 0);
        setField(term655387, term655387.getClass(), "jsType", null);
        setField(term655387, term655387.getClass(), "parent", null);
        setField(term655385, term655385.getClass(), "next", term655387);
        setField(term655385, term655385.getClass(), "first", null);
        setField(term655385, term655385.getClass(), "last", null);
        setField(term655385, term655385.getClass(), "propListHead", null);
        setIntField(term655385, term655385.getClass(), "sourcePosition", 0);
        setField(term655385, term655385.getClass(), "jsType", null);
        setField(term655385, term655385.getClass(), "parent", null);
        setField(term655383, term655383.getClass(), "first", term655385);
        setField(term655383, term655383.getClass(), "last", null);
        setField(term655383, term655383.getClass(), "propListHead", null);
        setIntField(term655383, term655383.getClass(), "sourcePosition", 0);
        setField(term655383, term655383.getClass(), "jsType", null);
        setField(term655383, term655383.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term654667;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term654575, args);
        assertTrue(recursiveEquals(term654575, term655425));
        assertTrue(recursiveEquals(term654667, term655426));
        assertTrue(recursiveEquals(retValue, term655383));
    }

};


