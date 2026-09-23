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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term743935;
     Object term744027;
     Object term744211;
     Object term744303;
     Object term744386;
     Object term744387;
     Object term744389;
     Object term744390;
     Object term744314;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term743935 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term744027 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term744119 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term744119, term744119.getClass(), "type", 113);
        setField(term744027, term744027.getClass(), "parent", term744119);
        setIntField(term744027, term744027.getClass(), "type", 113);
        term744211 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term744211, term744211.getClass(), "type", 0);
        term744303 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term744303, term744303.getClass(), "type", 47);
        term744386 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term744386, term744386.getClass(), "currentTraversal", null);
        term744387 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term744388 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term744387, term744387.getClass(), "number", 0.0);
        setIntField(term744387, term744387.getClass(), "type", 113);
        setField(term744387, term744387.getClass(), "next", null);
        setField(term744387, term744387.getClass(), "first", null);
        setField(term744387, term744387.getClass(), "last", null);
        setField(term744387, term744387.getClass(), "propListHead", null);
        setIntField(term744387, term744387.getClass(), "sourcePosition", 0);
        setField(term744387, term744387.getClass(), "jsType", null);
        setDoubleField(term744388, term744388.getClass(), "number", 0.0);
        setIntField(term744388, term744388.getClass(), "type", 113);
        setField(term744388, term744388.getClass(), "next", null);
        setField(term744388, term744388.getClass(), "first", null);
        setField(term744388, term744388.getClass(), "last", null);
        setField(term744388, term744388.getClass(), "propListHead", null);
        setIntField(term744388, term744388.getClass(), "sourcePosition", 0);
        setField(term744388, term744388.getClass(), "jsType", null);
        setField(term744388, term744388.getClass(), "parent", null);
        setField(term744387, term744387.getClass(), "parent", term744388);
        term744389 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term744389, term744389.getClass(), "str", null);
        setIntField(term744389, term744389.getClass(), "type", 0);
        setField(term744389, term744389.getClass(), "next", null);
        setField(term744389, term744389.getClass(), "first", null);
        setField(term744389, term744389.getClass(), "last", null);
        setField(term744389, term744389.getClass(), "propListHead", null);
        setIntField(term744389, term744389.getClass(), "sourcePosition", 0);
        setField(term744389, term744389.getClass(), "jsType", null);
        setField(term744389, term744389.getClass(), "parent", null);
        term744390 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term744390, term744390.getClass(), "number", 0.0);
        setIntField(term744390, term744390.getClass(), "type", 47);
        setField(term744390, term744390.getClass(), "next", null);
        setField(term744390, term744390.getClass(), "first", null);
        setField(term744390, term744390.getClass(), "last", null);
        setField(term744390, term744390.getClass(), "propListHead", null);
        setIntField(term744390, term744390.getClass(), "sourcePosition", 0);
        setField(term744390, term744390.getClass(), "jsType", null);
        setField(term744390, term744390.getClass(), "parent", null);
        term744314 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term744318 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term744314, term744314.getClass(), "number", 0.0);
        setIntField(term744314, term744314.getClass(), "type", 113);
        setField(term744314, term744314.getClass(), "next", null);
        setField(term744314, term744314.getClass(), "first", null);
        setField(term744314, term744314.getClass(), "last", null);
        setField(term744314, term744314.getClass(), "propListHead", null);
        setIntField(term744314, term744314.getClass(), "sourcePosition", 0);
        setField(term744314, term744314.getClass(), "jsType", null);
        setDoubleField(term744318, term744318.getClass(), "number", 0.0);
        setIntField(term744318, term744318.getClass(), "type", 113);
        setField(term744318, term744318.getClass(), "next", null);
        setField(term744318, term744318.getClass(), "first", null);
        setField(term744318, term744318.getClass(), "last", null);
        setField(term744318, term744318.getClass(), "propListHead", null);
        setIntField(term744318, term744318.getClass(), "sourcePosition", 0);
        setField(term744318, term744318.getClass(), "jsType", null);
        setField(term744318, term744318.getClass(), "parent", null);
        setField(term744314, term744314.getClass(), "parent", term744318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term744027;
        args[1] = term744211;
        args[2] = term744303;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term743935, args);
        assertTrue(recursiveEquals(term743935, term744386));
        assertTrue(recursiveEquals(term744027, term744387));
        assertTrue(recursiveEquals(term744211, term744389));
        assertTrue(recursiveEquals(term744303, term744390));
        assertTrue(recursiveEquals(retValue, term744314));
    }

};


