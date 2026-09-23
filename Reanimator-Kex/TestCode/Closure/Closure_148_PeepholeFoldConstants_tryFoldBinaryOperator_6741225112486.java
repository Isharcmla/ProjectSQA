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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term697135;
     Object term697227;
     Object term697656;
     Object term697657;
     Object term697587;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term697135 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term697227 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term697297 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term697389 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term697481 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term697389, term697389.getClass(), "type", 64);
        setField(term697297, term697297.getClass(), "next", term697389);
        setIntField(term697297, term697297.getClass(), "type", 0);
        setField(term697227, term697227.getClass(), "first", term697297);
        setIntField(term697227, term697227.getClass(), "type", 101);
        setIntField(term697481, term697481.getClass(), "type", 98);
        setField(term697227, term697227.getClass(), "parent", term697481);
        term697656 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term697656, term697656.getClass(), "currentTraversal", null);
        term697657 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term697658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term697659 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term697660 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term697657, term697657.getClass(), "str", null);
        setIntField(term697657, term697657.getClass(), "type", 101);
        setField(term697657, term697657.getClass(), "next", null);
        setIntField(term697658, term697658.getClass(), "type", 0);
        setField(term697659, term697659.getClass(), "str", null);
        setIntField(term697659, term697659.getClass(), "type", 64);
        setField(term697659, term697659.getClass(), "next", null);
        setField(term697659, term697659.getClass(), "first", null);
        setField(term697659, term697659.getClass(), "last", null);
        setField(term697659, term697659.getClass(), "propListHead", null);
        setIntField(term697659, term697659.getClass(), "sourcePosition", 0);
        setField(term697659, term697659.getClass(), "jsType", null);
        setField(term697659, term697659.getClass(), "parent", null);
        setField(term697658, term697658.getClass(), "next", term697659);
        setField(term697658, term697658.getClass(), "first", null);
        setField(term697658, term697658.getClass(), "last", null);
        setField(term697658, term697658.getClass(), "propListHead", null);
        setIntField(term697658, term697658.getClass(), "sourcePosition", 0);
        setField(term697658, term697658.getClass(), "jsType", null);
        setField(term697658, term697658.getClass(), "parent", null);
        setField(term697657, term697657.getClass(), "first", term697658);
        setField(term697657, term697657.getClass(), "last", null);
        setField(term697657, term697657.getClass(), "propListHead", null);
        setIntField(term697657, term697657.getClass(), "sourcePosition", 0);
        setField(term697657, term697657.getClass(), "jsType", null);
        setField(term697660, term697660.getClass(), "str", null);
        setIntField(term697660, term697660.getClass(), "type", 98);
        setField(term697660, term697660.getClass(), "next", null);
        setField(term697660, term697660.getClass(), "first", null);
        setField(term697660, term697660.getClass(), "last", null);
        setField(term697660, term697660.getClass(), "propListHead", null);
        setIntField(term697660, term697660.getClass(), "sourcePosition", 0);
        setField(term697660, term697660.getClass(), "jsType", null);
        setField(term697660, term697660.getClass(), "parent", null);
        setField(term697657, term697657.getClass(), "parent", term697660);
        term697587 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term697589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term697591 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term697596 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term697587, term697587.getClass(), "str", null);
        setIntField(term697587, term697587.getClass(), "type", 101);
        setField(term697587, term697587.getClass(), "next", null);
        setIntField(term697589, term697589.getClass(), "type", 0);
        setField(term697591, term697591.getClass(), "str", null);
        setIntField(term697591, term697591.getClass(), "type", 64);
        setField(term697591, term697591.getClass(), "next", null);
        setField(term697591, term697591.getClass(), "first", null);
        setField(term697591, term697591.getClass(), "last", null);
        setField(term697591, term697591.getClass(), "propListHead", null);
        setIntField(term697591, term697591.getClass(), "sourcePosition", 0);
        setField(term697591, term697591.getClass(), "jsType", null);
        setField(term697591, term697591.getClass(), "parent", null);
        setField(term697589, term697589.getClass(), "next", term697591);
        setField(term697589, term697589.getClass(), "first", null);
        setField(term697589, term697589.getClass(), "last", null);
        setField(term697589, term697589.getClass(), "propListHead", null);
        setIntField(term697589, term697589.getClass(), "sourcePosition", 0);
        setField(term697589, term697589.getClass(), "jsType", null);
        setField(term697589, term697589.getClass(), "parent", null);
        setField(term697587, term697587.getClass(), "first", term697589);
        setField(term697587, term697587.getClass(), "last", null);
        setField(term697587, term697587.getClass(), "propListHead", null);
        setIntField(term697587, term697587.getClass(), "sourcePosition", 0);
        setField(term697587, term697587.getClass(), "jsType", null);
        setField(term697596, term697596.getClass(), "str", null);
        setIntField(term697596, term697596.getClass(), "type", 98);
        setField(term697596, term697596.getClass(), "next", null);
        setField(term697596, term697596.getClass(), "first", null);
        setField(term697596, term697596.getClass(), "last", null);
        setField(term697596, term697596.getClass(), "propListHead", null);
        setIntField(term697596, term697596.getClass(), "sourcePosition", 0);
        setField(term697596, term697596.getClass(), "jsType", null);
        setField(term697596, term697596.getClass(), "parent", null);
        setField(term697587, term697587.getClass(), "parent", term697596);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term697227;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term697135, args);
        assertTrue(recursiveEquals(term697135, term697656));
        assertTrue(recursiveEquals(term697227, term697657));
        assertTrue(recursiveEquals(retValue, term697587));
    }

};


