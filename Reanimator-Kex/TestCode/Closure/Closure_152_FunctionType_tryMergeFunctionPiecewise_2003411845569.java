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

public class FunctionType_tryMergeFunctionPiecewise_2003411845569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term539268;
     Object term539778;

    public FunctionType_tryMergeFunctionPiecewise_2003411845569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term540762 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term540761 = ((Class) term540762).getDeclaredField((String) "ORDINARY");
        ((Field) term540761).setAccessible(true);
        Object enum846 = ((Field) term540761).get((Object) null);
        term539268 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term539362 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term539432 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term539542 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term539432, term539432.getClass(), "first", term539432);
        setField(term539432, term539432.getClass(), "jsType", null);
        setField(term539432, term539432.getClass(), "next", null);
        setField(term539362, term539362.getClass(), "parameters", term539432);
        setField(term539542, term539542.getClass(), "kind", enum846);
        setField(term539362, term539362.getClass(), "returnType", term539542);
        setField(term539268, term539268.getClass(), "call", term539362);
        term539778 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term539872 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term539942 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term540012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term540112 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term540012, term540012.getClass(), "jsType", null);
        setField(term540012, term540012.getClass(), "next", null);
        setField(term539942, term539942.getClass(), "first", term540012);
        setField(term539872, term539872.getClass(), "parameters", term539942);
        setField(term539872, term539872.getClass(), "returnType", term540112);
        setField(term539778, term539778.getClass(), "call", term539872);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term539778;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term539268, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


