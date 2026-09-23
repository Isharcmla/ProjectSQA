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

public class FunctionType_isSubtype_21010021581431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2043433;
     Object term2044187;

    public FunctionType_isSubtype_21010021581431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2045534 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2045533 = ((Class) term2045534).getDeclaredField((String) "INTERFACE");
        ((Field) term2045533).setAccessible(true);
        Object enum3634 = ((Field) term2045533).get((Object) null);
        Class<? extends Object> term2045828 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2045827 = ((Class) term2045828).getDeclaredField((String) "INTERFACE");
        ((Field) term2045827).setAccessible(true);
        Object enum3635 = ((Field) term2045827).get((Object) null);
        term2043433 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2043977 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term2044077 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term2043433, term2043433.getClass(), "kind", enum3634);
        setField(term2043977, term2043977.getClass(), "kind", enum3635);
        setField(term2043977, term2043977.getClass(), "typeOfThis", term2044077);
        setField(term2043433, term2043433.getClass(), "typeOfThis", term2043977);
        term2044187 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2044519 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2044187, term2044187.getClass(), "kind", enum3634);
        setField(term2044519, term2044519.getClass(), "kind", enum3634);
        setField(term2044519, term2044519.getClass(), "typeOfThis", null);
        setField(term2044187, term2044187.getClass(), "typeOfThis", term2044519);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2044187;
        try {
            callMethod(klass, "isSubtype", argTypes, term2043433, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


