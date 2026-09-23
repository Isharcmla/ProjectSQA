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

public class TypedScopeCreator_createScope_26573221587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53558;
     Object term53650;
     Object term53724;

    public TypedScopeCreator_createScope_26573221587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53558 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term53558, term53558.getClass(), "compiler", null);
        term53650 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term53650, term53650.getClass(), "jsType", null);
        setIntField(term53650, term53650.getClass(), "type", 0);
        setField(term53650, term53650.getClass(), "parent", null);
        setField(term53650, term53650.getClass(), "first", null);
        term53724 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term53724, term53724.getClass(), "rootNode", null);
        setField(term53724, term53724.getClass(), "thisType", null);
        setIntField(term53724, term53724.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term53650;
        args[1] = term53724;
        callMethod(klass, "createScope", argTypes, term53558, args);
    }

};


