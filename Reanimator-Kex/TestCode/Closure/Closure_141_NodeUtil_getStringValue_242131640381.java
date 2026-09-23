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

public class NodeUtil_getStringValue_242131640381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30924;
     Object term30943;

    public NodeUtil_getStringValue_242131640381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30924, term30924.getClass(), "type", 41);
        term30943 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30943, term30943.getClass(), "type", 41);
        setField(term30943, term30943.getClass(), "next", null);
        setField(term30943, term30943.getClass(), "first", null);
        setField(term30943, term30943.getClass(), "last", null);
        setField(term30943, term30943.getClass(), "propListHead", null);
        setIntField(term30943, term30943.getClass(), "sourcePosition", 0);
        setField(term30943, term30943.getClass(), "jsType", null);
        setField(term30943, term30943.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term30924;
        Object retValue = callMethod(klass, "getStringValue", argTypes, null, args);
        assertTrue(recursiveEquals(term30924, term30943));
        assertTrue(recursiveEquals(retValue, "null"));
    }

};


