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

public class FunctionType_getGreatestSubtype_679591709948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1168855;
     Object term1169519;

    public FunctionType_getGreatestSubtype_679591709948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1173846 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1173845 = ((Class) term1173846).getDeclaredField((String) "ORDINARY");
        ((Field) term1173845).setAccessible(true);
        Object enum2107 = ((Field) term1173845).get((Object) null);
        term1168855 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1169409 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term1168855, term1168855.getClass(), "kind", enum2107);
        setField(term1168855, term1168855.getClass(), "typeOfThis", term1169409);
        Class<? extends Object> term1174137 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1174136 = ((Class) term1174137).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1174136).setAccessible(true);
        Object enum2108 = ((Field) term1174136).get((Object) null);
        term1169519 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1169701 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1169519, term1169519.getClass(), "kind", enum2108);
        setField(term1169701, term1169701.getClass(), "kind", enum2107);
        setField(term1169701, term1169701.getClass(), "typeOfThis", null);
        setField(term1169519, term1169519.getClass(), "typeOfThis", term1169701);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1169519;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1168855, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


