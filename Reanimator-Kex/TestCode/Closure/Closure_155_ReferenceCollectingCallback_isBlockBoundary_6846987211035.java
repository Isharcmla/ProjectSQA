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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263864;
     Object term263934;
     Object term264303;
     Object term264305;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term263864 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term263934 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term264004 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term263934, term263934.getClass(), "type", 100);
        setField(term263934, term263934.getClass(), "first", term264004);
        term264303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term264304 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term264303, term264303.getClass(), "type", 100);
        setField(term264303, term264303.getClass(), "next", null);
        setIntField(term264304, term264304.getClass(), "type", 0);
        setField(term264304, term264304.getClass(), "next", null);
        setField(term264304, term264304.getClass(), "first", null);
        setField(term264304, term264304.getClass(), "last", null);
        setField(term264304, term264304.getClass(), "propListHead", null);
        setIntField(term264304, term264304.getClass(), "sourcePosition", 0);
        setField(term264304, term264304.getClass(), "jsType", null);
        setField(term264304, term264304.getClass(), "parent", null);
        setField(term264303, term264303.getClass(), "first", term264304);
        setField(term264303, term264303.getClass(), "last", null);
        setField(term264303, term264303.getClass(), "propListHead", null);
        setIntField(term264303, term264303.getClass(), "sourcePosition", 0);
        setField(term264303, term264303.getClass(), "jsType", null);
        setField(term264303, term264303.getClass(), "parent", null);
        term264305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term264305, term264305.getClass(), "type", 0);
        setField(term264305, term264305.getClass(), "next", null);
        setField(term264305, term264305.getClass(), "first", null);
        setField(term264305, term264305.getClass(), "last", null);
        setField(term264305, term264305.getClass(), "propListHead", null);
        setIntField(term264305, term264305.getClass(), "sourcePosition", 0);
        setField(term264305, term264305.getClass(), "jsType", null);
        setField(term264305, term264305.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term263864;
        args[1] = term263934;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term263864, term264303));
        assertTrue(recursiveEquals(term263934, term264305));
        assertTrue(recursiveEquals(retValue, true));
    }

};


