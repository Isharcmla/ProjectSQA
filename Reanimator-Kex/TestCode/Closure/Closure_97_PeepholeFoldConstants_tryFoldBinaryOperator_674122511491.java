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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126597;
     Object term126689;
     Object term133769;
     Object term133770;
     Object term133728;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126597 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term126689 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term126781 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term126873 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term126781, term126781.getClass(), "next", term126873);
        setField(term126689, term126689.getClass(), "first", term126781);
        setIntField(term126689, term126689.getClass(), "type", 17);
        term133769 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term133769, term133769.getClass(), "currentTraversal", null);
        term133770 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term133771 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term133772 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term133770, term133770.getClass(), "number", 0.0);
        setIntField(term133770, term133770.getClass(), "type", 17);
        setField(term133770, term133770.getClass(), "next", null);
        setDoubleField(term133771, term133771.getClass(), "number", 0.0);
        setIntField(term133771, term133771.getClass(), "type", 0);
        setDoubleField(term133772, term133772.getClass(), "number", 0.0);
        setIntField(term133772, term133772.getClass(), "type", 0);
        setField(term133772, term133772.getClass(), "next", null);
        setField(term133772, term133772.getClass(), "first", null);
        setField(term133772, term133772.getClass(), "last", null);
        setField(term133772, term133772.getClass(), "propListHead", null);
        setIntField(term133772, term133772.getClass(), "sourcePosition", 0);
        setField(term133772, term133772.getClass(), "jsType", null);
        setField(term133772, term133772.getClass(), "parent", null);
        setField(term133771, term133771.getClass(), "next", term133772);
        setField(term133771, term133771.getClass(), "first", null);
        setField(term133771, term133771.getClass(), "last", null);
        setField(term133771, term133771.getClass(), "propListHead", null);
        setIntField(term133771, term133771.getClass(), "sourcePosition", 0);
        setField(term133771, term133771.getClass(), "jsType", null);
        setField(term133771, term133771.getClass(), "parent", null);
        setField(term133770, term133770.getClass(), "first", term133771);
        setField(term133770, term133770.getClass(), "last", null);
        setField(term133770, term133770.getClass(), "propListHead", null);
        setIntField(term133770, term133770.getClass(), "sourcePosition", 0);
        setField(term133770, term133770.getClass(), "jsType", null);
        setField(term133770, term133770.getClass(), "parent", null);
        term133728 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term133731 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term133734 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term133728, term133728.getClass(), "number", 0.0);
        setIntField(term133728, term133728.getClass(), "type", 17);
        setField(term133728, term133728.getClass(), "next", null);
        setDoubleField(term133731, term133731.getClass(), "number", 0.0);
        setIntField(term133731, term133731.getClass(), "type", 0);
        setDoubleField(term133734, term133734.getClass(), "number", 0.0);
        setIntField(term133734, term133734.getClass(), "type", 0);
        setField(term133734, term133734.getClass(), "next", null);
        setField(term133734, term133734.getClass(), "first", null);
        setField(term133734, term133734.getClass(), "last", null);
        setField(term133734, term133734.getClass(), "propListHead", null);
        setIntField(term133734, term133734.getClass(), "sourcePosition", 0);
        setField(term133734, term133734.getClass(), "jsType", null);
        setField(term133734, term133734.getClass(), "parent", null);
        setField(term133731, term133731.getClass(), "next", term133734);
        setField(term133731, term133731.getClass(), "first", null);
        setField(term133731, term133731.getClass(), "last", null);
        setField(term133731, term133731.getClass(), "propListHead", null);
        setIntField(term133731, term133731.getClass(), "sourcePosition", 0);
        setField(term133731, term133731.getClass(), "jsType", null);
        setField(term133731, term133731.getClass(), "parent", null);
        setField(term133728, term133728.getClass(), "first", term133731);
        setField(term133728, term133728.getClass(), "last", null);
        setField(term133728, term133728.getClass(), "propListHead", null);
        setIntField(term133728, term133728.getClass(), "sourcePosition", 0);
        setField(term133728, term133728.getClass(), "jsType", null);
        setField(term133728, term133728.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term126689;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term126597, args);
        assertTrue(recursiveEquals(term126597, term133769));
        assertTrue(recursiveEquals(term126689, term133770));
        assertTrue(recursiveEquals(retValue, term133728));
    }

};


