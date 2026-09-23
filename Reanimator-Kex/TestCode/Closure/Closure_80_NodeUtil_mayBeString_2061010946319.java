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

public class NodeUtil_mayBeString_2061010946319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28904;
     Object term28933;

    public NodeUtil_mayBeString_2061010946319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28904 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28904, term28904.getClass(), "type", 102);
        term28933 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28933, term28933.getClass(), "type", 102);
        setField(term28933, term28933.getClass(), "next", null);
        setField(term28933, term28933.getClass(), "first", null);
        setField(term28933, term28933.getClass(), "last", null);
        setField(term28933, term28933.getClass(), "propListHead", null);
        setIntField(term28933, term28933.getClass(), "sourcePosition", 0);
        setField(term28933, term28933.getClass(), "jsType", null);
        setField(term28933, term28933.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term28904;
        callMethod(klass, "mayBeString", argTypes, null, args);
        assertTrue(recursiveEquals(term28904, term28933));
    }

};


