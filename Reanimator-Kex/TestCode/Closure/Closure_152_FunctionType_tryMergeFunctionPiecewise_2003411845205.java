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

public class FunctionType_tryMergeFunctionPiecewise_2003411845205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100999;
     Object term101433;

    public FunctionType_tryMergeFunctionPiecewise_2003411845205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100999 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term101093 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term101562 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term101597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term101333 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term101597, term101597.getClass(), "jsType", null);
        setField(term101597, term101597.getClass(), "next", null);
        setField(term101562, term101562.getClass(), "first", term101597);
        setField(term101093, term101093.getClass(), "parameters", term101562);
        setField(term101093, term101093.getClass(), "returnType", term101333);
        setField(term100999, term100999.getClass(), "call", term101093);
        term101433 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term101527 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term101697 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term101527, term101527.getClass(), "parameters", term101562);
        setField(term101527, term101527.getClass(), "returnType", term101697);
        setField(term101433, term101433.getClass(), "call", term101527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term101433;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term100999, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


