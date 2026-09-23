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

public class FoldConstants_process_1962761263145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32832;
     Object term32902;
     Object term33098;
     Object term33099;

    public FoldConstants_process_1962761263145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32832 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term32832, term32832.getClass(), "compiler", null);
        term32902 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32972 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32902, term32902.getClass(), "type", 125);
        setField(term32972, term32972.getClass(), "next", null);
        setIntField(term32972, term32972.getClass(), "type", 0);
        setField(term32972, term32972.getClass(), "first", null);
        setField(term32902, term32902.getClass(), "first", term32972);
        term33098 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term33098, term33098.getClass(), "compiler", null);
        term33099 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33100 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33099, term33099.getClass(), "type", 125);
        setField(term33099, term33099.getClass(), "next", null);
        setIntField(term33100, term33100.getClass(), "type", 0);
        setField(term33100, term33100.getClass(), "next", null);
        setField(term33100, term33100.getClass(), "first", null);
        setField(term33100, term33100.getClass(), "last", null);
        setField(term33100, term33100.getClass(), "propListHead", null);
        setIntField(term33100, term33100.getClass(), "sourcePosition", 0);
        setField(term33100, term33100.getClass(), "jsType", null);
        setField(term33100, term33100.getClass(), "parent", null);
        setField(term33099, term33099.getClass(), "first", term33100);
        setField(term33099, term33099.getClass(), "last", null);
        setField(term33099, term33099.getClass(), "propListHead", null);
        setIntField(term33099, term33099.getClass(), "sourcePosition", 0);
        setField(term33099, term33099.getClass(), "jsType", null);
        setField(term33099, term33099.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term32902;
        callMethod(klass, "process", argTypes, term32832, args);
        assertTrue(recursiveEquals(term32832, term33098));
        assertTrue(recursiveEquals(term32902, null));
    }

};


