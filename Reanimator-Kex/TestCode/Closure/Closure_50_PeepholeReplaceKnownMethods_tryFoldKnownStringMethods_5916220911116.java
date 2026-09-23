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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5499801;
     Object term5499893;
     Object term5500319;
     Object term5500320;
     Object term5500241;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5499801 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term5499893 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term5499985 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5500077 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5500169 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5500239 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5499893, term5499893.getClass(), "type", 37);
        setIntField(term5499985, term5499985.getClass(), "type", 33);
        setIntField(term5500169, term5500169.getClass(), "type", 40);
        setField(term5500169, term5500169.getClass(), "str", null);
        setField(term5500077, term5500077.getClass(), "next", term5500169);
        setIntField(term5500077, term5500077.getClass(), "type", 40);
        setField(term5499985, term5499985.getClass(), "first", term5500077);
        setField(term5499985, term5499985.getClass(), "next", term5500239);
        setField(term5499893, term5499893.getClass(), "first", term5499985);
        term5500319 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term5500319, term5500319.getClass(), "currentTraversal", null);
        term5500320 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term5500321 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5500322 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5500323 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5500324 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term5500320, term5500320.getClass(), "number", 0.0);
        setIntField(term5500320, term5500320.getClass(), "type", 37);
        setField(term5500320, term5500320.getClass(), "next", null);
        setField(term5500321, term5500321.getClass(), "str", null);
        setIntField(term5500321, term5500321.getClass(), "type", 33);
        setIntField(term5500322, term5500322.getClass(), "type", 0);
        setField(term5500322, term5500322.getClass(), "next", null);
        setField(term5500322, term5500322.getClass(), "first", null);
        setField(term5500322, term5500322.getClass(), "last", null);
        setField(term5500322, term5500322.getClass(), "propListHead", null);
        setIntField(term5500322, term5500322.getClass(), "sourcePosition", 0);
        setField(term5500322, term5500322.getClass(), "jsType", null);
        setField(term5500322, term5500322.getClass(), "parent", null);
        setField(term5500321, term5500321.getClass(), "next", term5500322);
        setField(term5500323, term5500323.getClass(), "str", null);
        setIntField(term5500323, term5500323.getClass(), "type", 40);
        setField(term5500324, term5500324.getClass(), "str", null);
        setIntField(term5500324, term5500324.getClass(), "type", 40);
        setField(term5500324, term5500324.getClass(), "next", null);
        setField(term5500324, term5500324.getClass(), "first", null);
        setField(term5500324, term5500324.getClass(), "last", null);
        setField(term5500324, term5500324.getClass(), "propListHead", null);
        setIntField(term5500324, term5500324.getClass(), "sourcePosition", 0);
        setField(term5500324, term5500324.getClass(), "jsType", null);
        setField(term5500324, term5500324.getClass(), "parent", null);
        setField(term5500323, term5500323.getClass(), "next", term5500324);
        setField(term5500323, term5500323.getClass(), "first", null);
        setField(term5500323, term5500323.getClass(), "last", null);
        setField(term5500323, term5500323.getClass(), "propListHead", null);
        setIntField(term5500323, term5500323.getClass(), "sourcePosition", 0);
        setField(term5500323, term5500323.getClass(), "jsType", null);
        setField(term5500323, term5500323.getClass(), "parent", null);
        setField(term5500321, term5500321.getClass(), "first", term5500323);
        setField(term5500321, term5500321.getClass(), "last", null);
        setField(term5500321, term5500321.getClass(), "propListHead", null);
        setIntField(term5500321, term5500321.getClass(), "sourcePosition", 0);
        setField(term5500321, term5500321.getClass(), "jsType", null);
        setField(term5500321, term5500321.getClass(), "parent", null);
        setField(term5500320, term5500320.getClass(), "first", term5500321);
        setField(term5500320, term5500320.getClass(), "last", null);
        setField(term5500320, term5500320.getClass(), "propListHead", null);
        setIntField(term5500320, term5500320.getClass(), "sourcePosition", 0);
        setField(term5500320, term5500320.getClass(), "jsType", null);
        setField(term5500320, term5500320.getClass(), "parent", null);
        term5500241 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term5500244 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5500246 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5500249 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5500251 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term5500241, term5500241.getClass(), "number", 0.0);
        setIntField(term5500241, term5500241.getClass(), "type", 37);
        setField(term5500241, term5500241.getClass(), "next", null);
        setField(term5500244, term5500244.getClass(), "str", null);
        setIntField(term5500244, term5500244.getClass(), "type", 33);
        setIntField(term5500246, term5500246.getClass(), "type", 0);
        setField(term5500246, term5500246.getClass(), "next", null);
        setField(term5500246, term5500246.getClass(), "first", null);
        setField(term5500246, term5500246.getClass(), "last", null);
        setField(term5500246, term5500246.getClass(), "propListHead", null);
        setIntField(term5500246, term5500246.getClass(), "sourcePosition", 0);
        setField(term5500246, term5500246.getClass(), "jsType", null);
        setField(term5500246, term5500246.getClass(), "parent", null);
        setField(term5500244, term5500244.getClass(), "next", term5500246);
        setField(term5500249, term5500249.getClass(), "str", null);
        setIntField(term5500249, term5500249.getClass(), "type", 40);
        setField(term5500251, term5500251.getClass(), "str", null);
        setIntField(term5500251, term5500251.getClass(), "type", 40);
        setField(term5500251, term5500251.getClass(), "next", null);
        setField(term5500251, term5500251.getClass(), "first", null);
        setField(term5500251, term5500251.getClass(), "last", null);
        setField(term5500251, term5500251.getClass(), "propListHead", null);
        setIntField(term5500251, term5500251.getClass(), "sourcePosition", 0);
        setField(term5500251, term5500251.getClass(), "jsType", null);
        setField(term5500251, term5500251.getClass(), "parent", null);
        setField(term5500249, term5500249.getClass(), "next", term5500251);
        setField(term5500249, term5500249.getClass(), "first", null);
        setField(term5500249, term5500249.getClass(), "last", null);
        setField(term5500249, term5500249.getClass(), "propListHead", null);
        setIntField(term5500249, term5500249.getClass(), "sourcePosition", 0);
        setField(term5500249, term5500249.getClass(), "jsType", null);
        setField(term5500249, term5500249.getClass(), "parent", null);
        setField(term5500244, term5500244.getClass(), "first", term5500249);
        setField(term5500244, term5500244.getClass(), "last", null);
        setField(term5500244, term5500244.getClass(), "propListHead", null);
        setIntField(term5500244, term5500244.getClass(), "sourcePosition", 0);
        setField(term5500244, term5500244.getClass(), "jsType", null);
        setField(term5500244, term5500244.getClass(), "parent", null);
        setField(term5500241, term5500241.getClass(), "first", term5500244);
        setField(term5500241, term5500241.getClass(), "last", null);
        setField(term5500241, term5500241.getClass(), "propListHead", null);
        setIntField(term5500241, term5500241.getClass(), "sourcePosition", 0);
        setField(term5500241, term5500241.getClass(), "jsType", null);
        setField(term5500241, term5500241.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term5499893;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term5499801, args);
        assertTrue(recursiveEquals(term5499801, term5500319));
        assertTrue(recursiveEquals(term5499893, term5500320));
        assertTrue(recursiveEquals(retValue, term5500241));
    }

};


