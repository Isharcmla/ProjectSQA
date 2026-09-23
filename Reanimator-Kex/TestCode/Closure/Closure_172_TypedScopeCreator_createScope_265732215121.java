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

public class TypedScopeCreator_createScope_265732215121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53311;
     Object term53483;
     Object term53557;

    public TypedScopeCreator_createScope_265732215121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53311 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term53391 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term53311, term53311.getClass(), "compiler", term53391);
        term53483 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term53483, term53483.getClass(), "type", 132);
        term53557 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term53557, term53557.getClass(), "rootNode", null);
        setIntField(term53557, term53557.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term53483;
        args[1] = term53557;
        callMethod(klass, "createScope", argTypes, term53311, args);
    }

};


