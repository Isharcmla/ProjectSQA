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

public class FoldConstants_process_1962761263273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72975;
     Object term73045;
     Object term73314;
     Object term73315;

    public FoldConstants_process_1962761263273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72975 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term72975, term72975.getClass(), "compiler", null);
        term73045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term73045, term73045.getClass(), "type", 125);
        setField(term73115, term73115.getClass(), "next", null);
        setIntField(term73115, term73115.getClass(), "type", 65);
        setField(term73115, term73115.getClass(), "first", null);
        setField(term73045, term73045.getClass(), "first", term73115);
        term73314 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term73314, term73314.getClass(), "compiler", null);
        term73315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73316 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term73315, term73315.getClass(), "type", 125);
        setField(term73315, term73315.getClass(), "next", null);
        setIntField(term73316, term73316.getClass(), "type", 65);
        setField(term73316, term73316.getClass(), "next", null);
        setField(term73316, term73316.getClass(), "first", null);
        setField(term73316, term73316.getClass(), "last", null);
        setField(term73316, term73316.getClass(), "propListHead", null);
        setIntField(term73316, term73316.getClass(), "sourcePosition", 0);
        setField(term73316, term73316.getClass(), "jsType", null);
        setField(term73316, term73316.getClass(), "parent", null);
        setField(term73315, term73315.getClass(), "first", term73316);
        setField(term73315, term73315.getClass(), "last", null);
        setField(term73315, term73315.getClass(), "propListHead", null);
        setIntField(term73315, term73315.getClass(), "sourcePosition", 0);
        setField(term73315, term73315.getClass(), "jsType", null);
        setField(term73315, term73315.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term73045;
        callMethod(klass, "process", argTypes, term72975, args);
        assertTrue(recursiveEquals(term72975, term73314));
        assertTrue(recursiveEquals(term73045, null));
    }

};


