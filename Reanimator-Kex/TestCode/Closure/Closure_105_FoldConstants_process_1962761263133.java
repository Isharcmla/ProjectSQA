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

public class FoldConstants_process_1962761263133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21321;
     Object term21391;
     Object term30930;
     Object term30931;

    public FoldConstants_process_1962761263133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21321 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term21321, term21321.getClass(), "compiler", null);
        term21391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21461 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21391, term21391.getClass(), "type", 30);
        setField(term21461, term21461.getClass(), "next", null);
        setIntField(term21461, term21461.getClass(), "type", 0);
        setField(term21461, term21461.getClass(), "first", null);
        setField(term21391, term21391.getClass(), "first", term21461);
        term30930 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term30930, term30930.getClass(), "compiler", null);
        term30931 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30932 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30931, term30931.getClass(), "type", 30);
        setField(term30931, term30931.getClass(), "next", null);
        setIntField(term30932, term30932.getClass(), "type", 0);
        setField(term30932, term30932.getClass(), "next", null);
        setField(term30932, term30932.getClass(), "first", null);
        setField(term30932, term30932.getClass(), "last", null);
        setField(term30932, term30932.getClass(), "propListHead", null);
        setIntField(term30932, term30932.getClass(), "sourcePosition", 0);
        setField(term30932, term30932.getClass(), "jsType", null);
        setField(term30932, term30932.getClass(), "parent", null);
        setField(term30931, term30931.getClass(), "first", term30932);
        setField(term30931, term30931.getClass(), "last", null);
        setField(term30931, term30931.getClass(), "propListHead", null);
        setIntField(term30931, term30931.getClass(), "sourcePosition", 0);
        setField(term30931, term30931.getClass(), "jsType", null);
        setField(term30931, term30931.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term21391;
        callMethod(klass, "process", argTypes, term21321, args);
        assertTrue(recursiveEquals(term21321, term30930));
        assertTrue(recursiveEquals(term21391, null));
    }

};


