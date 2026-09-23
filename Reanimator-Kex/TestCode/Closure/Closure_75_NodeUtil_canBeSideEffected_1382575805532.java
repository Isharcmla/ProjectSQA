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

public class NodeUtil_canBeSideEffected_1382575805532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41242;
     Object term80378;

    public NodeUtil_canBeSideEffected_1382575805532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41312 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41242, term41242.getClass(), "type", 0);
        setIntField(term41312, term41312.getClass(), "type", 30);
        setField(term41242, term41242.getClass(), "first", term41312);
        term80378 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term80378, term80378.getClass(), "type", 0);
        setField(term80378, term80378.getClass(), "next", null);
        setIntField(term80379, term80379.getClass(), "type", 30);
        setField(term80379, term80379.getClass(), "next", null);
        setField(term80379, term80379.getClass(), "first", null);
        setField(term80379, term80379.getClass(), "last", null);
        setField(term80379, term80379.getClass(), "propListHead", null);
        setIntField(term80379, term80379.getClass(), "sourcePosition", 0);
        setField(term80379, term80379.getClass(), "jsType", null);
        setField(term80379, term80379.getClass(), "parent", null);
        setField(term80378, term80378.getClass(), "first", term80379);
        setField(term80378, term80378.getClass(), "last", null);
        setField(term80378, term80378.getClass(), "propListHead", null);
        setIntField(term80378, term80378.getClass(), "sourcePosition", 0);
        setField(term80378, term80378.getClass(), "jsType", null);
        setField(term80378, term80378.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term41242;
        callMethod(klass, "canBeSideEffected", argTypes, null, args);
        assertTrue(recursiveEquals(term41242, term80378));
    }

};


