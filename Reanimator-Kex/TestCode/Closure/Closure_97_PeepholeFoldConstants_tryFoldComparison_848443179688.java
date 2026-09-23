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

public class PeepholeFoldConstants_tryFoldComparison_848443179688 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177384;
     Object term177476;
     Object term177568;
     Object term177660;
     Object term177696;
     Object term177697;
     Object term177698;
     Object term177699;
     Object term177671;

    public PeepholeFoldConstants_tryFoldComparison_848443179688() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177384 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term177476 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term177476, term177476.getClass(), "type", 16);
        term177568 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term177568, term177568.getClass(), "type", 42);
        term177660 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term177660, term177660.getClass(), "type", 16);
        term177696 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term177696, term177696.getClass(), "currentTraversal", null);
        term177697 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term177697, term177697.getClass(), "number", 0.0);
        setIntField(term177697, term177697.getClass(), "type", 42);
        setField(term177697, term177697.getClass(), "next", null);
        setField(term177697, term177697.getClass(), "first", null);
        setField(term177697, term177697.getClass(), "last", null);
        setField(term177697, term177697.getClass(), "propListHead", null);
        setIntField(term177697, term177697.getClass(), "sourcePosition", 0);
        setField(term177697, term177697.getClass(), "jsType", null);
        setField(term177697, term177697.getClass(), "parent", null);
        term177698 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term177698, term177698.getClass(), "number", 0.0);
        setIntField(term177698, term177698.getClass(), "type", 16);
        setField(term177698, term177698.getClass(), "next", null);
        setField(term177698, term177698.getClass(), "first", null);
        setField(term177698, term177698.getClass(), "last", null);
        setField(term177698, term177698.getClass(), "propListHead", null);
        setIntField(term177698, term177698.getClass(), "sourcePosition", 0);
        setField(term177698, term177698.getClass(), "jsType", null);
        setField(term177698, term177698.getClass(), "parent", null);
        term177699 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term177699, term177699.getClass(), "number", 0.0);
        setIntField(term177699, term177699.getClass(), "type", 16);
        setField(term177699, term177699.getClass(), "next", null);
        setField(term177699, term177699.getClass(), "first", null);
        setField(term177699, term177699.getClass(), "last", null);
        setField(term177699, term177699.getClass(), "propListHead", null);
        setIntField(term177699, term177699.getClass(), "sourcePosition", 0);
        setField(term177699, term177699.getClass(), "jsType", null);
        setField(term177699, term177699.getClass(), "parent", null);
        term177671 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term177671, term177671.getClass(), "number", 0.0);
        setIntField(term177671, term177671.getClass(), "type", 16);
        setField(term177671, term177671.getClass(), "next", null);
        setField(term177671, term177671.getClass(), "first", null);
        setField(term177671, term177671.getClass(), "last", null);
        setField(term177671, term177671.getClass(), "propListHead", null);
        setIntField(term177671, term177671.getClass(), "sourcePosition", 0);
        setField(term177671, term177671.getClass(), "jsType", null);
        setField(term177671, term177671.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term177476;
        args[1] = term177568;
        args[2] = term177660;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term177384, args);
        assertTrue(recursiveEquals(term177384, term177696));
        assertTrue(recursiveEquals(term177476, term177697));
        assertTrue(recursiveEquals(term177568, term177698));
        assertTrue(recursiveEquals(term177660, term177699));
        assertTrue(recursiveEquals(retValue, term177671));
    }

};


