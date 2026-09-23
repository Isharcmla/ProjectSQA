package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Node_toString_1476988999265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2327;

    public Node_toString_1476988999265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2333 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2335 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2338 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2327, term2327.getClass(), "type", 2077491675);
        setIntField(term2329, term2329.getClass(), "type", -1728316609);
        setIntField(term2331, term2331.getClass(), "type", 47118909);
        setIntField(term2333, term2333.getClass(), "type", -2093707412);
        setIntField(term2335, term2335.getClass(), "type", -680627153);
        setField(term2335, term2335.getClass(), "next", null);
        setField(term2335, term2335.getClass(), "first", null);
        setField(term2335, term2335.getClass(), "last", null);
        setField(term2335, term2335.getClass(), "propListHead", null);
        setIntField(term2335, term2335.getClass(), "sourcePosition", 0);
        setField(term2335, term2335.getClass(), "jsType", null);
        setField(term2335, term2335.getClass(), "parent", null);
        setField(term2333, term2333.getClass(), "next", term2335);
        setIntField(term2338, term2338.getClass(), "type", 722519669);
        setField(term2338, term2338.getClass(), "next", null);
        setField(term2338, term2338.getClass(), "first", null);
        setField(term2338, term2338.getClass(), "last", term2335);
        setField(term2338, term2338.getClass(), "propListHead", null);
        setIntField(term2338, term2338.getClass(), "sourcePosition", 0);
        setField(term2338, term2338.getClass(), "jsType", null);
        setField(term2338, term2338.getClass(), "parent", null);
        setField(term2333, term2333.getClass(), "first", term2338);
        setField(term2333, term2333.getClass(), "last", term2331);
        setField(term2333, term2333.getClass(), "propListHead", null);
        setIntField(term2333, term2333.getClass(), "sourcePosition", 0);
        setField(term2333, term2333.getClass(), "jsType", null);
        setField(term2333, term2333.getClass(), "parent", null);
        setField(term2331, term2331.getClass(), "next", term2333);
        setField(term2331, term2331.getClass(), "first", term2335);
        setIntField(term2342, term2342.getClass(), "type", 175343605);
        setIntField(term2344, term2344.getClass(), "type", 1050853183);
        setField(term2344, term2344.getClass(), "next", null);
        setField(term2344, term2344.getClass(), "first", term2338);
        setField(term2344, term2344.getClass(), "last", term2333);
        setField(term2344, term2344.getClass(), "propListHead", null);
        setIntField(term2344, term2344.getClass(), "sourcePosition", 0);
        setField(term2344, term2344.getClass(), "jsType", null);
        setField(term2344, term2344.getClass(), "parent", null);
        setField(term2342, term2342.getClass(), "next", term2344);
        setField(term2342, term2342.getClass(), "first", term2329);
        setField(term2342, term2342.getClass(), "last", term2329);
        setField(term2342, term2342.getClass(), "propListHead", null);
        setIntField(term2342, term2342.getClass(), "sourcePosition", 0);
        setField(term2342, term2342.getClass(), "jsType", null);
        setField(term2342, term2342.getClass(), "parent", null);
        setField(term2331, term2331.getClass(), "last", term2342);
        setField(term2331, term2331.getClass(), "propListHead", null);
        setIntField(term2331, term2331.getClass(), "sourcePosition", 0);
        setField(term2331, term2331.getClass(), "jsType", null);
        setField(term2331, term2331.getClass(), "parent", null);
        setField(term2329, term2329.getClass(), "next", term2331);
        setIntField(term2349, term2349.getClass(), "type", 848428785);
        setField(term2349, term2349.getClass(), "next", term2342);
        setField(term2349, term2349.getClass(), "first", term2344);
        setField(term2349, term2349.getClass(), "last", term2327);
        setField(term2349, term2349.getClass(), "propListHead", null);
        setIntField(term2349, term2349.getClass(), "sourcePosition", 0);
        setField(term2349, term2349.getClass(), "jsType", null);
        setField(term2349, term2349.getClass(), "parent", null);
        setField(term2329, term2329.getClass(), "first", term2349);
        setField(term2329, term2329.getClass(), "last", term2349);
        setField(term2329, term2329.getClass(), "propListHead", null);
        setIntField(term2329, term2329.getClass(), "sourcePosition", 0);
        setField(term2329, term2329.getClass(), "jsType", null);
        setField(term2329, term2329.getClass(), "parent", null);
        setField(term2327, term2327.getClass(), "next", term2329);
        setField(term2327, term2327.getClass(), "first", term2333);
        setField(term2327, term2327.getClass(), "last", term2335);
        setField(term2327, term2327.getClass(), "propListHead", null);
        setIntField(term2327, term2327.getClass(), "sourcePosition", 0);
        setField(term2327, term2327.getClass(), "jsType", null);
        setField(term2327, term2327.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toString", argTypes, term2327, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


