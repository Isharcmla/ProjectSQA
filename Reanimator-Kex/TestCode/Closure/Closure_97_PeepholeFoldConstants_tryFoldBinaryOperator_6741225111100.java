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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term340150;
     Object term340242;
     Object term340610;
     Object term340611;
     Object term340581;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term340150 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term340242 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term340334 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term340426 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term340334, term340334.getClass(), "next", term340426);
        setIntField(term340334, term340334.getClass(), "type", 39);
        setField(term340242, term340242.getClass(), "first", term340334);
        setIntField(term340242, term340242.getClass(), "type", 24);
        term340610 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term340610, term340610.getClass(), "currentTraversal", null);
        term340611 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term340612 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term340613 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term340611, term340611.getClass(), "str", null);
        setIntField(term340611, term340611.getClass(), "type", 24);
        setField(term340611, term340611.getClass(), "next", null);
        setField(term340612, term340612.getClass(), "str", null);
        setIntField(term340612, term340612.getClass(), "type", 39);
        setField(term340613, term340613.getClass(), "str", null);
        setIntField(term340613, term340613.getClass(), "type", 0);
        setField(term340613, term340613.getClass(), "next", null);
        setField(term340613, term340613.getClass(), "first", null);
        setField(term340613, term340613.getClass(), "last", null);
        setField(term340613, term340613.getClass(), "propListHead", null);
        setIntField(term340613, term340613.getClass(), "sourcePosition", 0);
        setField(term340613, term340613.getClass(), "jsType", null);
        setField(term340613, term340613.getClass(), "parent", null);
        setField(term340612, term340612.getClass(), "next", term340613);
        setField(term340612, term340612.getClass(), "first", null);
        setField(term340612, term340612.getClass(), "last", null);
        setField(term340612, term340612.getClass(), "propListHead", null);
        setIntField(term340612, term340612.getClass(), "sourcePosition", 0);
        setField(term340612, term340612.getClass(), "jsType", null);
        setField(term340612, term340612.getClass(), "parent", null);
        setField(term340611, term340611.getClass(), "first", term340612);
        setField(term340611, term340611.getClass(), "last", null);
        setField(term340611, term340611.getClass(), "propListHead", null);
        setIntField(term340611, term340611.getClass(), "sourcePosition", 0);
        setField(term340611, term340611.getClass(), "jsType", null);
        setField(term340611, term340611.getClass(), "parent", null);
        term340581 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term340583 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term340585 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term340581, term340581.getClass(), "str", null);
        setIntField(term340581, term340581.getClass(), "type", 24);
        setField(term340581, term340581.getClass(), "next", null);
        setField(term340583, term340583.getClass(), "str", null);
        setIntField(term340583, term340583.getClass(), "type", 39);
        setField(term340585, term340585.getClass(), "str", null);
        setIntField(term340585, term340585.getClass(), "type", 0);
        setField(term340585, term340585.getClass(), "next", null);
        setField(term340585, term340585.getClass(), "first", null);
        setField(term340585, term340585.getClass(), "last", null);
        setField(term340585, term340585.getClass(), "propListHead", null);
        setIntField(term340585, term340585.getClass(), "sourcePosition", 0);
        setField(term340585, term340585.getClass(), "jsType", null);
        setField(term340585, term340585.getClass(), "parent", null);
        setField(term340583, term340583.getClass(), "next", term340585);
        setField(term340583, term340583.getClass(), "first", null);
        setField(term340583, term340583.getClass(), "last", null);
        setField(term340583, term340583.getClass(), "propListHead", null);
        setIntField(term340583, term340583.getClass(), "sourcePosition", 0);
        setField(term340583, term340583.getClass(), "jsType", null);
        setField(term340583, term340583.getClass(), "parent", null);
        setField(term340581, term340581.getClass(), "first", term340583);
        setField(term340581, term340581.getClass(), "last", null);
        setField(term340581, term340581.getClass(), "propListHead", null);
        setIntField(term340581, term340581.getClass(), "sourcePosition", 0);
        setField(term340581, term340581.getClass(), "jsType", null);
        setField(term340581, term340581.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term340242;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term340150, args);
        assertTrue(recursiveEquals(term340150, term340610));
        assertTrue(recursiveEquals(term340242, term340611));
        assertTrue(recursiveEquals(retValue, term340581));
    }

};


