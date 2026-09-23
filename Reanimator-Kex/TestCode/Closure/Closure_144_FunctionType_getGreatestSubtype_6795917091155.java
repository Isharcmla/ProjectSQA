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

public class FunctionType_getGreatestSubtype_6795917091155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1538317;
     Object term1538979;

    public FunctionType_getGreatestSubtype_6795917091155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1540468 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1540467 = ((Class) term1540468).getDeclaredField((String) "ORDINARY");
        ((Field) term1540467).setAccessible(true);
        Object enum2747 = ((Field) term1540467).get((Object) null);
        Class<? extends Object> term1540759 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1540758 = ((Class) term1540759).getDeclaredField((String) "INTERFACE");
        ((Field) term1540758).setAccessible(true);
        Object enum2748 = ((Field) term1540758).get((Object) null);
        term1538317 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1538869 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1538317, term1538317.getClass(), "kind", enum2747);
        setField(term1538869, term1538869.getClass(), "kind", enum2748);
        setField(term1538317, term1538317.getClass(), "typeOfThis", term1538869);
        Class<? extends Object> term1541053 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1541052 = ((Class) term1541053).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1541052).setAccessible(true);
        Object enum2749 = ((Field) term1541052).get((Object) null);
        term1538979 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1539161 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1538979, term1538979.getClass(), "kind", enum2749);
        setField(term1538979, term1538979.getClass(), "typeOfThis", term1539161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1538979;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1538317, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


