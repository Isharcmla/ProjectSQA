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

public class NodeUtil_mayHaveSideEffects_109682951359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29900;
     Object term29909;

    public NodeUtil_mayHaveSideEffects_109682951359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29900 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29900, term29900.getClass(), "type", 100);
        term29909 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29909, term29909.getClass(), "type", 100);
        setField(term29909, term29909.getClass(), "next", null);
        setField(term29909, term29909.getClass(), "first", null);
        setField(term29909, term29909.getClass(), "last", null);
        setField(term29909, term29909.getClass(), "propListHead", null);
        setIntField(term29909, term29909.getClass(), "sourcePosition", 0);
        setField(term29909, term29909.getClass(), "jsType", null);
        setField(term29909, term29909.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term29900;
        callMethod(klass, "mayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term29900, term29909));
    }

};


