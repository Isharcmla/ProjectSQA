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

public class FunctionType_tryMergeFunctionPiecewise_2003411845278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157964;
     Object term158462;

    public FunctionType_tryMergeFunctionPiecewise_2003411845278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157964 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term158058 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term158128 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term158661 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term158696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term158362 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term158661, term158661.getClass(), "jsType", null);
        setField(term158696, term158696.getClass(), "jsType", null);
        setField(term158696, term158696.getClass(), "next", null);
        setField(term158661, term158661.getClass(), "next", term158696);
        setField(term158128, term158128.getClass(), "first", term158661);
        setField(term158058, term158058.getClass(), "parameters", term158128);
        setField(term158058, term158058.getClass(), "returnType", term158362);
        setField(term157964, term157964.getClass(), "call", term158058);
        term158462 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term158556 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term158626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term158788 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setField(term158626, term158626.getClass(), "first", term158661);
        setField(term158556, term158556.getClass(), "parameters", term158626);
        setField(term158556, term158556.getClass(), "returnType", term158788);
        setField(term158462, term158462.getClass(), "call", term158556);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term158462;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term157964, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


