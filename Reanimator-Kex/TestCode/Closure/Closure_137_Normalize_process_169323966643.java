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

public class Normalize_process_169323966643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1190052;
     Object term1190122;

    public Normalize_process_169323966643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1190052 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        setField(term1190052, term1190052.getClass(), "compiler", null);
        setBooleanField(term1190052, term1190052.getClass(), "assertOnChange", false);
        term1190122 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1190208 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term1190122, term1190122.getClass(), "type", 0);
        setField(term1190122, term1190122.getClass(), "first", term1190208);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1190122;
        try {
            callMethod(klass, "process", argTypes, term1190052, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


