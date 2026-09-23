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

public class FoldConstants_tryFoldBlock_1167048042201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51104;
     Object term51174;
     Object term51555;
     Object term51556;

    public FoldConstants_tryFoldBlock_1167048042201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51104 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term51174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51314 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term51244, term51244.getClass(), "next", term51174);
        setIntField(term51244, term51244.getClass(), "type", 107);
        setField(term51174, term51174.getClass(), "first", term51244);
        setField(term51174, term51174.getClass(), "next", term51314);
        setIntField(term51174, term51174.getClass(), "type", 99);
        term51555 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term51555, term51555.getClass(), "compiler", null);
        term51556 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51557 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51558 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term51556, term51556.getClass(), "type", 99);
        setIntField(term51557, term51557.getClass(), "type", 0);
        setField(term51557, term51557.getClass(), "next", null);
        setField(term51557, term51557.getClass(), "first", null);
        setField(term51557, term51557.getClass(), "last", null);
        setField(term51557, term51557.getClass(), "propListHead", null);
        setIntField(term51557, term51557.getClass(), "sourcePosition", 0);
        setField(term51557, term51557.getClass(), "jsType", null);
        setField(term51557, term51557.getClass(), "parent", null);
        setField(term51556, term51556.getClass(), "next", term51557);
        setIntField(term51558, term51558.getClass(), "type", 107);
        setField(term51558, term51558.getClass(), "next", term51556);
        setField(term51558, term51558.getClass(), "first", null);
        setField(term51558, term51558.getClass(), "last", null);
        setField(term51558, term51558.getClass(), "propListHead", null);
        setIntField(term51558, term51558.getClass(), "sourcePosition", 0);
        setField(term51558, term51558.getClass(), "jsType", null);
        setField(term51558, term51558.getClass(), "parent", null);
        setField(term51556, term51556.getClass(), "first", term51558);
        setField(term51556, term51556.getClass(), "last", null);
        setField(term51556, term51556.getClass(), "propListHead", null);
        setIntField(term51556, term51556.getClass(), "sourcePosition", 0);
        setField(term51556, term51556.getClass(), "jsType", null);
        setField(term51556, term51556.getClass(), "parent", null);
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
        args[1] = term51174;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term51104, args);
        assertTrue(recursiveEquals(term51104, term51555));
        assertTrue(recursiveEquals(term51174, null));
    }

};


