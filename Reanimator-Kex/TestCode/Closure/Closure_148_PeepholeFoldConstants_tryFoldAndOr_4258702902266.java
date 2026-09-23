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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term622772;
     Object term622864;
     Object term623048;
     Object term623140;
     Object term623323;
     Object term623324;
     Object term623326;
     Object term623327;
     Object term623250;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term622772 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term622864 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term622956 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term622956, term622956.getClass(), "type", 114);
        setField(term622864, term622864.getClass(), "parent", term622956);
        setIntField(term622864, term622864.getClass(), "type", 47);
        term623048 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term623048, term623048.getClass(), "type", 0);
        term623140 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term623140, term623140.getClass(), "type", 47);
        term623323 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term623323, term623323.getClass(), "currentTraversal", null);
        term623324 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term623325 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term623324, term623324.getClass(), "number", 0.0);
        setIntField(term623324, term623324.getClass(), "type", 47);
        setField(term623324, term623324.getClass(), "next", null);
        setField(term623324, term623324.getClass(), "first", null);
        setField(term623324, term623324.getClass(), "last", null);
        setField(term623324, term623324.getClass(), "propListHead", null);
        setIntField(term623324, term623324.getClass(), "sourcePosition", 0);
        setField(term623324, term623324.getClass(), "jsType", null);
        setDoubleField(term623325, term623325.getClass(), "number", 0.0);
        setIntField(term623325, term623325.getClass(), "type", 114);
        setField(term623325, term623325.getClass(), "next", null);
        setField(term623325, term623325.getClass(), "first", null);
        setField(term623325, term623325.getClass(), "last", null);
        setField(term623325, term623325.getClass(), "propListHead", null);
        setIntField(term623325, term623325.getClass(), "sourcePosition", 0);
        setField(term623325, term623325.getClass(), "jsType", null);
        setField(term623325, term623325.getClass(), "parent", null);
        setField(term623324, term623324.getClass(), "parent", term623325);
        term623326 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term623326, term623326.getClass(), "number", 0.0);
        setIntField(term623326, term623326.getClass(), "type", 0);
        setField(term623326, term623326.getClass(), "next", null);
        setField(term623326, term623326.getClass(), "first", null);
        setField(term623326, term623326.getClass(), "last", null);
        setField(term623326, term623326.getClass(), "propListHead", null);
        setIntField(term623326, term623326.getClass(), "sourcePosition", 0);
        setField(term623326, term623326.getClass(), "jsType", null);
        setField(term623326, term623326.getClass(), "parent", null);
        term623327 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term623327, term623327.getClass(), "str", null);
        setIntField(term623327, term623327.getClass(), "type", 47);
        setField(term623327, term623327.getClass(), "next", null);
        setField(term623327, term623327.getClass(), "first", null);
        setField(term623327, term623327.getClass(), "last", null);
        setField(term623327, term623327.getClass(), "propListHead", null);
        setIntField(term623327, term623327.getClass(), "sourcePosition", 0);
        setField(term623327, term623327.getClass(), "jsType", null);
        setField(term623327, term623327.getClass(), "parent", null);
        term623250 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term623254 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term623250, term623250.getClass(), "number", 0.0);
        setIntField(term623250, term623250.getClass(), "type", 47);
        setField(term623250, term623250.getClass(), "next", null);
        setField(term623250, term623250.getClass(), "first", null);
        setField(term623250, term623250.getClass(), "last", null);
        setField(term623250, term623250.getClass(), "propListHead", null);
        setIntField(term623250, term623250.getClass(), "sourcePosition", 0);
        setField(term623250, term623250.getClass(), "jsType", null);
        setDoubleField(term623254, term623254.getClass(), "number", 0.0);
        setIntField(term623254, term623254.getClass(), "type", 114);
        setField(term623254, term623254.getClass(), "next", null);
        setField(term623254, term623254.getClass(), "first", null);
        setField(term623254, term623254.getClass(), "last", null);
        setField(term623254, term623254.getClass(), "propListHead", null);
        setIntField(term623254, term623254.getClass(), "sourcePosition", 0);
        setField(term623254, term623254.getClass(), "jsType", null);
        setField(term623254, term623254.getClass(), "parent", null);
        setField(term623250, term623250.getClass(), "parent", term623254);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term622864;
        args[1] = term623048;
        args[2] = term623140;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term622772, args);
        assertTrue(recursiveEquals(term622772, term623323));
        assertTrue(recursiveEquals(term622864, term623324));
        assertTrue(recursiveEquals(term623048, term623326));
        assertTrue(recursiveEquals(term623140, term623327));
        assertTrue(recursiveEquals(retValue, term623250));
    }

};


