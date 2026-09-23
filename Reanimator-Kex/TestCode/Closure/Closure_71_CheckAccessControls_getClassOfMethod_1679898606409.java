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

public class CheckAccessControls_getClassOfMethod_1679898606409 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205859;
     Object term205951;
     Object term206342;
     Object term206343;

    public CheckAccessControls_getClassOfMethod_1679898606409() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term205859 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term205951 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term206043 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term205951, term205951.getClass(), "type", 86);
        setField(term205951, term205951.getClass(), "first", term206043);
        term206342 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term206342, term206342.getClass(), "compiler", null);
        setField(term206342, term206342.getClass(), "validator", null);
        setIntField(term206342, term206342.getClass(), "deprecatedDepth", 0);
        setIntField(term206342, term206342.getClass(), "methodDepth", 0);
        setField(term206342, term206342.getClass(), "currentClass", null);
        setField(term206342, term206342.getClass(), "initializedConstantProperties", null);
        term206343 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term206344 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term206343, term206343.getClass(), "number", 0.0);
        setIntField(term206343, term206343.getClass(), "type", 86);
        setField(term206343, term206343.getClass(), "next", null);
        setDoubleField(term206344, term206344.getClass(), "number", 0.0);
        setIntField(term206344, term206344.getClass(), "type", 0);
        setField(term206344, term206344.getClass(), "next", null);
        setField(term206344, term206344.getClass(), "first", null);
        setField(term206344, term206344.getClass(), "last", null);
        setField(term206344, term206344.getClass(), "propListHead", null);
        setIntField(term206344, term206344.getClass(), "sourcePosition", 0);
        setField(term206344, term206344.getClass(), "jsType", null);
        setField(term206344, term206344.getClass(), "parent", null);
        setField(term206343, term206343.getClass(), "first", term206344);
        setField(term206343, term206343.getClass(), "last", null);
        setField(term206343, term206343.getClass(), "propListHead", null);
        setIntField(term206343, term206343.getClass(), "sourcePosition", 0);
        setField(term206343, term206343.getClass(), "jsType", null);
        setField(term206343, term206343.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term205951;
        Object retValue = callMethod(klass, "getClassOfMethod", argTypes, term205859, args);
        assertTrue(recursiveEquals(term205859, term206342));
        assertTrue(recursiveEquals(term205951, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


