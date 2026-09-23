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

public class Normalize_process_1693239666199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2655900;
     Object term2656050;

    public Normalize_process_1693239666199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2655900 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        Object term2655980 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term2655900, term2655900.getClass(), "compiler", term2655980);
        setBooleanField(term2655900, term2655900.getClass(), "assertOnChange", false);
        term2656050 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2656120 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2656050, term2656050.getClass(), "type", 0);
        setField(term2656120, term2656120.getClass(), "next", null);
        setIntField(term2656120, term2656120.getClass(), "type", 113);
        setField(term2656120, term2656120.getClass(), "first", null);
        setField(term2656050, term2656050.getClass(), "first", term2656120);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2656050;
        try {
            callMethod(klass, "process", argTypes, term2655900, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


