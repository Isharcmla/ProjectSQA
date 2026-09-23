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

public class FoldConstants_tryFoldBlock_1167048042407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117284;
     Object term117354;
     Object term117594;
     Object term117595;

    public FoldConstants_tryFoldBlock_1167048042407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117284 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term117354 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term117424 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term117494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term117424, term117424.getClass(), "next", term117354);
        setIntField(term117424, term117424.getClass(), "type", 75);
        setField(term117354, term117354.getClass(), "first", term117424);
        setField(term117354, term117354.getClass(), "next", term117494);
        setIntField(term117354, term117354.getClass(), "type", 31);
        term117594 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term117594, term117594.getClass(), "compiler", null);
        term117595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term117596 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term117597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term117595, term117595.getClass(), "type", 31);
        setIntField(term117596, term117596.getClass(), "type", 0);
        setField(term117596, term117596.getClass(), "next", null);
        setField(term117596, term117596.getClass(), "first", null);
        setField(term117596, term117596.getClass(), "last", null);
        setField(term117596, term117596.getClass(), "propListHead", null);
        setIntField(term117596, term117596.getClass(), "sourcePosition", 0);
        setField(term117596, term117596.getClass(), "jsType", null);
        setField(term117596, term117596.getClass(), "parent", null);
        setField(term117595, term117595.getClass(), "next", term117596);
        setIntField(term117597, term117597.getClass(), "type", 75);
        setField(term117597, term117597.getClass(), "next", term117595);
        setField(term117597, term117597.getClass(), "first", null);
        setField(term117597, term117597.getClass(), "last", null);
        setField(term117597, term117597.getClass(), "propListHead", null);
        setIntField(term117597, term117597.getClass(), "sourcePosition", 0);
        setField(term117597, term117597.getClass(), "jsType", null);
        setField(term117597, term117597.getClass(), "parent", null);
        setField(term117595, term117595.getClass(), "first", term117597);
        setField(term117595, term117595.getClass(), "last", null);
        setField(term117595, term117595.getClass(), "propListHead", null);
        setIntField(term117595, term117595.getClass(), "sourcePosition", 0);
        setField(term117595, term117595.getClass(), "jsType", null);
        setField(term117595, term117595.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term117354;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term117284, args);
        assertTrue(recursiveEquals(term117284, term117594));
        assertTrue(recursiveEquals(term117354, null));
    }

};


