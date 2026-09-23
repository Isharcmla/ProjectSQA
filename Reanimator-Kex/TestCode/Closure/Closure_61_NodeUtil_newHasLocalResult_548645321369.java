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

public class NodeUtil_newHasLocalResult_548645321369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30987;
     Object term31014;

    public NodeUtil_newHasLocalResult_548645321369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30987, term30987.getClass(), "type", 30);
        term31014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31014, term31014.getClass(), "type", 30);
        setField(term31014, term31014.getClass(), "next", null);
        setField(term31014, term31014.getClass(), "first", null);
        setField(term31014, term31014.getClass(), "last", null);
        setField(term31014, term31014.getClass(), "propListHead", null);
        setIntField(term31014, term31014.getClass(), "sourcePosition", 0);
        setField(term31014, term31014.getClass(), "jsType", null);
        setField(term31014, term31014.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term30987;
        callMethod(klass, "newHasLocalResult", argTypes, null, args);
        assertTrue(recursiveEquals(term30987, term31014));
    }

};


