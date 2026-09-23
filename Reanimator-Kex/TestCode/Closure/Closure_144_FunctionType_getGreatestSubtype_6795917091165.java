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

public class FunctionType_getGreatestSubtype_6795917091165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1555401;
     Object term1556175;

    public FunctionType_getGreatestSubtype_6795917091165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1557415 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1557414 = ((Class) term1557415).getDeclaredField((String) "INTERFACE");
        ((Field) term1557414).setAccessible(true);
        Object enum2776 = ((Field) term1557414).get((Object) null);
        Class<? extends Object> term1557709 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1557708 = ((Class) term1557709).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1557708).setAccessible(true);
        Object enum2777 = ((Field) term1557708).get((Object) null);
        term1555401 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1555955 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1556065 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1555401, term1555401.getClass(), "kind", enum2776);
        setField(term1555955, term1555955.getClass(), "kind", enum2776);
        setField(term1556065, term1556065.getClass(), "kind", enum2777);
        setField(term1555955, term1555955.getClass(), "typeOfThis", term1556065);
        setField(term1555401, term1555401.getClass(), "typeOfThis", term1555955);
        term1556175 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1556349 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1556449 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1556175, term1556175.getClass(), "kind", enum2777);
        setField(term1556349, term1556349.getClass(), "kind", enum2777);
        setField(term1556349, term1556349.getClass(), "typeOfThis", term1556449);
        setField(term1556175, term1556175.getClass(), "typeOfThis", term1556349);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1556175;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1555401, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


