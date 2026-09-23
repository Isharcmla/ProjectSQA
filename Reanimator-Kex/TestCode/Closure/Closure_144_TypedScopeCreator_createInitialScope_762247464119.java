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

public class TypedScopeCreator_createInitialScope_762247464119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57126;
     Object term57298;

    public TypedScopeCreator_createInitialScope_762247464119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57126 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term57206 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term57126, term57126.getClass(), "compiler", term57206);
        setField(term57126, term57126.getClass(), "typeRegistry", null);
        term57298 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term57298, term57298.getClass(), "type", 105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term57298;
        try {
            callMethod(klass, "createInitialScope", argTypes, term57126, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


