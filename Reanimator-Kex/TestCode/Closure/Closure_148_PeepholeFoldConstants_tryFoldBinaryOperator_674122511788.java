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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511788 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177991;
     Object term178083;
     Object term178431;
     Object term178432;
     Object term178389;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511788() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177991 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term178083 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term178175 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term178267 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term178175, term178175.getClass(), "next", term178267);
        setField(term178083, term178083.getClass(), "first", term178175);
        setIntField(term178083, term178083.getClass(), "type", 16);
        term178431 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term178431, term178431.getClass(), "currentTraversal", null);
        term178432 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term178433 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term178434 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term178432, term178432.getClass(), "str", null);
        setIntField(term178432, term178432.getClass(), "type", 16);
        setField(term178432, term178432.getClass(), "next", null);
        setField(term178433, term178433.getClass(), "str", null);
        setIntField(term178433, term178433.getClass(), "type", 0);
        setField(term178434, term178434.getClass(), "str", null);
        setIntField(term178434, term178434.getClass(), "type", 0);
        setField(term178434, term178434.getClass(), "next", null);
        setField(term178434, term178434.getClass(), "first", null);
        setField(term178434, term178434.getClass(), "last", null);
        setField(term178434, term178434.getClass(), "propListHead", null);
        setIntField(term178434, term178434.getClass(), "sourcePosition", 0);
        setField(term178434, term178434.getClass(), "jsType", null);
        setField(term178434, term178434.getClass(), "parent", null);
        setField(term178433, term178433.getClass(), "next", term178434);
        setField(term178433, term178433.getClass(), "first", null);
        setField(term178433, term178433.getClass(), "last", null);
        setField(term178433, term178433.getClass(), "propListHead", null);
        setIntField(term178433, term178433.getClass(), "sourcePosition", 0);
        setField(term178433, term178433.getClass(), "jsType", null);
        setField(term178433, term178433.getClass(), "parent", null);
        setField(term178432, term178432.getClass(), "first", term178433);
        setField(term178432, term178432.getClass(), "last", null);
        setField(term178432, term178432.getClass(), "propListHead", null);
        setIntField(term178432, term178432.getClass(), "sourcePosition", 0);
        setField(term178432, term178432.getClass(), "jsType", null);
        setField(term178432, term178432.getClass(), "parent", null);
        term178389 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term178391 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term178393 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term178389, term178389.getClass(), "str", null);
        setIntField(term178389, term178389.getClass(), "type", 16);
        setField(term178389, term178389.getClass(), "next", null);
        setField(term178391, term178391.getClass(), "str", null);
        setIntField(term178391, term178391.getClass(), "type", 0);
        setField(term178393, term178393.getClass(), "str", null);
        setIntField(term178393, term178393.getClass(), "type", 0);
        setField(term178393, term178393.getClass(), "next", null);
        setField(term178393, term178393.getClass(), "first", null);
        setField(term178393, term178393.getClass(), "last", null);
        setField(term178393, term178393.getClass(), "propListHead", null);
        setIntField(term178393, term178393.getClass(), "sourcePosition", 0);
        setField(term178393, term178393.getClass(), "jsType", null);
        setField(term178393, term178393.getClass(), "parent", null);
        setField(term178391, term178391.getClass(), "next", term178393);
        setField(term178391, term178391.getClass(), "first", null);
        setField(term178391, term178391.getClass(), "last", null);
        setField(term178391, term178391.getClass(), "propListHead", null);
        setIntField(term178391, term178391.getClass(), "sourcePosition", 0);
        setField(term178391, term178391.getClass(), "jsType", null);
        setField(term178391, term178391.getClass(), "parent", null);
        setField(term178389, term178389.getClass(), "first", term178391);
        setField(term178389, term178389.getClass(), "last", null);
        setField(term178389, term178389.getClass(), "propListHead", null);
        setIntField(term178389, term178389.getClass(), "sourcePosition", 0);
        setField(term178389, term178389.getClass(), "jsType", null);
        setField(term178389, term178389.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term178083;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term177991, args);
        assertTrue(recursiveEquals(term177991, term178431));
        assertTrue(recursiveEquals(term178083, term178432));
        assertTrue(recursiveEquals(retValue, term178389));
    }

};


