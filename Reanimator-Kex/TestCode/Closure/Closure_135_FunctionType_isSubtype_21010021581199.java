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

public class FunctionType_isSubtype_21010021581199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1459500;
     Object term1460160;

    public FunctionType_isSubtype_21010021581199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1461272 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1461271 = ((Class) term1461272).getDeclaredField((String) "ORDINARY");
        ((Field) term1461271).setAccessible(true);
        Object enum2729 = ((Field) term1461271).get((Object) null);
        term1459500 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1460052 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1459500, term1459500.getClass(), "kind", enum2729);
        setField(term1459500, term1459500.getClass(), "typeOfThis", term1460052);
        Class<? extends Object> term1461563 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1461562 = ((Class) term1461563).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1461562).setAccessible(true);
        Object enum2730 = ((Field) term1461562).get((Object) null);
        term1460160 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1460344 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1460160, term1460160.getClass(), "kind", enum2730);
        setField(term1460160, term1460160.getClass(), "typeOfThis", term1460344);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1460160;
        try {
            callMethod(klass, "isSubtype", argTypes, term1459500, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


