package com.google.javascript.rhino;

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
import java.lang.IllegalArgumentException;
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class Node_init_1103777367220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term617;
     Object term619;

    public Node_init_1103777367220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term617 = new Integer(-1122880881);
        term619 = (Object[]) newArray("com.google.javascript.rhino.Node", 4);
        Object term620 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term622 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term624 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term636 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term644 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term620, term620.getClass(), "type", -542712742);
        setIntField(term622, term622.getClass(), "type", -1254072822);
        setIntField(term624, term624.getClass(), "type", -1111249833);
        setIntField(term626, term626.getClass(), "type", -1692331299);
        setField(term626, term626.getClass(), "next", null);
        setField(term626, term626.getClass(), "first", null);
        setField(term626, term626.getClass(), "last", term624);
        setField(term626, term626.getClass(), "propListHead", null);
        setIntField(term626, term626.getClass(), "sourcePosition", 0);
        setField(term626, term626.getClass(), "jsType", null);
        setField(term626, term626.getClass(), "parent", null);
        setField(term624, term624.getClass(), "next", term626);
        setIntField(term629, term629.getClass(), "type", 479531250);
        setField(term629, term629.getClass(), "next", null);
        setField(term629, term629.getClass(), "first", null);
        setField(term629, term629.getClass(), "last", null);
        setField(term629, term629.getClass(), "propListHead", null);
        setIntField(term629, term629.getClass(), "sourcePosition", 0);
        setField(term629, term629.getClass(), "jsType", null);
        setField(term629, term629.getClass(), "parent", null);
        setField(term624, term624.getClass(), "first", term629);
        setIntField(term632, term632.getClass(), "type", 534834644);
        setField(term632, term632.getClass(), "next", null);
        setField(term632, term632.getClass(), "first", term622);
        setField(term632, term632.getClass(), "last", term622);
        setField(term632, term632.getClass(), "propListHead", null);
        setIntField(term632, term632.getClass(), "sourcePosition", 0);
        setField(term632, term632.getClass(), "jsType", null);
        setField(term632, term632.getClass(), "parent", null);
        setField(term624, term624.getClass(), "last", term632);
        setField(term624, term624.getClass(), "propListHead", null);
        setIntField(term624, term624.getClass(), "sourcePosition", 0);
        setField(term624, term624.getClass(), "jsType", null);
        setField(term624, term624.getClass(), "parent", null);
        setField(term622, term622.getClass(), "next", term624);
        setIntField(term636, term636.getClass(), "type", -209654048);
        setField(term636, term636.getClass(), "next", term632);
        setIntField(term638, term638.getClass(), "type", 1959097203);
        setField(term638, term638.getClass(), "next", term636);
        setField(term638, term638.getClass(), "first", null);
        setField(term638, term638.getClass(), "last", term626);
        setField(term638, term638.getClass(), "propListHead", null);
        setIntField(term638, term638.getClass(), "sourcePosition", 0);
        setField(term638, term638.getClass(), "jsType", null);
        setField(term638, term638.getClass(), "parent", null);
        setField(term636, term636.getClass(), "first", term638);
        setField(term636, term636.getClass(), "last", term620);
        setField(term636, term636.getClass(), "propListHead", null);
        setIntField(term636, term636.getClass(), "sourcePosition", 0);
        setField(term636, term636.getClass(), "jsType", null);
        setField(term636, term636.getClass(), "parent", null);
        setField(term622, term622.getClass(), "first", term636);
        setField(term622, term622.getClass(), "last", term636);
        setField(term622, term622.getClass(), "propListHead", null);
        setIntField(term622, term622.getClass(), "sourcePosition", 0);
        setField(term622, term622.getClass(), "jsType", null);
        setField(term622, term622.getClass(), "parent", null);
        setField(term620, term620.getClass(), "next", term622);
        setField(term620, term620.getClass(), "first", term626);
        setField(term620, term620.getClass(), "last", term629);
        setField(term620, term620.getClass(), "propListHead", null);
        setIntField(term620, term620.getClass(), "sourcePosition", 0);
        setField(term620, term620.getClass(), "jsType", null);
        setField(term620, term620.getClass(), "parent", null);
        setElement(term619, 0, term620);
        setElement(term619, 1, term629);
        setElement(term619, 2, term622);
        setIntField(term644, term644.getClass(), "type", -130649791);
        setField(term644, term644.getClass(), "next", term632);
        setField(term644, term644.getClass(), "first", term636);
        setField(term644, term644.getClass(), "last", term632);
        setField(term644, term644.getClass(), "propListHead", null);
        setIntField(term644, term644.getClass(), "sourcePosition", 0);
        setField(term644, term644.getClass(), "jsType", null);
        setField(term644, term644.getClass(), "parent", null);
        setElement(term619, 3, term644);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(Class.forName("com.google.javascript.rhino.Node"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term617;
        args[1] = term619;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


