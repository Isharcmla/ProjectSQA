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

public class Normalize_process_169323966655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1197279;
     Object term1197429;

    public Normalize_process_169323966655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1197279 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        Object term1197359 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term1197279, term1197279.getClass(), "compiler", term1197359);
        setBooleanField(term1197279, term1197279.getClass(), "assertOnChange", false);
        term1197429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1197499 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1197569 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1197429, term1197429.getClass(), "type", 0);
        setField(term1197499, term1197499.getClass(), "next", term1197569);
        setIntField(term1197499, term1197499.getClass(), "type", 105);
        setField(term1197499, term1197499.getClass(), "last", null);
        setField(term1197429, term1197429.getClass(), "first", term1197499);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1197429;
        try {
            callMethod(klass, "process", argTypes, term1197279, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


