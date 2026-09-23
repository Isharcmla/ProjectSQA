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

public class FunctionType_tryMergeFunctionPiecewise_2003411845231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118604;
     Object term118962;

    public FunctionType_tryMergeFunctionPiecewise_2003411845231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118604 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term118698 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term119091 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term118862 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term119091, term119091.getClass(), "first", null);
        setField(term118698, term118698.getClass(), "parameters", term119091);
        setField(term118698, term118698.getClass(), "returnType", term118862);
        setField(term118604, term118604.getClass(), "call", term118698);
        term118962 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term119056 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term119185 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term119056, term119056.getClass(), "parameters", term119091);
        setField(term119056, term119056.getClass(), "returnType", term119185);
        setField(term118962, term118962.getClass(), "call", term119056);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term118962;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term118604, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


