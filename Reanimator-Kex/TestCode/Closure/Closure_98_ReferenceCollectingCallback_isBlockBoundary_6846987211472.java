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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term474966;
     Object term475058;
     Object term475598;
     Object term475600;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term474966 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term475058 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term475150 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term475058, term475058.getClass(), "type", 100);
        setField(term475058, term475058.getClass(), "first", term475150);
        term475598 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term475599 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term475598, term475598.getClass(), "str", null);
        setIntField(term475598, term475598.getClass(), "type", 100);
        setField(term475598, term475598.getClass(), "next", null);
        setField(term475599, term475599.getClass(), "str", null);
        setIntField(term475599, term475599.getClass(), "type", 0);
        setField(term475599, term475599.getClass(), "next", null);
        setField(term475599, term475599.getClass(), "first", null);
        setField(term475599, term475599.getClass(), "last", null);
        setField(term475599, term475599.getClass(), "propListHead", null);
        setIntField(term475599, term475599.getClass(), "sourcePosition", 0);
        setField(term475599, term475599.getClass(), "jsType", null);
        setField(term475599, term475599.getClass(), "parent", null);
        setField(term475598, term475598.getClass(), "first", term475599);
        setField(term475598, term475598.getClass(), "last", null);
        setField(term475598, term475598.getClass(), "propListHead", null);
        setIntField(term475598, term475598.getClass(), "sourcePosition", 0);
        setField(term475598, term475598.getClass(), "jsType", null);
        setField(term475598, term475598.getClass(), "parent", null);
        term475600 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term475600, term475600.getClass(), "str", null);
        setIntField(term475600, term475600.getClass(), "type", 0);
        setField(term475600, term475600.getClass(), "next", null);
        setField(term475600, term475600.getClass(), "first", null);
        setField(term475600, term475600.getClass(), "last", null);
        setField(term475600, term475600.getClass(), "propListHead", null);
        setIntField(term475600, term475600.getClass(), "sourcePosition", 0);
        setField(term475600, term475600.getClass(), "jsType", null);
        setField(term475600, term475600.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term474966;
        args[1] = term475058;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term474966, term475598));
        assertTrue(recursiveEquals(term475058, term475600));
        assertTrue(recursiveEquals(retValue, true));
    }

};


