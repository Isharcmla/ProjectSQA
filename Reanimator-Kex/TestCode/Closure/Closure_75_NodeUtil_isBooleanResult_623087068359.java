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

public class NodeUtil_isBooleanResult_623087068359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31953;
     Object term31968;

    public NodeUtil_isBooleanResult_623087068359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31953 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31953, term31953.getClass(), "type", 14);
        term31968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31968, term31968.getClass(), "type", 14);
        setField(term31968, term31968.getClass(), "next", null);
        setField(term31968, term31968.getClass(), "first", null);
        setField(term31968, term31968.getClass(), "last", null);
        setField(term31968, term31968.getClass(), "propListHead", null);
        setIntField(term31968, term31968.getClass(), "sourcePosition", 0);
        setField(term31968, term31968.getClass(), "jsType", null);
        setField(term31968, term31968.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term31953;
        callMethod(klass, "isBooleanResult", argTypes, null, args);
        assertTrue(recursiveEquals(term31953, term31968));
    }

};


