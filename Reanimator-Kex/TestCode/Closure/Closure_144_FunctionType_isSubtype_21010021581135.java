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

public class FunctionType_isSubtype_21010021581135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1503433;
     Object term1504197;

    public FunctionType_isSubtype_21010021581135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1507427 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1507426 = ((Class) term1507427).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1507426).setAccessible(true);
        Object enum2689 = ((Field) term1507426).get((Object) null);
        Class<? extends Object> term1507727 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1507726 = ((Class) term1507727).getDeclaredField((String) "INTERFACE");
        ((Field) term1507726).setAccessible(true);
        Object enum2690 = ((Field) term1507726).get((Object) null);
        term1503433 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1503977 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1504474 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1503433, term1503433.getClass(), "kind", enum2689);
        setField(term1503977, term1503977.getClass(), "kind", enum2689);
        setField(term1504474, term1504474.getClass(), "kind", enum2690);
        setField(term1504474, term1504474.getClass(), "typeOfThis", null);
        setField(term1503977, term1503977.getClass(), "typeOfThis", term1504474);
        setField(term1503433, term1503433.getClass(), "typeOfThis", term1503977);
        term1504197 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1504197, term1504197.getClass(), "kind", enum2689);
        setField(term1504197, term1504197.getClass(), "typeOfThis", term1504474);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1504197;
        try {
            callMethod(klass, "isSubtype", argTypes, term1503433, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


