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
import java.lang.String;

public class FunctionType_tryMergeFunctionPiecewise_2003411845473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403497;
     Object term404019;

    public FunctionType_tryMergeFunctionPiecewise_2003411845473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term405110 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term405109 = ((Class) term405110).getDeclaredField((String) "INTERFACE");
        ((Field) term405109).setAccessible(true);
        Object enum670 = ((Field) term405109).get((Object) null);
        term403497 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term403591 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term403661 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term403761 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term403661, term403661.getClass(), "first", term403661);
        setField(term403661, term403661.getClass(), "jsType", null);
        setField(term403661, term403661.getClass(), "next", null);
        setField(term403591, term403591.getClass(), "parameters", term403661);
        setField(term403761, term403761.getClass(), "kind", enum670);
        setField(term403591, term403591.getClass(), "returnType", term403761);
        setField(term403497, term403497.getClass(), "call", term403591);
        term404019 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term404113 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term404183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term404253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term404353 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term404253, term404253.getClass(), "jsType", null);
        setField(term404253, term404253.getClass(), "next", null);
        setField(term404183, term404183.getClass(), "first", term404253);
        setField(term404113, term404113.getClass(), "parameters", term404183);
        setField(term404353, term404353.getClass(), "kind", enum670);
        setField(term404113, term404113.getClass(), "returnType", term404353);
        setField(term404019, term404019.getClass(), "call", term404113);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term404019;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term403497, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


