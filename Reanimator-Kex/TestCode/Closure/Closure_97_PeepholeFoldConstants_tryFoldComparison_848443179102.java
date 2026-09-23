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

public class PeepholeFoldConstants_tryFoldComparison_848443179102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19298;
     Object term19473;
     Object term19438;
     Object term19498;
     Object term19499;
     Object term19500;
     Object term19501;
     Object term19483;

    public PeepholeFoldConstants_tryFoldComparison_848443179102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19298 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term19473 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19473, term19473.getClass(), "type", 16);
        term19438 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19438, term19438.getClass(), "type", 16);
        term19498 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term19498, term19498.getClass(), "currentTraversal", null);
        term19499 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19499, term19499.getClass(), "type", 16);
        setField(term19499, term19499.getClass(), "next", null);
        setField(term19499, term19499.getClass(), "first", null);
        setField(term19499, term19499.getClass(), "last", null);
        setField(term19499, term19499.getClass(), "propListHead", null);
        setIntField(term19499, term19499.getClass(), "sourcePosition", 0);
        setField(term19499, term19499.getClass(), "jsType", null);
        setField(term19499, term19499.getClass(), "parent", null);
        term19500 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19500, term19500.getClass(), "type", 16);
        setField(term19500, term19500.getClass(), "next", null);
        setField(term19500, term19500.getClass(), "first", null);
        setField(term19500, term19500.getClass(), "last", null);
        setField(term19500, term19500.getClass(), "propListHead", null);
        setIntField(term19500, term19500.getClass(), "sourcePosition", 0);
        setField(term19500, term19500.getClass(), "jsType", null);
        setField(term19500, term19500.getClass(), "parent", null);
        term19501 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19501, term19501.getClass(), "type", 16);
        setField(term19501, term19501.getClass(), "next", null);
        setField(term19501, term19501.getClass(), "first", null);
        setField(term19501, term19501.getClass(), "last", null);
        setField(term19501, term19501.getClass(), "propListHead", null);
        setIntField(term19501, term19501.getClass(), "sourcePosition", 0);
        setField(term19501, term19501.getClass(), "jsType", null);
        setField(term19501, term19501.getClass(), "parent", null);
        term19483 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19483, term19483.getClass(), "type", 16);
        setField(term19483, term19483.getClass(), "next", null);
        setField(term19483, term19483.getClass(), "first", null);
        setField(term19483, term19483.getClass(), "last", null);
        setField(term19483, term19483.getClass(), "propListHead", null);
        setIntField(term19483, term19483.getClass(), "sourcePosition", 0);
        setField(term19483, term19483.getClass(), "jsType", null);
        setField(term19483, term19483.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term19473;
        args[1] = term19438;
        args[2] = term19473;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term19298, args);
        assertTrue(recursiveEquals(term19298, term19498));
        assertTrue(recursiveEquals(term19473, term19499));
        assertTrue(recursiveEquals(term19438, term19500));
        assertTrue(recursiveEquals(term19473, term19501));
        assertTrue(recursiveEquals(retValue, term19483));
    }

};


