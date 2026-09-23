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

public class Normalize_process_1693239666139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2224674;
     Object term2224840;

    public Normalize_process_1693239666139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2224674 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        Object term2224754 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term2224674, term2224674.getClass(), "compiler", term2224754);
        setBooleanField(term2224674, term2224674.getClass(), "assertOnChange", false);
        term2224840 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2224932 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term2224840, term2224840.getClass(), "type", 126);
        setIntField(term2224932, term2224932.getClass(), "type", 116);
        setField(term2224840, term2224840.getClass(), "last", term2224932);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2224840;
        try {
            callMethod(klass, "process", argTypes, term2224674, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


