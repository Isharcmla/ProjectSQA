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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term590374;
     Object term590466;
     Object term591388;
     Object term591389;
     Object term591365;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term590374 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term590466 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term590536 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term590466, term590466.getClass(), "first", term590466);
        setField(term590466, term590466.getClass(), "next", term590536);
        setIntField(term590466, term590466.getClass(), "type", 20);
        term591388 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term591388, term591388.getClass(), "currentTraversal", null);
        term591389 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term591390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term591389, term591389.getClass(), "number", 0.0);
        setIntField(term591389, term591389.getClass(), "type", 20);
        setIntField(term591390, term591390.getClass(), "type", 0);
        setField(term591390, term591390.getClass(), "next", null);
        setField(term591390, term591390.getClass(), "first", null);
        setField(term591390, term591390.getClass(), "last", null);
        setField(term591390, term591390.getClass(), "propListHead", null);
        setIntField(term591390, term591390.getClass(), "sourcePosition", 0);
        setField(term591390, term591390.getClass(), "jsType", null);
        setField(term591390, term591390.getClass(), "parent", null);
        setField(term591389, term591389.getClass(), "next", term591390);
        setField(term591389, term591389.getClass(), "first", term591389);
        setField(term591389, term591389.getClass(), "last", null);
        setField(term591389, term591389.getClass(), "propListHead", null);
        setIntField(term591389, term591389.getClass(), "sourcePosition", 0);
        setField(term591389, term591389.getClass(), "jsType", null);
        setField(term591389, term591389.getClass(), "parent", null);
        term591365 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term591368 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term591365, term591365.getClass(), "number", 0.0);
        setIntField(term591365, term591365.getClass(), "type", 20);
        setIntField(term591368, term591368.getClass(), "type", 0);
        setField(term591368, term591368.getClass(), "next", null);
        setField(term591368, term591368.getClass(), "first", null);
        setField(term591368, term591368.getClass(), "last", null);
        setField(term591368, term591368.getClass(), "propListHead", null);
        setIntField(term591368, term591368.getClass(), "sourcePosition", 0);
        setField(term591368, term591368.getClass(), "jsType", null);
        setField(term591368, term591368.getClass(), "parent", null);
        setField(term591365, term591365.getClass(), "next", term591368);
        setField(term591365, term591365.getClass(), "first", term591365);
        setField(term591365, term591365.getClass(), "last", null);
        setField(term591365, term591365.getClass(), "propListHead", null);
        setIntField(term591365, term591365.getClass(), "sourcePosition", 0);
        setField(term591365, term591365.getClass(), "jsType", null);
        setField(term591365, term591365.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term590466;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term590374, args);
        assertTrue(recursiveEquals(term590374, term591388));
        assertTrue(recursiveEquals(term590466, term591389));
        assertTrue(recursiveEquals(retValue, term591365));
    }

};


