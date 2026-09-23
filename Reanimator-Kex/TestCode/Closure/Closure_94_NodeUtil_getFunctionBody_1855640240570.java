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

public class NodeUtil_getFunctionBody_1855640240570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61809;
     Object term61898;

    public NodeUtil_getFunctionBody_1855640240570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term61809, term61809.getClass(), "type", 105);
        term61898 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term61898, term61898.getClass(), "type", 105);
        setField(term61898, term61898.getClass(), "next", null);
        setField(term61898, term61898.getClass(), "first", null);
        setField(term61898, term61898.getClass(), "last", null);
        setField(term61898, term61898.getClass(), "propListHead", null);
        setIntField(term61898, term61898.getClass(), "sourcePosition", 0);
        setField(term61898, term61898.getClass(), "jsType", null);
        setField(term61898, term61898.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term61809;
        Object retValue = callMethod(klass, "getFunctionBody", argTypes, null, args);
        assertTrue(recursiveEquals(term61809, term61898));
        assertTrue(recursiveEquals(retValue, null));
    }

};


