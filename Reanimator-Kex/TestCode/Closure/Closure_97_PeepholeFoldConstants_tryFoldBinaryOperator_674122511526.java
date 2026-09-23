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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140325;
     Object term140417;
     Object term140654;
     Object term140655;
     Object term140608;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140325 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term140417 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term140509 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term140601 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term140601, term140601.getClass(), "type", 42);
        setField(term140509, term140509.getClass(), "next", term140601);
        setIntField(term140509, term140509.getClass(), "type", 42);
        setField(term140417, term140417.getClass(), "first", term140509);
        setIntField(term140417, term140417.getClass(), "type", 14);
        term140654 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term140654, term140654.getClass(), "currentTraversal", null);
        term140655 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term140656 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term140657 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term140655, term140655.getClass(), "str", null);
        setIntField(term140655, term140655.getClass(), "type", 14);
        setField(term140655, term140655.getClass(), "next", null);
        setField(term140656, term140656.getClass(), "str", null);
        setIntField(term140656, term140656.getClass(), "type", 42);
        setField(term140657, term140657.getClass(), "str", null);
        setIntField(term140657, term140657.getClass(), "type", 42);
        setField(term140657, term140657.getClass(), "next", null);
        setField(term140657, term140657.getClass(), "first", null);
        setField(term140657, term140657.getClass(), "last", null);
        setField(term140657, term140657.getClass(), "propListHead", null);
        setIntField(term140657, term140657.getClass(), "sourcePosition", 0);
        setField(term140657, term140657.getClass(), "jsType", null);
        setField(term140657, term140657.getClass(), "parent", null);
        setField(term140656, term140656.getClass(), "next", term140657);
        setField(term140656, term140656.getClass(), "first", null);
        setField(term140656, term140656.getClass(), "last", null);
        setField(term140656, term140656.getClass(), "propListHead", null);
        setIntField(term140656, term140656.getClass(), "sourcePosition", 0);
        setField(term140656, term140656.getClass(), "jsType", null);
        setField(term140656, term140656.getClass(), "parent", null);
        setField(term140655, term140655.getClass(), "first", term140656);
        setField(term140655, term140655.getClass(), "last", null);
        setField(term140655, term140655.getClass(), "propListHead", null);
        setIntField(term140655, term140655.getClass(), "sourcePosition", 0);
        setField(term140655, term140655.getClass(), "jsType", null);
        setField(term140655, term140655.getClass(), "parent", null);
        term140608 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term140610 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term140612 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term140608, term140608.getClass(), "str", null);
        setIntField(term140608, term140608.getClass(), "type", 14);
        setField(term140608, term140608.getClass(), "next", null);
        setField(term140610, term140610.getClass(), "str", null);
        setIntField(term140610, term140610.getClass(), "type", 42);
        setField(term140612, term140612.getClass(), "str", null);
        setIntField(term140612, term140612.getClass(), "type", 42);
        setField(term140612, term140612.getClass(), "next", null);
        setField(term140612, term140612.getClass(), "first", null);
        setField(term140612, term140612.getClass(), "last", null);
        setField(term140612, term140612.getClass(), "propListHead", null);
        setIntField(term140612, term140612.getClass(), "sourcePosition", 0);
        setField(term140612, term140612.getClass(), "jsType", null);
        setField(term140612, term140612.getClass(), "parent", null);
        setField(term140610, term140610.getClass(), "next", term140612);
        setField(term140610, term140610.getClass(), "first", null);
        setField(term140610, term140610.getClass(), "last", null);
        setField(term140610, term140610.getClass(), "propListHead", null);
        setIntField(term140610, term140610.getClass(), "sourcePosition", 0);
        setField(term140610, term140610.getClass(), "jsType", null);
        setField(term140610, term140610.getClass(), "parent", null);
        setField(term140608, term140608.getClass(), "first", term140610);
        setField(term140608, term140608.getClass(), "last", null);
        setField(term140608, term140608.getClass(), "propListHead", null);
        setIntField(term140608, term140608.getClass(), "sourcePosition", 0);
        setField(term140608, term140608.getClass(), "jsType", null);
        setField(term140608, term140608.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term140417;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term140325, args);
        assertTrue(recursiveEquals(term140325, term140654));
        assertTrue(recursiveEquals(term140417, term140655));
        assertTrue(recursiveEquals(retValue, term140608));
    }

};


