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
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeOptimizationsPass_traverse_11243165835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2889;
     Object term2959;

    public PeepholeOptimizationsPass_traverse_11243165835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2889 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        term2959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3099 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2959, term2959.getClass(), "type", 0);
        setIntField(term3029, term3029.getClass(), "type", 0);
        setIntField(term3099, term3099.getClass(), "type", 0);
        setField(term3099, term3099.getClass(), "first", term3029);
        setField(term3029, term3029.getClass(), "first", term3099);
        setField(term2959, term2959.getClass(), "first", term3029);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2959;
        try {
            callMethod(klass, "traverse", argTypes, term2889, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


