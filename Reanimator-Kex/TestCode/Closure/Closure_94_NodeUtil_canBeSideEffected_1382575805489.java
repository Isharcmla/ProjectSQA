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

public class NodeUtil_canBeSideEffected_1382575805489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42036;
     Object term42151;

    public NodeUtil_canBeSideEffected_1382575805489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42036 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42128 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term42036, term42036.getClass(), "type", 0);
        setField(term42036, term42036.getClass(), "first", term42128);
        term42151 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42152 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term42151, term42151.getClass(), "type", 0);
        setField(term42151, term42151.getClass(), "next", null);
        setField(term42152, term42152.getClass(), "str", null);
        setIntField(term42152, term42152.getClass(), "type", 0);
        setField(term42152, term42152.getClass(), "next", null);
        setField(term42152, term42152.getClass(), "first", null);
        setField(term42152, term42152.getClass(), "last", null);
        setField(term42152, term42152.getClass(), "propListHead", null);
        setIntField(term42152, term42152.getClass(), "sourcePosition", 0);
        setField(term42152, term42152.getClass(), "jsType", null);
        setField(term42152, term42152.getClass(), "parent", null);
        setField(term42151, term42151.getClass(), "first", term42152);
        setField(term42151, term42151.getClass(), "last", null);
        setField(term42151, term42151.getClass(), "propListHead", null);
        setIntField(term42151, term42151.getClass(), "sourcePosition", 0);
        setField(term42151, term42151.getClass(), "jsType", null);
        setField(term42151, term42151.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term42036;
        callMethod(klass, "canBeSideEffected", argTypes, null, args);
        assertTrue(recursiveEquals(term42036, term42151));
    }

};


