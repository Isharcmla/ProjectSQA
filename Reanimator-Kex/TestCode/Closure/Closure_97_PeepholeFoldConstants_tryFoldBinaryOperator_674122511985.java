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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511985 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term311401;
     Object term311493;
     Object term312134;
     Object term312135;
     Object term312098;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term311401 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term311493 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term311585 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term311677 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term311585, term311585.getClass(), "next", term311677);
        setIntField(term311585, term311585.getClass(), "type", 39);
        setField(term311493, term311493.getClass(), "first", term311585);
        setIntField(term311493, term311493.getClass(), "type", 24);
        term312134 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term312134, term312134.getClass(), "currentTraversal", null);
        term312135 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term312136 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term312137 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term312135, term312135.getClass(), "number", 0.0);
        setIntField(term312135, term312135.getClass(), "type", 24);
        setField(term312135, term312135.getClass(), "next", null);
        setDoubleField(term312136, term312136.getClass(), "number", 0.0);
        setIntField(term312136, term312136.getClass(), "type", 39);
        setDoubleField(term312137, term312137.getClass(), "number", 0.0);
        setIntField(term312137, term312137.getClass(), "type", 0);
        setField(term312137, term312137.getClass(), "next", null);
        setField(term312137, term312137.getClass(), "first", null);
        setField(term312137, term312137.getClass(), "last", null);
        setField(term312137, term312137.getClass(), "propListHead", null);
        setIntField(term312137, term312137.getClass(), "sourcePosition", 0);
        setField(term312137, term312137.getClass(), "jsType", null);
        setField(term312137, term312137.getClass(), "parent", null);
        setField(term312136, term312136.getClass(), "next", term312137);
        setField(term312136, term312136.getClass(), "first", null);
        setField(term312136, term312136.getClass(), "last", null);
        setField(term312136, term312136.getClass(), "propListHead", null);
        setIntField(term312136, term312136.getClass(), "sourcePosition", 0);
        setField(term312136, term312136.getClass(), "jsType", null);
        setField(term312136, term312136.getClass(), "parent", null);
        setField(term312135, term312135.getClass(), "first", term312136);
        setField(term312135, term312135.getClass(), "last", null);
        setField(term312135, term312135.getClass(), "propListHead", null);
        setIntField(term312135, term312135.getClass(), "sourcePosition", 0);
        setField(term312135, term312135.getClass(), "jsType", null);
        setField(term312135, term312135.getClass(), "parent", null);
        term312098 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term312101 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term312104 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term312098, term312098.getClass(), "number", 0.0);
        setIntField(term312098, term312098.getClass(), "type", 24);
        setField(term312098, term312098.getClass(), "next", null);
        setDoubleField(term312101, term312101.getClass(), "number", 0.0);
        setIntField(term312101, term312101.getClass(), "type", 39);
        setDoubleField(term312104, term312104.getClass(), "number", 0.0);
        setIntField(term312104, term312104.getClass(), "type", 0);
        setField(term312104, term312104.getClass(), "next", null);
        setField(term312104, term312104.getClass(), "first", null);
        setField(term312104, term312104.getClass(), "last", null);
        setField(term312104, term312104.getClass(), "propListHead", null);
        setIntField(term312104, term312104.getClass(), "sourcePosition", 0);
        setField(term312104, term312104.getClass(), "jsType", null);
        setField(term312104, term312104.getClass(), "parent", null);
        setField(term312101, term312101.getClass(), "next", term312104);
        setField(term312101, term312101.getClass(), "first", null);
        setField(term312101, term312101.getClass(), "last", null);
        setField(term312101, term312101.getClass(), "propListHead", null);
        setIntField(term312101, term312101.getClass(), "sourcePosition", 0);
        setField(term312101, term312101.getClass(), "jsType", null);
        setField(term312101, term312101.getClass(), "parent", null);
        setField(term312098, term312098.getClass(), "first", term312101);
        setField(term312098, term312098.getClass(), "last", null);
        setField(term312098, term312098.getClass(), "propListHead", null);
        setIntField(term312098, term312098.getClass(), "sourcePosition", 0);
        setField(term312098, term312098.getClass(), "jsType", null);
        setField(term312098, term312098.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term311493;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term311401, args);
        assertTrue(recursiveEquals(term311401, term312134));
        assertTrue(recursiveEquals(term311493, term312135));
        assertTrue(recursiveEquals(retValue, term312098));
    }

};


