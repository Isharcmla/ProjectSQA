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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term323267;
     Object term323359;
     Object term324012;
     Object term324013;
     Object term323959;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term323267 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term323359 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term323451 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term323543 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term323543, term323543.getClass(), "type", 42);
        setField(term323451, term323451.getClass(), "next", term323543);
        setIntField(term323451, term323451.getClass(), "type", 42);
        setField(term323359, term323359.getClass(), "first", term323451);
        setIntField(term323359, term323359.getClass(), "type", 14);
        term324012 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term324012, term324012.getClass(), "currentTraversal", null);
        term324013 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term324014 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term324015 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term324013, term324013.getClass(), "number", 0.0);
        setIntField(term324013, term324013.getClass(), "type", 14);
        setField(term324013, term324013.getClass(), "next", null);
        setDoubleField(term324014, term324014.getClass(), "number", 0.0);
        setIntField(term324014, term324014.getClass(), "type", 42);
        setDoubleField(term324015, term324015.getClass(), "number", 0.0);
        setIntField(term324015, term324015.getClass(), "type", 42);
        setField(term324015, term324015.getClass(), "next", null);
        setField(term324015, term324015.getClass(), "first", null);
        setField(term324015, term324015.getClass(), "last", null);
        setField(term324015, term324015.getClass(), "propListHead", null);
        setIntField(term324015, term324015.getClass(), "sourcePosition", 0);
        setField(term324015, term324015.getClass(), "jsType", null);
        setField(term324015, term324015.getClass(), "parent", null);
        setField(term324014, term324014.getClass(), "next", term324015);
        setField(term324014, term324014.getClass(), "first", null);
        setField(term324014, term324014.getClass(), "last", null);
        setField(term324014, term324014.getClass(), "propListHead", null);
        setIntField(term324014, term324014.getClass(), "sourcePosition", 0);
        setField(term324014, term324014.getClass(), "jsType", null);
        setField(term324014, term324014.getClass(), "parent", null);
        setField(term324013, term324013.getClass(), "first", term324014);
        setField(term324013, term324013.getClass(), "last", null);
        setField(term324013, term324013.getClass(), "propListHead", null);
        setIntField(term324013, term324013.getClass(), "sourcePosition", 0);
        setField(term324013, term324013.getClass(), "jsType", null);
        setField(term324013, term324013.getClass(), "parent", null);
        term323959 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term323962 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term323965 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term323959, term323959.getClass(), "number", 0.0);
        setIntField(term323959, term323959.getClass(), "type", 14);
        setField(term323959, term323959.getClass(), "next", null);
        setDoubleField(term323962, term323962.getClass(), "number", 0.0);
        setIntField(term323962, term323962.getClass(), "type", 42);
        setDoubleField(term323965, term323965.getClass(), "number", 0.0);
        setIntField(term323965, term323965.getClass(), "type", 42);
        setField(term323965, term323965.getClass(), "next", null);
        setField(term323965, term323965.getClass(), "first", null);
        setField(term323965, term323965.getClass(), "last", null);
        setField(term323965, term323965.getClass(), "propListHead", null);
        setIntField(term323965, term323965.getClass(), "sourcePosition", 0);
        setField(term323965, term323965.getClass(), "jsType", null);
        setField(term323965, term323965.getClass(), "parent", null);
        setField(term323962, term323962.getClass(), "next", term323965);
        setField(term323962, term323962.getClass(), "first", null);
        setField(term323962, term323962.getClass(), "last", null);
        setField(term323962, term323962.getClass(), "propListHead", null);
        setIntField(term323962, term323962.getClass(), "sourcePosition", 0);
        setField(term323962, term323962.getClass(), "jsType", null);
        setField(term323962, term323962.getClass(), "parent", null);
        setField(term323959, term323959.getClass(), "first", term323962);
        setField(term323959, term323959.getClass(), "last", null);
        setField(term323959, term323959.getClass(), "propListHead", null);
        setIntField(term323959, term323959.getClass(), "sourcePosition", 0);
        setField(term323959, term323959.getClass(), "jsType", null);
        setField(term323959, term323959.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term323359;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term323267, args);
        assertTrue(recursiveEquals(term323267, term324012));
        assertTrue(recursiveEquals(term323359, term324013));
        assertTrue(recursiveEquals(retValue, term323959));
    }

};


