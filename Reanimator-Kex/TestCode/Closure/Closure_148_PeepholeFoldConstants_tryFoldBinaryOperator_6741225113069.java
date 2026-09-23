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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113069 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term905502;
     Object term905594;
     Object term906616;
     Object term906617;
     Object term906537;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113069() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term905502 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term905594 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term905686 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term905778 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term905870 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term905778, term905778.getClass(), "type", 63);
        setField(term905686, term905686.getClass(), "next", term905778);
        setIntField(term905686, term905686.getClass(), "type", 0);
        setField(term905594, term905594.getClass(), "first", term905686);
        setIntField(term905594, term905594.getClass(), "type", 101);
        setField(term905594, term905594.getClass(), "parent", term905870);
        term906616 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term906616, term906616.getClass(), "currentTraversal", null);
        term906617 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term906618 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term906619 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term906620 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term906617, term906617.getClass(), "number", 0.0);
        setIntField(term906617, term906617.getClass(), "type", 101);
        setField(term906617, term906617.getClass(), "next", null);
        setDoubleField(term906618, term906618.getClass(), "number", 0.0);
        setIntField(term906618, term906618.getClass(), "type", 0);
        setDoubleField(term906619, term906619.getClass(), "number", 0.0);
        setIntField(term906619, term906619.getClass(), "type", 63);
        setField(term906619, term906619.getClass(), "next", null);
        setField(term906619, term906619.getClass(), "first", null);
        setField(term906619, term906619.getClass(), "last", null);
        setField(term906619, term906619.getClass(), "propListHead", null);
        setIntField(term906619, term906619.getClass(), "sourcePosition", 0);
        setField(term906619, term906619.getClass(), "jsType", null);
        setField(term906619, term906619.getClass(), "parent", null);
        setField(term906618, term906618.getClass(), "next", term906619);
        setField(term906618, term906618.getClass(), "first", null);
        setField(term906618, term906618.getClass(), "last", null);
        setField(term906618, term906618.getClass(), "propListHead", null);
        setIntField(term906618, term906618.getClass(), "sourcePosition", 0);
        setField(term906618, term906618.getClass(), "jsType", null);
        setField(term906618, term906618.getClass(), "parent", null);
        setField(term906617, term906617.getClass(), "first", term906618);
        setField(term906617, term906617.getClass(), "last", null);
        setField(term906617, term906617.getClass(), "propListHead", null);
        setIntField(term906617, term906617.getClass(), "sourcePosition", 0);
        setField(term906617, term906617.getClass(), "jsType", null);
        setDoubleField(term906620, term906620.getClass(), "number", 0.0);
        setIntField(term906620, term906620.getClass(), "type", 0);
        setField(term906620, term906620.getClass(), "next", null);
        setField(term906620, term906620.getClass(), "first", null);
        setField(term906620, term906620.getClass(), "last", null);
        setField(term906620, term906620.getClass(), "propListHead", null);
        setIntField(term906620, term906620.getClass(), "sourcePosition", 0);
        setField(term906620, term906620.getClass(), "jsType", null);
        setField(term906620, term906620.getClass(), "parent", null);
        setField(term906617, term906617.getClass(), "parent", term906620);
        term906537 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term906540 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term906543 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term906549 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term906537, term906537.getClass(), "number", 0.0);
        setIntField(term906537, term906537.getClass(), "type", 101);
        setField(term906537, term906537.getClass(), "next", null);
        setDoubleField(term906540, term906540.getClass(), "number", 0.0);
        setIntField(term906540, term906540.getClass(), "type", 0);
        setDoubleField(term906543, term906543.getClass(), "number", 0.0);
        setIntField(term906543, term906543.getClass(), "type", 63);
        setField(term906543, term906543.getClass(), "next", null);
        setField(term906543, term906543.getClass(), "first", null);
        setField(term906543, term906543.getClass(), "last", null);
        setField(term906543, term906543.getClass(), "propListHead", null);
        setIntField(term906543, term906543.getClass(), "sourcePosition", 0);
        setField(term906543, term906543.getClass(), "jsType", null);
        setField(term906543, term906543.getClass(), "parent", null);
        setField(term906540, term906540.getClass(), "next", term906543);
        setField(term906540, term906540.getClass(), "first", null);
        setField(term906540, term906540.getClass(), "last", null);
        setField(term906540, term906540.getClass(), "propListHead", null);
        setIntField(term906540, term906540.getClass(), "sourcePosition", 0);
        setField(term906540, term906540.getClass(), "jsType", null);
        setField(term906540, term906540.getClass(), "parent", null);
        setField(term906537, term906537.getClass(), "first", term906540);
        setField(term906537, term906537.getClass(), "last", null);
        setField(term906537, term906537.getClass(), "propListHead", null);
        setIntField(term906537, term906537.getClass(), "sourcePosition", 0);
        setField(term906537, term906537.getClass(), "jsType", null);
        setDoubleField(term906549, term906549.getClass(), "number", 0.0);
        setIntField(term906549, term906549.getClass(), "type", 0);
        setField(term906549, term906549.getClass(), "next", null);
        setField(term906549, term906549.getClass(), "first", null);
        setField(term906549, term906549.getClass(), "last", null);
        setField(term906549, term906549.getClass(), "propListHead", null);
        setIntField(term906549, term906549.getClass(), "sourcePosition", 0);
        setField(term906549, term906549.getClass(), "jsType", null);
        setField(term906549, term906549.getClass(), "parent", null);
        setField(term906537, term906537.getClass(), "parent", term906549);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term905594;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term905502, args);
        assertTrue(recursiveEquals(term905502, term906616));
        assertTrue(recursiveEquals(term905594, term906617));
        assertTrue(recursiveEquals(retValue, term906537));
    }

};


