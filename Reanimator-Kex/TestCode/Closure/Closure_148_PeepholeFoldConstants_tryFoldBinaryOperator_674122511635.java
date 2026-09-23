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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139614;
     Object term139706;
     Object term140451;
     Object term140452;
     Object term140416;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139614 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term139706 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term139798 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term139890 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term139798, term139798.getClass(), "next", term139890);
        setIntField(term139798, term139798.getClass(), "type", 39);
        setField(term139706, term139706.getClass(), "first", term139798);
        setIntField(term139706, term139706.getClass(), "type", 9);
        term140451 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term140451, term140451.getClass(), "currentTraversal", null);
        term140452 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term140453 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term140454 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term140452, term140452.getClass(), "str", null);
        setIntField(term140452, term140452.getClass(), "type", 9);
        setField(term140452, term140452.getClass(), "next", null);
        setField(term140453, term140453.getClass(), "str", null);
        setIntField(term140453, term140453.getClass(), "type", 39);
        setField(term140454, term140454.getClass(), "str", null);
        setIntField(term140454, term140454.getClass(), "type", 0);
        setField(term140454, term140454.getClass(), "next", null);
        setField(term140454, term140454.getClass(), "first", null);
        setField(term140454, term140454.getClass(), "last", null);
        setField(term140454, term140454.getClass(), "propListHead", null);
        setIntField(term140454, term140454.getClass(), "sourcePosition", 0);
        setField(term140454, term140454.getClass(), "jsType", null);
        setField(term140454, term140454.getClass(), "parent", null);
        setField(term140453, term140453.getClass(), "next", term140454);
        setField(term140453, term140453.getClass(), "first", null);
        setField(term140453, term140453.getClass(), "last", null);
        setField(term140453, term140453.getClass(), "propListHead", null);
        setIntField(term140453, term140453.getClass(), "sourcePosition", 0);
        setField(term140453, term140453.getClass(), "jsType", null);
        setField(term140453, term140453.getClass(), "parent", null);
        setField(term140452, term140452.getClass(), "first", term140453);
        setField(term140452, term140452.getClass(), "last", null);
        setField(term140452, term140452.getClass(), "propListHead", null);
        setIntField(term140452, term140452.getClass(), "sourcePosition", 0);
        setField(term140452, term140452.getClass(), "jsType", null);
        setField(term140452, term140452.getClass(), "parent", null);
        term140416 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term140418 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term140420 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term140416, term140416.getClass(), "str", null);
        setIntField(term140416, term140416.getClass(), "type", 9);
        setField(term140416, term140416.getClass(), "next", null);
        setField(term140418, term140418.getClass(), "str", null);
        setIntField(term140418, term140418.getClass(), "type", 39);
        setField(term140420, term140420.getClass(), "str", null);
        setIntField(term140420, term140420.getClass(), "type", 0);
        setField(term140420, term140420.getClass(), "next", null);
        setField(term140420, term140420.getClass(), "first", null);
        setField(term140420, term140420.getClass(), "last", null);
        setField(term140420, term140420.getClass(), "propListHead", null);
        setIntField(term140420, term140420.getClass(), "sourcePosition", 0);
        setField(term140420, term140420.getClass(), "jsType", null);
        setField(term140420, term140420.getClass(), "parent", null);
        setField(term140418, term140418.getClass(), "next", term140420);
        setField(term140418, term140418.getClass(), "first", null);
        setField(term140418, term140418.getClass(), "last", null);
        setField(term140418, term140418.getClass(), "propListHead", null);
        setIntField(term140418, term140418.getClass(), "sourcePosition", 0);
        setField(term140418, term140418.getClass(), "jsType", null);
        setField(term140418, term140418.getClass(), "parent", null);
        setField(term140416, term140416.getClass(), "first", term140418);
        setField(term140416, term140416.getClass(), "last", null);
        setField(term140416, term140416.getClass(), "propListHead", null);
        setIntField(term140416, term140416.getClass(), "sourcePosition", 0);
        setField(term140416, term140416.getClass(), "jsType", null);
        setField(term140416, term140416.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term139706;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term139614, args);
        assertTrue(recursiveEquals(term139614, term140451));
        assertTrue(recursiveEquals(term139706, term140452));
        assertTrue(recursiveEquals(retValue, term140416));
    }

};


