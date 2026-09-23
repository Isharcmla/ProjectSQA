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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Normalize_process_1693239666166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2439967;
     Object term2440133;

    public Normalize_process_1693239666166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2439967 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        Object term2440047 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term2439967, term2439967.getClass(), "compiler", term2440047);
        setBooleanField(term2439967, term2439967.getClass(), "assertOnChange", false);
        term2440133 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2440225 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term2440133, term2440133.getClass(), "type", 126);
        setIntField(term2440225, term2440225.getClass(), "type", 126);
        setField(term2440133, term2440133.getClass(), "last", term2440225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2440133;
        callMethod(klass, "process", argTypes, term2439967, args);
    }

};


