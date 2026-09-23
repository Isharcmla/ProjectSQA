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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term631982;
     Object term632074;
     Object term632710;
     Object term632711;
     Object term632661;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term631982 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term632074 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term632144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term632074, term632074.getClass(), "first", term632074);
        setField(term632074, term632074.getClass(), "next", term632144);
        setIntField(term632074, term632074.getClass(), "type", 100);
        term632710 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term632710, term632710.getClass(), "currentTraversal", null);
        term632711 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term632712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term632711, term632711.getClass(), "number", 0.0);
        setIntField(term632711, term632711.getClass(), "type", 100);
        setIntField(term632712, term632712.getClass(), "type", 0);
        setField(term632712, term632712.getClass(), "next", null);
        setField(term632712, term632712.getClass(), "first", null);
        setField(term632712, term632712.getClass(), "last", null);
        setField(term632712, term632712.getClass(), "propListHead", null);
        setIntField(term632712, term632712.getClass(), "sourcePosition", 0);
        setField(term632712, term632712.getClass(), "jsType", null);
        setField(term632712, term632712.getClass(), "parent", null);
        setField(term632711, term632711.getClass(), "next", term632712);
        setField(term632711, term632711.getClass(), "first", term632711);
        setField(term632711, term632711.getClass(), "last", null);
        setField(term632711, term632711.getClass(), "propListHead", null);
        setIntField(term632711, term632711.getClass(), "sourcePosition", 0);
        setField(term632711, term632711.getClass(), "jsType", null);
        setField(term632711, term632711.getClass(), "parent", null);
        term632661 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term632664 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term632661, term632661.getClass(), "number", 0.0);
        setIntField(term632661, term632661.getClass(), "type", 100);
        setIntField(term632664, term632664.getClass(), "type", 0);
        setField(term632664, term632664.getClass(), "next", null);
        setField(term632664, term632664.getClass(), "first", null);
        setField(term632664, term632664.getClass(), "last", null);
        setField(term632664, term632664.getClass(), "propListHead", null);
        setIntField(term632664, term632664.getClass(), "sourcePosition", 0);
        setField(term632664, term632664.getClass(), "jsType", null);
        setField(term632664, term632664.getClass(), "parent", null);
        setField(term632661, term632661.getClass(), "next", term632664);
        setField(term632661, term632661.getClass(), "first", term632661);
        setField(term632661, term632661.getClass(), "last", null);
        setField(term632661, term632661.getClass(), "propListHead", null);
        setIntField(term632661, term632661.getClass(), "sourcePosition", 0);
        setField(term632661, term632661.getClass(), "jsType", null);
        setField(term632661, term632661.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term632074;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term631982, args);
        assertTrue(recursiveEquals(term631982, term632710));
        assertTrue(recursiveEquals(term632074, term632711));
        assertTrue(recursiveEquals(retValue, term632661));
    }

};


