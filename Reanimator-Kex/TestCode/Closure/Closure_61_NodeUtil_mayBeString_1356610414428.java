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

public class NodeUtil_mayBeString_1356610414428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35807;
     Object term35907;

    public NodeUtil_mayBeString_1356610414428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term35807, term35807.getClass(), "type", 19);
        term35907 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term35907, term35907.getClass(), "type", 19);
        setField(term35907, term35907.getClass(), "next", null);
        setField(term35907, term35907.getClass(), "first", null);
        setField(term35907, term35907.getClass(), "last", null);
        setField(term35907, term35907.getClass(), "propListHead", null);
        setIntField(term35907, term35907.getClass(), "sourcePosition", 0);
        setField(term35907, term35907.getClass(), "jsType", null);
        setField(term35907, term35907.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term35807;
        args[1] = false;
        callMethod(klass, "mayBeString", argTypes, null, args);
        assertTrue(recursiveEquals(term35807, term35907));
    }

};


