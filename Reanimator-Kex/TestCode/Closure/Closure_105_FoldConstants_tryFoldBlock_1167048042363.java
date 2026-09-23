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

public class FoldConstants_tryFoldBlock_1167048042363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101930;
     Object term102000;
     Object term102528;
     Object term102529;

    public FoldConstants_tryFoldBlock_1167048042363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101930 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term102000 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102070 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102140 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102280 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102350 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term102280, term102280.getClass(), "next", term102350);
        setIntField(term102280, term102280.getClass(), "type", 120);
        setField(term102210, term102210.getClass(), "next", term102280);
        setIntField(term102210, term102210.getClass(), "type", 70);
        setField(term102140, term102140.getClass(), "next", term102210);
        setIntField(term102140, term102140.getClass(), "type", 128);
        setField(term102070, term102070.getClass(), "next", term102140);
        setIntField(term102070, term102070.getClass(), "type", 103);
        setField(term102000, term102000.getClass(), "first", term102070);
        term102528 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term102528, term102528.getClass(), "compiler", null);
        term102529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102530 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102531 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102532 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102533 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term102529, term102529.getClass(), "type", 0);
        setField(term102529, term102529.getClass(), "next", null);
        setIntField(term102530, term102530.getClass(), "type", 103);
        setIntField(term102531, term102531.getClass(), "type", 128);
        setIntField(term102532, term102532.getClass(), "type", 70);
        setIntField(term102533, term102533.getClass(), "type", 120);
        setField(term102533, term102533.getClass(), "next", null);
        setField(term102533, term102533.getClass(), "first", null);
        setField(term102533, term102533.getClass(), "last", null);
        setField(term102533, term102533.getClass(), "propListHead", null);
        setIntField(term102533, term102533.getClass(), "sourcePosition", 0);
        setField(term102533, term102533.getClass(), "jsType", null);
        setField(term102533, term102533.getClass(), "parent", null);
        setField(term102532, term102532.getClass(), "next", term102533);
        setField(term102532, term102532.getClass(), "first", null);
        setField(term102532, term102532.getClass(), "last", null);
        setField(term102532, term102532.getClass(), "propListHead", null);
        setIntField(term102532, term102532.getClass(), "sourcePosition", 0);
        setField(term102532, term102532.getClass(), "jsType", null);
        setField(term102532, term102532.getClass(), "parent", null);
        setField(term102531, term102531.getClass(), "next", term102532);
        setField(term102531, term102531.getClass(), "first", null);
        setField(term102531, term102531.getClass(), "last", null);
        setField(term102531, term102531.getClass(), "propListHead", null);
        setIntField(term102531, term102531.getClass(), "sourcePosition", 0);
        setField(term102531, term102531.getClass(), "jsType", null);
        setField(term102531, term102531.getClass(), "parent", null);
        setField(term102530, term102530.getClass(), "next", term102531);
        setField(term102530, term102530.getClass(), "first", null);
        setField(term102530, term102530.getClass(), "last", null);
        setField(term102530, term102530.getClass(), "propListHead", null);
        setIntField(term102530, term102530.getClass(), "sourcePosition", 0);
        setField(term102530, term102530.getClass(), "jsType", null);
        setField(term102530, term102530.getClass(), "parent", null);
        setField(term102529, term102529.getClass(), "first", term102530);
        setField(term102529, term102529.getClass(), "last", null);
        setField(term102529, term102529.getClass(), "propListHead", null);
        setIntField(term102529, term102529.getClass(), "sourcePosition", 0);
        setField(term102529, term102529.getClass(), "jsType", null);
        setField(term102529, term102529.getClass(), "parent", null);
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
        args[1] = term102000;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term101930, args);
        assertTrue(recursiveEquals(term101930, term102528));
        assertTrue(recursiveEquals(term102000, null));
    }

};


