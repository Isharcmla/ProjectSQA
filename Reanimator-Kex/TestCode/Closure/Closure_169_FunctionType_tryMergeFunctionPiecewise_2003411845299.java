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

public class FunctionType_tryMergeFunctionPiecewise_2003411845299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281859;
     Object term282193;

    public FunctionType_tryMergeFunctionPiecewise_2003411845299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term281859 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term282240 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term282275 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term282310 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term282275, term282275.getClass(), "first", term282275);
        setField(term282275, term282275.getClass(), "jsType", null);
        setField(term282310, term282310.getClass(), "jsType", null);
        setField(term282310, term282310.getClass(), "next", null);
        setField(term282275, term282275.getClass(), "next", term282310);
        setField(term282240, term282240.getClass(), "parameters", term282275);
        setField(term281859, term281859.getClass(), "call", term282240);
        term282193 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term282193, term282193.getClass(), "call", term282240);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term282193;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term281859, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


