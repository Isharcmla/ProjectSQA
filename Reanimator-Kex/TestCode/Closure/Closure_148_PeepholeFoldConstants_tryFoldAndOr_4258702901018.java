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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238503;
     Object term238641;
     Object term238733;
     Object term238799;
     Object term238800;
     Object term238801;
     Object term238802;
     Object term238764;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term238503 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term238641 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term238641, term238641.getClass(), "parent", null);
        setIntField(term238641, term238641.getClass(), "type", 0);
        term238733 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term238799 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term238799, term238799.getClass(), "currentTraversal", null);
        term238800 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term238800, term238800.getClass(), "str", null);
        setIntField(term238800, term238800.getClass(), "type", 0);
        setField(term238800, term238800.getClass(), "next", null);
        setField(term238800, term238800.getClass(), "first", null);
        setField(term238800, term238800.getClass(), "last", null);
        setField(term238800, term238800.getClass(), "propListHead", null);
        setIntField(term238800, term238800.getClass(), "sourcePosition", 0);
        setField(term238800, term238800.getClass(), "jsType", null);
        setField(term238800, term238800.getClass(), "parent", null);
        term238801 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term238801, term238801.getClass(), "str", null);
        setIntField(term238801, term238801.getClass(), "type", 0);
        setField(term238801, term238801.getClass(), "next", null);
        setField(term238801, term238801.getClass(), "first", null);
        setField(term238801, term238801.getClass(), "last", null);
        setField(term238801, term238801.getClass(), "propListHead", null);
        setIntField(term238801, term238801.getClass(), "sourcePosition", 0);
        setField(term238801, term238801.getClass(), "jsType", null);
        setField(term238801, term238801.getClass(), "parent", null);
        term238802 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term238802, term238802.getClass(), "str", null);
        setIntField(term238802, term238802.getClass(), "type", 0);
        setField(term238802, term238802.getClass(), "next", null);
        setField(term238802, term238802.getClass(), "first", null);
        setField(term238802, term238802.getClass(), "last", null);
        setField(term238802, term238802.getClass(), "propListHead", null);
        setIntField(term238802, term238802.getClass(), "sourcePosition", 0);
        setField(term238802, term238802.getClass(), "jsType", null);
        setField(term238802, term238802.getClass(), "parent", null);
        term238764 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term238764, term238764.getClass(), "str", null);
        setIntField(term238764, term238764.getClass(), "type", 0);
        setField(term238764, term238764.getClass(), "next", null);
        setField(term238764, term238764.getClass(), "first", null);
        setField(term238764, term238764.getClass(), "last", null);
        setField(term238764, term238764.getClass(), "propListHead", null);
        setIntField(term238764, term238764.getClass(), "sourcePosition", 0);
        setField(term238764, term238764.getClass(), "jsType", null);
        setField(term238764, term238764.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term238641;
        args[1] = term238641;
        args[2] = term238733;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term238503, args);
        assertTrue(recursiveEquals(term238503, term238799));
        assertTrue(recursiveEquals(term238641, term238800));
        assertTrue(recursiveEquals(term238641, term238801));
        assertTrue(recursiveEquals(term238733, term238802));
        assertTrue(recursiveEquals(retValue, term238764));
    }

};


