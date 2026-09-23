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

public class Normalize_process_169323966648 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1192347;
     Object term1192497;

    public Normalize_process_169323966648() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1192347 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        Object term1192427 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term1192347, term1192347.getClass(), "compiler", term1192427);
        setBooleanField(term1192347, term1192347.getClass(), "assertOnChange", false);
        term1192497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1192567 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1192637 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1192497, term1192497.getClass(), "type", 126);
        setIntField(term1192567, term1192567.getClass(), "type", 0);
        setField(term1192567, term1192567.getClass(), "propListHead", null);
        setIntField(term1192567, term1192567.getClass(), "sourcePosition", 0);
        setField(term1192567, term1192567.getClass(), "next", null);
        setField(term1192497, term1192497.getClass(), "last", term1192567);
        setField(term1192497, term1192497.getClass(), "first", term1192637);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1192497;
        try {
            callMethod(klass, "process", argTypes, term1192347, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


