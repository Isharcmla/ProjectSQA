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

public class PeepholeFoldConstants_tryFoldComparison_8484431791296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term311063;
     Object term311155;
     Object term311247;
     Object term311339;
     Object term311395;
     Object term311396;
     Object term311397;
     Object term311398;
     Object term311371;

    public PeepholeFoldConstants_tryFoldComparison_8484431791296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term311063 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term311155 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term311155, term311155.getClass(), "type", 14);
        term311247 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term311247, term311247.getClass(), "type", 42);
        term311339 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term311339, term311339.getClass(), "type", 42);
        term311395 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term311395, term311395.getClass(), "currentTraversal", null);
        term311396 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term311396, term311396.getClass(), "number", 0.0);
        setIntField(term311396, term311396.getClass(), "type", 42);
        setField(term311396, term311396.getClass(), "next", null);
        setField(term311396, term311396.getClass(), "first", null);
        setField(term311396, term311396.getClass(), "last", null);
        setField(term311396, term311396.getClass(), "propListHead", null);
        setIntField(term311396, term311396.getClass(), "sourcePosition", 0);
        setField(term311396, term311396.getClass(), "jsType", null);
        setField(term311396, term311396.getClass(), "parent", null);
        term311397 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term311397, term311397.getClass(), "number", 0.0);
        setIntField(term311397, term311397.getClass(), "type", 14);
        setField(term311397, term311397.getClass(), "next", null);
        setField(term311397, term311397.getClass(), "first", null);
        setField(term311397, term311397.getClass(), "last", null);
        setField(term311397, term311397.getClass(), "propListHead", null);
        setIntField(term311397, term311397.getClass(), "sourcePosition", 0);
        setField(term311397, term311397.getClass(), "jsType", null);
        setField(term311397, term311397.getClass(), "parent", null);
        term311398 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term311398, term311398.getClass(), "number", 0.0);
        setIntField(term311398, term311398.getClass(), "type", 42);
        setField(term311398, term311398.getClass(), "next", null);
        setField(term311398, term311398.getClass(), "first", null);
        setField(term311398, term311398.getClass(), "last", null);
        setField(term311398, term311398.getClass(), "propListHead", null);
        setIntField(term311398, term311398.getClass(), "sourcePosition", 0);
        setField(term311398, term311398.getClass(), "jsType", null);
        setField(term311398, term311398.getClass(), "parent", null);
        term311371 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term311371, term311371.getClass(), "number", 0.0);
        setIntField(term311371, term311371.getClass(), "type", 14);
        setField(term311371, term311371.getClass(), "next", null);
        setField(term311371, term311371.getClass(), "first", null);
        setField(term311371, term311371.getClass(), "last", null);
        setField(term311371, term311371.getClass(), "propListHead", null);
        setIntField(term311371, term311371.getClass(), "sourcePosition", 0);
        setField(term311371, term311371.getClass(), "jsType", null);
        setField(term311371, term311371.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term311155;
        args[1] = term311247;
        args[2] = term311339;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term311063, args);
        assertTrue(recursiveEquals(term311063, term311395));
        assertTrue(recursiveEquals(term311155, term311396));
        assertTrue(recursiveEquals(term311247, term311397));
        assertTrue(recursiveEquals(term311339, term311398));
        assertTrue(recursiveEquals(retValue, term311371));
    }

};


