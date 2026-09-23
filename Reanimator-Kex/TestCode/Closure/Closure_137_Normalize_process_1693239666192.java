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

public class Normalize_process_1693239666192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2651599;
     Object term2651749;

    public Normalize_process_1693239666192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2651599 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        Object term2651679 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term2651599, term2651599.getClass(), "compiler", term2651679);
        setBooleanField(term2651599, term2651599.getClass(), "assertOnChange", false);
        term2651749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2651749, term2651749.getClass(), "type", 105);
        setField(term2651749, term2651749.getClass(), "last", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2651749;
        try {
            callMethod(klass, "process", argTypes, term2651599, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


