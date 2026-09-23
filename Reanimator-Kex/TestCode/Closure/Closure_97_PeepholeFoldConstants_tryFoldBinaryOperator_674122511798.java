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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511798 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230236;
     Object term230306;
     Object term230338;
     Object term230339;
     Object term230316;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511798() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term230236 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term230306 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term230306, term230306.getClass(), "first", term230306);
        setField(term230306, term230306.getClass(), "next", term230306);
        setIntField(term230306, term230306.getClass(), "type", 12);
        term230338 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term230338, term230338.getClass(), "currentTraversal", null);
        term230339 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term230339, term230339.getClass(), "type", 12);
        setField(term230339, term230339.getClass(), "next", term230339);
        setField(term230339, term230339.getClass(), "first", term230339);
        setField(term230339, term230339.getClass(), "last", null);
        setField(term230339, term230339.getClass(), "propListHead", null);
        setIntField(term230339, term230339.getClass(), "sourcePosition", 0);
        setField(term230339, term230339.getClass(), "jsType", null);
        setField(term230339, term230339.getClass(), "parent", null);
        term230316 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term230316, term230316.getClass(), "type", 12);
        setField(term230316, term230316.getClass(), "next", term230316);
        setField(term230316, term230316.getClass(), "first", term230316);
        setField(term230316, term230316.getClass(), "last", null);
        setField(term230316, term230316.getClass(), "propListHead", null);
        setIntField(term230316, term230316.getClass(), "sourcePosition", 0);
        setField(term230316, term230316.getClass(), "jsType", null);
        setField(term230316, term230316.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term230306;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term230236, args);
        assertTrue(recursiveEquals(term230236, term230338));
        assertTrue(recursiveEquals(term230306, term230339));
        assertTrue(recursiveEquals(retValue, term230316));
    }

};


