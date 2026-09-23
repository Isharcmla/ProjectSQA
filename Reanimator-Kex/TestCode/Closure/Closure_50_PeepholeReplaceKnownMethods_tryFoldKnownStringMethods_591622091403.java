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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091403 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2658100;
     Object term2658186;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091403() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2658100 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2658186 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2658278 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2658370 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2658462 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term2658186, term2658186.getClass(), "type", 37);
        setIntField(term2658278, term2658278.getClass(), "type", 33);
        setIntField(term2658462, term2658462.getClass(), "type", 40);
        setField(term2658370, term2658370.getClass(), "next", term2658462);
        setIntField(term2658370, term2658370.getClass(), "type", 40);
        setField(term2658278, term2658278.getClass(), "first", term2658370);
        setField(term2658186, term2658186.getClass(), "first", term2658278);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2658186;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2658100, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


