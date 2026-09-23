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

public class FunctionType_tryMergeFunctionPiecewise_2003411845325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214755;
     Object term215347;

    public FunctionType_tryMergeFunctionPiecewise_2003411845325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term216826 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term216825 = ((Class) term216826).getDeclaredField((String) "ORDINARY");
        ((Field) term216825).setAccessible(true);
        Object enum383 = ((Field) term216825).get((Object) null);
        term214755 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term214849 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term214919 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term214989 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term215089 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term214989, term214989.getClass(), "jsType", null);
        setField(term214989, term214989.getClass(), "next", null);
        setField(term214919, term214919.getClass(), "first", term214989);
        setField(term214849, term214849.getClass(), "parameters", term214919);
        setField(term215089, term215089.getClass(), "kind", enum383);
        setField(term214849, term214849.getClass(), "returnType", term215089);
        setField(term214755, term214755.getClass(), "call", term214849);
        Class<? extends Object> term217117 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term217116 = ((Class) term217117).getDeclaredField((String) "INTERFACE");
        ((Field) term217116).setAccessible(true);
        Object enum384 = ((Field) term217116).get((Object) null);
        term215347 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term215441 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term215511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term215581 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term215681 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term215581, term215581.getClass(), "jsType", null);
        setField(term215581, term215581.getClass(), "next", null);
        setField(term215511, term215511.getClass(), "first", term215581);
        setField(term215441, term215441.getClass(), "parameters", term215511);
        setField(term215681, term215681.getClass(), "kind", enum384);
        setField(term215441, term215441.getClass(), "returnType", term215681);
        setField(term215347, term215347.getClass(), "call", term215441);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term215347;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term214755, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


