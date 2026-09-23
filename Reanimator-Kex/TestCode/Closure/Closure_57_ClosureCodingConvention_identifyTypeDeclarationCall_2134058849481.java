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

public class ClosureCodingConvention_identifyTypeDeclarationCall_2134058849481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156894;
     Object term156986;
     Object term157170;
     Object term157171;

    public ClosureCodingConvention_identifyTypeDeclarationCall_2134058849481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156894 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term156986 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term157078 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term156986, term156986.getClass(), "first", term157078);
        term157170 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term157170, term157170.getClass(), "propertyTestFunctions", null);
        term157171 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term157172 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term157171, term157171.getClass(), "str", null);
        setIntField(term157171, term157171.getClass(), "type", 0);
        setField(term157171, term157171.getClass(), "next", null);
        setDoubleField(term157172, term157172.getClass(), "number", 0.0);
        setIntField(term157172, term157172.getClass(), "type", 0);
        setField(term157172, term157172.getClass(), "next", null);
        setField(term157172, term157172.getClass(), "first", null);
        setField(term157172, term157172.getClass(), "last", null);
        setField(term157172, term157172.getClass(), "propListHead", null);
        setIntField(term157172, term157172.getClass(), "sourcePosition", 0);
        setField(term157172, term157172.getClass(), "jsType", null);
        setField(term157172, term157172.getClass(), "parent", null);
        setField(term157171, term157171.getClass(), "first", term157172);
        setField(term157171, term157171.getClass(), "last", null);
        setField(term157171, term157171.getClass(), "propListHead", null);
        setIntField(term157171, term157171.getClass(), "sourcePosition", 0);
        setField(term157171, term157171.getClass(), "jsType", null);
        setField(term157171, term157171.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term156986;
        Object retValue = callMethod(klass, "identifyTypeDeclarationCall", argTypes, term156894, args);
        assertTrue(recursiveEquals(term156894, term157170));
        assertTrue(recursiveEquals(term156986, term157171));
        assertTrue(recursiveEquals(retValue, null));
    }

};


