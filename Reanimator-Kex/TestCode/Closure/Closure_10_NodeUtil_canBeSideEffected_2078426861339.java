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

public class NodeUtil_canBeSideEffected_2078426861339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32686;
     Object term32972;

    public NodeUtil_canBeSideEffected_2078426861339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32686 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32756 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32826 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32896 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32686, term32686.getClass(), "type", 4);
        setIntField(term32756, term32756.getClass(), "type", 4);
        setIntField(term32826, term32826.getClass(), "type", 4);
        setField(term32826, term32826.getClass(), "first", null);
        setField(term32826, term32826.getClass(), "next", term32896);
        setField(term32756, term32756.getClass(), "first", term32826);
        setField(term32686, term32686.getClass(), "first", term32756);
        term32972 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32973 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32974 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32975 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32972, term32972.getClass(), "type", 4);
        setField(term32972, term32972.getClass(), "next", null);
        setIntField(term32973, term32973.getClass(), "type", 4);
        setField(term32973, term32973.getClass(), "next", null);
        setIntField(term32974, term32974.getClass(), "type", 4);
        setIntField(term32975, term32975.getClass(), "type", 0);
        setField(term32975, term32975.getClass(), "next", null);
        setField(term32975, term32975.getClass(), "first", null);
        setField(term32975, term32975.getClass(), "last", null);
        setField(term32975, term32975.getClass(), "propListHead", null);
        setIntField(term32975, term32975.getClass(), "sourcePosition", 0);
        setField(term32975, term32975.getClass(), "jsType", null);
        setField(term32975, term32975.getClass(), "parent", null);
        setField(term32974, term32974.getClass(), "next", term32975);
        setField(term32974, term32974.getClass(), "first", null);
        setField(term32974, term32974.getClass(), "last", null);
        setField(term32974, term32974.getClass(), "propListHead", null);
        setIntField(term32974, term32974.getClass(), "sourcePosition", 0);
        setField(term32974, term32974.getClass(), "jsType", null);
        setField(term32974, term32974.getClass(), "parent", null);
        setField(term32973, term32973.getClass(), "first", term32974);
        setField(term32973, term32973.getClass(), "last", null);
        setField(term32973, term32973.getClass(), "propListHead", null);
        setIntField(term32973, term32973.getClass(), "sourcePosition", 0);
        setField(term32973, term32973.getClass(), "jsType", null);
        setField(term32973, term32973.getClass(), "parent", null);
        setField(term32972, term32972.getClass(), "first", term32973);
        setField(term32972, term32972.getClass(), "last", null);
        setField(term32972, term32972.getClass(), "propListHead", null);
        setIntField(term32972, term32972.getClass(), "sourcePosition", 0);
        setField(term32972, term32972.getClass(), "jsType", null);
        setField(term32972, term32972.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term32686;
        args[1] = null;
        Object retValue = callMethod(klass, "canBeSideEffected", argTypes, null, args);
        assertTrue(recursiveEquals(term32686, term32972));
        assertTrue(recursiveEquals(retValue, false));
    }

};


