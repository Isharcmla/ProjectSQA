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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term529785;
     Object term529877;
     Object term530544;
     Object term530545;
     Object term530516;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term529785 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term529877 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term529947 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term529877, term529877.getClass(), "first", term529877);
        setField(term529877, term529877.getClass(), "next", term529947);
        setIntField(term529877, term529877.getClass(), "type", 15);
        term530544 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term530544, term530544.getClass(), "currentTraversal", null);
        term530545 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term530546 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term530545, term530545.getClass(), "str", null);
        setIntField(term530545, term530545.getClass(), "type", 15);
        setIntField(term530546, term530546.getClass(), "type", 0);
        setField(term530546, term530546.getClass(), "next", null);
        setField(term530546, term530546.getClass(), "first", null);
        setField(term530546, term530546.getClass(), "last", null);
        setField(term530546, term530546.getClass(), "propListHead", null);
        setIntField(term530546, term530546.getClass(), "sourcePosition", 0);
        setField(term530546, term530546.getClass(), "jsType", null);
        setField(term530546, term530546.getClass(), "parent", null);
        setField(term530545, term530545.getClass(), "next", term530546);
        setField(term530545, term530545.getClass(), "first", term530545);
        setField(term530545, term530545.getClass(), "last", null);
        setField(term530545, term530545.getClass(), "propListHead", null);
        setIntField(term530545, term530545.getClass(), "sourcePosition", 0);
        setField(term530545, term530545.getClass(), "jsType", null);
        setField(term530545, term530545.getClass(), "parent", null);
        term530516 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term530518 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term530516, term530516.getClass(), "str", null);
        setIntField(term530516, term530516.getClass(), "type", 15);
        setIntField(term530518, term530518.getClass(), "type", 0);
        setField(term530518, term530518.getClass(), "next", null);
        setField(term530518, term530518.getClass(), "first", null);
        setField(term530518, term530518.getClass(), "last", null);
        setField(term530518, term530518.getClass(), "propListHead", null);
        setIntField(term530518, term530518.getClass(), "sourcePosition", 0);
        setField(term530518, term530518.getClass(), "jsType", null);
        setField(term530518, term530518.getClass(), "parent", null);
        setField(term530516, term530516.getClass(), "next", term530518);
        setField(term530516, term530516.getClass(), "first", term530516);
        setField(term530516, term530516.getClass(), "last", null);
        setField(term530516, term530516.getClass(), "propListHead", null);
        setIntField(term530516, term530516.getClass(), "sourcePosition", 0);
        setField(term530516, term530516.getClass(), "jsType", null);
        setField(term530516, term530516.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term529877;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term529785, args);
        assertTrue(recursiveEquals(term529785, term530544));
        assertTrue(recursiveEquals(term529877, term530545));
        assertTrue(recursiveEquals(retValue, term530516));
    }

};


