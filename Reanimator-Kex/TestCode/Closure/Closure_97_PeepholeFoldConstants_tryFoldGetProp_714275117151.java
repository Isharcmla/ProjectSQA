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

public class PeepholeFoldConstants_tryFoldGetProp_714275117151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29076;
     Object term29181;
     Object term29544;
     Object term29545;
     Object term29546;
     Object term29535;

    public PeepholeFoldConstants_tryFoldGetProp_714275117151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29076 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term29181 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29181, term29181.getClass(), "type", 33);
        term29544 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term29544, term29544.getClass(), "currentTraversal", null);
        term29545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29545, term29545.getClass(), "type", 33);
        setField(term29545, term29545.getClass(), "next", null);
        setField(term29545, term29545.getClass(), "first", null);
        setField(term29545, term29545.getClass(), "last", null);
        setField(term29545, term29545.getClass(), "propListHead", null);
        setIntField(term29545, term29545.getClass(), "sourcePosition", 0);
        setField(term29545, term29545.getClass(), "jsType", null);
        setField(term29545, term29545.getClass(), "parent", null);
        term29546 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29546, term29546.getClass(), "type", 33);
        setField(term29546, term29546.getClass(), "next", null);
        setField(term29546, term29546.getClass(), "first", null);
        setField(term29546, term29546.getClass(), "last", null);
        setField(term29546, term29546.getClass(), "propListHead", null);
        setIntField(term29546, term29546.getClass(), "sourcePosition", 0);
        setField(term29546, term29546.getClass(), "jsType", null);
        setField(term29546, term29546.getClass(), "parent", null);
        term29535 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29535, term29535.getClass(), "type", 33);
        setField(term29535, term29535.getClass(), "next", null);
        setField(term29535, term29535.getClass(), "first", null);
        setField(term29535, term29535.getClass(), "last", null);
        setField(term29535, term29535.getClass(), "propListHead", null);
        setIntField(term29535, term29535.getClass(), "sourcePosition", 0);
        setField(term29535, term29535.getClass(), "jsType", null);
        setField(term29535, term29535.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term29181;
        args[1] = null;
        args[2] = term29181;
        Object retValue = callMethod(klass, "tryFoldGetProp", argTypes, term29076, args);
        assertTrue(recursiveEquals(term29076, term29544));
        assertTrue(recursiveEquals(term29181, term29545));
        assertTrue(recursiveEquals(term29181, null));
        assertTrue(recursiveEquals(retValue, term29535));
    }

};


