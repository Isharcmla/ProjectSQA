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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101224;
     Object term101316;
     Object term101421;
     Object term101422;
     Object term101394;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101224 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term101316 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term101386 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term101316, term101316.getClass(), "first", term101316);
        setField(term101316, term101316.getClass(), "next", term101386);
        setIntField(term101316, term101316.getClass(), "type", 33);
        term101421 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term101421, term101421.getClass(), "currentTraversal", null);
        term101422 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term101423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term101422, term101422.getClass(), "number", 0.0);
        setIntField(term101422, term101422.getClass(), "type", 33);
        setIntField(term101423, term101423.getClass(), "type", 0);
        setField(term101423, term101423.getClass(), "next", null);
        setField(term101423, term101423.getClass(), "first", null);
        setField(term101423, term101423.getClass(), "last", null);
        setField(term101423, term101423.getClass(), "propListHead", null);
        setIntField(term101423, term101423.getClass(), "sourcePosition", 0);
        setField(term101423, term101423.getClass(), "jsType", null);
        setField(term101423, term101423.getClass(), "parent", null);
        setField(term101422, term101422.getClass(), "next", term101423);
        setField(term101422, term101422.getClass(), "first", term101422);
        setField(term101422, term101422.getClass(), "last", null);
        setField(term101422, term101422.getClass(), "propListHead", null);
        setIntField(term101422, term101422.getClass(), "sourcePosition", 0);
        setField(term101422, term101422.getClass(), "jsType", null);
        setField(term101422, term101422.getClass(), "parent", null);
        term101394 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term101397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term101394, term101394.getClass(), "number", 0.0);
        setIntField(term101394, term101394.getClass(), "type", 33);
        setIntField(term101397, term101397.getClass(), "type", 0);
        setField(term101397, term101397.getClass(), "next", null);
        setField(term101397, term101397.getClass(), "first", null);
        setField(term101397, term101397.getClass(), "last", null);
        setField(term101397, term101397.getClass(), "propListHead", null);
        setIntField(term101397, term101397.getClass(), "sourcePosition", 0);
        setField(term101397, term101397.getClass(), "jsType", null);
        setField(term101397, term101397.getClass(), "parent", null);
        setField(term101394, term101394.getClass(), "next", term101397);
        setField(term101394, term101394.getClass(), "first", term101394);
        setField(term101394, term101394.getClass(), "last", null);
        setField(term101394, term101394.getClass(), "propListHead", null);
        setIntField(term101394, term101394.getClass(), "sourcePosition", 0);
        setField(term101394, term101394.getClass(), "jsType", null);
        setField(term101394, term101394.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term101316;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term101224, args);
        assertTrue(recursiveEquals(term101224, term101421));
        assertTrue(recursiveEquals(term101316, term101422));
        assertTrue(recursiveEquals(retValue, term101394));
    }

};


