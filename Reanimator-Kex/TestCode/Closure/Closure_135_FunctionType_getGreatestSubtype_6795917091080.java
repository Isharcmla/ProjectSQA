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

public class FunctionType_getGreatestSubtype_6795917091080 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1251193;
     Object term1251845;

    public FunctionType_getGreatestSubtype_6795917091080() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1254990 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1254989 = ((Class) term1254990).getDeclaredField((String) "INTERFACE");
        ((Field) term1254989).setAccessible(true);
        Object enum2334 = ((Field) term1254989).get((Object) null);
        term1251193 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1251737 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1251193, term1251193.getClass(), "kind", enum2334);
        setField(term1251737, term1251737.getClass(), "kind", enum2334);
        setField(term1251193, term1251193.getClass(), "typeOfThis", term1251737);
        Class<? extends Object> term1255284 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1255283 = ((Class) term1255284).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1255283).setAccessible(true);
        Object enum2335 = ((Field) term1255283).get((Object) null);
        Class<? extends Object> term1255584 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1255583 = ((Class) term1255584).getDeclaredField((String) "INTERFACE");
        ((Field) term1255583).setAccessible(true);
        Object enum2336 = ((Field) term1255583).get((Object) null);
        term1251845 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1252019 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1251845, term1251845.getClass(), "kind", enum2335);
        setField(term1252019, term1252019.getClass(), "kind", enum2336);
        setField(term1251845, term1251845.getClass(), "typeOfThis", term1252019);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1251845;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1251193, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


