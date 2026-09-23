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

public class Normalize_process_1693239666170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2440989;
     Object term2441139;

    public Normalize_process_1693239666170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2440989 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        Object term2441069 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term2440989, term2440989.getClass(), "compiler", term2441069);
        setBooleanField(term2440989, term2440989.getClass(), "assertOnChange", false);
        term2441139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2441225 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term2441139, term2441139.getClass(), "type", 113);
        setField(term2441225, term2441225.getClass(), "next", null);
        setIntField(term2441225, term2441225.getClass(), "type", 0);
        setField(term2441225, term2441225.getClass(), "first", null);
        setField(term2441139, term2441139.getClass(), "first", term2441225);
        setField(term2441139, term2441139.getClass(), "last", term2441225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2441139;
        try {
            callMethod(klass, "process", argTypes, term2440989, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


