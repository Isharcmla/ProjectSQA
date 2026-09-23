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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term429151;
     Object term429243;
     Object term429468;
     Object term429469;
     Object term429435;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term429151 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term429243 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term429335 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term429427 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term429335, term429335.getClass(), "next", term429427);
        setIntField(term429335, term429335.getClass(), "type", 39);
        setField(term429243, term429243.getClass(), "first", term429335);
        setIntField(term429243, term429243.getClass(), "type", 24);
        term429468 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term429468, term429468.getClass(), "currentTraversal", null);
        term429469 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term429470 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term429471 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term429469, term429469.getClass(), "number", 0.0);
        setIntField(term429469, term429469.getClass(), "type", 24);
        setField(term429469, term429469.getClass(), "next", null);
        setDoubleField(term429470, term429470.getClass(), "number", 0.0);
        setIntField(term429470, term429470.getClass(), "type", 39);
        setField(term429471, term429471.getClass(), "str", null);
        setIntField(term429471, term429471.getClass(), "type", 0);
        setField(term429471, term429471.getClass(), "next", null);
        setField(term429471, term429471.getClass(), "first", null);
        setField(term429471, term429471.getClass(), "last", null);
        setField(term429471, term429471.getClass(), "propListHead", null);
        setIntField(term429471, term429471.getClass(), "sourcePosition", 0);
        setField(term429471, term429471.getClass(), "jsType", null);
        setField(term429471, term429471.getClass(), "parent", null);
        setField(term429470, term429470.getClass(), "next", term429471);
        setField(term429470, term429470.getClass(), "first", null);
        setField(term429470, term429470.getClass(), "last", null);
        setField(term429470, term429470.getClass(), "propListHead", null);
        setIntField(term429470, term429470.getClass(), "sourcePosition", 0);
        setField(term429470, term429470.getClass(), "jsType", null);
        setField(term429470, term429470.getClass(), "parent", null);
        setField(term429469, term429469.getClass(), "first", term429470);
        setField(term429469, term429469.getClass(), "last", null);
        setField(term429469, term429469.getClass(), "propListHead", null);
        setIntField(term429469, term429469.getClass(), "sourcePosition", 0);
        setField(term429469, term429469.getClass(), "jsType", null);
        setField(term429469, term429469.getClass(), "parent", null);
        term429435 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term429438 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term429441 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term429435, term429435.getClass(), "number", 0.0);
        setIntField(term429435, term429435.getClass(), "type", 24);
        setField(term429435, term429435.getClass(), "next", null);
        setDoubleField(term429438, term429438.getClass(), "number", 0.0);
        setIntField(term429438, term429438.getClass(), "type", 39);
        setField(term429441, term429441.getClass(), "str", null);
        setIntField(term429441, term429441.getClass(), "type", 0);
        setField(term429441, term429441.getClass(), "next", null);
        setField(term429441, term429441.getClass(), "first", null);
        setField(term429441, term429441.getClass(), "last", null);
        setField(term429441, term429441.getClass(), "propListHead", null);
        setIntField(term429441, term429441.getClass(), "sourcePosition", 0);
        setField(term429441, term429441.getClass(), "jsType", null);
        setField(term429441, term429441.getClass(), "parent", null);
        setField(term429438, term429438.getClass(), "next", term429441);
        setField(term429438, term429438.getClass(), "first", null);
        setField(term429438, term429438.getClass(), "last", null);
        setField(term429438, term429438.getClass(), "propListHead", null);
        setIntField(term429438, term429438.getClass(), "sourcePosition", 0);
        setField(term429438, term429438.getClass(), "jsType", null);
        setField(term429438, term429438.getClass(), "parent", null);
        setField(term429435, term429435.getClass(), "first", term429438);
        setField(term429435, term429435.getClass(), "last", null);
        setField(term429435, term429435.getClass(), "propListHead", null);
        setIntField(term429435, term429435.getClass(), "sourcePosition", 0);
        setField(term429435, term429435.getClass(), "jsType", null);
        setField(term429435, term429435.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term429243;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term429151, args);
        assertTrue(recursiveEquals(term429151, term429468));
        assertTrue(recursiveEquals(term429243, term429469));
        assertTrue(recursiveEquals(retValue, term429435));
    }

};


