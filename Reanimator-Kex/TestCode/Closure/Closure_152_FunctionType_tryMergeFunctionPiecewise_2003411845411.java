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

public class FunctionType_tryMergeFunctionPiecewise_2003411845411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term323007;
     Object term323609;

    public FunctionType_tryMergeFunctionPiecewise_2003411845411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term324723 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term324722 = ((Class) term324723).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term324722).setAccessible(true);
        Object enum554 = ((Field) term324722).get((Object) null);
        term323007 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term323101 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term323171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term323241 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term323351 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term323241, term323241.getClass(), "jsType", null);
        setField(term323241, term323241.getClass(), "next", null);
        setField(term323171, term323171.getClass(), "first", term323241);
        setField(term323101, term323101.getClass(), "parameters", term323171);
        setField(term323351, term323351.getClass(), "kind", enum554);
        setField(term323101, term323101.getClass(), "returnType", term323351);
        setField(term323007, term323007.getClass(), "call", term323101);
        term323609 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term323703 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term323773 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term323843 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term323943 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term323843, term323843.getClass(), "jsType", null);
        setField(term323843, term323843.getClass(), "next", null);
        setField(term323773, term323773.getClass(), "first", term323843);
        setField(term323703, term323703.getClass(), "parameters", term323773);
        setField(term323943, term323943.getClass(), "kind", enum554);
        setField(term323703, term323703.getClass(), "returnType", term323943);
        setField(term323609, term323609.getClass(), "call", term323703);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term323609;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term323007, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


