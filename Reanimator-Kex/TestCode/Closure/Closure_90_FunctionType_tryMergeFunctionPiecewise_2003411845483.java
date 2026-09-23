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
import java.lang.StackOverflowError;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class FunctionType_tryMergeFunctionPiecewise_2003411845483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term402123;
     Object term401874;

    public FunctionType_tryMergeFunctionPiecewise_2003411845483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term476828 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term476827 = ((Class) term476828).getDeclaredField((String) "ORDINARY");
        ((Field) term476827).setAccessible(true);
        Object enum687 = ((Field) term476827).get((Object) null);
        term402123 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term402170 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term402205 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term402073 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term402073, term402073.getClass(), "jsType", null);
        setField(term402073, term402073.getClass(), "next", null);
        setField(term402205, term402205.getClass(), "first", term402073);
        setField(term402170, term402170.getClass(), "parameters", term402205);
        setField(term402170, term402170.getClass(), "returnType", term402123);
        setField(term402123, term402123.getClass(), "call", term402170);
        setField(term402123, term402123.getClass(), "kind", enum687);
        setField(term402123, term402123.getClass(), "typeOfThis", term402123);
        term401874 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term401968 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term402038 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term402038, term402038.getClass(), "first", term402073);
        setField(term401968, term401968.getClass(), "parameters", term402038);
        setField(term401968, term401968.getClass(), "returnType", term402123);
        setField(term401874, term401874.getClass(), "call", term401968);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term401874;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term402123, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


