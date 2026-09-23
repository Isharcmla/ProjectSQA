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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term453542;
     Object term453634;
     Object term453818;
     Object term453910;
     Object term454065;
     Object term454066;
     Object term454068;
     Object term454069;
     Object term454014;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term453542 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term453634 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term453726 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term453634, term453634.getClass(), "parent", term453726);
        setIntField(term453634, term453634.getClass(), "type", 0);
        term453818 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term453818, term453818.getClass(), "type", 0);
        term453910 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term453910, term453910.getClass(), "type", 63);
        term454065 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term454065, term454065.getClass(), "currentTraversal", null);
        term454066 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term454067 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term454066, term454066.getClass(), "number", 0.0);
        setIntField(term454066, term454066.getClass(), "type", 0);
        setField(term454066, term454066.getClass(), "next", null);
        setField(term454066, term454066.getClass(), "first", null);
        setField(term454066, term454066.getClass(), "last", null);
        setField(term454066, term454066.getClass(), "propListHead", null);
        setIntField(term454066, term454066.getClass(), "sourcePosition", 0);
        setField(term454066, term454066.getClass(), "jsType", null);
        setDoubleField(term454067, term454067.getClass(), "number", 0.0);
        setIntField(term454067, term454067.getClass(), "type", 0);
        setField(term454067, term454067.getClass(), "next", null);
        setField(term454067, term454067.getClass(), "first", null);
        setField(term454067, term454067.getClass(), "last", null);
        setField(term454067, term454067.getClass(), "propListHead", null);
        setIntField(term454067, term454067.getClass(), "sourcePosition", 0);
        setField(term454067, term454067.getClass(), "jsType", null);
        setField(term454067, term454067.getClass(), "parent", null);
        setField(term454066, term454066.getClass(), "parent", term454067);
        term454068 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term454068, term454068.getClass(), "number", 0.0);
        setIntField(term454068, term454068.getClass(), "type", 0);
        setField(term454068, term454068.getClass(), "next", null);
        setField(term454068, term454068.getClass(), "first", null);
        setField(term454068, term454068.getClass(), "last", null);
        setField(term454068, term454068.getClass(), "propListHead", null);
        setIntField(term454068, term454068.getClass(), "sourcePosition", 0);
        setField(term454068, term454068.getClass(), "jsType", null);
        setField(term454068, term454068.getClass(), "parent", null);
        term454069 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term454069, term454069.getClass(), "str", null);
        setIntField(term454069, term454069.getClass(), "type", 63);
        setField(term454069, term454069.getClass(), "next", null);
        setField(term454069, term454069.getClass(), "first", null);
        setField(term454069, term454069.getClass(), "last", null);
        setField(term454069, term454069.getClass(), "propListHead", null);
        setIntField(term454069, term454069.getClass(), "sourcePosition", 0);
        setField(term454069, term454069.getClass(), "jsType", null);
        setField(term454069, term454069.getClass(), "parent", null);
        term454014 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term454018 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term454014, term454014.getClass(), "number", 0.0);
        setIntField(term454014, term454014.getClass(), "type", 0);
        setField(term454014, term454014.getClass(), "next", null);
        setField(term454014, term454014.getClass(), "first", null);
        setField(term454014, term454014.getClass(), "last", null);
        setField(term454014, term454014.getClass(), "propListHead", null);
        setIntField(term454014, term454014.getClass(), "sourcePosition", 0);
        setField(term454014, term454014.getClass(), "jsType", null);
        setDoubleField(term454018, term454018.getClass(), "number", 0.0);
        setIntField(term454018, term454018.getClass(), "type", 0);
        setField(term454018, term454018.getClass(), "next", null);
        setField(term454018, term454018.getClass(), "first", null);
        setField(term454018, term454018.getClass(), "last", null);
        setField(term454018, term454018.getClass(), "propListHead", null);
        setIntField(term454018, term454018.getClass(), "sourcePosition", 0);
        setField(term454018, term454018.getClass(), "jsType", null);
        setField(term454018, term454018.getClass(), "parent", null);
        setField(term454014, term454014.getClass(), "parent", term454018);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term453634;
        args[1] = term453818;
        args[2] = term453910;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term453542, args);
        assertTrue(recursiveEquals(term453542, term454065));
        assertTrue(recursiveEquals(term453634, term454066));
        assertTrue(recursiveEquals(term453818, term454068));
        assertTrue(recursiveEquals(term453910, term454069));
        assertTrue(recursiveEquals(retValue, term454014));
    }

};


