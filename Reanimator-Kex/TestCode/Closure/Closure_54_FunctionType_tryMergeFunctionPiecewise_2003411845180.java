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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FunctionType_tryMergeFunctionPiecewise_2003411845180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89032;
     Object term89466;

    public FunctionType_tryMergeFunctionPiecewise_2003411845180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89032 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term89126 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term89595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89630 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89366 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term89630, term89630.getClass(), "jsType", null);
        setField(term89630, term89630.getClass(), "next", null);
        setField(term89595, term89595.getClass(), "first", term89630);
        setField(term89126, term89126.getClass(), "parameters", term89595);
        setField(term89126, term89126.getClass(), "returnType", term89366);
        setField(term89032, term89032.getClass(), "call", term89126);
        term89466 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term89560 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term89730 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term89560, term89560.getClass(), "parameters", term89595);
        setField(term89560, term89560.getClass(), "returnType", term89730);
        setField(term89466, term89466.getClass(), "call", term89560);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term89466;
        args[1] = true;
        callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term89032, args);
    }

};


