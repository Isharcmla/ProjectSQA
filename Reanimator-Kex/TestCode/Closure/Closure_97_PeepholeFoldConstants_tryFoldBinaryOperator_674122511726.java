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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185784;
     Object term185876;
     Object term186103;
     Object term186104;
     Object term186069;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185784 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term185876 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term185968 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term186060 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term185968, term185968.getClass(), "next", term186060);
        setField(term185876, term185876.getClass(), "first", term185968);
        setIntField(term185876, term185876.getClass(), "type", 19);
        term186103 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term186103, term186103.getClass(), "currentTraversal", null);
        term186104 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term186105 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term186106 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term186104, term186104.getClass(), "number", 0.0);
        setIntField(term186104, term186104.getClass(), "type", 19);
        setField(term186104, term186104.getClass(), "next", null);
        setDoubleField(term186105, term186105.getClass(), "number", 0.0);
        setIntField(term186105, term186105.getClass(), "type", 0);
        setDoubleField(term186106, term186106.getClass(), "number", 0.0);
        setIntField(term186106, term186106.getClass(), "type", 0);
        setField(term186106, term186106.getClass(), "next", null);
        setField(term186106, term186106.getClass(), "first", null);
        setField(term186106, term186106.getClass(), "last", null);
        setField(term186106, term186106.getClass(), "propListHead", null);
        setIntField(term186106, term186106.getClass(), "sourcePosition", 0);
        setField(term186106, term186106.getClass(), "jsType", null);
        setField(term186106, term186106.getClass(), "parent", null);
        setField(term186105, term186105.getClass(), "next", term186106);
        setField(term186105, term186105.getClass(), "first", null);
        setField(term186105, term186105.getClass(), "last", null);
        setField(term186105, term186105.getClass(), "propListHead", null);
        setIntField(term186105, term186105.getClass(), "sourcePosition", 0);
        setField(term186105, term186105.getClass(), "jsType", null);
        setField(term186105, term186105.getClass(), "parent", null);
        setField(term186104, term186104.getClass(), "first", term186105);
        setField(term186104, term186104.getClass(), "last", null);
        setField(term186104, term186104.getClass(), "propListHead", null);
        setIntField(term186104, term186104.getClass(), "sourcePosition", 0);
        setField(term186104, term186104.getClass(), "jsType", null);
        setField(term186104, term186104.getClass(), "parent", null);
        term186069 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term186072 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term186075 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term186069, term186069.getClass(), "number", 0.0);
        setIntField(term186069, term186069.getClass(), "type", 19);
        setField(term186069, term186069.getClass(), "next", null);
        setDoubleField(term186072, term186072.getClass(), "number", 0.0);
        setIntField(term186072, term186072.getClass(), "type", 0);
        setDoubleField(term186075, term186075.getClass(), "number", 0.0);
        setIntField(term186075, term186075.getClass(), "type", 0);
        setField(term186075, term186075.getClass(), "next", null);
        setField(term186075, term186075.getClass(), "first", null);
        setField(term186075, term186075.getClass(), "last", null);
        setField(term186075, term186075.getClass(), "propListHead", null);
        setIntField(term186075, term186075.getClass(), "sourcePosition", 0);
        setField(term186075, term186075.getClass(), "jsType", null);
        setField(term186075, term186075.getClass(), "parent", null);
        setField(term186072, term186072.getClass(), "next", term186075);
        setField(term186072, term186072.getClass(), "first", null);
        setField(term186072, term186072.getClass(), "last", null);
        setField(term186072, term186072.getClass(), "propListHead", null);
        setIntField(term186072, term186072.getClass(), "sourcePosition", 0);
        setField(term186072, term186072.getClass(), "jsType", null);
        setField(term186072, term186072.getClass(), "parent", null);
        setField(term186069, term186069.getClass(), "first", term186072);
        setField(term186069, term186069.getClass(), "last", null);
        setField(term186069, term186069.getClass(), "propListHead", null);
        setIntField(term186069, term186069.getClass(), "sourcePosition", 0);
        setField(term186069, term186069.getClass(), "jsType", null);
        setField(term186069, term186069.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term185876;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term185784, args);
        assertTrue(recursiveEquals(term185784, term186103));
        assertTrue(recursiveEquals(term185876, term186104));
        assertTrue(recursiveEquals(retValue, term186069));
    }

};


