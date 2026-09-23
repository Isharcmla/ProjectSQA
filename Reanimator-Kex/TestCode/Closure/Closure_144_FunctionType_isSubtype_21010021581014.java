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
import java.lang.String;
import java.lang.Object;

public class FunctionType_isSubtype_21010021581014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1285509;
     Object term1286261;

    public FunctionType_isSubtype_21010021581014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1290041 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1290040 = ((Class) term1290041).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1290040).setAccessible(true);
        Object enum2312 = ((Field) term1290040).get((Object) null);
        term1285509 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1286063 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1286151 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1285509, term1285509.getClass(), "kind", enum2312);
        setField(term1286063, term1286063.getClass(), "kind", enum2312);
        setField(term1286063, term1286063.getClass(), "typeOfThis", term1286151);
        setField(term1285509, term1285509.getClass(), "typeOfThis", term1286063);
        Class<? extends Object> term1290341 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1290340 = ((Class) term1290341).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1290340).setAccessible(true);
        Object enum2313 = ((Field) term1290340).get((Object) null);
        term1286261 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1286445 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1286261, term1286261.getClass(), "kind", enum2313);
        setField(term1286445, term1286445.getClass(), "kind", enum2312);
        setField(term1286445, term1286445.getClass(), "typeOfThis", null);
        setField(term1286261, term1286261.getClass(), "typeOfThis", term1286445);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1286261;
        try {
            callMethod(klass, "isSubtype", argTypes, term1285509, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


