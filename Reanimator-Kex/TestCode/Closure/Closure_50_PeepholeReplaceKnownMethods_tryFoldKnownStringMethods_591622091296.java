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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1973235;
     Object term1973327;
     Object term1973579;
     Object term1973580;
     Object term1973539;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1973235 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term1973327 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1973419 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term1973489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1973327, term1973327.getClass(), "type", 37);
        setIntField(term1973419, term1973419.getClass(), "type", 35);
        setField(term1973419, term1973419.getClass(), "first", term1973489);
        setField(term1973327, term1973327.getClass(), "first", term1973419);
        term1973579 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term1973579, term1973579.getClass(), "currentTraversal", null);
        term1973580 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1973581 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term1973582 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1973580, term1973580.getClass(), "str", null);
        setIntField(term1973580, term1973580.getClass(), "type", 37);
        setField(term1973580, term1973580.getClass(), "next", null);
        setDoubleField(term1973581, term1973581.getClass(), "number", 0.0);
        setIntField(term1973581, term1973581.getClass(), "type", 35);
        setField(term1973581, term1973581.getClass(), "next", null);
        setIntField(term1973582, term1973582.getClass(), "type", 0);
        setField(term1973582, term1973582.getClass(), "next", null);
        setField(term1973582, term1973582.getClass(), "first", null);
        setField(term1973582, term1973582.getClass(), "last", null);
        setField(term1973582, term1973582.getClass(), "propListHead", null);
        setIntField(term1973582, term1973582.getClass(), "sourcePosition", 0);
        setField(term1973582, term1973582.getClass(), "jsType", null);
        setField(term1973582, term1973582.getClass(), "parent", null);
        setField(term1973581, term1973581.getClass(), "first", term1973582);
        setField(term1973581, term1973581.getClass(), "last", null);
        setField(term1973581, term1973581.getClass(), "propListHead", null);
        setIntField(term1973581, term1973581.getClass(), "sourcePosition", 0);
        setField(term1973581, term1973581.getClass(), "jsType", null);
        setField(term1973581, term1973581.getClass(), "parent", null);
        setField(term1973580, term1973580.getClass(), "first", term1973581);
        setField(term1973580, term1973580.getClass(), "last", null);
        setField(term1973580, term1973580.getClass(), "propListHead", null);
        setIntField(term1973580, term1973580.getClass(), "sourcePosition", 0);
        setField(term1973580, term1973580.getClass(), "jsType", null);
        setField(term1973580, term1973580.getClass(), "parent", null);
        term1973539 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1973541 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term1973544 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1973539, term1973539.getClass(), "str", null);
        setIntField(term1973539, term1973539.getClass(), "type", 37);
        setField(term1973539, term1973539.getClass(), "next", null);
        setDoubleField(term1973541, term1973541.getClass(), "number", 0.0);
        setIntField(term1973541, term1973541.getClass(), "type", 35);
        setField(term1973541, term1973541.getClass(), "next", null);
        setIntField(term1973544, term1973544.getClass(), "type", 0);
        setField(term1973544, term1973544.getClass(), "next", null);
        setField(term1973544, term1973544.getClass(), "first", null);
        setField(term1973544, term1973544.getClass(), "last", null);
        setField(term1973544, term1973544.getClass(), "propListHead", null);
        setIntField(term1973544, term1973544.getClass(), "sourcePosition", 0);
        setField(term1973544, term1973544.getClass(), "jsType", null);
        setField(term1973544, term1973544.getClass(), "parent", null);
        setField(term1973541, term1973541.getClass(), "first", term1973544);
        setField(term1973541, term1973541.getClass(), "last", null);
        setField(term1973541, term1973541.getClass(), "propListHead", null);
        setIntField(term1973541, term1973541.getClass(), "sourcePosition", 0);
        setField(term1973541, term1973541.getClass(), "jsType", null);
        setField(term1973541, term1973541.getClass(), "parent", null);
        setField(term1973539, term1973539.getClass(), "first", term1973541);
        setField(term1973539, term1973539.getClass(), "last", null);
        setField(term1973539, term1973539.getClass(), "propListHead", null);
        setIntField(term1973539, term1973539.getClass(), "sourcePosition", 0);
        setField(term1973539, term1973539.getClass(), "jsType", null);
        setField(term1973539, term1973539.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1973327;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term1973235, args);
        assertTrue(recursiveEquals(term1973235, term1973579));
        assertTrue(recursiveEquals(term1973327, term1973580));
        assertTrue(recursiveEquals(retValue, term1973539));
    }

};


