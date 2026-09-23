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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Normalize_process_1693239666135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2221257;
     Object term2221343;

    public Normalize_process_1693239666135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2221257 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        setField(term2221257, term2221257.getClass(), "compiler", null);
        setBooleanField(term2221257, term2221257.getClass(), "assertOnChange", false);
        term2221343 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2221429 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term2221343, term2221343.getClass(), "type", 126);
        setIntField(term2221429, term2221429.getClass(), "type", 121);
        setField(term2221343, term2221343.getClass(), "last", term2221429);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2221343;
        try {
            callMethod(klass, "process", argTypes, term2221257, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


