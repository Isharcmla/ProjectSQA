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

public class FunctionType_tryMergeFunctionPiecewise_2003411845327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217640;
     Object term218232;

    public FunctionType_tryMergeFunctionPiecewise_2003411845327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term219241 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term219240 = ((Class) term219241).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term219240).setAccessible(true);
        Object enum386 = ((Field) term219240).get((Object) null);
        term217640 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term217734 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term217804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term217874 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term217974 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term217874, term217874.getClass(), "jsType", null);
        setField(term217874, term217874.getClass(), "next", null);
        setField(term217804, term217804.getClass(), "first", term217874);
        setField(term217734, term217734.getClass(), "parameters", term217804);
        setField(term217974, term217974.getClass(), "kind", enum386);
        setField(term217734, term217734.getClass(), "returnType", term217974);
        setField(term217640, term217640.getClass(), "call", term217734);
        term218232 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term218326 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term218396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term218466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term218566 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term218466, term218466.getClass(), "jsType", null);
        setField(term218466, term218466.getClass(), "next", null);
        setField(term218396, term218396.getClass(), "first", term218466);
        setField(term218326, term218326.getClass(), "parameters", term218396);
        setField(term218326, term218326.getClass(), "returnType", term218566);
        setField(term218232, term218232.getClass(), "call", term218326);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term218232;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term217640, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


