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

public class PeepholeFoldConstants_tryFoldComparison_8484431791849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term713104;
     Object term713196;
     Object term713288;
     Object term713380;
     Object term713868;
     Object term713869;
     Object term713870;
     Object term713871;
     Object term713844;

    public PeepholeFoldConstants_tryFoldComparison_8484431791849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term713104 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term713196 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term713196, term713196.getClass(), "type", 16);
        term713288 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term713288, term713288.getClass(), "type", 42);
        term713380 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term713380, term713380.getClass(), "type", 16);
        term713868 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term713868, term713868.getClass(), "currentTraversal", null);
        term713869 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term713869, term713869.getClass(), "number", 0.0);
        setIntField(term713869, term713869.getClass(), "type", 42);
        setField(term713869, term713869.getClass(), "next", null);
        setField(term713869, term713869.getClass(), "first", null);
        setField(term713869, term713869.getClass(), "last", null);
        setField(term713869, term713869.getClass(), "propListHead", null);
        setIntField(term713869, term713869.getClass(), "sourcePosition", 0);
        setField(term713869, term713869.getClass(), "jsType", null);
        setField(term713869, term713869.getClass(), "parent", null);
        term713870 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term713870, term713870.getClass(), "number", 0.0);
        setIntField(term713870, term713870.getClass(), "type", 16);
        setField(term713870, term713870.getClass(), "next", null);
        setField(term713870, term713870.getClass(), "first", null);
        setField(term713870, term713870.getClass(), "last", null);
        setField(term713870, term713870.getClass(), "propListHead", null);
        setIntField(term713870, term713870.getClass(), "sourcePosition", 0);
        setField(term713870, term713870.getClass(), "jsType", null);
        setField(term713870, term713870.getClass(), "parent", null);
        term713871 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term713871, term713871.getClass(), "str", null);
        setIntField(term713871, term713871.getClass(), "type", 16);
        setField(term713871, term713871.getClass(), "next", null);
        setField(term713871, term713871.getClass(), "first", null);
        setField(term713871, term713871.getClass(), "last", null);
        setField(term713871, term713871.getClass(), "propListHead", null);
        setIntField(term713871, term713871.getClass(), "sourcePosition", 0);
        setField(term713871, term713871.getClass(), "jsType", null);
        setField(term713871, term713871.getClass(), "parent", null);
        term713844 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term713844, term713844.getClass(), "number", 0.0);
        setIntField(term713844, term713844.getClass(), "type", 16);
        setField(term713844, term713844.getClass(), "next", null);
        setField(term713844, term713844.getClass(), "first", null);
        setField(term713844, term713844.getClass(), "last", null);
        setField(term713844, term713844.getClass(), "propListHead", null);
        setIntField(term713844, term713844.getClass(), "sourcePosition", 0);
        setField(term713844, term713844.getClass(), "jsType", null);
        setField(term713844, term713844.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term713196;
        args[1] = term713288;
        args[2] = term713380;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term713104, args);
        assertTrue(recursiveEquals(term713104, term713868));
        assertTrue(recursiveEquals(term713196, term713869));
        assertTrue(recursiveEquals(term713288, term713870));
        assertTrue(recursiveEquals(term713380, term713871));
        assertTrue(recursiveEquals(retValue, term713844));
    }

};


