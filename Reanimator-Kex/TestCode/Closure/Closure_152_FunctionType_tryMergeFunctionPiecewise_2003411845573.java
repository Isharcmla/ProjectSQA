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

public class FunctionType_tryMergeFunctionPiecewise_2003411845573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term546527;
     Object term547223;

    public FunctionType_tryMergeFunctionPiecewise_2003411845573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term548331 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term548330 = ((Class) term548331).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term548330).setAccessible(true);
        Object enum855 = ((Field) term548330).get((Object) null);
        term546527 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term546621 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term546691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term546761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term547512 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term547123 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term546761, term546761.getClass(), "jsType", null);
        setField(term546761, term546761.getClass(), "next", null);
        setField(term546691, term546691.getClass(), "first", term546761);
        setField(term546621, term546621.getClass(), "parameters", term546691);
        setField(term547512, term547512.getClass(), "kind", enum855);
        setField(term546621, term546621.getClass(), "returnType", term547512);
        setBooleanField(term546621, term546621.getClass(), "returnTypeInferred", true);
        setField(term546527, term546527.getClass(), "call", term546621);
        setField(term546527, term546527.getClass(), "typeOfThis", null);
        setField(term546527, term546527.getClass(), "registry", term547123);
        term547223 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term547317 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term547387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term547457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term547457, term547457.getClass(), "jsType", null);
        setField(term547457, term547457.getClass(), "next", null);
        setField(term547387, term547387.getClass(), "first", term547457);
        setField(term547317, term547317.getClass(), "parameters", term547387);
        setField(term547317, term547317.getClass(), "returnType", term547512);
        setField(term547223, term547223.getClass(), "call", term547317);
        setField(term547223, term547223.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term547223;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term546527, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


