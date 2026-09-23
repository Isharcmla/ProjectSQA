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

public class FoldConstants_tryFoldBlock_1167048042387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110085;
     Object term110155;
     Object term110887;
     Object term110888;

    public FoldConstants_tryFoldBlock_1167048042387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110085 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term110155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110295 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110365 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110435 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110505 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term110365, term110365.getClass(), "next", term110435);
        setIntField(term110365, term110365.getClass(), "type", 57);
        setField(term110295, term110295.getClass(), "next", term110365);
        setIntField(term110295, term110295.getClass(), "type", 95);
        setIntField(term110505, term110505.getClass(), "type", 31);
        setField(term110295, term110295.getClass(), "first", term110505);
        setField(term110225, term110225.getClass(), "next", term110295);
        setIntField(term110225, term110225.getClass(), "type", 31);
        setField(term110155, term110155.getClass(), "first", term110225);
        term110887 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term110887, term110887.getClass(), "compiler", null);
        term110888 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110889 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110890 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110891 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110892 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110893 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term110888, term110888.getClass(), "type", 0);
        setField(term110888, term110888.getClass(), "next", null);
        setIntField(term110889, term110889.getClass(), "type", 31);
        setIntField(term110890, term110890.getClass(), "type", 95);
        setIntField(term110891, term110891.getClass(), "type", 57);
        setIntField(term110892, term110892.getClass(), "type", 0);
        setField(term110892, term110892.getClass(), "next", null);
        setField(term110892, term110892.getClass(), "first", null);
        setField(term110892, term110892.getClass(), "last", null);
        setField(term110892, term110892.getClass(), "propListHead", null);
        setIntField(term110892, term110892.getClass(), "sourcePosition", 0);
        setField(term110892, term110892.getClass(), "jsType", null);
        setField(term110892, term110892.getClass(), "parent", null);
        setField(term110891, term110891.getClass(), "next", term110892);
        setField(term110891, term110891.getClass(), "first", null);
        setField(term110891, term110891.getClass(), "last", null);
        setField(term110891, term110891.getClass(), "propListHead", null);
        setIntField(term110891, term110891.getClass(), "sourcePosition", 0);
        setField(term110891, term110891.getClass(), "jsType", null);
        setField(term110891, term110891.getClass(), "parent", null);
        setField(term110890, term110890.getClass(), "next", term110891);
        setIntField(term110893, term110893.getClass(), "type", 31);
        setField(term110893, term110893.getClass(), "next", null);
        setField(term110893, term110893.getClass(), "first", null);
        setField(term110893, term110893.getClass(), "last", null);
        setField(term110893, term110893.getClass(), "propListHead", null);
        setIntField(term110893, term110893.getClass(), "sourcePosition", 0);
        setField(term110893, term110893.getClass(), "jsType", null);
        setField(term110893, term110893.getClass(), "parent", null);
        setField(term110890, term110890.getClass(), "first", term110893);
        setField(term110890, term110890.getClass(), "last", null);
        setField(term110890, term110890.getClass(), "propListHead", null);
        setIntField(term110890, term110890.getClass(), "sourcePosition", 0);
        setField(term110890, term110890.getClass(), "jsType", null);
        setField(term110890, term110890.getClass(), "parent", null);
        setField(term110889, term110889.getClass(), "next", term110890);
        setField(term110889, term110889.getClass(), "first", null);
        setField(term110889, term110889.getClass(), "last", null);
        setField(term110889, term110889.getClass(), "propListHead", null);
        setIntField(term110889, term110889.getClass(), "sourcePosition", 0);
        setField(term110889, term110889.getClass(), "jsType", null);
        setField(term110889, term110889.getClass(), "parent", null);
        setField(term110888, term110888.getClass(), "first", term110889);
        setField(term110888, term110888.getClass(), "last", null);
        setField(term110888, term110888.getClass(), "propListHead", null);
        setIntField(term110888, term110888.getClass(), "sourcePosition", 0);
        setField(term110888, term110888.getClass(), "jsType", null);
        setField(term110888, term110888.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term110155;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term110085, args);
        assertTrue(recursiveEquals(term110085, term110887));
        assertTrue(recursiveEquals(term110155, null));
    }

};


