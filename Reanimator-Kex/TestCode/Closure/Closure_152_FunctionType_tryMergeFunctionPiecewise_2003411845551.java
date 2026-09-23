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

public class FunctionType_tryMergeFunctionPiecewise_2003411845551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term514251;
     Object term514947;

    public FunctionType_tryMergeFunctionPiecewise_2003411845551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term516164 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term516163 = ((Class) term516164).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term516163).setAccessible(true);
        Object enum820 = ((Field) term516163).get((Object) null);
        term514251 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term514345 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term514415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term514485 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term515236 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term514847 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term514485, term514485.getClass(), "jsType", null);
        setField(term514485, term514485.getClass(), "next", null);
        setField(term514415, term514415.getClass(), "first", term514485);
        setField(term514345, term514345.getClass(), "parameters", term514415);
        setField(term515236, term515236.getClass(), "kind", enum820);
        setField(term514345, term514345.getClass(), "returnType", term515236);
        setBooleanField(term514345, term514345.getClass(), "returnTypeInferred", false);
        setField(term514251, term514251.getClass(), "call", term514345);
        setField(term514251, term514251.getClass(), "typeOfThis", null);
        setField(term514251, term514251.getClass(), "registry", term514847);
        term514947 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term515041 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term515111 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term515181 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term515181, term515181.getClass(), "jsType", null);
        setField(term515181, term515181.getClass(), "next", null);
        setField(term515111, term515111.getClass(), "first", term515181);
        setField(term515041, term515041.getClass(), "parameters", term515111);
        setField(term515041, term515041.getClass(), "returnType", term515236);
        setBooleanField(term515041, term515041.getClass(), "returnTypeInferred", false);
        setField(term514947, term514947.getClass(), "call", term515041);
        setField(term514947, term514947.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term514947;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term514251, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


