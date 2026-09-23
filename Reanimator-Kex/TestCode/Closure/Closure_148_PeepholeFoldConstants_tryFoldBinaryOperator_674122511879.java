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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203685;
     Object term203777;
     Object term204192;
     Object term204193;
     Object term204165;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term203685 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term203777 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term203869 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term203777, term203777.getClass(), "first", term203777);
        setField(term203777, term203777.getClass(), "next", term203869);
        setIntField(term203777, term203777.getClass(), "type", 33);
        term204192 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term204192, term204192.getClass(), "currentTraversal", null);
        term204193 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term204194 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term204193, term204193.getClass(), "number", 0.0);
        setIntField(term204193, term204193.getClass(), "type", 33);
        setField(term204194, term204194.getClass(), "str", null);
        setIntField(term204194, term204194.getClass(), "type", 0);
        setField(term204194, term204194.getClass(), "next", null);
        setField(term204194, term204194.getClass(), "first", null);
        setField(term204194, term204194.getClass(), "last", null);
        setField(term204194, term204194.getClass(), "propListHead", null);
        setIntField(term204194, term204194.getClass(), "sourcePosition", 0);
        setField(term204194, term204194.getClass(), "jsType", null);
        setField(term204194, term204194.getClass(), "parent", null);
        setField(term204193, term204193.getClass(), "next", term204194);
        setField(term204193, term204193.getClass(), "first", term204193);
        setField(term204193, term204193.getClass(), "last", null);
        setField(term204193, term204193.getClass(), "propListHead", null);
        setIntField(term204193, term204193.getClass(), "sourcePosition", 0);
        setField(term204193, term204193.getClass(), "jsType", null);
        setField(term204193, term204193.getClass(), "parent", null);
        term204165 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term204168 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term204165, term204165.getClass(), "number", 0.0);
        setIntField(term204165, term204165.getClass(), "type", 33);
        setField(term204168, term204168.getClass(), "str", null);
        setIntField(term204168, term204168.getClass(), "type", 0);
        setField(term204168, term204168.getClass(), "next", null);
        setField(term204168, term204168.getClass(), "first", null);
        setField(term204168, term204168.getClass(), "last", null);
        setField(term204168, term204168.getClass(), "propListHead", null);
        setIntField(term204168, term204168.getClass(), "sourcePosition", 0);
        setField(term204168, term204168.getClass(), "jsType", null);
        setField(term204168, term204168.getClass(), "parent", null);
        setField(term204165, term204165.getClass(), "next", term204168);
        setField(term204165, term204165.getClass(), "first", term204165);
        setField(term204165, term204165.getClass(), "last", null);
        setField(term204165, term204165.getClass(), "propListHead", null);
        setIntField(term204165, term204165.getClass(), "sourcePosition", 0);
        setField(term204165, term204165.getClass(), "jsType", null);
        setField(term204165, term204165.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term203777;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term203685, args);
        assertTrue(recursiveEquals(term203685, term204192));
        assertTrue(recursiveEquals(term203777, term204193));
        assertTrue(recursiveEquals(retValue, term204165));
    }

};


