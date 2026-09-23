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

public class PeepholeFoldConstants_tryFoldInstanceof_18306864081295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term310732;
     Object term310824;
     Object term310916;
     Object term311358;
     Object term311359;
     Object term311360;
     Object term311341;

    public PeepholeFoldConstants_tryFoldInstanceof_18306864081295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term310732 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term310824 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term310824, term310824.getClass(), "type", 52);
        term310916 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term311358 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term311358, term311358.getClass(), "currentTraversal", null);
        term311359 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term311359, term311359.getClass(), "number", 0.0);
        setIntField(term311359, term311359.getClass(), "type", 52);
        setField(term311359, term311359.getClass(), "next", null);
        setField(term311359, term311359.getClass(), "first", null);
        setField(term311359, term311359.getClass(), "last", null);
        setField(term311359, term311359.getClass(), "propListHead", null);
        setIntField(term311359, term311359.getClass(), "sourcePosition", 0);
        setField(term311359, term311359.getClass(), "jsType", null);
        setField(term311359, term311359.getClass(), "parent", null);
        term311360 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term311360, term311360.getClass(), "number", 0.0);
        setIntField(term311360, term311360.getClass(), "type", 0);
        setField(term311360, term311360.getClass(), "next", null);
        setField(term311360, term311360.getClass(), "first", null);
        setField(term311360, term311360.getClass(), "last", null);
        setField(term311360, term311360.getClass(), "propListHead", null);
        setIntField(term311360, term311360.getClass(), "sourcePosition", 0);
        setField(term311360, term311360.getClass(), "jsType", null);
        setField(term311360, term311360.getClass(), "parent", null);
        term311341 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term311341, term311341.getClass(), "number", 0.0);
        setIntField(term311341, term311341.getClass(), "type", 52);
        setField(term311341, term311341.getClass(), "next", null);
        setField(term311341, term311341.getClass(), "first", null);
        setField(term311341, term311341.getClass(), "last", null);
        setField(term311341, term311341.getClass(), "propListHead", null);
        setIntField(term311341, term311341.getClass(), "sourcePosition", 0);
        setField(term311341, term311341.getClass(), "jsType", null);
        setField(term311341, term311341.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term310824;
        args[1] = term310916;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldInstanceof", argTypes, term310732, args);
        assertTrue(recursiveEquals(term310732, term311358));
        assertTrue(recursiveEquals(term310824, term311359));
        assertTrue(recursiveEquals(term310916, term311360));
        assertTrue(recursiveEquals(retValue, term311341));
    }

};


