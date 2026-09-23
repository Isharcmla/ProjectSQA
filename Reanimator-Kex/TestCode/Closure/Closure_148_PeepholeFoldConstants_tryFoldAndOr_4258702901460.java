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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term361918;
     Object term362056;
     Object term362091;
     Object term362092;
     Object term362093;
     Object term362063;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term361918 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term362056 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term362056, term362056.getClass(), "parent", null);
        setIntField(term362056, term362056.getClass(), "type", 47);
        term362091 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term362091, term362091.getClass(), "currentTraversal", null);
        term362092 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term362092, term362092.getClass(), "str", null);
        setIntField(term362092, term362092.getClass(), "type", 47);
        setField(term362092, term362092.getClass(), "next", null);
        setField(term362092, term362092.getClass(), "first", null);
        setField(term362092, term362092.getClass(), "last", null);
        setField(term362092, term362092.getClass(), "propListHead", null);
        setIntField(term362092, term362092.getClass(), "sourcePosition", 0);
        setField(term362092, term362092.getClass(), "jsType", null);
        setField(term362092, term362092.getClass(), "parent", null);
        term362093 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term362093, term362093.getClass(), "str", null);
        setIntField(term362093, term362093.getClass(), "type", 47);
        setField(term362093, term362093.getClass(), "next", null);
        setField(term362093, term362093.getClass(), "first", null);
        setField(term362093, term362093.getClass(), "last", null);
        setField(term362093, term362093.getClass(), "propListHead", null);
        setIntField(term362093, term362093.getClass(), "sourcePosition", 0);
        setField(term362093, term362093.getClass(), "jsType", null);
        setField(term362093, term362093.getClass(), "parent", null);
        term362063 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term362063, term362063.getClass(), "str", null);
        setIntField(term362063, term362063.getClass(), "type", 47);
        setField(term362063, term362063.getClass(), "next", null);
        setField(term362063, term362063.getClass(), "first", null);
        setField(term362063, term362063.getClass(), "last", null);
        setField(term362063, term362063.getClass(), "propListHead", null);
        setIntField(term362063, term362063.getClass(), "sourcePosition", 0);
        setField(term362063, term362063.getClass(), "jsType", null);
        setField(term362063, term362063.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term362056;
        args[1] = term362056;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term361918, args);
        assertTrue(recursiveEquals(term361918, term362091));
        assertTrue(recursiveEquals(term362056, term362092));
        assertTrue(recursiveEquals(term362056, term362093));
        assertTrue(recursiveEquals(retValue, term362063));
    }

};


