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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypedScopeCreator_createScope_265732215106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42347;
     Object term42439;
     Object term42513;

    public TypedScopeCreator_createScope_265732215106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42347 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term42347, term42347.getClass(), "compiler", null);
        term42439 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term42513 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term42583 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term42513, term42513.getClass(), "rootNode", term42583);
        setIntField(term42513, term42513.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term42439;
        args[1] = term42513;
        try {
            callMethod(klass, "createScope", argTypes, term42347, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


