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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term567136;
     Object term567228;
     Object term567459;
     Object term567460;
     Object term567421;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term567136 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term567228 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term567320 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term567412 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term567320, term567320.getClass(), "next", term567412);
        setField(term567228, term567228.getClass(), "first", term567320);
        setIntField(term567228, term567228.getClass(), "type", 11);
        term567459 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term567459, term567459.getClass(), "currentTraversal", null);
        term567460 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term567461 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term567462 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term567460, term567460.getClass(), "number", 0.0);
        setIntField(term567460, term567460.getClass(), "type", 11);
        setField(term567460, term567460.getClass(), "next", null);
        setDoubleField(term567461, term567461.getClass(), "number", 0.0);
        setIntField(term567461, term567461.getClass(), "type", 0);
        setDoubleField(term567462, term567462.getClass(), "number", 0.0);
        setIntField(term567462, term567462.getClass(), "type", 0);
        setField(term567462, term567462.getClass(), "next", null);
        setField(term567462, term567462.getClass(), "first", null);
        setField(term567462, term567462.getClass(), "last", null);
        setField(term567462, term567462.getClass(), "propListHead", null);
        setIntField(term567462, term567462.getClass(), "sourcePosition", 0);
        setField(term567462, term567462.getClass(), "jsType", null);
        setField(term567462, term567462.getClass(), "parent", null);
        setField(term567461, term567461.getClass(), "next", term567462);
        setField(term567461, term567461.getClass(), "first", null);
        setField(term567461, term567461.getClass(), "last", null);
        setField(term567461, term567461.getClass(), "propListHead", null);
        setIntField(term567461, term567461.getClass(), "sourcePosition", 0);
        setField(term567461, term567461.getClass(), "jsType", null);
        setField(term567461, term567461.getClass(), "parent", null);
        setField(term567460, term567460.getClass(), "first", term567461);
        setField(term567460, term567460.getClass(), "last", null);
        setField(term567460, term567460.getClass(), "propListHead", null);
        setIntField(term567460, term567460.getClass(), "sourcePosition", 0);
        setField(term567460, term567460.getClass(), "jsType", null);
        setField(term567460, term567460.getClass(), "parent", null);
        term567421 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term567424 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term567427 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term567421, term567421.getClass(), "number", 0.0);
        setIntField(term567421, term567421.getClass(), "type", 11);
        setField(term567421, term567421.getClass(), "next", null);
        setDoubleField(term567424, term567424.getClass(), "number", 0.0);
        setIntField(term567424, term567424.getClass(), "type", 0);
        setDoubleField(term567427, term567427.getClass(), "number", 0.0);
        setIntField(term567427, term567427.getClass(), "type", 0);
        setField(term567427, term567427.getClass(), "next", null);
        setField(term567427, term567427.getClass(), "first", null);
        setField(term567427, term567427.getClass(), "last", null);
        setField(term567427, term567427.getClass(), "propListHead", null);
        setIntField(term567427, term567427.getClass(), "sourcePosition", 0);
        setField(term567427, term567427.getClass(), "jsType", null);
        setField(term567427, term567427.getClass(), "parent", null);
        setField(term567424, term567424.getClass(), "next", term567427);
        setField(term567424, term567424.getClass(), "first", null);
        setField(term567424, term567424.getClass(), "last", null);
        setField(term567424, term567424.getClass(), "propListHead", null);
        setIntField(term567424, term567424.getClass(), "sourcePosition", 0);
        setField(term567424, term567424.getClass(), "jsType", null);
        setField(term567424, term567424.getClass(), "parent", null);
        setField(term567421, term567421.getClass(), "first", term567424);
        setField(term567421, term567421.getClass(), "last", null);
        setField(term567421, term567421.getClass(), "propListHead", null);
        setIntField(term567421, term567421.getClass(), "sourcePosition", 0);
        setField(term567421, term567421.getClass(), "jsType", null);
        setField(term567421, term567421.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term567228;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term567136, args);
        assertTrue(recursiveEquals(term567136, term567459));
        assertTrue(recursiveEquals(term567228, term567460));
        assertTrue(recursiveEquals(retValue, term567421));
    }

};


