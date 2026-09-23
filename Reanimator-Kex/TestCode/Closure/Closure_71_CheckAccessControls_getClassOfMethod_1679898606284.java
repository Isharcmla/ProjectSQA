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

public class CheckAccessControls_getClassOfMethod_1679898606284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86155;
     Object term86247;
     Object term87744;
     Object term87745;

    public CheckAccessControls_getClassOfMethod_1679898606284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86155 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term86247 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term86339 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term86247, term86247.getClass(), "type", 86);
        setField(term86247, term86247.getClass(), "first", term86339);
        term87744 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term87744, term87744.getClass(), "compiler", null);
        setField(term87744, term87744.getClass(), "validator", null);
        setIntField(term87744, term87744.getClass(), "deprecatedDepth", 0);
        setIntField(term87744, term87744.getClass(), "methodDepth", 0);
        setField(term87744, term87744.getClass(), "currentClass", null);
        setField(term87744, term87744.getClass(), "initializedConstantProperties", null);
        term87745 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term87746 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term87745, term87745.getClass(), "number", 0.0);
        setIntField(term87745, term87745.getClass(), "type", 86);
        setField(term87745, term87745.getClass(), "next", null);
        setDoubleField(term87746, term87746.getClass(), "number", 0.0);
        setIntField(term87746, term87746.getClass(), "type", 0);
        setField(term87746, term87746.getClass(), "next", null);
        setField(term87746, term87746.getClass(), "first", null);
        setField(term87746, term87746.getClass(), "last", null);
        setField(term87746, term87746.getClass(), "propListHead", null);
        setIntField(term87746, term87746.getClass(), "sourcePosition", 0);
        setField(term87746, term87746.getClass(), "jsType", null);
        setField(term87746, term87746.getClass(), "parent", null);
        setField(term87745, term87745.getClass(), "first", term87746);
        setField(term87745, term87745.getClass(), "last", null);
        setField(term87745, term87745.getClass(), "propListHead", null);
        setIntField(term87745, term87745.getClass(), "sourcePosition", 0);
        setField(term87745, term87745.getClass(), "jsType", null);
        setField(term87745, term87745.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term86247;
        Object retValue = callMethod(klass, "getClassOfMethod", argTypes, term86155, args);
        assertTrue(recursiveEquals(term86155, term87744));
        assertTrue(recursiveEquals(term86247, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


