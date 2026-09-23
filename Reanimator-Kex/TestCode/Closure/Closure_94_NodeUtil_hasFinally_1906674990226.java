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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_hasFinally_1906674990226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3274;

    public NodeUtil_hasFinally_1906674990226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3274 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3276 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3278 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3281 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3284 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3287 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3291 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3294 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3297 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3274, term3274.getClass(), "type", 1094297953);
        setIntField(term3276, term3276.getClass(), "type", -777833461);
        setIntField(term3278, term3278.getClass(), "type", 0);
        setField(term3278, term3278.getClass(), "next", null);
        setField(term3278, term3278.getClass(), "first", null);
        setField(term3278, term3278.getClass(), "last", null);
        setField(term3278, term3278.getClass(), "propListHead", null);
        setIntField(term3278, term3278.getClass(), "sourcePosition", 0);
        setField(term3278, term3278.getClass(), "jsType", null);
        setField(term3278, term3278.getClass(), "parent", null);
        setField(term3276, term3276.getClass(), "next", term3278);
        setIntField(term3281, term3281.getClass(), "type", 0);
        setField(term3281, term3281.getClass(), "next", null);
        setField(term3281, term3281.getClass(), "first", null);
        setField(term3281, term3281.getClass(), "last", null);
        setField(term3281, term3281.getClass(), "propListHead", null);
        setIntField(term3281, term3281.getClass(), "sourcePosition", 0);
        setField(term3281, term3281.getClass(), "jsType", null);
        setField(term3281, term3281.getClass(), "parent", null);
        setField(term3276, term3276.getClass(), "first", term3281);
        setIntField(term3284, term3284.getClass(), "type", 0);
        setField(term3284, term3284.getClass(), "next", null);
        setField(term3284, term3284.getClass(), "first", null);
        setField(term3284, term3284.getClass(), "last", null);
        setField(term3284, term3284.getClass(), "propListHead", null);
        setIntField(term3284, term3284.getClass(), "sourcePosition", 0);
        setField(term3284, term3284.getClass(), "jsType", null);
        setField(term3284, term3284.getClass(), "parent", null);
        setField(term3276, term3276.getClass(), "last", term3284);
        setField(term3287, term3287.getClass(), "next", null);
        setIntField(term3287, term3287.getClass(), "type", 0);
        setIntField(term3287, term3287.getClass(), "intValue", 0);
        setField(term3287, term3287.getClass(), "objectValue", null);
        setField(term3276, term3276.getClass(), "propListHead", term3287);
        setIntField(term3276, term3276.getClass(), "sourcePosition", -1796760393);
        setField(term3276, term3276.getClass(), "jsType", null);
        setField(term3276, term3276.getClass(), "parent", null);
        setField(term3274, term3274.getClass(), "next", term3276);
        setIntField(term3291, term3291.getClass(), "type", 0);
        setField(term3291, term3291.getClass(), "next", null);
        setField(term3291, term3291.getClass(), "first", null);
        setField(term3291, term3291.getClass(), "last", null);
        setField(term3291, term3291.getClass(), "propListHead", null);
        setIntField(term3291, term3291.getClass(), "sourcePosition", 0);
        setField(term3291, term3291.getClass(), "jsType", null);
        setField(term3291, term3291.getClass(), "parent", null);
        setField(term3274, term3274.getClass(), "first", term3291);
        setIntField(term3294, term3294.getClass(), "type", 0);
        setField(term3294, term3294.getClass(), "next", null);
        setField(term3294, term3294.getClass(), "first", null);
        setField(term3294, term3294.getClass(), "last", null);
        setField(term3294, term3294.getClass(), "propListHead", null);
        setIntField(term3294, term3294.getClass(), "sourcePosition", 0);
        setField(term3294, term3294.getClass(), "jsType", null);
        setField(term3294, term3294.getClass(), "parent", null);
        setField(term3274, term3274.getClass(), "last", term3294);
        setField(term3297, term3297.getClass(), "next", null);
        setIntField(term3297, term3297.getClass(), "type", 0);
        setIntField(term3297, term3297.getClass(), "intValue", 0);
        setField(term3297, term3297.getClass(), "objectValue", null);
        setField(term3274, term3274.getClass(), "propListHead", term3297);
        setIntField(term3274, term3274.getClass(), "sourcePosition", -2099267271);
        setField(term3274, term3274.getClass(), "jsType", null);
        setField(term3274, term3274.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3274;
        try {
            callMethod(klass, "hasFinally", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


