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

public class Normalize_process_1693239666194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2652764;
     Object term2652930;

    public Normalize_process_1693239666194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2652764 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        Object term2652844 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term2652764, term2652764.getClass(), "compiler", term2652844);
        setBooleanField(term2652764, term2652764.getClass(), "assertOnChange", false);
        term2652930 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2653022 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term2652930, term2652930.getClass(), "type", 126);
        setIntField(term2653022, term2653022.getClass(), "type", 124);
        setField(term2652930, term2652930.getClass(), "last", term2653022);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2652930;
        try {
            callMethod(klass, "process", argTypes, term2652764, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


