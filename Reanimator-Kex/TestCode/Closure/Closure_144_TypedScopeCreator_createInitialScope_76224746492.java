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

public class TypedScopeCreator_createInitialScope_76224746492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45343;
     Object term45493;

    public TypedScopeCreator_createInitialScope_76224746492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45343 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term45423 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term45343, term45343.getClass(), "compiler", term45423);
        setField(term45343, term45343.getClass(), "typeRegistry", null);
        term45493 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45563 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term45493, term45493.getClass(), "type", 0);
        setField(term45563, term45563.getClass(), "next", null);
        setIntField(term45563, term45563.getClass(), "type", 105);
        setField(term45563, term45563.getClass(), "first", null);
        setField(term45493, term45493.getClass(), "first", term45563);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term45493;
        try {
            callMethod(klass, "createInitialScope", argTypes, term45343, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


