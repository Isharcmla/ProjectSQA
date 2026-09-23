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

public class FunctionType_getGreatestSubtype_6795917091355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1904863;
     Object term1905225;

    public FunctionType_getGreatestSubtype_6795917091355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1908533 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1908532 = ((Class) term1908533).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1908532).setAccessible(true);
        Object enum3381 = ((Field) term1908532).get((Object) null);
        term1904863 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1905115 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term1904863, term1904863.getClass(), "kind", enum3381);
        setField(term1904863, term1904863.getClass(), "registry", term1905115);
        Class<? extends Object> term1908833 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1908832 = ((Class) term1908833).getDeclaredField((String) "ORDINARY");
        ((Field) term1908832).setAccessible(true);
        Object enum3382 = ((Field) term1908832).get((Object) null);
        term1905225 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1905225, term1905225.getClass(), "kind", enum3382);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1905225;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1904863, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


