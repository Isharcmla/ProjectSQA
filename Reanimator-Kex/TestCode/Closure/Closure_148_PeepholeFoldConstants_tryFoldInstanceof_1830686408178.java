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

public class PeepholeFoldConstants_tryFoldInstanceof_1830686408178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33406;
     Object term33511;
     Object term33834;
     Object term33835;
     Object term33836;
     Object term33822;

    public PeepholeFoldConstants_tryFoldInstanceof_1830686408178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33406 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term33511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33511, term33511.getClass(), "type", 52);
        term33834 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term33834, term33834.getClass(), "currentTraversal", null);
        term33835 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33835, term33835.getClass(), "type", 52);
        setField(term33835, term33835.getClass(), "next", null);
        setField(term33835, term33835.getClass(), "first", null);
        setField(term33835, term33835.getClass(), "last", null);
        setField(term33835, term33835.getClass(), "propListHead", null);
        setIntField(term33835, term33835.getClass(), "sourcePosition", 0);
        setField(term33835, term33835.getClass(), "jsType", null);
        setField(term33835, term33835.getClass(), "parent", null);
        term33836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33836, term33836.getClass(), "type", 52);
        setField(term33836, term33836.getClass(), "next", null);
        setField(term33836, term33836.getClass(), "first", null);
        setField(term33836, term33836.getClass(), "last", null);
        setField(term33836, term33836.getClass(), "propListHead", null);
        setIntField(term33836, term33836.getClass(), "sourcePosition", 0);
        setField(term33836, term33836.getClass(), "jsType", null);
        setField(term33836, term33836.getClass(), "parent", null);
        term33822 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33822, term33822.getClass(), "type", 52);
        setField(term33822, term33822.getClass(), "next", null);
        setField(term33822, term33822.getClass(), "first", null);
        setField(term33822, term33822.getClass(), "last", null);
        setField(term33822, term33822.getClass(), "propListHead", null);
        setIntField(term33822, term33822.getClass(), "sourcePosition", 0);
        setField(term33822, term33822.getClass(), "jsType", null);
        setField(term33822, term33822.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term33511;
        args[1] = term33511;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldInstanceof", argTypes, term33406, args);
        assertTrue(recursiveEquals(term33406, term33834));
        assertTrue(recursiveEquals(term33511, term33835));
        assertTrue(recursiveEquals(term33511, term33836));
        assertTrue(recursiveEquals(retValue, term33822));
    }

};


