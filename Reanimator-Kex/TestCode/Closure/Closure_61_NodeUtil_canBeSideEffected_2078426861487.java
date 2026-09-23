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

public class NodeUtil_canBeSideEffected_2078426861487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41028;
     Object term41034;

    public NodeUtil_canBeSideEffected_2078426861487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41028, term41028.getClass(), "type", 35);
        term41034 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41034, term41034.getClass(), "type", 35);
        setField(term41034, term41034.getClass(), "next", null);
        setField(term41034, term41034.getClass(), "first", null);
        setField(term41034, term41034.getClass(), "last", null);
        setField(term41034, term41034.getClass(), "propListHead", null);
        setIntField(term41034, term41034.getClass(), "sourcePosition", 0);
        setField(term41034, term41034.getClass(), "jsType", null);
        setField(term41034, term41034.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term41028;
        args[1] = null;
        Object retValue = callMethod(klass, "canBeSideEffected", argTypes, null, args);
        assertTrue(recursiveEquals(term41028, term41034));
        assertTrue(recursiveEquals(retValue, true));
    }

};


