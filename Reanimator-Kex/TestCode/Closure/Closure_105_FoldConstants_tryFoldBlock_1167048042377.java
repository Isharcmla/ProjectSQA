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

public class FoldConstants_tryFoldBlock_1167048042377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107070;
     Object term107140;
     Object term107556;
     Object term107557;

    public FoldConstants_tryFoldBlock_1167048042377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107070 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term107140 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term107210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term107280 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term107350 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term107420 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term107350, term107350.getClass(), "next", term107420);
        setIntField(term107350, term107350.getClass(), "type", 56);
        setField(term107280, term107280.getClass(), "next", term107350);
        setIntField(term107280, term107280.getClass(), "type", 127);
        setField(term107210, term107210.getClass(), "next", term107280);
        setIntField(term107210, term107210.getClass(), "type", 103);
        setField(term107140, term107140.getClass(), "first", term107210);
        term107556 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term107556, term107556.getClass(), "compiler", null);
        term107557 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term107558 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term107559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term107560 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term107561 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term107557, term107557.getClass(), "type", 0);
        setField(term107557, term107557.getClass(), "next", null);
        setIntField(term107558, term107558.getClass(), "type", 103);
        setIntField(term107559, term107559.getClass(), "type", 127);
        setIntField(term107560, term107560.getClass(), "type", 56);
        setIntField(term107561, term107561.getClass(), "type", 0);
        setField(term107561, term107561.getClass(), "next", null);
        setField(term107561, term107561.getClass(), "first", null);
        setField(term107561, term107561.getClass(), "last", null);
        setField(term107561, term107561.getClass(), "propListHead", null);
        setIntField(term107561, term107561.getClass(), "sourcePosition", 0);
        setField(term107561, term107561.getClass(), "jsType", null);
        setField(term107561, term107561.getClass(), "parent", null);
        setField(term107560, term107560.getClass(), "next", term107561);
        setField(term107560, term107560.getClass(), "first", null);
        setField(term107560, term107560.getClass(), "last", null);
        setField(term107560, term107560.getClass(), "propListHead", null);
        setIntField(term107560, term107560.getClass(), "sourcePosition", 0);
        setField(term107560, term107560.getClass(), "jsType", null);
        setField(term107560, term107560.getClass(), "parent", null);
        setField(term107559, term107559.getClass(), "next", term107560);
        setField(term107559, term107559.getClass(), "first", null);
        setField(term107559, term107559.getClass(), "last", null);
        setField(term107559, term107559.getClass(), "propListHead", null);
        setIntField(term107559, term107559.getClass(), "sourcePosition", 0);
        setField(term107559, term107559.getClass(), "jsType", null);
        setField(term107559, term107559.getClass(), "parent", null);
        setField(term107558, term107558.getClass(), "next", term107559);
        setField(term107558, term107558.getClass(), "first", null);
        setField(term107558, term107558.getClass(), "last", null);
        setField(term107558, term107558.getClass(), "propListHead", null);
        setIntField(term107558, term107558.getClass(), "sourcePosition", 0);
        setField(term107558, term107558.getClass(), "jsType", null);
        setField(term107558, term107558.getClass(), "parent", null);
        setField(term107557, term107557.getClass(), "first", term107558);
        setField(term107557, term107557.getClass(), "last", null);
        setField(term107557, term107557.getClass(), "propListHead", null);
        setIntField(term107557, term107557.getClass(), "sourcePosition", 0);
        setField(term107557, term107557.getClass(), "jsType", null);
        setField(term107557, term107557.getClass(), "parent", null);
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
        args[1] = term107140;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term107070, args);
        assertTrue(recursiveEquals(term107070, term107556));
        assertTrue(recursiveEquals(term107140, null));
    }

};


