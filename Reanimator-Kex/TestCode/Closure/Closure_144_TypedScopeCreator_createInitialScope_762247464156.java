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

public class TypedScopeCreator_createInitialScope_762247464156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74310;
     Object term74460;

    public TypedScopeCreator_createInitialScope_762247464156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74310 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term74390 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term74310, term74310.getClass(), "compiler", term74390);
        setField(term74310, term74310.getClass(), "typeRegistry", null);
        term74460 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74530 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term74460, term74460.getClass(), "type", 0);
        setField(term74530, term74530.getClass(), "next", null);
        setIntField(term74530, term74530.getClass(), "type", 105);
        setField(term74530, term74530.getClass(), "first", null);
        setField(term74460, term74460.getClass(), "first", term74530);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term74460;
        try {
            callMethod(klass, "createInitialScope", argTypes, term74310, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


