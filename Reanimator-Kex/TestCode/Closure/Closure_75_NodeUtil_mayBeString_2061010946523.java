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

public class NodeUtil_mayBeString_2061010946523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40438;
     Object term78503;

    public NodeUtil_mayBeString_2061010946523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40438 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40438, term40438.getClass(), "type", 13);
        term78503 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term78503, term78503.getClass(), "type", 13);
        setField(term78503, term78503.getClass(), "next", null);
        setField(term78503, term78503.getClass(), "first", null);
        setField(term78503, term78503.getClass(), "last", null);
        setField(term78503, term78503.getClass(), "propListHead", null);
        setIntField(term78503, term78503.getClass(), "sourcePosition", 0);
        setField(term78503, term78503.getClass(), "jsType", null);
        setField(term78503, term78503.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term40438;
        callMethod(klass, "mayBeString", argTypes, null, args);
        assertTrue(recursiveEquals(term40438, term78503));
    }

};


