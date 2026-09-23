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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FunctionType_tryMergeFunctionPiecewise_2003411845224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122149;
     Object term122507;

    public FunctionType_tryMergeFunctionPiecewise_2003411845224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122149 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term122243 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term122636 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122407 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term122636, term122636.getClass(), "first", null);
        setField(term122243, term122243.getClass(), "parameters", term122636);
        setField(term122243, term122243.getClass(), "returnType", term122407);
        setField(term122149, term122149.getClass(), "call", term122243);
        term122507 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term122601 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term122730 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term122601, term122601.getClass(), "parameters", term122636);
        setField(term122601, term122601.getClass(), "returnType", term122730);
        setField(term122507, term122507.getClass(), "call", term122601);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term122507;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term122149, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


