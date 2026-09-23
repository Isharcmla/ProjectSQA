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

public class FunctionType_tryMergeFunctionPiecewise_2003411845267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149260;
     Object term149852;

    public FunctionType_tryMergeFunctionPiecewise_2003411845267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term150859 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term150858 = ((Class) term150859).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term150858).setAccessible(true);
        Object enum276 = ((Field) term150858).get((Object) null);
        term149260 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term149354 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term149424 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term149494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term149594 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term149494, term149494.getClass(), "jsType", null);
        setField(term149494, term149494.getClass(), "next", null);
        setField(term149424, term149424.getClass(), "first", term149494);
        setField(term149354, term149354.getClass(), "parameters", term149424);
        setField(term149594, term149594.getClass(), "kind", enum276);
        setField(term149354, term149354.getClass(), "returnType", term149594);
        setField(term149260, term149260.getClass(), "call", term149354);
        term149852 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term149946 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term150016 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term150086 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term150186 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term150086, term150086.getClass(), "jsType", null);
        setField(term150086, term150086.getClass(), "next", null);
        setField(term150016, term150016.getClass(), "first", term150086);
        setField(term149946, term149946.getClass(), "parameters", term150016);
        setField(term149946, term149946.getClass(), "returnType", term150186);
        setField(term149852, term149852.getClass(), "call", term149946);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term149852;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term149260, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


