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

public class NodeUtil_arrayToString_1073419571419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52121;
     Object term52769;

    public NodeUtil_arrayToString_1073419571419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term52121, term52121.getClass(), "first", null);
        term52769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term52769, term52769.getClass(), "type", 0);
        setField(term52769, term52769.getClass(), "next", null);
        setField(term52769, term52769.getClass(), "first", null);
        setField(term52769, term52769.getClass(), "last", null);
        setField(term52769, term52769.getClass(), "propListHead", null);
        setIntField(term52769, term52769.getClass(), "sourcePosition", 0);
        setField(term52769, term52769.getClass(), "jsType", null);
        setField(term52769, term52769.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term52121;
        Object retValue = callMethod(klass, "arrayToString", argTypes, null, args);
        assertTrue(recursiveEquals(term52121, term52769));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


