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

public class FoldConstants_tryFoldBlock_1167048042319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87103;
     Object term87173;
     Object term87413;
     Object term87414;

    public FoldConstants_tryFoldBlock_1167048042319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87103 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term87173 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87243 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87313 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term87243, term87243.getClass(), "next", term87173);
        setIntField(term87243, term87243.getClass(), "type", 129);
        setField(term87173, term87173.getClass(), "first", term87243);
        setField(term87173, term87173.getClass(), "next", term87313);
        setIntField(term87173, term87173.getClass(), "type", 84);
        term87413 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term87413, term87413.getClass(), "compiler", null);
        term87414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87416 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term87414, term87414.getClass(), "type", 84);
        setIntField(term87415, term87415.getClass(), "type", 0);
        setField(term87415, term87415.getClass(), "next", null);
        setField(term87415, term87415.getClass(), "first", null);
        setField(term87415, term87415.getClass(), "last", null);
        setField(term87415, term87415.getClass(), "propListHead", null);
        setIntField(term87415, term87415.getClass(), "sourcePosition", 0);
        setField(term87415, term87415.getClass(), "jsType", null);
        setField(term87415, term87415.getClass(), "parent", null);
        setField(term87414, term87414.getClass(), "next", term87415);
        setIntField(term87416, term87416.getClass(), "type", 129);
        setField(term87416, term87416.getClass(), "next", term87414);
        setField(term87416, term87416.getClass(), "first", null);
        setField(term87416, term87416.getClass(), "last", null);
        setField(term87416, term87416.getClass(), "propListHead", null);
        setIntField(term87416, term87416.getClass(), "sourcePosition", 0);
        setField(term87416, term87416.getClass(), "jsType", null);
        setField(term87416, term87416.getClass(), "parent", null);
        setField(term87414, term87414.getClass(), "first", term87416);
        setField(term87414, term87414.getClass(), "last", null);
        setField(term87414, term87414.getClass(), "propListHead", null);
        setIntField(term87414, term87414.getClass(), "sourcePosition", 0);
        setField(term87414, term87414.getClass(), "jsType", null);
        setField(term87414, term87414.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term87173;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term87103, args);
        assertTrue(recursiveEquals(term87103, term87413));
        assertTrue(recursiveEquals(term87173, null));
    }

};


