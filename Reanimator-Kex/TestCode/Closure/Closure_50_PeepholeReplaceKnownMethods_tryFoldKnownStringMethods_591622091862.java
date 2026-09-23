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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3720431;
     Object term3720523;
     Object term3721010;
     Object term3721011;
     Object term3720909;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3720431 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3720523 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3720615 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3720707 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3720799 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3720907 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3720523, term3720523.getClass(), "type", 37);
        setIntField(term3720615, term3720615.getClass(), "type", 35);
        setIntField(term3720799, term3720799.getClass(), "type", 40);
        setField(term3720799, term3720799.getClass(), "str", "");
        setField(term3720707, term3720707.getClass(), "next", term3720799);
        setIntField(term3720707, term3720707.getClass(), "type", 40);
        setField(term3720615, term3720615.getClass(), "first", term3720707);
        setIntField(term3720907, term3720907.getClass(), "type", 39);
        setField(term3720615, term3720615.getClass(), "next", term3720907);
        setField(term3720523, term3720523.getClass(), "first", term3720615);
        term3721010 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3721010, term3721010.getClass(), "currentTraversal", null);
        term3721011 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3721012 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3721013 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3721014 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3721015 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term3721011, term3721011.getClass(), "number", 0.0);
        setIntField(term3721011, term3721011.getClass(), "type", 37);
        setField(term3721011, term3721011.getClass(), "next", null);
        setField(term3721012, term3721012.getClass(), "str", null);
        setIntField(term3721012, term3721012.getClass(), "type", 35);
        setIntField(term3721013, term3721013.getClass(), "type", 39);
        setField(term3721013, term3721013.getClass(), "next", null);
        setField(term3721013, term3721013.getClass(), "first", null);
        setField(term3721013, term3721013.getClass(), "last", null);
        setField(term3721013, term3721013.getClass(), "propListHead", null);
        setIntField(term3721013, term3721013.getClass(), "sourcePosition", 0);
        setField(term3721013, term3721013.getClass(), "jsType", null);
        setField(term3721013, term3721013.getClass(), "parent", null);
        setField(term3721012, term3721012.getClass(), "next", term3721013);
        setField(term3721014, term3721014.getClass(), "str", null);
        setIntField(term3721014, term3721014.getClass(), "type", 40);
        setField(term3721015, term3721015.getClass(), "str", "");
        setIntField(term3721015, term3721015.getClass(), "type", 40);
        setField(term3721015, term3721015.getClass(), "next", null);
        setField(term3721015, term3721015.getClass(), "first", null);
        setField(term3721015, term3721015.getClass(), "last", null);
        setField(term3721015, term3721015.getClass(), "propListHead", null);
        setIntField(term3721015, term3721015.getClass(), "sourcePosition", 0);
        setField(term3721015, term3721015.getClass(), "jsType", null);
        setField(term3721015, term3721015.getClass(), "parent", null);
        setField(term3721014, term3721014.getClass(), "next", term3721015);
        setField(term3721014, term3721014.getClass(), "first", null);
        setField(term3721014, term3721014.getClass(), "last", null);
        setField(term3721014, term3721014.getClass(), "propListHead", null);
        setIntField(term3721014, term3721014.getClass(), "sourcePosition", 0);
        setField(term3721014, term3721014.getClass(), "jsType", null);
        setField(term3721014, term3721014.getClass(), "parent", null);
        setField(term3721012, term3721012.getClass(), "first", term3721014);
        setField(term3721012, term3721012.getClass(), "last", null);
        setField(term3721012, term3721012.getClass(), "propListHead", null);
        setIntField(term3721012, term3721012.getClass(), "sourcePosition", 0);
        setField(term3721012, term3721012.getClass(), "jsType", null);
        setField(term3721012, term3721012.getClass(), "parent", null);
        setField(term3721011, term3721011.getClass(), "first", term3721012);
        setField(term3721011, term3721011.getClass(), "last", null);
        setField(term3721011, term3721011.getClass(), "propListHead", null);
        setIntField(term3721011, term3721011.getClass(), "sourcePosition", 0);
        setField(term3721011, term3721011.getClass(), "jsType", null);
        setField(term3721011, term3721011.getClass(), "parent", null);
        term3720909 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3720912 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3720914 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3720917 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3720919 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term3720909, term3720909.getClass(), "number", 0.0);
        setIntField(term3720909, term3720909.getClass(), "type", 37);
        setField(term3720909, term3720909.getClass(), "next", null);
        setField(term3720912, term3720912.getClass(), "str", null);
        setIntField(term3720912, term3720912.getClass(), "type", 35);
        setIntField(term3720914, term3720914.getClass(), "type", 39);
        setField(term3720914, term3720914.getClass(), "next", null);
        setField(term3720914, term3720914.getClass(), "first", null);
        setField(term3720914, term3720914.getClass(), "last", null);
        setField(term3720914, term3720914.getClass(), "propListHead", null);
        setIntField(term3720914, term3720914.getClass(), "sourcePosition", 0);
        setField(term3720914, term3720914.getClass(), "jsType", null);
        setField(term3720914, term3720914.getClass(), "parent", null);
        setField(term3720912, term3720912.getClass(), "next", term3720914);
        setField(term3720917, term3720917.getClass(), "str", null);
        setIntField(term3720917, term3720917.getClass(), "type", 40);
        setField(term3720919, term3720919.getClass(), "str", "");
        setIntField(term3720919, term3720919.getClass(), "type", 40);
        setField(term3720919, term3720919.getClass(), "next", null);
        setField(term3720919, term3720919.getClass(), "first", null);
        setField(term3720919, term3720919.getClass(), "last", null);
        setField(term3720919, term3720919.getClass(), "propListHead", null);
        setIntField(term3720919, term3720919.getClass(), "sourcePosition", 0);
        setField(term3720919, term3720919.getClass(), "jsType", null);
        setField(term3720919, term3720919.getClass(), "parent", null);
        setField(term3720917, term3720917.getClass(), "next", term3720919);
        setField(term3720917, term3720917.getClass(), "first", null);
        setField(term3720917, term3720917.getClass(), "last", null);
        setField(term3720917, term3720917.getClass(), "propListHead", null);
        setIntField(term3720917, term3720917.getClass(), "sourcePosition", 0);
        setField(term3720917, term3720917.getClass(), "jsType", null);
        setField(term3720917, term3720917.getClass(), "parent", null);
        setField(term3720912, term3720912.getClass(), "first", term3720917);
        setField(term3720912, term3720912.getClass(), "last", null);
        setField(term3720912, term3720912.getClass(), "propListHead", null);
        setIntField(term3720912, term3720912.getClass(), "sourcePosition", 0);
        setField(term3720912, term3720912.getClass(), "jsType", null);
        setField(term3720912, term3720912.getClass(), "parent", null);
        setField(term3720909, term3720909.getClass(), "first", term3720912);
        setField(term3720909, term3720909.getClass(), "last", null);
        setField(term3720909, term3720909.getClass(), "propListHead", null);
        setIntField(term3720909, term3720909.getClass(), "sourcePosition", 0);
        setField(term3720909, term3720909.getClass(), "jsType", null);
        setField(term3720909, term3720909.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3720523;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3720431, args);
        assertTrue(recursiveEquals(term3720431, term3721010));
        assertTrue(recursiveEquals(term3720523, term3721011));
        assertTrue(recursiveEquals(retValue, term3720909));
    }

};


