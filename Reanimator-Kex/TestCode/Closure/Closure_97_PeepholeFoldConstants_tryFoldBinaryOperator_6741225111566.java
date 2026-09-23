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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term572695;
     Object term572787;
     Object term573099;
     Object term573100;
     Object term573046;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term572695 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term572787 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term572879 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term572971 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term572879, term572879.getClass(), "next", term572971);
        setIntField(term572879, term572879.getClass(), "type", 0);
        setField(term572787, term572787.getClass(), "first", term572879);
        setIntField(term572787, term572787.getClass(), "type", 101);
        setField(term572787, term572787.getClass(), "parent", null);
        term573099 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term573099, term573099.getClass(), "currentTraversal", null);
        term573100 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term573101 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term573102 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term573100, term573100.getClass(), "str", null);
        setIntField(term573100, term573100.getClass(), "type", 101);
        setField(term573100, term573100.getClass(), "next", null);
        setField(term573101, term573101.getClass(), "str", null);
        setIntField(term573101, term573101.getClass(), "type", 0);
        setField(term573102, term573102.getClass(), "str", null);
        setIntField(term573102, term573102.getClass(), "type", 0);
        setField(term573102, term573102.getClass(), "next", null);
        setField(term573102, term573102.getClass(), "first", null);
        setField(term573102, term573102.getClass(), "last", null);
        setField(term573102, term573102.getClass(), "propListHead", null);
        setIntField(term573102, term573102.getClass(), "sourcePosition", 0);
        setField(term573102, term573102.getClass(), "jsType", null);
        setField(term573102, term573102.getClass(), "parent", null);
        setField(term573101, term573101.getClass(), "next", term573102);
        setField(term573101, term573101.getClass(), "first", null);
        setField(term573101, term573101.getClass(), "last", null);
        setField(term573101, term573101.getClass(), "propListHead", null);
        setIntField(term573101, term573101.getClass(), "sourcePosition", 0);
        setField(term573101, term573101.getClass(), "jsType", null);
        setField(term573101, term573101.getClass(), "parent", null);
        setField(term573100, term573100.getClass(), "first", term573101);
        setField(term573100, term573100.getClass(), "last", null);
        setField(term573100, term573100.getClass(), "propListHead", null);
        setIntField(term573100, term573100.getClass(), "sourcePosition", 0);
        setField(term573100, term573100.getClass(), "jsType", null);
        setField(term573100, term573100.getClass(), "parent", null);
        term573046 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term573048 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term573050 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term573046, term573046.getClass(), "str", null);
        setIntField(term573046, term573046.getClass(), "type", 101);
        setField(term573046, term573046.getClass(), "next", null);
        setField(term573048, term573048.getClass(), "str", null);
        setIntField(term573048, term573048.getClass(), "type", 0);
        setField(term573050, term573050.getClass(), "str", null);
        setIntField(term573050, term573050.getClass(), "type", 0);
        setField(term573050, term573050.getClass(), "next", null);
        setField(term573050, term573050.getClass(), "first", null);
        setField(term573050, term573050.getClass(), "last", null);
        setField(term573050, term573050.getClass(), "propListHead", null);
        setIntField(term573050, term573050.getClass(), "sourcePosition", 0);
        setField(term573050, term573050.getClass(), "jsType", null);
        setField(term573050, term573050.getClass(), "parent", null);
        setField(term573048, term573048.getClass(), "next", term573050);
        setField(term573048, term573048.getClass(), "first", null);
        setField(term573048, term573048.getClass(), "last", null);
        setField(term573048, term573048.getClass(), "propListHead", null);
        setIntField(term573048, term573048.getClass(), "sourcePosition", 0);
        setField(term573048, term573048.getClass(), "jsType", null);
        setField(term573048, term573048.getClass(), "parent", null);
        setField(term573046, term573046.getClass(), "first", term573048);
        setField(term573046, term573046.getClass(), "last", null);
        setField(term573046, term573046.getClass(), "propListHead", null);
        setIntField(term573046, term573046.getClass(), "sourcePosition", 0);
        setField(term573046, term573046.getClass(), "jsType", null);
        setField(term573046, term573046.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term572787;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term572695, args);
        assertTrue(recursiveEquals(term572695, term573099));
        assertTrue(recursiveEquals(term572787, term573100));
        assertTrue(recursiveEquals(retValue, term573046));
    }

};


