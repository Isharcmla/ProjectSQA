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

public class TypeValidator_expectUndeclaredVariable_59719754178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53971;
     Object term54063;
     Object term54145;
     Object term54159;
     Object term54160;
     Object term54161;

    public TypeValidator_expectUndeclaredVariable_59719754178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53971 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term54063 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term54063, term54063.getClass(), "type", -34);
        term54145 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        term54159 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term54159, term54159.getClass(), "compiler", null);
        setField(term54159, term54159.getClass(), "typeRegistry", null);
        setField(term54159, term54159.getClass(), "allValueTypes", null);
        setBooleanField(term54159, term54159.getClass(), "shouldReport", false);
        setField(term54159, term54159.getClass(), "nullOrUndefined", null);
        setField(term54159, term54159.getClass(), "mismatches", null);
        term54160 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term54160, term54160.getClass(), "number", 0.0);
        setIntField(term54160, term54160.getClass(), "type", -34);
        setField(term54160, term54160.getClass(), "next", null);
        setField(term54160, term54160.getClass(), "first", null);
        setField(term54160, term54160.getClass(), "last", null);
        setField(term54160, term54160.getClass(), "propListHead", null);
        setIntField(term54160, term54160.getClass(), "sourcePosition", 0);
        setField(term54160, term54160.getClass(), "jsType", null);
        setField(term54160, term54160.getClass(), "parent", null);
        term54161 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        setField(term54161, term54161.getClass(), "name", null);
        setField(term54161, term54161.getClass(), "nameNode", null);
        setField(term54161, term54161.getClass(), "type", null);
        setField(term54161, term54161.getClass(), "info", null);
        setBooleanField(term54161, term54161.getClass(), "typeInferred", false);
        setField(term54161, term54161.getClass(), "input", null);
        setBooleanField(term54161, term54161.getClass(), "isDefine", false);
        setIntField(term54161, term54161.getClass(), "index", 0);
        setField(term54161, term54161.getClass(), "scope", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("com.google.javascript.jscomp.Scope$Var");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = term54063;
        args[2] = null;
        args[3] = term54145;
        args[4] = null;
        args[5] = null;
        callMethod(klass, "expectUndeclaredVariable", argTypes, term53971, args);
        assertTrue(recursiveEquals(term53971, term54159));
        assertTrue(recursiveEquals(term54063, term54161));
        assertTrue(recursiveEquals(term54145, null));
    }

};


