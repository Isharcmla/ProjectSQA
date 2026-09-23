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

public class NodeUtil_mayHaveSideEffects_1029731851253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22063;
     Object term22072;

    public NodeUtil_mayHaveSideEffects_1029731851253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22063 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22063, term22063.getClass(), "type", 51);
        term22072 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22072, term22072.getClass(), "type", 51);
        setField(term22072, term22072.getClass(), "next", null);
        setField(term22072, term22072.getClass(), "first", null);
        setField(term22072, term22072.getClass(), "last", null);
        setField(term22072, term22072.getClass(), "propListHead", null);
        setIntField(term22072, term22072.getClass(), "sourcePosition", 0);
        setField(term22072, term22072.getClass(), "jsType", null);
        setField(term22072, term22072.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term22063;
        args[1] = null;
        callMethod(klass, "mayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term22063, term22072));
    }

};


