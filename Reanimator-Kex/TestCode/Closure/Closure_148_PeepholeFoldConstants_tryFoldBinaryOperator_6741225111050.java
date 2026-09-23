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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111050 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245943;
     Object term246035;
     Object term246354;
     Object term246355;
     Object term246327;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111050() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term245943 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term246035 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term246127 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term246219 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term246127, term246127.getClass(), "next", term246219);
        setField(term246035, term246035.getClass(), "first", term246127);
        setIntField(term246035, term246035.getClass(), "type", 23);
        term246354 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term246354, term246354.getClass(), "currentTraversal", null);
        term246355 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term246356 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term246357 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term246355, term246355.getClass(), "str", null);
        setIntField(term246355, term246355.getClass(), "type", 23);
        setField(term246355, term246355.getClass(), "next", null);
        setField(term246356, term246356.getClass(), "str", null);
        setIntField(term246356, term246356.getClass(), "type", 0);
        setField(term246357, term246357.getClass(), "str", null);
        setIntField(term246357, term246357.getClass(), "type", 0);
        setField(term246357, term246357.getClass(), "next", null);
        setField(term246357, term246357.getClass(), "first", null);
        setField(term246357, term246357.getClass(), "last", null);
        setField(term246357, term246357.getClass(), "propListHead", null);
        setIntField(term246357, term246357.getClass(), "sourcePosition", 0);
        setField(term246357, term246357.getClass(), "jsType", null);
        setField(term246357, term246357.getClass(), "parent", null);
        setField(term246356, term246356.getClass(), "next", term246357);
        setField(term246356, term246356.getClass(), "first", null);
        setField(term246356, term246356.getClass(), "last", null);
        setField(term246356, term246356.getClass(), "propListHead", null);
        setIntField(term246356, term246356.getClass(), "sourcePosition", 0);
        setField(term246356, term246356.getClass(), "jsType", null);
        setField(term246356, term246356.getClass(), "parent", null);
        setField(term246355, term246355.getClass(), "first", term246356);
        setField(term246355, term246355.getClass(), "last", null);
        setField(term246355, term246355.getClass(), "propListHead", null);
        setIntField(term246355, term246355.getClass(), "sourcePosition", 0);
        setField(term246355, term246355.getClass(), "jsType", null);
        setField(term246355, term246355.getClass(), "parent", null);
        term246327 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term246329 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term246331 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term246327, term246327.getClass(), "str", null);
        setIntField(term246327, term246327.getClass(), "type", 23);
        setField(term246327, term246327.getClass(), "next", null);
        setField(term246329, term246329.getClass(), "str", null);
        setIntField(term246329, term246329.getClass(), "type", 0);
        setField(term246331, term246331.getClass(), "str", null);
        setIntField(term246331, term246331.getClass(), "type", 0);
        setField(term246331, term246331.getClass(), "next", null);
        setField(term246331, term246331.getClass(), "first", null);
        setField(term246331, term246331.getClass(), "last", null);
        setField(term246331, term246331.getClass(), "propListHead", null);
        setIntField(term246331, term246331.getClass(), "sourcePosition", 0);
        setField(term246331, term246331.getClass(), "jsType", null);
        setField(term246331, term246331.getClass(), "parent", null);
        setField(term246329, term246329.getClass(), "next", term246331);
        setField(term246329, term246329.getClass(), "first", null);
        setField(term246329, term246329.getClass(), "last", null);
        setField(term246329, term246329.getClass(), "propListHead", null);
        setIntField(term246329, term246329.getClass(), "sourcePosition", 0);
        setField(term246329, term246329.getClass(), "jsType", null);
        setField(term246329, term246329.getClass(), "parent", null);
        setField(term246327, term246327.getClass(), "first", term246329);
        setField(term246327, term246327.getClass(), "last", null);
        setField(term246327, term246327.getClass(), "propListHead", null);
        setIntField(term246327, term246327.getClass(), "sourcePosition", 0);
        setField(term246327, term246327.getClass(), "jsType", null);
        setField(term246327, term246327.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term246035;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term245943, args);
        assertTrue(recursiveEquals(term245943, term246354));
        assertTrue(recursiveEquals(term246035, term246355));
        assertTrue(recursiveEquals(retValue, term246327));
    }

};


