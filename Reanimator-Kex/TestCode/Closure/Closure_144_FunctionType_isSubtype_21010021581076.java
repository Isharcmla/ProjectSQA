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

public class FunctionType_isSubtype_21010021581076 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1401566;
     Object term1402104;

    public FunctionType_isSubtype_21010021581076() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1404895 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1404894 = ((Class) term1404895).getDeclaredField((String) "ORDINARY");
        ((Field) term1404894).setAccessible(true);
        Object enum2516 = ((Field) term1404894).get((Object) null);
        term1401566 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1401814 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1401902 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term1401996 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1401566, term1401566.getClass(), "kind", enum2516);
        setField(term1401814, term1401814.getClass(), "kind", enum2516);
        setField(term1401814, term1401814.getClass(), "typeOfThis", term1401902);
        setField(term1401814, term1401814.getClass(), "call", term1401996);
        setField(term1401566, term1401566.getClass(), "typeOfThis", term1401814);
        Class<? extends Object> term1405186 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1405185 = ((Class) term1405186).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1405185).setAccessible(true);
        Object enum2517 = ((Field) term1405185).get((Object) null);
        term1402104 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1402286 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1402104, term1402104.getClass(), "kind", enum2516);
        setField(term1402286, term1402286.getClass(), "kind", enum2517);
        setField(term1402286, term1402286.getClass(), "typeOfThis", null);
        setField(term1402286, term1402286.getClass(), "call", null);
        setField(term1402104, term1402104.getClass(), "typeOfThis", term1402286);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1402104;
        try {
            callMethod(klass, "isSubtype", argTypes, term1401566, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


