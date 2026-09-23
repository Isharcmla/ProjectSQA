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

public class FunctionType_tryMergeFunctionPiecewise_2003411845659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term671684;
     Object term672194;

    public FunctionType_tryMergeFunctionPiecewise_2003411845659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term673274 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term673273 = ((Class) term673274).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term673273).setAccessible(true);
        Object enum1029 = ((Field) term673273).get((Object) null);
        term671684 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term671778 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term672393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term671958 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term672393, term672393.getClass(), "first", term672393);
        setField(term672393, term672393.getClass(), "jsType", null);
        setField(term672393, term672393.getClass(), "next", null);
        setField(term671778, term671778.getClass(), "parameters", term672393);
        setField(term671958, term671958.getClass(), "kind", enum1029);
        setField(term671778, term671778.getClass(), "returnType", term671958);
        setField(term671684, term671684.getClass(), "call", term671778);
        term672194 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term672288 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term672358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term672503 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term672358, term672358.getClass(), "first", term672393);
        setField(term672288, term672288.getClass(), "parameters", term672358);
        setField(term672503, term672503.getClass(), "kind", enum1029);
        setField(term672288, term672288.getClass(), "returnType", term672503);
        setField(term672194, term672194.getClass(), "call", term672288);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term672194;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term671684, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


