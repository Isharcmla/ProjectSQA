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

public class CheckAccessControls_hotSwapScript_739486180425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210844;
     Object term210994;

    public CheckAccessControls_hotSwapScript_739486180425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210844 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        Object term210924 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term210844, term210844.getClass(), "compiler", term210924);
        term210994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term211064 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term211176 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setIntField(term210994, term210994.getClass(), "type", 30);
        setField(term211064, term211064.getClass(), "next", null);
        setIntField(term211064, term211064.getClass(), "type", 0);
        setField(term211064, term211064.getClass(), "first", null);
        setField(term210994, term210994.getClass(), "first", term211064);
        setField(term210994, term210994.getClass(), "jsType", term211176);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term210994;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term210844, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


