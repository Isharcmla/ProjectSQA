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

public class Normalize_process_1693239666130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2218604;
     Object term2218754;

    public Normalize_process_1693239666130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2218604 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        Object term2218684 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term2218604, term2218604.getClass(), "compiler", term2218684);
        setBooleanField(term2218604, term2218604.getClass(), "assertOnChange", false);
        term2218754 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2218840 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2218910 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2218754, term2218754.getClass(), "type", 0);
        setField(term2218840, term2218840.getClass(), "next", term2218910);
        setIntField(term2218840, term2218840.getClass(), "type", 113);
        setField(term2218840, term2218840.getClass(), "first", null);
        setField(term2218754, term2218754.getClass(), "first", term2218840);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2218754;
        try {
            callMethod(klass, "process", argTypes, term2218604, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


