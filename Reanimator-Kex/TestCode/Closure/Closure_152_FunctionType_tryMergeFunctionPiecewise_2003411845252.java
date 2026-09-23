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

public class FunctionType_tryMergeFunctionPiecewise_2003411845252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133947;
     Object term134381;

    public FunctionType_tryMergeFunctionPiecewise_2003411845252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133947 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term134041 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term134510 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term134545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term134281 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term134545, term134545.getClass(), "jsType", null);
        setField(term134545, term134545.getClass(), "next", null);
        setField(term134510, term134510.getClass(), "first", term134545);
        setField(term134041, term134041.getClass(), "parameters", term134510);
        setField(term134041, term134041.getClass(), "returnType", term134281);
        setField(term133947, term133947.getClass(), "call", term134041);
        term134381 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term134475 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term134645 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term134475, term134475.getClass(), "parameters", term134510);
        setField(term134475, term134475.getClass(), "returnType", term134645);
        setField(term134381, term134381.getClass(), "call", term134475);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term134381;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term133947, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


