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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term361588;
     Object term361680;
     Object term361905;
     Object term361906;
     Object term361872;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term361588 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term361680 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term361772 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term361864 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term361772, term361772.getClass(), "next", term361864);
        setIntField(term361772, term361772.getClass(), "type", 39);
        setField(term361680, term361680.getClass(), "first", term361772);
        setIntField(term361680, term361680.getClass(), "type", 22);
        term361905 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term361905, term361905.getClass(), "currentTraversal", null);
        term361906 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term361907 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term361908 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term361906, term361906.getClass(), "number", 0.0);
        setIntField(term361906, term361906.getClass(), "type", 22);
        setField(term361906, term361906.getClass(), "next", null);
        setDoubleField(term361907, term361907.getClass(), "number", 0.0);
        setIntField(term361907, term361907.getClass(), "type", 39);
        setField(term361908, term361908.getClass(), "str", null);
        setIntField(term361908, term361908.getClass(), "type", 0);
        setField(term361908, term361908.getClass(), "next", null);
        setField(term361908, term361908.getClass(), "first", null);
        setField(term361908, term361908.getClass(), "last", null);
        setField(term361908, term361908.getClass(), "propListHead", null);
        setIntField(term361908, term361908.getClass(), "sourcePosition", 0);
        setField(term361908, term361908.getClass(), "jsType", null);
        setField(term361908, term361908.getClass(), "parent", null);
        setField(term361907, term361907.getClass(), "next", term361908);
        setField(term361907, term361907.getClass(), "first", null);
        setField(term361907, term361907.getClass(), "last", null);
        setField(term361907, term361907.getClass(), "propListHead", null);
        setIntField(term361907, term361907.getClass(), "sourcePosition", 0);
        setField(term361907, term361907.getClass(), "jsType", null);
        setField(term361907, term361907.getClass(), "parent", null);
        setField(term361906, term361906.getClass(), "first", term361907);
        setField(term361906, term361906.getClass(), "last", null);
        setField(term361906, term361906.getClass(), "propListHead", null);
        setIntField(term361906, term361906.getClass(), "sourcePosition", 0);
        setField(term361906, term361906.getClass(), "jsType", null);
        setField(term361906, term361906.getClass(), "parent", null);
        term361872 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term361875 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term361878 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term361872, term361872.getClass(), "number", 0.0);
        setIntField(term361872, term361872.getClass(), "type", 22);
        setField(term361872, term361872.getClass(), "next", null);
        setDoubleField(term361875, term361875.getClass(), "number", 0.0);
        setIntField(term361875, term361875.getClass(), "type", 39);
        setField(term361878, term361878.getClass(), "str", null);
        setIntField(term361878, term361878.getClass(), "type", 0);
        setField(term361878, term361878.getClass(), "next", null);
        setField(term361878, term361878.getClass(), "first", null);
        setField(term361878, term361878.getClass(), "last", null);
        setField(term361878, term361878.getClass(), "propListHead", null);
        setIntField(term361878, term361878.getClass(), "sourcePosition", 0);
        setField(term361878, term361878.getClass(), "jsType", null);
        setField(term361878, term361878.getClass(), "parent", null);
        setField(term361875, term361875.getClass(), "next", term361878);
        setField(term361875, term361875.getClass(), "first", null);
        setField(term361875, term361875.getClass(), "last", null);
        setField(term361875, term361875.getClass(), "propListHead", null);
        setIntField(term361875, term361875.getClass(), "sourcePosition", 0);
        setField(term361875, term361875.getClass(), "jsType", null);
        setField(term361875, term361875.getClass(), "parent", null);
        setField(term361872, term361872.getClass(), "first", term361875);
        setField(term361872, term361872.getClass(), "last", null);
        setField(term361872, term361872.getClass(), "propListHead", null);
        setIntField(term361872, term361872.getClass(), "sourcePosition", 0);
        setField(term361872, term361872.getClass(), "jsType", null);
        setField(term361872, term361872.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term361680;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term361588, args);
        assertTrue(recursiveEquals(term361588, term361905));
        assertTrue(recursiveEquals(term361680, term361906));
        assertTrue(recursiveEquals(retValue, term361872));
    }

};


