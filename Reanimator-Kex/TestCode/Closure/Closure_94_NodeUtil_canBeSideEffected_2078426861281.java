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

public class NodeUtil_canBeSideEffected_2078426861281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25187;
     Object term25193;

    public NodeUtil_canBeSideEffected_2078426861281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25187 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25187, term25187.getClass(), "type", 33);
        term25193 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25193, term25193.getClass(), "type", 33);
        setField(term25193, term25193.getClass(), "next", null);
        setField(term25193, term25193.getClass(), "first", null);
        setField(term25193, term25193.getClass(), "last", null);
        setField(term25193, term25193.getClass(), "propListHead", null);
        setIntField(term25193, term25193.getClass(), "sourcePosition", 0);
        setField(term25193, term25193.getClass(), "jsType", null);
        setField(term25193, term25193.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term25187;
        args[1] = null;
        Object retValue = callMethod(klass, "canBeSideEffected", argTypes, null, args);
        assertTrue(recursiveEquals(term25187, term25193));
        assertTrue(recursiveEquals(retValue, true));
    }

};


