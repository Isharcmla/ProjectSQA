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

public class NodeUtil_canBeSideEffected_1382575805293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23058;
     Object term23187;

    public NodeUtil_canBeSideEffected_1382575805293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23128 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23058, term23058.getClass(), "type", -506958186);
        setIntField(term23128, term23128.getClass(), "type", 30);
        setField(term23058, term23058.getClass(), "first", term23128);
        term23187 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23187, term23187.getClass(), "type", -506958186);
        setField(term23187, term23187.getClass(), "next", null);
        setIntField(term23188, term23188.getClass(), "type", 30);
        setField(term23188, term23188.getClass(), "next", null);
        setField(term23188, term23188.getClass(), "first", null);
        setField(term23188, term23188.getClass(), "last", null);
        setField(term23188, term23188.getClass(), "propListHead", null);
        setIntField(term23188, term23188.getClass(), "sourcePosition", 0);
        setField(term23188, term23188.getClass(), "jsType", null);
        setField(term23188, term23188.getClass(), "parent", null);
        setField(term23187, term23187.getClass(), "first", term23188);
        setField(term23187, term23187.getClass(), "last", null);
        setField(term23187, term23187.getClass(), "propListHead", null);
        setIntField(term23187, term23187.getClass(), "sourcePosition", 0);
        setField(term23187, term23187.getClass(), "jsType", null);
        setField(term23187, term23187.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term23058;
        callMethod(klass, "canBeSideEffected", argTypes, null, args);
        assertTrue(recursiveEquals(term23058, term23187));
    }

};


