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

public class FoldConstants_tryFoldBlock_1167048042389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111033;
     Object term111103;
     Object term111519;
     Object term111520;

    public FoldConstants_tryFoldBlock_1167048042389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111033 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term111103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term111173 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term111243 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term111313 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term111383 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term111313, term111313.getClass(), "next", term111383);
        setIntField(term111313, term111313.getClass(), "type", 79);
        setField(term111243, term111243.getClass(), "next", term111313);
        setIntField(term111243, term111243.getClass(), "type", 84);
        setField(term111173, term111173.getClass(), "next", term111243);
        setIntField(term111173, term111173.getClass(), "type", 129);
        setField(term111103, term111103.getClass(), "first", term111173);
        term111519 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term111519, term111519.getClass(), "compiler", null);
        term111520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term111521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term111522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term111523 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term111524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term111520, term111520.getClass(), "type", 0);
        setField(term111520, term111520.getClass(), "next", null);
        setIntField(term111521, term111521.getClass(), "type", 129);
        setIntField(term111522, term111522.getClass(), "type", 84);
        setIntField(term111523, term111523.getClass(), "type", 79);
        setIntField(term111524, term111524.getClass(), "type", 0);
        setField(term111524, term111524.getClass(), "next", null);
        setField(term111524, term111524.getClass(), "first", null);
        setField(term111524, term111524.getClass(), "last", null);
        setField(term111524, term111524.getClass(), "propListHead", null);
        setIntField(term111524, term111524.getClass(), "sourcePosition", 0);
        setField(term111524, term111524.getClass(), "jsType", null);
        setField(term111524, term111524.getClass(), "parent", null);
        setField(term111523, term111523.getClass(), "next", term111524);
        setField(term111523, term111523.getClass(), "first", null);
        setField(term111523, term111523.getClass(), "last", null);
        setField(term111523, term111523.getClass(), "propListHead", null);
        setIntField(term111523, term111523.getClass(), "sourcePosition", 0);
        setField(term111523, term111523.getClass(), "jsType", null);
        setField(term111523, term111523.getClass(), "parent", null);
        setField(term111522, term111522.getClass(), "next", term111523);
        setField(term111522, term111522.getClass(), "first", null);
        setField(term111522, term111522.getClass(), "last", null);
        setField(term111522, term111522.getClass(), "propListHead", null);
        setIntField(term111522, term111522.getClass(), "sourcePosition", 0);
        setField(term111522, term111522.getClass(), "jsType", null);
        setField(term111522, term111522.getClass(), "parent", null);
        setField(term111521, term111521.getClass(), "next", term111522);
        setField(term111521, term111521.getClass(), "first", null);
        setField(term111521, term111521.getClass(), "last", null);
        setField(term111521, term111521.getClass(), "propListHead", null);
        setIntField(term111521, term111521.getClass(), "sourcePosition", 0);
        setField(term111521, term111521.getClass(), "jsType", null);
        setField(term111521, term111521.getClass(), "parent", null);
        setField(term111520, term111520.getClass(), "first", term111521);
        setField(term111520, term111520.getClass(), "last", null);
        setField(term111520, term111520.getClass(), "propListHead", null);
        setIntField(term111520, term111520.getClass(), "sourcePosition", 0);
        setField(term111520, term111520.getClass(), "jsType", null);
        setField(term111520, term111520.getClass(), "parent", null);
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
        args[1] = term111103;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term111033, args);
        assertTrue(recursiveEquals(term111033, term111519));
        assertTrue(recursiveEquals(term111103, null));
    }

};


