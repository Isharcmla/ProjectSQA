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

public class Normalize_process_1693239666202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2657808;
     Object term2657894;

    public Normalize_process_1693239666202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2657808 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        setField(term2657808, term2657808.getClass(), "compiler", null);
        setBooleanField(term2657808, term2657808.getClass(), "assertOnChange", false);
        term2657894 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2657980 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2658066 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term2657894, term2657894.getClass(), "type", 113);
        setField(term2657980, term2657980.getClass(), "next", null);
        setIntField(term2657980, term2657980.getClass(), "type", 0);
        setField(term2657980, term2657980.getClass(), "first", null);
        setField(term2657894, term2657894.getClass(), "first", term2657980);
        setField(term2657894, term2657894.getClass(), "last", term2658066);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2657894;
        try {
            callMethod(klass, "process", argTypes, term2657808, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


