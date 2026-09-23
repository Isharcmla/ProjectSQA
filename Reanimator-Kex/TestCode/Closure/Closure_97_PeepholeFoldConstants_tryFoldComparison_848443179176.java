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

public class PeepholeFoldConstants_tryFoldComparison_848443179176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33778;
     Object term33870;
     Object term33962;
     Object term34054;
     Object term34116;
     Object term34117;
     Object term34118;
     Object term34119;
     Object term34096;

    public PeepholeFoldConstants_tryFoldComparison_848443179176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33778 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term33870 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term33870, term33870.getClass(), "type", 16);
        term33962 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term33962, term33962.getClass(), "type", 16);
        term34054 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term34116 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term34116, term34116.getClass(), "currentTraversal", null);
        term34117 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term34117, term34117.getClass(), "number", 0.0);
        setIntField(term34117, term34117.getClass(), "type", 16);
        setField(term34117, term34117.getClass(), "next", null);
        setField(term34117, term34117.getClass(), "first", null);
        setField(term34117, term34117.getClass(), "last", null);
        setField(term34117, term34117.getClass(), "propListHead", null);
        setIntField(term34117, term34117.getClass(), "sourcePosition", 0);
        setField(term34117, term34117.getClass(), "jsType", null);
        setField(term34117, term34117.getClass(), "parent", null);
        term34118 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term34118, term34118.getClass(), "number", 0.0);
        setIntField(term34118, term34118.getClass(), "type", 16);
        setField(term34118, term34118.getClass(), "next", null);
        setField(term34118, term34118.getClass(), "first", null);
        setField(term34118, term34118.getClass(), "last", null);
        setField(term34118, term34118.getClass(), "propListHead", null);
        setIntField(term34118, term34118.getClass(), "sourcePosition", 0);
        setField(term34118, term34118.getClass(), "jsType", null);
        setField(term34118, term34118.getClass(), "parent", null);
        term34119 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term34119, term34119.getClass(), "number", 0.0);
        setIntField(term34119, term34119.getClass(), "type", 0);
        setField(term34119, term34119.getClass(), "next", null);
        setField(term34119, term34119.getClass(), "first", null);
        setField(term34119, term34119.getClass(), "last", null);
        setField(term34119, term34119.getClass(), "propListHead", null);
        setIntField(term34119, term34119.getClass(), "sourcePosition", 0);
        setField(term34119, term34119.getClass(), "jsType", null);
        setField(term34119, term34119.getClass(), "parent", null);
        term34096 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term34096, term34096.getClass(), "number", 0.0);
        setIntField(term34096, term34096.getClass(), "type", 16);
        setField(term34096, term34096.getClass(), "next", null);
        setField(term34096, term34096.getClass(), "first", null);
        setField(term34096, term34096.getClass(), "last", null);
        setField(term34096, term34096.getClass(), "propListHead", null);
        setIntField(term34096, term34096.getClass(), "sourcePosition", 0);
        setField(term34096, term34096.getClass(), "jsType", null);
        setField(term34096, term34096.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term33870;
        args[1] = term33962;
        args[2] = term34054;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term33778, args);
        assertTrue(recursiveEquals(term33778, term34116));
        assertTrue(recursiveEquals(term33870, term34117));
        assertTrue(recursiveEquals(term33962, term34118));
        assertTrue(recursiveEquals(term34054, term34119));
        assertTrue(recursiveEquals(retValue, term34096));
    }

};


