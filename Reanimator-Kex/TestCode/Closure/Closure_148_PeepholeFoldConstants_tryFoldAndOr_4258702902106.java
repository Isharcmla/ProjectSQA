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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term572013;
     Object term572105;
     Object term572289;
     Object term572381;
     Object term572443;
     Object term572444;
     Object term572446;
     Object term572447;
     Object term572392;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term572013 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term572105 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term572197 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term572105, term572105.getClass(), "parent", term572197);
        setIntField(term572105, term572105.getClass(), "type", 0);
        term572289 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term572289, term572289.getClass(), "type", 0);
        term572381 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term572381, term572381.getClass(), "type", 44);
        term572443 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term572443, term572443.getClass(), "currentTraversal", null);
        term572444 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term572445 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term572444, term572444.getClass(), "number", 0.0);
        setIntField(term572444, term572444.getClass(), "type", 0);
        setField(term572444, term572444.getClass(), "next", null);
        setField(term572444, term572444.getClass(), "first", null);
        setField(term572444, term572444.getClass(), "last", null);
        setField(term572444, term572444.getClass(), "propListHead", null);
        setIntField(term572444, term572444.getClass(), "sourcePosition", 0);
        setField(term572444, term572444.getClass(), "jsType", null);
        setDoubleField(term572445, term572445.getClass(), "number", 0.0);
        setIntField(term572445, term572445.getClass(), "type", 0);
        setField(term572445, term572445.getClass(), "next", null);
        setField(term572445, term572445.getClass(), "first", null);
        setField(term572445, term572445.getClass(), "last", null);
        setField(term572445, term572445.getClass(), "propListHead", null);
        setIntField(term572445, term572445.getClass(), "sourcePosition", 0);
        setField(term572445, term572445.getClass(), "jsType", null);
        setField(term572445, term572445.getClass(), "parent", null);
        setField(term572444, term572444.getClass(), "parent", term572445);
        term572446 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term572446, term572446.getClass(), "str", null);
        setIntField(term572446, term572446.getClass(), "type", 0);
        setField(term572446, term572446.getClass(), "next", null);
        setField(term572446, term572446.getClass(), "first", null);
        setField(term572446, term572446.getClass(), "last", null);
        setField(term572446, term572446.getClass(), "propListHead", null);
        setIntField(term572446, term572446.getClass(), "sourcePosition", 0);
        setField(term572446, term572446.getClass(), "jsType", null);
        setField(term572446, term572446.getClass(), "parent", null);
        term572447 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term572447, term572447.getClass(), "number", 0.0);
        setIntField(term572447, term572447.getClass(), "type", 44);
        setField(term572447, term572447.getClass(), "next", null);
        setField(term572447, term572447.getClass(), "first", null);
        setField(term572447, term572447.getClass(), "last", null);
        setField(term572447, term572447.getClass(), "propListHead", null);
        setIntField(term572447, term572447.getClass(), "sourcePosition", 0);
        setField(term572447, term572447.getClass(), "jsType", null);
        setField(term572447, term572447.getClass(), "parent", null);
        term572392 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term572396 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term572392, term572392.getClass(), "number", 0.0);
        setIntField(term572392, term572392.getClass(), "type", 0);
        setField(term572392, term572392.getClass(), "next", null);
        setField(term572392, term572392.getClass(), "first", null);
        setField(term572392, term572392.getClass(), "last", null);
        setField(term572392, term572392.getClass(), "propListHead", null);
        setIntField(term572392, term572392.getClass(), "sourcePosition", 0);
        setField(term572392, term572392.getClass(), "jsType", null);
        setDoubleField(term572396, term572396.getClass(), "number", 0.0);
        setIntField(term572396, term572396.getClass(), "type", 0);
        setField(term572396, term572396.getClass(), "next", null);
        setField(term572396, term572396.getClass(), "first", null);
        setField(term572396, term572396.getClass(), "last", null);
        setField(term572396, term572396.getClass(), "propListHead", null);
        setIntField(term572396, term572396.getClass(), "sourcePosition", 0);
        setField(term572396, term572396.getClass(), "jsType", null);
        setField(term572396, term572396.getClass(), "parent", null);
        setField(term572392, term572392.getClass(), "parent", term572396);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term572105;
        args[1] = term572289;
        args[2] = term572381;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term572013, args);
        assertTrue(recursiveEquals(term572013, term572443));
        assertTrue(recursiveEquals(term572105, term572444));
        assertTrue(recursiveEquals(term572289, term572446));
        assertTrue(recursiveEquals(term572381, term572447));
        assertTrue(recursiveEquals(retValue, term572392));
    }

};


