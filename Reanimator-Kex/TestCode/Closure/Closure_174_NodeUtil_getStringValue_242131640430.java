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

public class NodeUtil_getStringValue_242131640430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38192;
     Object term59626;

    public NodeUtil_getStringValue_242131640430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38192 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term38192, term38192.getClass(), "type", 64);
        term59626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term59626, term59626.getClass(), "type", 64);
        setField(term59626, term59626.getClass(), "next", null);
        setField(term59626, term59626.getClass(), "first", null);
        setField(term59626, term59626.getClass(), "last", null);
        setField(term59626, term59626.getClass(), "propListHead", null);
        setIntField(term59626, term59626.getClass(), "sourcePosition", 0);
        setField(term59626, term59626.getClass(), "jsType", null);
        setField(term59626, term59626.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term38192;
        Object retValue = callMethod(klass, "getStringValue", argTypes, null, args);
        assertTrue(recursiveEquals(term38192, term59626));
        assertTrue(recursiveEquals(retValue, "[object Object]"));
    }

};


