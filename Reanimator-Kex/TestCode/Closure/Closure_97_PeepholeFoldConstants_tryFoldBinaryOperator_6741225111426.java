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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term536769;
     Object term536861;
     Object term537086;
     Object term537087;
     Object term537053;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term536769 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term536861 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term536953 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term537045 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term536953, term536953.getClass(), "next", term537045);
        setIntField(term536953, term536953.getClass(), "type", 39);
        setField(term536861, term536861.getClass(), "first", term536953);
        setIntField(term536861, term536861.getClass(), "type", 19);
        term537086 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term537086, term537086.getClass(), "currentTraversal", null);
        term537087 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term537088 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term537089 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term537087, term537087.getClass(), "number", 0.0);
        setIntField(term537087, term537087.getClass(), "type", 19);
        setField(term537087, term537087.getClass(), "next", null);
        setDoubleField(term537088, term537088.getClass(), "number", 0.0);
        setIntField(term537088, term537088.getClass(), "type", 39);
        setField(term537089, term537089.getClass(), "str", null);
        setIntField(term537089, term537089.getClass(), "type", 0);
        setField(term537089, term537089.getClass(), "next", null);
        setField(term537089, term537089.getClass(), "first", null);
        setField(term537089, term537089.getClass(), "last", null);
        setField(term537089, term537089.getClass(), "propListHead", null);
        setIntField(term537089, term537089.getClass(), "sourcePosition", 0);
        setField(term537089, term537089.getClass(), "jsType", null);
        setField(term537089, term537089.getClass(), "parent", null);
        setField(term537088, term537088.getClass(), "next", term537089);
        setField(term537088, term537088.getClass(), "first", null);
        setField(term537088, term537088.getClass(), "last", null);
        setField(term537088, term537088.getClass(), "propListHead", null);
        setIntField(term537088, term537088.getClass(), "sourcePosition", 0);
        setField(term537088, term537088.getClass(), "jsType", null);
        setField(term537088, term537088.getClass(), "parent", null);
        setField(term537087, term537087.getClass(), "first", term537088);
        setField(term537087, term537087.getClass(), "last", null);
        setField(term537087, term537087.getClass(), "propListHead", null);
        setIntField(term537087, term537087.getClass(), "sourcePosition", 0);
        setField(term537087, term537087.getClass(), "jsType", null);
        setField(term537087, term537087.getClass(), "parent", null);
        term537053 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term537056 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term537059 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term537053, term537053.getClass(), "number", 0.0);
        setIntField(term537053, term537053.getClass(), "type", 19);
        setField(term537053, term537053.getClass(), "next", null);
        setDoubleField(term537056, term537056.getClass(), "number", 0.0);
        setIntField(term537056, term537056.getClass(), "type", 39);
        setField(term537059, term537059.getClass(), "str", null);
        setIntField(term537059, term537059.getClass(), "type", 0);
        setField(term537059, term537059.getClass(), "next", null);
        setField(term537059, term537059.getClass(), "first", null);
        setField(term537059, term537059.getClass(), "last", null);
        setField(term537059, term537059.getClass(), "propListHead", null);
        setIntField(term537059, term537059.getClass(), "sourcePosition", 0);
        setField(term537059, term537059.getClass(), "jsType", null);
        setField(term537059, term537059.getClass(), "parent", null);
        setField(term537056, term537056.getClass(), "next", term537059);
        setField(term537056, term537056.getClass(), "first", null);
        setField(term537056, term537056.getClass(), "last", null);
        setField(term537056, term537056.getClass(), "propListHead", null);
        setIntField(term537056, term537056.getClass(), "sourcePosition", 0);
        setField(term537056, term537056.getClass(), "jsType", null);
        setField(term537056, term537056.getClass(), "parent", null);
        setField(term537053, term537053.getClass(), "first", term537056);
        setField(term537053, term537053.getClass(), "last", null);
        setField(term537053, term537053.getClass(), "propListHead", null);
        setIntField(term537053, term537053.getClass(), "sourcePosition", 0);
        setField(term537053, term537053.getClass(), "jsType", null);
        setField(term537053, term537053.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term536861;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term536769, args);
        assertTrue(recursiveEquals(term536769, term537086));
        assertTrue(recursiveEquals(term536861, term537087));
        assertTrue(recursiveEquals(retValue, term537053));
    }

};


