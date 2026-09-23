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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term828116;
     Object term828208;
     Object term828300;
     Object term828333;
     Object term828334;
     Object term828335;
     Object term828301;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term828116 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term828208 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term828208, term828208.getClass(), "parent", null);
        setIntField(term828208, term828208.getClass(), "type", 64);
        term828300 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term828300, term828300.getClass(), "type", 64);
        term828333 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term828333, term828333.getClass(), "currentTraversal", null);
        term828334 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term828334, term828334.getClass(), "str", null);
        setIntField(term828334, term828334.getClass(), "type", 64);
        setField(term828334, term828334.getClass(), "next", null);
        setField(term828334, term828334.getClass(), "first", null);
        setField(term828334, term828334.getClass(), "last", null);
        setField(term828334, term828334.getClass(), "propListHead", null);
        setIntField(term828334, term828334.getClass(), "sourcePosition", 0);
        setField(term828334, term828334.getClass(), "jsType", null);
        setField(term828334, term828334.getClass(), "parent", null);
        term828335 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term828335, term828335.getClass(), "number", 0.0);
        setIntField(term828335, term828335.getClass(), "type", 64);
        setField(term828335, term828335.getClass(), "next", null);
        setField(term828335, term828335.getClass(), "first", null);
        setField(term828335, term828335.getClass(), "last", null);
        setField(term828335, term828335.getClass(), "propListHead", null);
        setIntField(term828335, term828335.getClass(), "sourcePosition", 0);
        setField(term828335, term828335.getClass(), "jsType", null);
        setField(term828335, term828335.getClass(), "parent", null);
        term828301 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term828301, term828301.getClass(), "str", null);
        setIntField(term828301, term828301.getClass(), "type", 64);
        setField(term828301, term828301.getClass(), "next", null);
        setField(term828301, term828301.getClass(), "first", null);
        setField(term828301, term828301.getClass(), "last", null);
        setField(term828301, term828301.getClass(), "propListHead", null);
        setIntField(term828301, term828301.getClass(), "sourcePosition", 0);
        setField(term828301, term828301.getClass(), "jsType", null);
        setField(term828301, term828301.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term828208;
        args[1] = term828300;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term828116, args);
        assertTrue(recursiveEquals(term828116, term828333));
        assertTrue(recursiveEquals(term828208, term828334));
        assertTrue(recursiveEquals(term828300, term828335));
        assertTrue(recursiveEquals(retValue, term828301));
    }

};


