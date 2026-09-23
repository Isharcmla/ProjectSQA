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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511778 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175852;
     Object term175944;
     Object term176105;
     Object term176106;
     Object term176075;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511778() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175852 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term175944 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term176014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term175944, term175944.getClass(), "first", term175944);
        setField(term175944, term175944.getClass(), "next", term176014);
        setIntField(term175944, term175944.getClass(), "type", 15);
        term176105 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term176105, term176105.getClass(), "currentTraversal", null);
        term176106 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term176107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term176106, term176106.getClass(), "number", 0.0);
        setIntField(term176106, term176106.getClass(), "type", 15);
        setIntField(term176107, term176107.getClass(), "type", 0);
        setField(term176107, term176107.getClass(), "next", null);
        setField(term176107, term176107.getClass(), "first", null);
        setField(term176107, term176107.getClass(), "last", null);
        setField(term176107, term176107.getClass(), "propListHead", null);
        setIntField(term176107, term176107.getClass(), "sourcePosition", 0);
        setField(term176107, term176107.getClass(), "jsType", null);
        setField(term176107, term176107.getClass(), "parent", null);
        setField(term176106, term176106.getClass(), "next", term176107);
        setField(term176106, term176106.getClass(), "first", term176106);
        setField(term176106, term176106.getClass(), "last", null);
        setField(term176106, term176106.getClass(), "propListHead", null);
        setIntField(term176106, term176106.getClass(), "sourcePosition", 0);
        setField(term176106, term176106.getClass(), "jsType", null);
        setField(term176106, term176106.getClass(), "parent", null);
        term176075 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term176078 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term176075, term176075.getClass(), "number", 0.0);
        setIntField(term176075, term176075.getClass(), "type", 15);
        setIntField(term176078, term176078.getClass(), "type", 0);
        setField(term176078, term176078.getClass(), "next", null);
        setField(term176078, term176078.getClass(), "first", null);
        setField(term176078, term176078.getClass(), "last", null);
        setField(term176078, term176078.getClass(), "propListHead", null);
        setIntField(term176078, term176078.getClass(), "sourcePosition", 0);
        setField(term176078, term176078.getClass(), "jsType", null);
        setField(term176078, term176078.getClass(), "parent", null);
        setField(term176075, term176075.getClass(), "next", term176078);
        setField(term176075, term176075.getClass(), "first", term176075);
        setField(term176075, term176075.getClass(), "last", null);
        setField(term176075, term176075.getClass(), "propListHead", null);
        setIntField(term176075, term176075.getClass(), "sourcePosition", 0);
        setField(term176075, term176075.getClass(), "jsType", null);
        setField(term176075, term176075.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term175944;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term175852, args);
        assertTrue(recursiveEquals(term175852, term176105));
        assertTrue(recursiveEquals(term175944, term176106));
        assertTrue(recursiveEquals(retValue, term176075));
    }

};


