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

public class PeepholeFoldConstants_tryReduceVoid_942546715178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28829;
     Object term28989;
     Object term29280;
     Object term29282;
     Object term29253;

    public PeepholeFoldConstants_tryReduceVoid_942546715178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28829 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term28919 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term28919, term28919.getClass(), "compiler", null);
        setField(term28829, term28829.getClass(), "currentTraversal", term28919);
        term28989 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29059, term29059.getClass(), "type", 72);
        setField(term28989, term28989.getClass(), "first", term29059);
        setIntField(term28989, term28989.getClass(), "type", 72);
        term29280 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term29281 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term29281, term29281.getClass(), "compiler", null);
        setField(term29281, term29281.getClass(), "callback", null);
        setField(term29281, term29281.getClass(), "curNode", null);
        setField(term29281, term29281.getClass(), "scopes", null);
        setField(term29281, term29281.getClass(), "scopeRoots", null);
        setField(term29281, term29281.getClass(), "cfgs", null);
        setField(term29281, term29281.getClass(), "sourceName", null);
        setField(term29281, term29281.getClass(), "scopeCreator", null);
        setField(term29281, term29281.getClass(), "scopeCallback", null);
        setField(term29280, term29280.getClass(), "currentTraversal", term29281);
        term29282 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29283 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29282, term29282.getClass(), "type", 72);
        setField(term29282, term29282.getClass(), "next", null);
        setIntField(term29283, term29283.getClass(), "type", 72);
        setField(term29283, term29283.getClass(), "next", null);
        setField(term29283, term29283.getClass(), "first", null);
        setField(term29283, term29283.getClass(), "last", null);
        setField(term29283, term29283.getClass(), "propListHead", null);
        setIntField(term29283, term29283.getClass(), "sourcePosition", 0);
        setField(term29283, term29283.getClass(), "jsType", null);
        setField(term29283, term29283.getClass(), "parent", null);
        setField(term29282, term29282.getClass(), "first", term29283);
        setField(term29282, term29282.getClass(), "last", null);
        setField(term29282, term29282.getClass(), "propListHead", null);
        setIntField(term29282, term29282.getClass(), "sourcePosition", 0);
        setField(term29282, term29282.getClass(), "jsType", null);
        setField(term29282, term29282.getClass(), "parent", null);
        term29253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29255 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29253, term29253.getClass(), "type", 72);
        setField(term29253, term29253.getClass(), "next", null);
        setIntField(term29255, term29255.getClass(), "type", 72);
        setField(term29255, term29255.getClass(), "next", null);
        setField(term29255, term29255.getClass(), "first", null);
        setField(term29255, term29255.getClass(), "last", null);
        setField(term29255, term29255.getClass(), "propListHead", null);
        setIntField(term29255, term29255.getClass(), "sourcePosition", 0);
        setField(term29255, term29255.getClass(), "jsType", null);
        setField(term29255, term29255.getClass(), "parent", null);
        setField(term29253, term29253.getClass(), "first", term29255);
        setField(term29253, term29253.getClass(), "last", null);
        setField(term29253, term29253.getClass(), "propListHead", null);
        setIntField(term29253, term29253.getClass(), "sourcePosition", 0);
        setField(term29253, term29253.getClass(), "jsType", null);
        setField(term29253, term29253.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term28989;
        Object retValue = callMethod(klass, "tryReduceVoid", argTypes, term28829, args);
        assertTrue(recursiveEquals(term28829, term29280));
        assertTrue(recursiveEquals(term28989, term29282));
        assertTrue(recursiveEquals(retValue, term29253));
    }

};


