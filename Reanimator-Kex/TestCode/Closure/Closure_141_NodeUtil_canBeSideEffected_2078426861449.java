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

public class NodeUtil_canBeSideEffected_2078426861449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35469;
     Object term36898;

    public NodeUtil_canBeSideEffected_2078426861449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term35469, term35469.getClass(), "type", 389427431);
        setIntField(term35539, term35539.getClass(), "type", 0);
        setField(term35539, term35539.getClass(), "first", null);
        setField(term35539, term35539.getClass(), "next", term35609);
        setField(term35469, term35469.getClass(), "first", term35539);
        term36898 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36899 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36900 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36898, term36898.getClass(), "type", 389427431);
        setField(term36898, term36898.getClass(), "next", null);
        setIntField(term36899, term36899.getClass(), "type", 0);
        setIntField(term36900, term36900.getClass(), "type", 0);
        setField(term36900, term36900.getClass(), "next", null);
        setField(term36900, term36900.getClass(), "first", null);
        setField(term36900, term36900.getClass(), "last", null);
        setField(term36900, term36900.getClass(), "propListHead", null);
        setIntField(term36900, term36900.getClass(), "sourcePosition", 0);
        setField(term36900, term36900.getClass(), "jsType", null);
        setField(term36900, term36900.getClass(), "parent", null);
        setField(term36899, term36899.getClass(), "next", term36900);
        setField(term36899, term36899.getClass(), "first", null);
        setField(term36899, term36899.getClass(), "last", null);
        setField(term36899, term36899.getClass(), "propListHead", null);
        setIntField(term36899, term36899.getClass(), "sourcePosition", 0);
        setField(term36899, term36899.getClass(), "jsType", null);
        setField(term36899, term36899.getClass(), "parent", null);
        setField(term36898, term36898.getClass(), "first", term36899);
        setField(term36898, term36898.getClass(), "last", null);
        setField(term36898, term36898.getClass(), "propListHead", null);
        setIntField(term36898, term36898.getClass(), "sourcePosition", 0);
        setField(term36898, term36898.getClass(), "jsType", null);
        setField(term36898, term36898.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term35469;
        args[1] = null;
        Object retValue = callMethod(klass, "canBeSideEffected", argTypes, null, args);
        assertTrue(recursiveEquals(term35469, term36898));
        assertTrue(recursiveEquals(retValue, false));
    }

};


