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

public class Normalize_process_1693239666204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2659833;
     Object term2659999;

    public Normalize_process_1693239666204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2659833 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        Object term2659913 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term2659833, term2659833.getClass(), "compiler", term2659913);
        setBooleanField(term2659833, term2659833.getClass(), "assertOnChange", false);
        term2659999 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2660091 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term2659999, term2659999.getClass(), "type", 126);
        setIntField(term2660091, term2660091.getClass(), "type", 120);
        setField(term2660091, term2660091.getClass(), "propListHead", null);
        setIntField(term2660091, term2660091.getClass(), "sourcePosition", 0);
        setField(term2660091, term2660091.getClass(), "next", null);
        setField(term2659999, term2659999.getClass(), "last", term2660091);
        setField(term2659999, term2659999.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2659999;
        try {
            callMethod(klass, "process", argTypes, term2659833, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


