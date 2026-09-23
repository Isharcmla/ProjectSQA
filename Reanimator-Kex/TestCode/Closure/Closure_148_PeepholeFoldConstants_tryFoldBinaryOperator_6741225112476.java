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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term694150;
     Object term694242;
     Object term694468;
     Object term694469;
     Object term694439;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term694150 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term694242 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term694334 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term694426 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term694334, term694334.getClass(), "next", term694426);
        setIntField(term694334, term694334.getClass(), "type", 39);
        setField(term694242, term694242.getClass(), "first", term694334);
        setIntField(term694242, term694242.getClass(), "type", 23);
        term694468 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term694468, term694468.getClass(), "currentTraversal", null);
        term694469 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term694470 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term694471 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term694469, term694469.getClass(), "str", null);
        setIntField(term694469, term694469.getClass(), "type", 23);
        setField(term694469, term694469.getClass(), "next", null);
        setField(term694470, term694470.getClass(), "str", null);
        setIntField(term694470, term694470.getClass(), "type", 39);
        setField(term694471, term694471.getClass(), "str", null);
        setIntField(term694471, term694471.getClass(), "type", 0);
        setField(term694471, term694471.getClass(), "next", null);
        setField(term694471, term694471.getClass(), "first", null);
        setField(term694471, term694471.getClass(), "last", null);
        setField(term694471, term694471.getClass(), "propListHead", null);
        setIntField(term694471, term694471.getClass(), "sourcePosition", 0);
        setField(term694471, term694471.getClass(), "jsType", null);
        setField(term694471, term694471.getClass(), "parent", null);
        setField(term694470, term694470.getClass(), "next", term694471);
        setField(term694470, term694470.getClass(), "first", null);
        setField(term694470, term694470.getClass(), "last", null);
        setField(term694470, term694470.getClass(), "propListHead", null);
        setIntField(term694470, term694470.getClass(), "sourcePosition", 0);
        setField(term694470, term694470.getClass(), "jsType", null);
        setField(term694470, term694470.getClass(), "parent", null);
        setField(term694469, term694469.getClass(), "first", term694470);
        setField(term694469, term694469.getClass(), "last", null);
        setField(term694469, term694469.getClass(), "propListHead", null);
        setIntField(term694469, term694469.getClass(), "sourcePosition", 0);
        setField(term694469, term694469.getClass(), "jsType", null);
        setField(term694469, term694469.getClass(), "parent", null);
        term694439 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term694441 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term694443 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term694439, term694439.getClass(), "str", null);
        setIntField(term694439, term694439.getClass(), "type", 23);
        setField(term694439, term694439.getClass(), "next", null);
        setField(term694441, term694441.getClass(), "str", null);
        setIntField(term694441, term694441.getClass(), "type", 39);
        setField(term694443, term694443.getClass(), "str", null);
        setIntField(term694443, term694443.getClass(), "type", 0);
        setField(term694443, term694443.getClass(), "next", null);
        setField(term694443, term694443.getClass(), "first", null);
        setField(term694443, term694443.getClass(), "last", null);
        setField(term694443, term694443.getClass(), "propListHead", null);
        setIntField(term694443, term694443.getClass(), "sourcePosition", 0);
        setField(term694443, term694443.getClass(), "jsType", null);
        setField(term694443, term694443.getClass(), "parent", null);
        setField(term694441, term694441.getClass(), "next", term694443);
        setField(term694441, term694441.getClass(), "first", null);
        setField(term694441, term694441.getClass(), "last", null);
        setField(term694441, term694441.getClass(), "propListHead", null);
        setIntField(term694441, term694441.getClass(), "sourcePosition", 0);
        setField(term694441, term694441.getClass(), "jsType", null);
        setField(term694441, term694441.getClass(), "parent", null);
        setField(term694439, term694439.getClass(), "first", term694441);
        setField(term694439, term694439.getClass(), "last", null);
        setField(term694439, term694439.getClass(), "propListHead", null);
        setIntField(term694439, term694439.getClass(), "sourcePosition", 0);
        setField(term694439, term694439.getClass(), "jsType", null);
        setField(term694439, term694439.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term694242;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term694150, args);
        assertTrue(recursiveEquals(term694150, term694468));
        assertTrue(recursiveEquals(term694242, term694469));
        assertTrue(recursiveEquals(retValue, term694439));
    }

};


