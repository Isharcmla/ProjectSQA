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

public class FoldConstants_tryFoldBlock_1167048042181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37629;
     Object term37699;
     Object term47388;
     Object term47389;

    public FoldConstants_tryFoldBlock_1167048042181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37629 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term37699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term37769, term37769.getClass(), "next", term37699);
        setIntField(term37769, term37769.getClass(), "type", 60);
        setField(term37699, term37699.getClass(), "first", term37769);
        setField(term37699, term37699.getClass(), "next", term37839);
        setIntField(term37699, term37699.getClass(), "type", 81);
        term47388 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term47388, term47388.getClass(), "compiler", null);
        term47389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term47389, term47389.getClass(), "type", 81);
        setIntField(term47390, term47390.getClass(), "type", 0);
        setField(term47390, term47390.getClass(), "next", null);
        setField(term47390, term47390.getClass(), "first", null);
        setField(term47390, term47390.getClass(), "last", null);
        setField(term47390, term47390.getClass(), "propListHead", null);
        setIntField(term47390, term47390.getClass(), "sourcePosition", 0);
        setField(term47390, term47390.getClass(), "jsType", null);
        setField(term47390, term47390.getClass(), "parent", null);
        setField(term47389, term47389.getClass(), "next", term47390);
        setIntField(term47391, term47391.getClass(), "type", 60);
        setField(term47391, term47391.getClass(), "next", term47389);
        setField(term47391, term47391.getClass(), "first", null);
        setField(term47391, term47391.getClass(), "last", null);
        setField(term47391, term47391.getClass(), "propListHead", null);
        setIntField(term47391, term47391.getClass(), "sourcePosition", 0);
        setField(term47391, term47391.getClass(), "jsType", null);
        setField(term47391, term47391.getClass(), "parent", null);
        setField(term47389, term47389.getClass(), "first", term47391);
        setField(term47389, term47389.getClass(), "last", null);
        setField(term47389, term47389.getClass(), "propListHead", null);
        setIntField(term47389, term47389.getClass(), "sourcePosition", 0);
        setField(term47389, term47389.getClass(), "jsType", null);
        setField(term47389, term47389.getClass(), "parent", null);
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
        args[1] = term37699;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term37629, args);
        assertTrue(recursiveEquals(term37629, term47388));
        assertTrue(recursiveEquals(term37699, null));
    }

};


