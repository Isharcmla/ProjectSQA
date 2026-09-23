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

public class NodeUtil_mayBeStringHelper_1019295344341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31044;
     Object term31126;

    public NodeUtil_mayBeStringHelper_1019295344341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31044 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31044, term31044.getClass(), "type", 35);
        term31126 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31126, term31126.getClass(), "type", 35);
        setField(term31126, term31126.getClass(), "next", null);
        setField(term31126, term31126.getClass(), "first", null);
        setField(term31126, term31126.getClass(), "last", null);
        setField(term31126, term31126.getClass(), "propListHead", null);
        setIntField(term31126, term31126.getClass(), "sourcePosition", 0);
        setField(term31126, term31126.getClass(), "jsType", null);
        setField(term31126, term31126.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term31044;
        Object retValue = callMethod(klass, "mayBeStringHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term31044, term31126));
        assertTrue(recursiveEquals(retValue, true));
    }

};


