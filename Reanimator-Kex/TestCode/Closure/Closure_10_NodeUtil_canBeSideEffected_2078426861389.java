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

public class NodeUtil_canBeSideEffected_2078426861389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48326;
     Object term48467;

    public NodeUtil_canBeSideEffected_2078426861389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term48326, term48326.getClass(), "type", 4);
        setIntField(term48396, term48396.getClass(), "type", 33);
        setField(term48326, term48326.getClass(), "first", term48396);
        term48467 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48468 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term48467, term48467.getClass(), "type", 4);
        setField(term48467, term48467.getClass(), "next", null);
        setIntField(term48468, term48468.getClass(), "type", 33);
        setField(term48468, term48468.getClass(), "next", null);
        setField(term48468, term48468.getClass(), "first", null);
        setField(term48468, term48468.getClass(), "last", null);
        setField(term48468, term48468.getClass(), "propListHead", null);
        setIntField(term48468, term48468.getClass(), "sourcePosition", 0);
        setField(term48468, term48468.getClass(), "jsType", null);
        setField(term48468, term48468.getClass(), "parent", null);
        setField(term48467, term48467.getClass(), "first", term48468);
        setField(term48467, term48467.getClass(), "last", null);
        setField(term48467, term48467.getClass(), "propListHead", null);
        setIntField(term48467, term48467.getClass(), "sourcePosition", 0);
        setField(term48467, term48467.getClass(), "jsType", null);
        setField(term48467, term48467.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term48326;
        args[1] = null;
        Object retValue = callMethod(klass, "canBeSideEffected", argTypes, null, args);
        assertTrue(recursiveEquals(term48326, term48467));
        assertTrue(recursiveEquals(retValue, true));
    }

};


