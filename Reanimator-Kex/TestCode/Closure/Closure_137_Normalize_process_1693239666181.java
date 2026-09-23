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

public class Normalize_process_1693239666181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2643460;
     Object term2643626;

    public Normalize_process_1693239666181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2643460 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        Object term2643540 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term2643460, term2643460.getClass(), "compiler", term2643540);
        setBooleanField(term2643460, term2643460.getClass(), "assertOnChange", false);
        term2643626 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2643718 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term2643626, term2643626.getClass(), "type", 126);
        setIntField(term2643718, term2643718.getClass(), "type", 122);
        setField(term2643626, term2643626.getClass(), "last", term2643718);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2643626;
        try {
            callMethod(klass, "process", argTypes, term2643460, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


