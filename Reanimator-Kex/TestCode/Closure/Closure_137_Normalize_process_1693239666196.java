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

public class Normalize_process_1693239666196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2654265;
     Object term2654437;

    public Normalize_process_1693239666196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2654265 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        Object term2654345 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term2654265, term2654265.getClass(), "compiler", term2654345);
        setBooleanField(term2654265, term2654265.getClass(), "assertOnChange", false);
        term2654437 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2654529 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2654621 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term2654437, term2654437.getClass(), "type", 0);
        setField(term2654529, term2654529.getClass(), "next", term2654621);
        setIntField(term2654529, term2654529.getClass(), "type", 105);
        setField(term2654529, term2654529.getClass(), "last", null);
        setField(term2654437, term2654437.getClass(), "first", term2654529);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2654437;
        try {
            callMethod(klass, "process", argTypes, term2654265, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


