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

public class NodeUtil_mayHaveSideEffects_109682951621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4242462;
     Object term4242478;

    public NodeUtil_mayHaveSideEffects_109682951621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4242462 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4242462, term4242462.getClass(), "type", 74);
        term4242478 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4242478, term4242478.getClass(), "type", 74);
        setField(term4242478, term4242478.getClass(), "next", null);
        setField(term4242478, term4242478.getClass(), "first", null);
        setField(term4242478, term4242478.getClass(), "last", null);
        setField(term4242478, term4242478.getClass(), "propListHead", null);
        setIntField(term4242478, term4242478.getClass(), "sourcePosition", 0);
        setField(term4242478, term4242478.getClass(), "jsType", null);
        setField(term4242478, term4242478.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4242462;
        callMethod(klass, "mayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term4242462, term4242478));
    }

};


