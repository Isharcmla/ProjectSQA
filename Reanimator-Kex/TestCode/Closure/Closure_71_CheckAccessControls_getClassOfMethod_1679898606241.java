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

public class CheckAccessControls_getClassOfMethod_1679898606241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69547;
     Object term69639;
     Object term70686;
     Object term70687;

    public CheckAccessControls_getClassOfMethod_1679898606241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69547 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term69639 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term69731 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term69639, term69639.getClass(), "type", 86);
        setField(term69639, term69639.getClass(), "first", term69731);
        term70686 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term70686, term70686.getClass(), "compiler", null);
        setField(term70686, term70686.getClass(), "validator", null);
        setIntField(term70686, term70686.getClass(), "deprecatedDepth", 0);
        setIntField(term70686, term70686.getClass(), "methodDepth", 0);
        setField(term70686, term70686.getClass(), "currentClass", null);
        setField(term70686, term70686.getClass(), "initializedConstantProperties", null);
        term70687 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term70688 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term70687, term70687.getClass(), "str", null);
        setIntField(term70687, term70687.getClass(), "type", 86);
        setField(term70687, term70687.getClass(), "next", null);
        setField(term70688, term70688.getClass(), "str", null);
        setIntField(term70688, term70688.getClass(), "type", 0);
        setField(term70688, term70688.getClass(), "next", null);
        setField(term70688, term70688.getClass(), "first", null);
        setField(term70688, term70688.getClass(), "last", null);
        setField(term70688, term70688.getClass(), "propListHead", null);
        setIntField(term70688, term70688.getClass(), "sourcePosition", 0);
        setField(term70688, term70688.getClass(), "jsType", null);
        setField(term70688, term70688.getClass(), "parent", null);
        setField(term70687, term70687.getClass(), "first", term70688);
        setField(term70687, term70687.getClass(), "last", null);
        setField(term70687, term70687.getClass(), "propListHead", null);
        setIntField(term70687, term70687.getClass(), "sourcePosition", 0);
        setField(term70687, term70687.getClass(), "jsType", null);
        setField(term70687, term70687.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term69639;
        Object retValue = callMethod(klass, "getClassOfMethod", argTypes, term69547, args);
        assertTrue(recursiveEquals(term69547, term70686));
        assertTrue(recursiveEquals(term69639, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


