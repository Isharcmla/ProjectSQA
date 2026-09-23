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

public class NodeUtil_containsCall_2124673690335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30040;
     Object term30297;

    public NodeUtil_containsCall_2124673690335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30040 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30110 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30180 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30040, term30040.getClass(), "type", 2);
        setIntField(term30110, term30110.getClass(), "type", 0);
        setField(term30110, term30110.getClass(), "first", null);
        setField(term30110, term30110.getClass(), "next", term30180);
        setField(term30040, term30040.getClass(), "first", term30110);
        term30297 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30298 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30297, term30297.getClass(), "type", 2);
        setField(term30297, term30297.getClass(), "next", null);
        setIntField(term30298, term30298.getClass(), "type", 0);
        setIntField(term30299, term30299.getClass(), "type", 0);
        setField(term30299, term30299.getClass(), "next", null);
        setField(term30299, term30299.getClass(), "first", null);
        setField(term30299, term30299.getClass(), "last", null);
        setField(term30299, term30299.getClass(), "propListHead", null);
        setIntField(term30299, term30299.getClass(), "sourcePosition", 0);
        setField(term30299, term30299.getClass(), "jsType", null);
        setField(term30299, term30299.getClass(), "parent", null);
        setField(term30298, term30298.getClass(), "next", term30299);
        setField(term30298, term30298.getClass(), "first", null);
        setField(term30298, term30298.getClass(), "last", null);
        setField(term30298, term30298.getClass(), "propListHead", null);
        setIntField(term30298, term30298.getClass(), "sourcePosition", 0);
        setField(term30298, term30298.getClass(), "jsType", null);
        setField(term30298, term30298.getClass(), "parent", null);
        setField(term30297, term30297.getClass(), "first", term30298);
        setField(term30297, term30297.getClass(), "last", null);
        setField(term30297, term30297.getClass(), "propListHead", null);
        setIntField(term30297, term30297.getClass(), "sourcePosition", 0);
        setField(term30297, term30297.getClass(), "jsType", null);
        setField(term30297, term30297.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term30040;
        callMethod(klass, "containsCall", argTypes, null, args);
        assertTrue(recursiveEquals(term30040, term30297));
    }

};


