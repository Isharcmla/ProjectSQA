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

public class FoldConstants_tryFoldBlock_1167048042182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37962;
     Object term38032;
     Object term47491;
     Object term47492;

    public FoldConstants_tryFoldBlock_1167048042182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37962 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term38032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term38102, term38102.getClass(), "next", term38032);
        setIntField(term38102, term38102.getClass(), "type", 103);
        setField(term38032, term38032.getClass(), "first", term38102);
        setField(term38032, term38032.getClass(), "next", term38172);
        setIntField(term38032, term38032.getClass(), "type", 81);
        term47491 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term47491, term47491.getClass(), "compiler", null);
        term47492 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47493 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term47492, term47492.getClass(), "type", 81);
        setIntField(term47493, term47493.getClass(), "type", 0);
        setField(term47493, term47493.getClass(), "next", null);
        setField(term47493, term47493.getClass(), "first", null);
        setField(term47493, term47493.getClass(), "last", null);
        setField(term47493, term47493.getClass(), "propListHead", null);
        setIntField(term47493, term47493.getClass(), "sourcePosition", 0);
        setField(term47493, term47493.getClass(), "jsType", null);
        setField(term47493, term47493.getClass(), "parent", null);
        setField(term47492, term47492.getClass(), "next", term47493);
        setIntField(term47494, term47494.getClass(), "type", 103);
        setField(term47494, term47494.getClass(), "next", term47492);
        setField(term47494, term47494.getClass(), "first", null);
        setField(term47494, term47494.getClass(), "last", null);
        setField(term47494, term47494.getClass(), "propListHead", null);
        setIntField(term47494, term47494.getClass(), "sourcePosition", 0);
        setField(term47494, term47494.getClass(), "jsType", null);
        setField(term47494, term47494.getClass(), "parent", null);
        setField(term47492, term47492.getClass(), "first", term47494);
        setField(term47492, term47492.getClass(), "last", null);
        setField(term47492, term47492.getClass(), "propListHead", null);
        setIntField(term47492, term47492.getClass(), "sourcePosition", 0);
        setField(term47492, term47492.getClass(), "jsType", null);
        setField(term47492, term47492.getClass(), "parent", null);
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
        args[1] = term38032;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term37962, args);
        assertTrue(recursiveEquals(term37962, term47491));
        assertTrue(recursiveEquals(term38032, null));
    }

};


