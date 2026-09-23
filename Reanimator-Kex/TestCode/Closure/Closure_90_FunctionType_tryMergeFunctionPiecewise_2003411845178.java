package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FunctionType_tryMergeFunctionPiecewise_2003411845178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94309;
     Object term94713;

    public FunctionType_tryMergeFunctionPiecewise_2003411845178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94309 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term94403 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term94473 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term94543 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term94982 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term94543, term94543.getClass(), "jsType", null);
        setField(term94543, term94543.getClass(), "next", term94982);
        setField(term94473, term94473.getClass(), "first", term94543);
        setField(term94403, term94403.getClass(), "parameters", term94473);
        setField(term94309, term94309.getClass(), "call", term94403);
        term94713 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term94807 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term94877 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term94947 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term94947, term94947.getClass(), "jsType", null);
        setField(term94947, term94947.getClass(), "next", term94982);
        setField(term94877, term94877.getClass(), "first", term94947);
        setField(term94807, term94807.getClass(), "parameters", term94877);
        setField(term94713, term94713.getClass(), "call", term94807);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term94713;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term94309, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


