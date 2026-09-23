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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127580;
     Object term127672;
     Object term128286;
     Object term128287;
     Object term128254;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127580 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term127672 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term127764 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term127856 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term127764, term127764.getClass(), "next", term127856);
        setIntField(term127764, term127764.getClass(), "type", 39);
        setField(term127672, term127672.getClass(), "first", term127764);
        setIntField(term127672, term127672.getClass(), "type", 20);
        term128286 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term128286, term128286.getClass(), "currentTraversal", null);
        term128287 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term128288 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term128289 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term128287, term128287.getClass(), "str", null);
        setIntField(term128287, term128287.getClass(), "type", 20);
        setField(term128287, term128287.getClass(), "next", null);
        setField(term128288, term128288.getClass(), "str", null);
        setIntField(term128288, term128288.getClass(), "type", 39);
        setDoubleField(term128289, term128289.getClass(), "number", 0.0);
        setIntField(term128289, term128289.getClass(), "type", 0);
        setField(term128289, term128289.getClass(), "next", null);
        setField(term128289, term128289.getClass(), "first", null);
        setField(term128289, term128289.getClass(), "last", null);
        setField(term128289, term128289.getClass(), "propListHead", null);
        setIntField(term128289, term128289.getClass(), "sourcePosition", 0);
        setField(term128289, term128289.getClass(), "jsType", null);
        setField(term128289, term128289.getClass(), "parent", null);
        setField(term128288, term128288.getClass(), "next", term128289);
        setField(term128288, term128288.getClass(), "first", null);
        setField(term128288, term128288.getClass(), "last", null);
        setField(term128288, term128288.getClass(), "propListHead", null);
        setIntField(term128288, term128288.getClass(), "sourcePosition", 0);
        setField(term128288, term128288.getClass(), "jsType", null);
        setField(term128288, term128288.getClass(), "parent", null);
        setField(term128287, term128287.getClass(), "first", term128288);
        setField(term128287, term128287.getClass(), "last", null);
        setField(term128287, term128287.getClass(), "propListHead", null);
        setIntField(term128287, term128287.getClass(), "sourcePosition", 0);
        setField(term128287, term128287.getClass(), "jsType", null);
        setField(term128287, term128287.getClass(), "parent", null);
        term128254 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term128256 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term128258 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term128254, term128254.getClass(), "str", null);
        setIntField(term128254, term128254.getClass(), "type", 20);
        setField(term128254, term128254.getClass(), "next", null);
        setField(term128256, term128256.getClass(), "str", null);
        setIntField(term128256, term128256.getClass(), "type", 39);
        setDoubleField(term128258, term128258.getClass(), "number", 0.0);
        setIntField(term128258, term128258.getClass(), "type", 0);
        setField(term128258, term128258.getClass(), "next", null);
        setField(term128258, term128258.getClass(), "first", null);
        setField(term128258, term128258.getClass(), "last", null);
        setField(term128258, term128258.getClass(), "propListHead", null);
        setIntField(term128258, term128258.getClass(), "sourcePosition", 0);
        setField(term128258, term128258.getClass(), "jsType", null);
        setField(term128258, term128258.getClass(), "parent", null);
        setField(term128256, term128256.getClass(), "next", term128258);
        setField(term128256, term128256.getClass(), "first", null);
        setField(term128256, term128256.getClass(), "last", null);
        setField(term128256, term128256.getClass(), "propListHead", null);
        setIntField(term128256, term128256.getClass(), "sourcePosition", 0);
        setField(term128256, term128256.getClass(), "jsType", null);
        setField(term128256, term128256.getClass(), "parent", null);
        setField(term128254, term128254.getClass(), "first", term128256);
        setField(term128254, term128254.getClass(), "last", null);
        setField(term128254, term128254.getClass(), "propListHead", null);
        setIntField(term128254, term128254.getClass(), "sourcePosition", 0);
        setField(term128254, term128254.getClass(), "jsType", null);
        setField(term128254, term128254.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term127672;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term127580, args);
        assertTrue(recursiveEquals(term127580, term128286));
        assertTrue(recursiveEquals(term127672, term128287));
        assertTrue(recursiveEquals(retValue, term128254));
    }

};


