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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511646 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142914;
     Object term143006;
     Object term143114;
     Object term143115;
     Object term143084;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511646() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142914 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term143006 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term143076 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term143006, term143006.getClass(), "first", term143006);
        setField(term143006, term143006.getClass(), "next", term143076);
        setIntField(term143006, term143006.getClass(), "type", 46);
        term143114 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term143114, term143114.getClass(), "currentTraversal", null);
        term143115 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term143116 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term143115, term143115.getClass(), "number", 0.0);
        setIntField(term143115, term143115.getClass(), "type", 46);
        setIntField(term143116, term143116.getClass(), "type", 0);
        setField(term143116, term143116.getClass(), "next", null);
        setField(term143116, term143116.getClass(), "first", null);
        setField(term143116, term143116.getClass(), "last", null);
        setField(term143116, term143116.getClass(), "propListHead", null);
        setIntField(term143116, term143116.getClass(), "sourcePosition", 0);
        setField(term143116, term143116.getClass(), "jsType", null);
        setField(term143116, term143116.getClass(), "parent", null);
        setField(term143115, term143115.getClass(), "next", term143116);
        setField(term143115, term143115.getClass(), "first", term143115);
        setField(term143115, term143115.getClass(), "last", null);
        setField(term143115, term143115.getClass(), "propListHead", null);
        setIntField(term143115, term143115.getClass(), "sourcePosition", 0);
        setField(term143115, term143115.getClass(), "jsType", null);
        setField(term143115, term143115.getClass(), "parent", null);
        term143084 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term143087 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term143084, term143084.getClass(), "number", 0.0);
        setIntField(term143084, term143084.getClass(), "type", 46);
        setIntField(term143087, term143087.getClass(), "type", 0);
        setField(term143087, term143087.getClass(), "next", null);
        setField(term143087, term143087.getClass(), "first", null);
        setField(term143087, term143087.getClass(), "last", null);
        setField(term143087, term143087.getClass(), "propListHead", null);
        setIntField(term143087, term143087.getClass(), "sourcePosition", 0);
        setField(term143087, term143087.getClass(), "jsType", null);
        setField(term143087, term143087.getClass(), "parent", null);
        setField(term143084, term143084.getClass(), "next", term143087);
        setField(term143084, term143084.getClass(), "first", term143084);
        setField(term143084, term143084.getClass(), "last", null);
        setField(term143084, term143084.getClass(), "propListHead", null);
        setIntField(term143084, term143084.getClass(), "sourcePosition", 0);
        setField(term143084, term143084.getClass(), "jsType", null);
        setField(term143084, term143084.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term143006;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term142914, args);
        assertTrue(recursiveEquals(term142914, term143114));
        assertTrue(recursiveEquals(term143006, term143115));
        assertTrue(recursiveEquals(retValue, term143084));
    }

};


