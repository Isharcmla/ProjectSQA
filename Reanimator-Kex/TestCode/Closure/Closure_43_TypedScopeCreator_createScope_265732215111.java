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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypedScopeCreator_createScope_265732215111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77837;
     Object term77987;
     Object term78131;

    public TypedScopeCreator_createScope_265732215111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77837 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term77917 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term77837, term77837.getClass(), "compiler", term77917);
        term77987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term77987, term77987.getClass(), "jsType", null);
        setIntField(term77987, term77987.getClass(), "type", 0);
        setField(term77987, term77987.getClass(), "parent", null);
        setField(term78057, term78057.getClass(), "next", null);
        setIntField(term78057, term78057.getClass(), "type", 39);
        setField(term78057, term78057.getClass(), "first", null);
        setField(term77987, term77987.getClass(), "first", term78057);
        term78131 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term78131, term78131.getClass(), "rootNode", null);
        setField(term78131, term78131.getClass(), "thisType", null);
        setIntField(term78131, term78131.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term77987;
        args[1] = term78131;
        try {
            callMethod(klass, "createScope", argTypes, term77837, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


