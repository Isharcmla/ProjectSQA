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

public class FoldConstants_tryFoldBlock_1167048042126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19511;
     Object term19581;
     Object term30358;
     Object term30359;

    public FoldConstants_tryFoldBlock_1167048042126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19511 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term19581 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19677 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setField(term19581, term19581.getClass(), "first", term19581);
        setField(term19581, term19581.getClass(), "next", null);
        setIntField(term19581, term19581.getClass(), "type", 0);
        setIntField(term19677, term19677.getClass(), "type", 37);
        setField(term19581, term19581.getClass(), "propListHead", term19677);
        term30358 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term30358, term30358.getClass(), "compiler", null);
        term30359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30360 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term30359, term30359.getClass(), "type", 0);
        setField(term30359, term30359.getClass(), "next", null);
        setField(term30359, term30359.getClass(), "first", term30359);
        setField(term30359, term30359.getClass(), "last", null);
        setField(term30360, term30360.getClass(), "next", null);
        setIntField(term30360, term30360.getClass(), "type", 37);
        setIntField(term30360, term30360.getClass(), "intValue", 0);
        setField(term30360, term30360.getClass(), "objectValue", null);
        setField(term30359, term30359.getClass(), "propListHead", term30360);
        setIntField(term30359, term30359.getClass(), "sourcePosition", 0);
        setField(term30359, term30359.getClass(), "jsType", null);
        setField(term30359, term30359.getClass(), "parent", null);
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
        args[1] = term19581;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term19511, args);
        assertTrue(recursiveEquals(term19511, term30358));
        assertTrue(recursiveEquals(term19581, null));
    }

};


