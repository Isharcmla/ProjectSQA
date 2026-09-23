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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term327106;
     Object term327244;
     Object term327280;
     Object term327281;
     Object term327282;
     Object term327251;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term327106 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term327244 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term327244, term327244.getClass(), "parent", null);
        setIntField(term327244, term327244.getClass(), "type", 47);
        term327280 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term327280, term327280.getClass(), "currentTraversal", null);
        term327281 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term327281, term327281.getClass(), "number", 0.0);
        setIntField(term327281, term327281.getClass(), "type", 47);
        setField(term327281, term327281.getClass(), "next", null);
        setField(term327281, term327281.getClass(), "first", null);
        setField(term327281, term327281.getClass(), "last", null);
        setField(term327281, term327281.getClass(), "propListHead", null);
        setIntField(term327281, term327281.getClass(), "sourcePosition", 0);
        setField(term327281, term327281.getClass(), "jsType", null);
        setField(term327281, term327281.getClass(), "parent", null);
        term327282 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term327282, term327282.getClass(), "number", 0.0);
        setIntField(term327282, term327282.getClass(), "type", 47);
        setField(term327282, term327282.getClass(), "next", null);
        setField(term327282, term327282.getClass(), "first", null);
        setField(term327282, term327282.getClass(), "last", null);
        setField(term327282, term327282.getClass(), "propListHead", null);
        setIntField(term327282, term327282.getClass(), "sourcePosition", 0);
        setField(term327282, term327282.getClass(), "jsType", null);
        setField(term327282, term327282.getClass(), "parent", null);
        term327251 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term327251, term327251.getClass(), "number", 0.0);
        setIntField(term327251, term327251.getClass(), "type", 47);
        setField(term327251, term327251.getClass(), "next", null);
        setField(term327251, term327251.getClass(), "first", null);
        setField(term327251, term327251.getClass(), "last", null);
        setField(term327251, term327251.getClass(), "propListHead", null);
        setIntField(term327251, term327251.getClass(), "sourcePosition", 0);
        setField(term327251, term327251.getClass(), "jsType", null);
        setField(term327251, term327251.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term327244;
        args[1] = term327244;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term327106, args);
        assertTrue(recursiveEquals(term327106, term327280));
        assertTrue(recursiveEquals(term327244, term327281));
        assertTrue(recursiveEquals(term327244, term327282));
        assertTrue(recursiveEquals(retValue, term327251));
    }

};


