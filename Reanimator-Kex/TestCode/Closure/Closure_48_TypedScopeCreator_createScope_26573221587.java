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
import java.lang.Object;

public class TypedScopeCreator_createScope_26573221587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52660;
     Object term52810;
     Object term53094;

    public TypedScopeCreator_createScope_26573221587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52660 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term52740 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term52660, term52660.getClass(), "compiler", term52740);
        term52810 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52880 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52950 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53020 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term52810, term52810.getClass(), "jsType", null);
        setIntField(term52810, term52810.getClass(), "type", 0);
        setField(term52810, term52810.getClass(), "parent", null);
        setField(term52950, term52950.getClass(), "next", null);
        setIntField(term52950, term52950.getClass(), "type", 122);
        setField(term52950, term52950.getClass(), "first", null);
        setField(term52880, term52880.getClass(), "next", term52950);
        setIntField(term52880, term52880.getClass(), "type", 0);
        setField(term53020, term53020.getClass(), "next", null);
        setIntField(term53020, term53020.getClass(), "type", 0);
        setField(term53020, term53020.getClass(), "first", null);
        setField(term52880, term52880.getClass(), "first", term53020);
        setField(term52810, term52810.getClass(), "first", term52880);
        term53094 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term53164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term53094, term53094.getClass(), "rootNode", term53164);
        setField(term53094, term53094.getClass(), "thisType", null);
        setIntField(term53094, term53094.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term52810;
        args[1] = term53094;
        callMethod(klass, "createScope", argTypes, term52660, args);
    }

};


