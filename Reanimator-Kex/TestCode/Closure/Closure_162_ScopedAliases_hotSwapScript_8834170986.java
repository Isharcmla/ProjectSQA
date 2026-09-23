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

public class ScopedAliases_hotSwapScript_8834170986 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44415;
     Object term44507;
     Object term45424;
     Object term45425;

    public ScopedAliases_hotSwapScript_8834170986() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44415 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term44415, term44415.getClass(), "compiler", null);
        term44507 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term44599 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term44669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44739 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44831 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term44507, term44507.getClass(), "type", 0);
        setField(term44507, term44507.getClass(), "parent", null);
        setField(term44669, term44669.getClass(), "next", term44739);
        setIntField(term44669, term44669.getClass(), "type", 0);
        setField(term44669, term44669.getClass(), "first", null);
        setField(term44599, term44599.getClass(), "next", term44669);
        setIntField(term44599, term44599.getClass(), "type", 0);
        setField(term44831, term44831.getClass(), "next", null);
        setIntField(term44831, term44831.getClass(), "type", 0);
        setField(term44831, term44831.getClass(), "first", null);
        setField(term44599, term44599.getClass(), "first", term44831);
        setField(term44507, term44507.getClass(), "first", term44599);
        term45424 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term45424, term45424.getClass(), "compiler", null);
        setField(term45424, term45424.getClass(), "preprocessorSymbolTable", null);
        setField(term45424, term45424.getClass(), "transformationHandler", null);
        term45425 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term45426 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term45427 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45428 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45429 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term45425, term45425.getClass(), "number", 0.0);
        setIntField(term45425, term45425.getClass(), "type", 0);
        setField(term45425, term45425.getClass(), "next", null);
        setDoubleField(term45426, term45426.getClass(), "number", 0.0);
        setIntField(term45426, term45426.getClass(), "type", 0);
        setIntField(term45427, term45427.getClass(), "type", 0);
        setIntField(term45428, term45428.getClass(), "type", 0);
        setField(term45428, term45428.getClass(), "next", null);
        setField(term45428, term45428.getClass(), "first", null);
        setField(term45428, term45428.getClass(), "last", null);
        setField(term45428, term45428.getClass(), "propListHead", null);
        setIntField(term45428, term45428.getClass(), "sourcePosition", 0);
        setField(term45428, term45428.getClass(), "jsType", null);
        setField(term45428, term45428.getClass(), "parent", null);
        setField(term45427, term45427.getClass(), "next", term45428);
        setField(term45427, term45427.getClass(), "first", null);
        setField(term45427, term45427.getClass(), "last", null);
        setField(term45427, term45427.getClass(), "propListHead", null);
        setIntField(term45427, term45427.getClass(), "sourcePosition", 0);
        setField(term45427, term45427.getClass(), "jsType", null);
        setField(term45427, term45427.getClass(), "parent", null);
        setField(term45426, term45426.getClass(), "next", term45427);
        setDoubleField(term45429, term45429.getClass(), "number", 0.0);
        setIntField(term45429, term45429.getClass(), "type", 0);
        setField(term45429, term45429.getClass(), "next", null);
        setField(term45429, term45429.getClass(), "first", null);
        setField(term45429, term45429.getClass(), "last", null);
        setField(term45429, term45429.getClass(), "propListHead", null);
        setIntField(term45429, term45429.getClass(), "sourcePosition", 0);
        setField(term45429, term45429.getClass(), "jsType", null);
        setField(term45429, term45429.getClass(), "parent", null);
        setField(term45426, term45426.getClass(), "first", term45429);
        setField(term45426, term45426.getClass(), "last", null);
        setField(term45426, term45426.getClass(), "propListHead", null);
        setIntField(term45426, term45426.getClass(), "sourcePosition", 0);
        setField(term45426, term45426.getClass(), "jsType", null);
        setField(term45426, term45426.getClass(), "parent", null);
        setField(term45425, term45425.getClass(), "first", term45426);
        setField(term45425, term45425.getClass(), "last", null);
        setField(term45425, term45425.getClass(), "propListHead", null);
        setIntField(term45425, term45425.getClass(), "sourcePosition", 0);
        setField(term45425, term45425.getClass(), "jsType", null);
        setField(term45425, term45425.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term44507;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term44415, args);
        assertTrue(recursiveEquals(term44415, term45424));
        assertTrue(recursiveEquals(term44507, term45425));
    }

};


