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

public class FunctionType_getGreatestSubtype_6795917091385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1959130;
     Object term1959784;

    public FunctionType_getGreatestSubtype_6795917091385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1962472 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1962471 = ((Class) term1962472).getDeclaredField((String) "ORDINARY");
        ((Field) term1962471).setAccessible(true);
        Object enum3478 = ((Field) term1962471).get((Object) null);
        term1959130 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1959674 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1959130, term1959130.getClass(), "kind", enum3478);
        setField(term1959130, term1959130.getClass(), "typeOfThis", term1959674);
        term1959784 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1959784, term1959784.getClass(), "kind", enum3478);
        setField(term1959784, term1959784.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1959784;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1959130, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


