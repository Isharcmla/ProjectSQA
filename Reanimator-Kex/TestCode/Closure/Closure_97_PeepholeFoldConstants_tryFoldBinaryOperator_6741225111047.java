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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term325783;
     Object term325853;
     Object term326468;
     Object term326469;
     Object term326422;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term325783 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term325853 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term325923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term325993 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term325993, term325993.getClass(), "type", 42);
        setField(term325923, term325923.getClass(), "next", term325993);
        setIntField(term325923, term325923.getClass(), "type", 42);
        setField(term325853, term325853.getClass(), "first", term325923);
        setIntField(term325853, term325853.getClass(), "type", 14);
        term326468 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term326468, term326468.getClass(), "currentTraversal", null);
        term326469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term326470 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term326471 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term326469, term326469.getClass(), "type", 14);
        setField(term326469, term326469.getClass(), "next", null);
        setIntField(term326470, term326470.getClass(), "type", 42);
        setIntField(term326471, term326471.getClass(), "type", 42);
        setField(term326471, term326471.getClass(), "next", null);
        setField(term326471, term326471.getClass(), "first", null);
        setField(term326471, term326471.getClass(), "last", null);
        setField(term326471, term326471.getClass(), "propListHead", null);
        setIntField(term326471, term326471.getClass(), "sourcePosition", 0);
        setField(term326471, term326471.getClass(), "jsType", null);
        setField(term326471, term326471.getClass(), "parent", null);
        setField(term326470, term326470.getClass(), "next", term326471);
        setField(term326470, term326470.getClass(), "first", null);
        setField(term326470, term326470.getClass(), "last", null);
        setField(term326470, term326470.getClass(), "propListHead", null);
        setIntField(term326470, term326470.getClass(), "sourcePosition", 0);
        setField(term326470, term326470.getClass(), "jsType", null);
        setField(term326470, term326470.getClass(), "parent", null);
        setField(term326469, term326469.getClass(), "first", term326470);
        setField(term326469, term326469.getClass(), "last", null);
        setField(term326469, term326469.getClass(), "propListHead", null);
        setIntField(term326469, term326469.getClass(), "sourcePosition", 0);
        setField(term326469, term326469.getClass(), "jsType", null);
        setField(term326469, term326469.getClass(), "parent", null);
        term326422 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term326424 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term326426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term326422, term326422.getClass(), "type", 14);
        setField(term326422, term326422.getClass(), "next", null);
        setIntField(term326424, term326424.getClass(), "type", 42);
        setIntField(term326426, term326426.getClass(), "type", 42);
        setField(term326426, term326426.getClass(), "next", null);
        setField(term326426, term326426.getClass(), "first", null);
        setField(term326426, term326426.getClass(), "last", null);
        setField(term326426, term326426.getClass(), "propListHead", null);
        setIntField(term326426, term326426.getClass(), "sourcePosition", 0);
        setField(term326426, term326426.getClass(), "jsType", null);
        setField(term326426, term326426.getClass(), "parent", null);
        setField(term326424, term326424.getClass(), "next", term326426);
        setField(term326424, term326424.getClass(), "first", null);
        setField(term326424, term326424.getClass(), "last", null);
        setField(term326424, term326424.getClass(), "propListHead", null);
        setIntField(term326424, term326424.getClass(), "sourcePosition", 0);
        setField(term326424, term326424.getClass(), "jsType", null);
        setField(term326424, term326424.getClass(), "parent", null);
        setField(term326422, term326422.getClass(), "first", term326424);
        setField(term326422, term326422.getClass(), "last", null);
        setField(term326422, term326422.getClass(), "propListHead", null);
        setIntField(term326422, term326422.getClass(), "sourcePosition", 0);
        setField(term326422, term326422.getClass(), "jsType", null);
        setField(term326422, term326422.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term325853;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term325783, args);
        assertTrue(recursiveEquals(term325783, term326468));
        assertTrue(recursiveEquals(term325853, term326469));
        assertTrue(recursiveEquals(retValue, term326422));
    }

};


