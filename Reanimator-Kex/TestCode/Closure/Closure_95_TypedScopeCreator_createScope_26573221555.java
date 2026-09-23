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

public class TypedScopeCreator_createScope_26573221555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29342;
     Object term29492;
     Object term29706;

    public TypedScopeCreator_createScope_26573221555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29342 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term29422 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term29342, term29342.getClass(), "compiler", term29422);
        term29492 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29562 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term29492, term29492.getClass(), "jsType", null);
        setIntField(term29492, term29492.getClass(), "type", 0);
        setField(term29562, term29562.getClass(), "next", term29632);
        setIntField(term29562, term29562.getClass(), "type", 47);
        setField(term29562, term29562.getClass(), "first", null);
        setField(term29492, term29492.getClass(), "first", term29562);
        term29706 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term29776 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term29706, term29706.getClass(), "rootNode", term29776);
        setField(term29706, term29706.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term29492;
        args[1] = term29706;
        try {
            callMethod(klass, "createScope", argTypes, term29342, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


