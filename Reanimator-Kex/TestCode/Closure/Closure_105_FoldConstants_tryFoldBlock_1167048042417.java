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

public class FoldConstants_tryFoldBlock_1167048042417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121205;
     Object term121275;
     Object term121691;
     Object term121692;

    public FoldConstants_tryFoldBlock_1167048042417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121205 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term121275 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term121345 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term121415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term121485 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term121555 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term121485, term121485.getClass(), "next", term121555);
        setIntField(term121485, term121485.getClass(), "type", 61);
        setField(term121415, term121415.getClass(), "next", term121485);
        setIntField(term121415, term121415.getClass(), "type", 78);
        setField(term121345, term121345.getClass(), "next", term121415);
        setIntField(term121345, term121345.getClass(), "type", 82);
        setField(term121275, term121275.getClass(), "first", term121345);
        term121691 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term121691, term121691.getClass(), "compiler", null);
        term121692 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term121693 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term121694 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term121695 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term121696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term121692, term121692.getClass(), "type", 0);
        setField(term121692, term121692.getClass(), "next", null);
        setIntField(term121693, term121693.getClass(), "type", 82);
        setIntField(term121694, term121694.getClass(), "type", 78);
        setIntField(term121695, term121695.getClass(), "type", 61);
        setIntField(term121696, term121696.getClass(), "type", 0);
        setField(term121696, term121696.getClass(), "next", null);
        setField(term121696, term121696.getClass(), "first", null);
        setField(term121696, term121696.getClass(), "last", null);
        setField(term121696, term121696.getClass(), "propListHead", null);
        setIntField(term121696, term121696.getClass(), "sourcePosition", 0);
        setField(term121696, term121696.getClass(), "jsType", null);
        setField(term121696, term121696.getClass(), "parent", null);
        setField(term121695, term121695.getClass(), "next", term121696);
        setField(term121695, term121695.getClass(), "first", null);
        setField(term121695, term121695.getClass(), "last", null);
        setField(term121695, term121695.getClass(), "propListHead", null);
        setIntField(term121695, term121695.getClass(), "sourcePosition", 0);
        setField(term121695, term121695.getClass(), "jsType", null);
        setField(term121695, term121695.getClass(), "parent", null);
        setField(term121694, term121694.getClass(), "next", term121695);
        setField(term121694, term121694.getClass(), "first", null);
        setField(term121694, term121694.getClass(), "last", null);
        setField(term121694, term121694.getClass(), "propListHead", null);
        setIntField(term121694, term121694.getClass(), "sourcePosition", 0);
        setField(term121694, term121694.getClass(), "jsType", null);
        setField(term121694, term121694.getClass(), "parent", null);
        setField(term121693, term121693.getClass(), "next", term121694);
        setField(term121693, term121693.getClass(), "first", null);
        setField(term121693, term121693.getClass(), "last", null);
        setField(term121693, term121693.getClass(), "propListHead", null);
        setIntField(term121693, term121693.getClass(), "sourcePosition", 0);
        setField(term121693, term121693.getClass(), "jsType", null);
        setField(term121693, term121693.getClass(), "parent", null);
        setField(term121692, term121692.getClass(), "first", term121693);
        setField(term121692, term121692.getClass(), "last", null);
        setField(term121692, term121692.getClass(), "propListHead", null);
        setIntField(term121692, term121692.getClass(), "sourcePosition", 0);
        setField(term121692, term121692.getClass(), "jsType", null);
        setField(term121692, term121692.getClass(), "parent", null);
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
        args[1] = term121275;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term121205, args);
        assertTrue(recursiveEquals(term121205, term121691));
        assertTrue(recursiveEquals(term121275, null));
    }

};


