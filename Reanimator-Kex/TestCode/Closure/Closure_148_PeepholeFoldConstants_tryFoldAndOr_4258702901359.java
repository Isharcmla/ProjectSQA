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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term331229;
     Object term331367;
     Object term331800;
     Object term331801;
     Object term331802;
     Object term331771;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term331229 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term331367 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term331367, term331367.getClass(), "parent", null);
        setIntField(term331367, term331367.getClass(), "type", 64);
        term331800 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term331800, term331800.getClass(), "currentTraversal", null);
        term331801 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term331801, term331801.getClass(), "number", 0.0);
        setIntField(term331801, term331801.getClass(), "type", 64);
        setField(term331801, term331801.getClass(), "next", null);
        setField(term331801, term331801.getClass(), "first", null);
        setField(term331801, term331801.getClass(), "last", null);
        setField(term331801, term331801.getClass(), "propListHead", null);
        setIntField(term331801, term331801.getClass(), "sourcePosition", 0);
        setField(term331801, term331801.getClass(), "jsType", null);
        setField(term331801, term331801.getClass(), "parent", null);
        term331802 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term331802, term331802.getClass(), "number", 0.0);
        setIntField(term331802, term331802.getClass(), "type", 64);
        setField(term331802, term331802.getClass(), "next", null);
        setField(term331802, term331802.getClass(), "first", null);
        setField(term331802, term331802.getClass(), "last", null);
        setField(term331802, term331802.getClass(), "propListHead", null);
        setIntField(term331802, term331802.getClass(), "sourcePosition", 0);
        setField(term331802, term331802.getClass(), "jsType", null);
        setField(term331802, term331802.getClass(), "parent", null);
        term331771 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term331771, term331771.getClass(), "number", 0.0);
        setIntField(term331771, term331771.getClass(), "type", 64);
        setField(term331771, term331771.getClass(), "next", null);
        setField(term331771, term331771.getClass(), "first", null);
        setField(term331771, term331771.getClass(), "last", null);
        setField(term331771, term331771.getClass(), "propListHead", null);
        setIntField(term331771, term331771.getClass(), "sourcePosition", 0);
        setField(term331771, term331771.getClass(), "jsType", null);
        setField(term331771, term331771.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term331367;
        args[1] = term331367;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term331229, args);
        assertTrue(recursiveEquals(term331229, term331800));
        assertTrue(recursiveEquals(term331367, term331801));
        assertTrue(recursiveEquals(term331367, term331802));
        assertTrue(recursiveEquals(retValue, term331771));
    }

};


