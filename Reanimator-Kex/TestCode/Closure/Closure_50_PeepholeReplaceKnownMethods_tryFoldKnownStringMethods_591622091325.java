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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2627177;
     Object term2627269;
     Object term2628195;
     Object term2628196;
     Object term2628160;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2627177 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2627269 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2627361 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2627453 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term2627269, term2627269.getClass(), "type", 37);
        setIntField(term2627361, term2627361.getClass(), "type", 33);
        setField(term2627361, term2627361.getClass(), "first", term2627453);
        setField(term2627269, term2627269.getClass(), "first", term2627361);
        term2628195 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term2628195, term2628195.getClass(), "currentTraversal", null);
        term2628196 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2628197 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2628198 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term2628196, term2628196.getClass(), "str", null);
        setIntField(term2628196, term2628196.getClass(), "type", 37);
        setField(term2628196, term2628196.getClass(), "next", null);
        setField(term2628197, term2628197.getClass(), "str", null);
        setIntField(term2628197, term2628197.getClass(), "type", 33);
        setField(term2628197, term2628197.getClass(), "next", null);
        setField(term2628198, term2628198.getClass(), "str", null);
        setIntField(term2628198, term2628198.getClass(), "type", 0);
        setField(term2628198, term2628198.getClass(), "next", null);
        setField(term2628198, term2628198.getClass(), "first", null);
        setField(term2628198, term2628198.getClass(), "last", null);
        setField(term2628198, term2628198.getClass(), "propListHead", null);
        setIntField(term2628198, term2628198.getClass(), "sourcePosition", 0);
        setField(term2628198, term2628198.getClass(), "jsType", null);
        setField(term2628198, term2628198.getClass(), "parent", null);
        setField(term2628197, term2628197.getClass(), "first", term2628198);
        setField(term2628197, term2628197.getClass(), "last", null);
        setField(term2628197, term2628197.getClass(), "propListHead", null);
        setIntField(term2628197, term2628197.getClass(), "sourcePosition", 0);
        setField(term2628197, term2628197.getClass(), "jsType", null);
        setField(term2628197, term2628197.getClass(), "parent", null);
        setField(term2628196, term2628196.getClass(), "first", term2628197);
        setField(term2628196, term2628196.getClass(), "last", null);
        setField(term2628196, term2628196.getClass(), "propListHead", null);
        setIntField(term2628196, term2628196.getClass(), "sourcePosition", 0);
        setField(term2628196, term2628196.getClass(), "jsType", null);
        setField(term2628196, term2628196.getClass(), "parent", null);
        term2628160 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2628162 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2628164 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term2628160, term2628160.getClass(), "str", null);
        setIntField(term2628160, term2628160.getClass(), "type", 37);
        setField(term2628160, term2628160.getClass(), "next", null);
        setField(term2628162, term2628162.getClass(), "str", null);
        setIntField(term2628162, term2628162.getClass(), "type", 33);
        setField(term2628162, term2628162.getClass(), "next", null);
        setField(term2628164, term2628164.getClass(), "str", null);
        setIntField(term2628164, term2628164.getClass(), "type", 0);
        setField(term2628164, term2628164.getClass(), "next", null);
        setField(term2628164, term2628164.getClass(), "first", null);
        setField(term2628164, term2628164.getClass(), "last", null);
        setField(term2628164, term2628164.getClass(), "propListHead", null);
        setIntField(term2628164, term2628164.getClass(), "sourcePosition", 0);
        setField(term2628164, term2628164.getClass(), "jsType", null);
        setField(term2628164, term2628164.getClass(), "parent", null);
        setField(term2628162, term2628162.getClass(), "first", term2628164);
        setField(term2628162, term2628162.getClass(), "last", null);
        setField(term2628162, term2628162.getClass(), "propListHead", null);
        setIntField(term2628162, term2628162.getClass(), "sourcePosition", 0);
        setField(term2628162, term2628162.getClass(), "jsType", null);
        setField(term2628162, term2628162.getClass(), "parent", null);
        setField(term2628160, term2628160.getClass(), "first", term2628162);
        setField(term2628160, term2628160.getClass(), "last", null);
        setField(term2628160, term2628160.getClass(), "propListHead", null);
        setIntField(term2628160, term2628160.getClass(), "sourcePosition", 0);
        setField(term2628160, term2628160.getClass(), "jsType", null);
        setField(term2628160, term2628160.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2627269;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2627177, args);
        assertTrue(recursiveEquals(term2627177, term2628195));
        assertTrue(recursiveEquals(term2627269, term2628196));
        assertTrue(recursiveEquals(retValue, term2628160));
    }

};


