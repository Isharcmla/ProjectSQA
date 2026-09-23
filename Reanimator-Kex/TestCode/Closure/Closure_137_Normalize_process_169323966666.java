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

public class Normalize_process_169323966666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1203395;
     Object term1203567;

    public Normalize_process_169323966666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1203395 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        Object term1203475 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term1203395, term1203395.getClass(), "compiler", term1203475);
        setBooleanField(term1203395, term1203395.getClass(), "assertOnChange", false);
        term1203567 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1203659 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1203751 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1203843 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term1203567, term1203567.getClass(), "type", 0);
        setField(term1203751, term1203751.getClass(), "next", term1203843);
        setIntField(term1203751, term1203751.getClass(), "type", 126);
        setField(term1203659, term1203659.getClass(), "next", term1203751);
        setIntField(term1203659, term1203659.getClass(), "type", 132);
        setField(term1203659, term1203659.getClass(), "propListHead", null);
        setField(term1203659, term1203659.getClass(), "first", null);
        setField(term1203567, term1203567.getClass(), "first", term1203659);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1203567;
        try {
            callMethod(klass, "process", argTypes, term1203395, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


