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

public class NodeUtil_hasCatchHandler_1686917870431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33599;
     Object term33611;

    public NodeUtil_hasCatchHandler_1686917870431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33599, term33599.getClass(), "type", 125);
        term33611 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33611, term33611.getClass(), "type", 125);
        setField(term33611, term33611.getClass(), "next", null);
        setField(term33611, term33611.getClass(), "first", null);
        setField(term33611, term33611.getClass(), "last", null);
        setField(term33611, term33611.getClass(), "propListHead", null);
        setIntField(term33611, term33611.getClass(), "sourcePosition", 0);
        setField(term33611, term33611.getClass(), "jsType", null);
        setField(term33611, term33611.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term33599;
        Object retValue = callMethod(klass, "hasCatchHandler", argTypes, null, args);
        assertTrue(recursiveEquals(term33599, term33611));
        assertTrue(recursiveEquals(retValue, false));
    }

};


