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

public class FoldConstants_process_1962761263307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83189;
     Object term83259;
     Object term83566;
     Object term83567;

    public FoldConstants_process_1962761263307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83189 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term83189, term83189.getClass(), "compiler", null);
        term83259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term83329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term83259, term83259.getClass(), "type", 125);
        setField(term83329, term83329.getClass(), "next", null);
        setIntField(term83329, term83329.getClass(), "type", 67);
        setField(term83329, term83329.getClass(), "first", null);
        setField(term83259, term83259.getClass(), "first", term83329);
        term83566 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term83566, term83566.getClass(), "compiler", null);
        term83567 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term83568 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term83567, term83567.getClass(), "type", 125);
        setField(term83567, term83567.getClass(), "next", null);
        setIntField(term83568, term83568.getClass(), "type", 67);
        setField(term83568, term83568.getClass(), "next", null);
        setField(term83568, term83568.getClass(), "first", null);
        setField(term83568, term83568.getClass(), "last", null);
        setField(term83568, term83568.getClass(), "propListHead", null);
        setIntField(term83568, term83568.getClass(), "sourcePosition", 0);
        setField(term83568, term83568.getClass(), "jsType", null);
        setField(term83568, term83568.getClass(), "parent", null);
        setField(term83567, term83567.getClass(), "first", term83568);
        setField(term83567, term83567.getClass(), "last", null);
        setField(term83567, term83567.getClass(), "propListHead", null);
        setIntField(term83567, term83567.getClass(), "sourcePosition", 0);
        setField(term83567, term83567.getClass(), "jsType", null);
        setField(term83567, term83567.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term83259;
        callMethod(klass, "process", argTypes, term83189, args);
        assertTrue(recursiveEquals(term83189, term83566));
        assertTrue(recursiveEquals(term83259, null));
    }

};


