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

public class NodeUtil_mayHaveSideEffects_109682951392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31415;
     Object term31587;

    public NodeUtil_mayHaveSideEffects_109682951392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31415, term31415.getClass(), "type", 72);
        term31587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31587, term31587.getClass(), "type", 72);
        setField(term31587, term31587.getClass(), "next", null);
        setField(term31587, term31587.getClass(), "first", null);
        setField(term31587, term31587.getClass(), "last", null);
        setField(term31587, term31587.getClass(), "propListHead", null);
        setIntField(term31587, term31587.getClass(), "sourcePosition", 0);
        setField(term31587, term31587.getClass(), "jsType", null);
        setField(term31587, term31587.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term31415;
        callMethod(klass, "mayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term31415, term31587));
    }

};


