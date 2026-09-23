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

public class NodeUtil_containsCall_2124673690359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28938;
     Object term29198;

    public NodeUtil_containsCall_2124673690359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29078 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28938, term28938.getClass(), "type", 2);
        setIntField(term29008, term29008.getClass(), "type", 0);
        setField(term29008, term29008.getClass(), "first", term29078);
        setField(term28938, term28938.getClass(), "first", term29008);
        term29198 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29200 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29198, term29198.getClass(), "type", 2);
        setField(term29198, term29198.getClass(), "next", null);
        setIntField(term29199, term29199.getClass(), "type", 0);
        setField(term29199, term29199.getClass(), "next", null);
        setIntField(term29200, term29200.getClass(), "type", 0);
        setField(term29200, term29200.getClass(), "next", null);
        setField(term29200, term29200.getClass(), "first", null);
        setField(term29200, term29200.getClass(), "last", null);
        setField(term29200, term29200.getClass(), "propListHead", null);
        setIntField(term29200, term29200.getClass(), "sourcePosition", 0);
        setField(term29200, term29200.getClass(), "jsType", null);
        setField(term29200, term29200.getClass(), "parent", null);
        setField(term29199, term29199.getClass(), "first", term29200);
        setField(term29199, term29199.getClass(), "last", null);
        setField(term29199, term29199.getClass(), "propListHead", null);
        setIntField(term29199, term29199.getClass(), "sourcePosition", 0);
        setField(term29199, term29199.getClass(), "jsType", null);
        setField(term29199, term29199.getClass(), "parent", null);
        setField(term29198, term29198.getClass(), "first", term29199);
        setField(term29198, term29198.getClass(), "last", null);
        setField(term29198, term29198.getClass(), "propListHead", null);
        setIntField(term29198, term29198.getClass(), "sourcePosition", 0);
        setField(term29198, term29198.getClass(), "jsType", null);
        setField(term29198, term29198.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term28938;
        callMethod(klass, "containsCall", argTypes, null, args);
        assertTrue(recursiveEquals(term28938, term29198));
    }

};


