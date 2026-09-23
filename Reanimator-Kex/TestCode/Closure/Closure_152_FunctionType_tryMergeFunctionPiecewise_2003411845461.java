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

public class FunctionType_tryMergeFunctionPiecewise_2003411845461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term389017;
     Object term389597;

    public FunctionType_tryMergeFunctionPiecewise_2003411845461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term390695 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term390694 = ((Class) term390695).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term390694).setAccessible(true);
        Object enum654 = ((Field) term390694).get((Object) null);
        term389017 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term389111 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term389181 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term389251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term389886 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term389251, term389251.getClass(), "jsType", null);
        setField(term389251, term389251.getClass(), "next", null);
        setField(term389181, term389181.getClass(), "first", term389251);
        setField(term389111, term389111.getClass(), "parameters", term389181);
        setField(term389886, term389886.getClass(), "kind", enum654);
        setField(term389111, term389111.getClass(), "returnType", term389886);
        setField(term389017, term389017.getClass(), "call", term389111);
        term389597 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term389691 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term389761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term389831 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term389831, term389831.getClass(), "jsType", null);
        setField(term389831, term389831.getClass(), "next", null);
        setField(term389761, term389761.getClass(), "first", term389831);
        setField(term389691, term389691.getClass(), "parameters", term389761);
        setField(term389691, term389691.getClass(), "returnType", term389886);
        setField(term389597, term389597.getClass(), "call", term389691);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term389597;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term389017, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


