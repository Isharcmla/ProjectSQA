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

public class Normalize_process_1693239666142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2227571;
     Object term2227737;

    public Normalize_process_1693239666142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2227571 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        Object term2227651 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term2227571, term2227571.getClass(), "compiler", term2227651);
        setBooleanField(term2227571, term2227571.getClass(), "assertOnChange", false);
        term2227737 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2227823 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term2227737, term2227737.getClass(), "type", 113);
        setField(term2227823, term2227823.getClass(), "next", null);
        setIntField(term2227823, term2227823.getClass(), "type", 0);
        setField(term2227823, term2227823.getClass(), "first", null);
        setField(term2227737, term2227737.getClass(), "first", term2227823);
        setField(term2227737, term2227737.getClass(), "last", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2227737;
        try {
            callMethod(klass, "process", argTypes, term2227571, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


