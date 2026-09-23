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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term675563;
     Object term675655;
     Object term676191;
     Object term676192;
     Object term676162;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term675563 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term675655 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term675747 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term675839 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term675747, term675747.getClass(), "next", term675839);
        setIntField(term675747, term675747.getClass(), "type", 39);
        setField(term675655, term675655.getClass(), "first", term675747);
        setIntField(term675655, term675655.getClass(), "type", 24);
        term676191 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term676191, term676191.getClass(), "currentTraversal", null);
        term676192 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term676193 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term676194 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term676192, term676192.getClass(), "str", null);
        setIntField(term676192, term676192.getClass(), "type", 24);
        setField(term676192, term676192.getClass(), "next", null);
        setField(term676193, term676193.getClass(), "str", null);
        setIntField(term676193, term676193.getClass(), "type", 39);
        setField(term676194, term676194.getClass(), "str", null);
        setIntField(term676194, term676194.getClass(), "type", 0);
        setField(term676194, term676194.getClass(), "next", null);
        setField(term676194, term676194.getClass(), "first", null);
        setField(term676194, term676194.getClass(), "last", null);
        setField(term676194, term676194.getClass(), "propListHead", null);
        setIntField(term676194, term676194.getClass(), "sourcePosition", 0);
        setField(term676194, term676194.getClass(), "jsType", null);
        setField(term676194, term676194.getClass(), "parent", null);
        setField(term676193, term676193.getClass(), "next", term676194);
        setField(term676193, term676193.getClass(), "first", null);
        setField(term676193, term676193.getClass(), "last", null);
        setField(term676193, term676193.getClass(), "propListHead", null);
        setIntField(term676193, term676193.getClass(), "sourcePosition", 0);
        setField(term676193, term676193.getClass(), "jsType", null);
        setField(term676193, term676193.getClass(), "parent", null);
        setField(term676192, term676192.getClass(), "first", term676193);
        setField(term676192, term676192.getClass(), "last", null);
        setField(term676192, term676192.getClass(), "propListHead", null);
        setIntField(term676192, term676192.getClass(), "sourcePosition", 0);
        setField(term676192, term676192.getClass(), "jsType", null);
        setField(term676192, term676192.getClass(), "parent", null);
        term676162 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term676164 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term676166 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term676162, term676162.getClass(), "str", null);
        setIntField(term676162, term676162.getClass(), "type", 24);
        setField(term676162, term676162.getClass(), "next", null);
        setField(term676164, term676164.getClass(), "str", null);
        setIntField(term676164, term676164.getClass(), "type", 39);
        setField(term676166, term676166.getClass(), "str", null);
        setIntField(term676166, term676166.getClass(), "type", 0);
        setField(term676166, term676166.getClass(), "next", null);
        setField(term676166, term676166.getClass(), "first", null);
        setField(term676166, term676166.getClass(), "last", null);
        setField(term676166, term676166.getClass(), "propListHead", null);
        setIntField(term676166, term676166.getClass(), "sourcePosition", 0);
        setField(term676166, term676166.getClass(), "jsType", null);
        setField(term676166, term676166.getClass(), "parent", null);
        setField(term676164, term676164.getClass(), "next", term676166);
        setField(term676164, term676164.getClass(), "first", null);
        setField(term676164, term676164.getClass(), "last", null);
        setField(term676164, term676164.getClass(), "propListHead", null);
        setIntField(term676164, term676164.getClass(), "sourcePosition", 0);
        setField(term676164, term676164.getClass(), "jsType", null);
        setField(term676164, term676164.getClass(), "parent", null);
        setField(term676162, term676162.getClass(), "first", term676164);
        setField(term676162, term676162.getClass(), "last", null);
        setField(term676162, term676162.getClass(), "propListHead", null);
        setIntField(term676162, term676162.getClass(), "sourcePosition", 0);
        setField(term676162, term676162.getClass(), "jsType", null);
        setField(term676162, term676162.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term675655;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term675563, args);
        assertTrue(recursiveEquals(term675563, term676191));
        assertTrue(recursiveEquals(term675655, term676192));
        assertTrue(recursiveEquals(retValue, term676162));
    }

};


