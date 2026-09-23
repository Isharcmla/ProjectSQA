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

public class FoldConstants_process_1962761263241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63118;
     Object term63188;
     Object term63485;
     Object term63486;

    public FoldConstants_process_1962761263241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63118 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term63118, term63118.getClass(), "compiler", null);
        term63188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term63258 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term63188, term63188.getClass(), "type", 125);
        setField(term63258, term63258.getClass(), "next", null);
        setIntField(term63258, term63258.getClass(), "type", 123);
        setField(term63258, term63258.getClass(), "first", null);
        setField(term63188, term63188.getClass(), "first", term63258);
        term63485 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term63485, term63485.getClass(), "compiler", null);
        term63486 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term63487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term63486, term63486.getClass(), "type", 125);
        setField(term63486, term63486.getClass(), "next", null);
        setIntField(term63487, term63487.getClass(), "type", 123);
        setField(term63487, term63487.getClass(), "next", null);
        setField(term63487, term63487.getClass(), "first", null);
        setField(term63487, term63487.getClass(), "last", null);
        setField(term63487, term63487.getClass(), "propListHead", null);
        setIntField(term63487, term63487.getClass(), "sourcePosition", 0);
        setField(term63487, term63487.getClass(), "jsType", null);
        setField(term63487, term63487.getClass(), "parent", null);
        setField(term63486, term63486.getClass(), "first", term63487);
        setField(term63486, term63486.getClass(), "last", null);
        setField(term63486, term63486.getClass(), "propListHead", null);
        setIntField(term63486, term63486.getClass(), "sourcePosition", 0);
        setField(term63486, term63486.getClass(), "jsType", null);
        setField(term63486, term63486.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term63188;
        callMethod(klass, "process", argTypes, term63118, args);
        assertTrue(recursiveEquals(term63118, term63485));
        assertTrue(recursiveEquals(term63188, null));
    }

};


