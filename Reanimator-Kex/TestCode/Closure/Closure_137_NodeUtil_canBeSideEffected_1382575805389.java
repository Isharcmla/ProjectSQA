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

public class NodeUtil_canBeSideEffected_1382575805389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31119;
     Object term31240;

    public NodeUtil_canBeSideEffected_1382575805389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31211 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term31119, term31119.getClass(), "type", -506958186);
        setField(term31119, term31119.getClass(), "first", term31211);
        term31240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31241 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term31240, term31240.getClass(), "type", -506958186);
        setField(term31240, term31240.getClass(), "next", null);
        setField(term31241, term31241.getClass(), "str", null);
        setIntField(term31241, term31241.getClass(), "type", 0);
        setField(term31241, term31241.getClass(), "next", null);
        setField(term31241, term31241.getClass(), "first", null);
        setField(term31241, term31241.getClass(), "last", null);
        setField(term31241, term31241.getClass(), "propListHead", null);
        setIntField(term31241, term31241.getClass(), "sourcePosition", 0);
        setField(term31241, term31241.getClass(), "jsType", null);
        setField(term31241, term31241.getClass(), "parent", null);
        setField(term31240, term31240.getClass(), "first", term31241);
        setField(term31240, term31240.getClass(), "last", null);
        setField(term31240, term31240.getClass(), "propListHead", null);
        setIntField(term31240, term31240.getClass(), "sourcePosition", 0);
        setField(term31240, term31240.getClass(), "jsType", null);
        setField(term31240, term31240.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term31119;
        callMethod(klass, "canBeSideEffected", argTypes, null, args);
        assertTrue(recursiveEquals(term31119, term31240));
    }

};


