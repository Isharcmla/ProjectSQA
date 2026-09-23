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

public class FoldConstants_tryFoldBlock_1167048042400 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114267;
     Object term114337;
     Object term115328;
     Object term115329;

    public FoldConstants_tryFoldBlock_1167048042400() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114267 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term114337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term114407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term114477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term114547 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term114617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term114547, term114547.getClass(), "next", term114617);
        setIntField(term114547, term114547.getClass(), "type", 128);
        setField(term114477, term114477.getClass(), "next", term114547);
        setIntField(term114477, term114477.getClass(), "type", 128);
        setField(term114407, term114407.getClass(), "next", term114477);
        setIntField(term114407, term114407.getClass(), "type", 103);
        setField(term114337, term114337.getClass(), "first", term114407);
        term115328 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term115328, term115328.getClass(), "compiler", null);
        term115329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115330 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115332 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115333 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term115329, term115329.getClass(), "type", 0);
        setField(term115329, term115329.getClass(), "next", null);
        setIntField(term115330, term115330.getClass(), "type", 103);
        setIntField(term115331, term115331.getClass(), "type", 128);
        setIntField(term115332, term115332.getClass(), "type", 128);
        setIntField(term115333, term115333.getClass(), "type", 0);
        setField(term115333, term115333.getClass(), "next", null);
        setField(term115333, term115333.getClass(), "first", null);
        setField(term115333, term115333.getClass(), "last", null);
        setField(term115333, term115333.getClass(), "propListHead", null);
        setIntField(term115333, term115333.getClass(), "sourcePosition", 0);
        setField(term115333, term115333.getClass(), "jsType", null);
        setField(term115333, term115333.getClass(), "parent", null);
        setField(term115332, term115332.getClass(), "next", term115333);
        setField(term115332, term115332.getClass(), "first", null);
        setField(term115332, term115332.getClass(), "last", null);
        setField(term115332, term115332.getClass(), "propListHead", null);
        setIntField(term115332, term115332.getClass(), "sourcePosition", 0);
        setField(term115332, term115332.getClass(), "jsType", null);
        setField(term115332, term115332.getClass(), "parent", null);
        setField(term115331, term115331.getClass(), "next", term115332);
        setField(term115331, term115331.getClass(), "first", null);
        setField(term115331, term115331.getClass(), "last", null);
        setField(term115331, term115331.getClass(), "propListHead", null);
        setIntField(term115331, term115331.getClass(), "sourcePosition", 0);
        setField(term115331, term115331.getClass(), "jsType", null);
        setField(term115331, term115331.getClass(), "parent", null);
        setField(term115330, term115330.getClass(), "next", term115331);
        setField(term115330, term115330.getClass(), "first", null);
        setField(term115330, term115330.getClass(), "last", null);
        setField(term115330, term115330.getClass(), "propListHead", null);
        setIntField(term115330, term115330.getClass(), "sourcePosition", 0);
        setField(term115330, term115330.getClass(), "jsType", null);
        setField(term115330, term115330.getClass(), "parent", null);
        setField(term115329, term115329.getClass(), "first", term115330);
        setField(term115329, term115329.getClass(), "last", null);
        setField(term115329, term115329.getClass(), "propListHead", null);
        setIntField(term115329, term115329.getClass(), "sourcePosition", 0);
        setField(term115329, term115329.getClass(), "jsType", null);
        setField(term115329, term115329.getClass(), "parent", null);
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
        args[1] = term114337;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term114267, args);
        assertTrue(recursiveEquals(term114267, term115328));
        assertTrue(recursiveEquals(term114337, null));
    }

};


