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

public class PeepholeFoldConstants_optimizeSubtree_1606506993216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41319;
     Object term41389;
     Object term41399;
     Object term41400;
     Object term41391;

    public PeepholeFoldConstants_optimizeSubtree_1606506993216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41319 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term41389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41389, term41389.getClass(), "type", 35);
        term41399 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term41399, term41399.getClass(), "currentTraversal", null);
        term41400 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41400, term41400.getClass(), "type", 35);
        setField(term41400, term41400.getClass(), "next", null);
        setField(term41400, term41400.getClass(), "first", null);
        setField(term41400, term41400.getClass(), "last", null);
        setField(term41400, term41400.getClass(), "propListHead", null);
        setIntField(term41400, term41400.getClass(), "sourcePosition", 0);
        setField(term41400, term41400.getClass(), "jsType", null);
        setField(term41400, term41400.getClass(), "parent", null);
        term41391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41391, term41391.getClass(), "type", 35);
        setField(term41391, term41391.getClass(), "next", null);
        setField(term41391, term41391.getClass(), "first", null);
        setField(term41391, term41391.getClass(), "last", null);
        setField(term41391, term41391.getClass(), "propListHead", null);
        setIntField(term41391, term41391.getClass(), "sourcePosition", 0);
        setField(term41391, term41391.getClass(), "jsType", null);
        setField(term41391, term41391.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term41389;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term41319, args);
        assertTrue(recursiveEquals(term41319, term41399));
        assertTrue(recursiveEquals(term41389, term41400));
        assertTrue(recursiveEquals(retValue, term41391));
    }

};


