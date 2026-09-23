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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term405082;
     Object term405174;
     Object term421432;
     Object term421433;
     Object term421396;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term405082 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term405174 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term405266 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term405358 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term405266, term405266.getClass(), "next", term405358);
        setIntField(term405266, term405266.getClass(), "type", 63);
        setField(term405174, term405174.getClass(), "first", term405266);
        setIntField(term405174, term405174.getClass(), "type", 35);
        term421432 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term421432, term421432.getClass(), "currentTraversal", null);
        term421433 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term421434 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term421435 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term421433, term421433.getClass(), "str", null);
        setIntField(term421433, term421433.getClass(), "type", 35);
        setField(term421433, term421433.getClass(), "next", null);
        setField(term421434, term421434.getClass(), "str", null);
        setIntField(term421434, term421434.getClass(), "type", 63);
        setDoubleField(term421435, term421435.getClass(), "number", 0.0);
        setIntField(term421435, term421435.getClass(), "type", 0);
        setField(term421435, term421435.getClass(), "next", null);
        setField(term421435, term421435.getClass(), "first", null);
        setField(term421435, term421435.getClass(), "last", null);
        setField(term421435, term421435.getClass(), "propListHead", null);
        setIntField(term421435, term421435.getClass(), "sourcePosition", 0);
        setField(term421435, term421435.getClass(), "jsType", null);
        setField(term421435, term421435.getClass(), "parent", null);
        setField(term421434, term421434.getClass(), "next", term421435);
        setField(term421434, term421434.getClass(), "first", null);
        setField(term421434, term421434.getClass(), "last", null);
        setField(term421434, term421434.getClass(), "propListHead", null);
        setIntField(term421434, term421434.getClass(), "sourcePosition", 0);
        setField(term421434, term421434.getClass(), "jsType", null);
        setField(term421434, term421434.getClass(), "parent", null);
        setField(term421433, term421433.getClass(), "first", term421434);
        setField(term421433, term421433.getClass(), "last", null);
        setField(term421433, term421433.getClass(), "propListHead", null);
        setIntField(term421433, term421433.getClass(), "sourcePosition", 0);
        setField(term421433, term421433.getClass(), "jsType", null);
        setField(term421433, term421433.getClass(), "parent", null);
        term421396 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term421398 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term421400 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term421396, term421396.getClass(), "str", null);
        setIntField(term421396, term421396.getClass(), "type", 35);
        setField(term421396, term421396.getClass(), "next", null);
        setField(term421398, term421398.getClass(), "str", null);
        setIntField(term421398, term421398.getClass(), "type", 63);
        setDoubleField(term421400, term421400.getClass(), "number", 0.0);
        setIntField(term421400, term421400.getClass(), "type", 0);
        setField(term421400, term421400.getClass(), "next", null);
        setField(term421400, term421400.getClass(), "first", null);
        setField(term421400, term421400.getClass(), "last", null);
        setField(term421400, term421400.getClass(), "propListHead", null);
        setIntField(term421400, term421400.getClass(), "sourcePosition", 0);
        setField(term421400, term421400.getClass(), "jsType", null);
        setField(term421400, term421400.getClass(), "parent", null);
        setField(term421398, term421398.getClass(), "next", term421400);
        setField(term421398, term421398.getClass(), "first", null);
        setField(term421398, term421398.getClass(), "last", null);
        setField(term421398, term421398.getClass(), "propListHead", null);
        setIntField(term421398, term421398.getClass(), "sourcePosition", 0);
        setField(term421398, term421398.getClass(), "jsType", null);
        setField(term421398, term421398.getClass(), "parent", null);
        setField(term421396, term421396.getClass(), "first", term421398);
        setField(term421396, term421396.getClass(), "last", null);
        setField(term421396, term421396.getClass(), "propListHead", null);
        setIntField(term421396, term421396.getClass(), "sourcePosition", 0);
        setField(term421396, term421396.getClass(), "jsType", null);
        setField(term421396, term421396.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term405174;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term405082, args);
        assertTrue(recursiveEquals(term405082, term421432));
        assertTrue(recursiveEquals(term405174, term421433));
        assertTrue(recursiveEquals(retValue, term421396));
    }

};


