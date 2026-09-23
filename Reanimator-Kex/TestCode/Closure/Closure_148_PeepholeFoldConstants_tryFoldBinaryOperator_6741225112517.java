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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term708483;
     Object term708575;
     Object term709404;
     Object term709405;
     Object term709313;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term708483 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term708575 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term708667 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term708759 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term708851 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term708759, term708759.getClass(), "type", 64);
        setField(term708667, term708667.getClass(), "next", term708759);
        setIntField(term708667, term708667.getClass(), "type", 0);
        setField(term708575, term708575.getClass(), "first", term708667);
        setIntField(term708575, term708575.getClass(), "type", 100);
        setIntField(term708851, term708851.getClass(), "type", 114);
        setField(term708575, term708575.getClass(), "parent", term708851);
        term709404 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term709404, term709404.getClass(), "currentTraversal", null);
        term709405 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term709406 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term709407 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term709408 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term709405, term709405.getClass(), "str", null);
        setIntField(term709405, term709405.getClass(), "type", 100);
        setField(term709405, term709405.getClass(), "next", null);
        setField(term709406, term709406.getClass(), "str", null);
        setIntField(term709406, term709406.getClass(), "type", 0);
        setField(term709407, term709407.getClass(), "str", null);
        setIntField(term709407, term709407.getClass(), "type", 64);
        setField(term709407, term709407.getClass(), "next", null);
        setField(term709407, term709407.getClass(), "first", null);
        setField(term709407, term709407.getClass(), "last", null);
        setField(term709407, term709407.getClass(), "propListHead", null);
        setIntField(term709407, term709407.getClass(), "sourcePosition", 0);
        setField(term709407, term709407.getClass(), "jsType", null);
        setField(term709407, term709407.getClass(), "parent", null);
        setField(term709406, term709406.getClass(), "next", term709407);
        setField(term709406, term709406.getClass(), "first", null);
        setField(term709406, term709406.getClass(), "last", null);
        setField(term709406, term709406.getClass(), "propListHead", null);
        setIntField(term709406, term709406.getClass(), "sourcePosition", 0);
        setField(term709406, term709406.getClass(), "jsType", null);
        setField(term709406, term709406.getClass(), "parent", null);
        setField(term709405, term709405.getClass(), "first", term709406);
        setField(term709405, term709405.getClass(), "last", null);
        setField(term709405, term709405.getClass(), "propListHead", null);
        setIntField(term709405, term709405.getClass(), "sourcePosition", 0);
        setField(term709405, term709405.getClass(), "jsType", null);
        setField(term709408, term709408.getClass(), "str", null);
        setIntField(term709408, term709408.getClass(), "type", 114);
        setField(term709408, term709408.getClass(), "next", null);
        setField(term709408, term709408.getClass(), "first", null);
        setField(term709408, term709408.getClass(), "last", null);
        setField(term709408, term709408.getClass(), "propListHead", null);
        setIntField(term709408, term709408.getClass(), "sourcePosition", 0);
        setField(term709408, term709408.getClass(), "jsType", null);
        setField(term709408, term709408.getClass(), "parent", null);
        setField(term709405, term709405.getClass(), "parent", term709408);
        term709313 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term709315 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term709317 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term709322 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term709313, term709313.getClass(), "str", null);
        setIntField(term709313, term709313.getClass(), "type", 100);
        setField(term709313, term709313.getClass(), "next", null);
        setField(term709315, term709315.getClass(), "str", null);
        setIntField(term709315, term709315.getClass(), "type", 0);
        setField(term709317, term709317.getClass(), "str", null);
        setIntField(term709317, term709317.getClass(), "type", 64);
        setField(term709317, term709317.getClass(), "next", null);
        setField(term709317, term709317.getClass(), "first", null);
        setField(term709317, term709317.getClass(), "last", null);
        setField(term709317, term709317.getClass(), "propListHead", null);
        setIntField(term709317, term709317.getClass(), "sourcePosition", 0);
        setField(term709317, term709317.getClass(), "jsType", null);
        setField(term709317, term709317.getClass(), "parent", null);
        setField(term709315, term709315.getClass(), "next", term709317);
        setField(term709315, term709315.getClass(), "first", null);
        setField(term709315, term709315.getClass(), "last", null);
        setField(term709315, term709315.getClass(), "propListHead", null);
        setIntField(term709315, term709315.getClass(), "sourcePosition", 0);
        setField(term709315, term709315.getClass(), "jsType", null);
        setField(term709315, term709315.getClass(), "parent", null);
        setField(term709313, term709313.getClass(), "first", term709315);
        setField(term709313, term709313.getClass(), "last", null);
        setField(term709313, term709313.getClass(), "propListHead", null);
        setIntField(term709313, term709313.getClass(), "sourcePosition", 0);
        setField(term709313, term709313.getClass(), "jsType", null);
        setField(term709322, term709322.getClass(), "str", null);
        setIntField(term709322, term709322.getClass(), "type", 114);
        setField(term709322, term709322.getClass(), "next", null);
        setField(term709322, term709322.getClass(), "first", null);
        setField(term709322, term709322.getClass(), "last", null);
        setField(term709322, term709322.getClass(), "propListHead", null);
        setIntField(term709322, term709322.getClass(), "sourcePosition", 0);
        setField(term709322, term709322.getClass(), "jsType", null);
        setField(term709322, term709322.getClass(), "parent", null);
        setField(term709313, term709313.getClass(), "parent", term709322);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term708575;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term708483, args);
        assertTrue(recursiveEquals(term708483, term709404));
        assertTrue(recursiveEquals(term708575, term709405));
        assertTrue(recursiveEquals(retValue, term709313));
    }

};


