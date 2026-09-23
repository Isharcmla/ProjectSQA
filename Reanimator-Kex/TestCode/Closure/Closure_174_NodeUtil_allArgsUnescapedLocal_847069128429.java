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
import java.lang.Object;

public class NodeUtil_allArgsUnescapedLocal_847069128429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37972;
     Object term59601;

    public NodeUtil_allArgsUnescapedLocal_847069128429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37972 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38042 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term38112, term38112.getClass(), "type", 102);
        setField(term38042, term38042.getClass(), "next", term38112);
        setField(term37972, term37972.getClass(), "first", term38042);
        term59601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59602 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59603 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term59601, term59601.getClass(), "type", 0);
        setField(term59601, term59601.getClass(), "next", null);
        setIntField(term59602, term59602.getClass(), "type", 0);
        setIntField(term59603, term59603.getClass(), "type", 102);
        setField(term59603, term59603.getClass(), "next", null);
        setField(term59603, term59603.getClass(), "first", null);
        setField(term59603, term59603.getClass(), "last", null);
        setField(term59603, term59603.getClass(), "propListHead", null);
        setIntField(term59603, term59603.getClass(), "sourcePosition", 0);
        setField(term59603, term59603.getClass(), "jsType", null);
        setField(term59603, term59603.getClass(), "parent", null);
        setField(term59602, term59602.getClass(), "next", term59603);
        setField(term59602, term59602.getClass(), "first", null);
        setField(term59602, term59602.getClass(), "last", null);
        setField(term59602, term59602.getClass(), "propListHead", null);
        setIntField(term59602, term59602.getClass(), "sourcePosition", 0);
        setField(term59602, term59602.getClass(), "jsType", null);
        setField(term59602, term59602.getClass(), "parent", null);
        setField(term59601, term59601.getClass(), "first", term59602);
        setField(term59601, term59601.getClass(), "last", null);
        setField(term59601, term59601.getClass(), "propListHead", null);
        setIntField(term59601, term59601.getClass(), "sourcePosition", 0);
        setField(term59601, term59601.getClass(), "jsType", null);
        setField(term59601, term59601.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term37972;
        Object retValue = callMethod(klass, "allArgsUnescapedLocal", argTypes, null, args);
        assertTrue(recursiveEquals(term37972, term59601));
        assertTrue(recursiveEquals(retValue, true));
    }

};


