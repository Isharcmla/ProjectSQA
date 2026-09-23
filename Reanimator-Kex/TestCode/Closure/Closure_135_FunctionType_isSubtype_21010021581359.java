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

public class FunctionType_isSubtype_21010021581359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1730311;
     Object term1731081;

    public FunctionType_isSubtype_21010021581359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1734213 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1734212 = ((Class) term1734213).getDeclaredField((String) "INTERFACE");
        ((Field) term1734212).setAccessible(true);
        Object enum3232 = ((Field) term1734212).get((Object) null);
        term1730311 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1730863 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1730973 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1730311, term1730311.getClass(), "kind", enum3232);
        setField(term1730863, term1730863.getClass(), "kind", enum3232);
        setField(term1730863, term1730863.getClass(), "typeOfThis", term1730973);
        setField(term1730311, term1730311.getClass(), "typeOfThis", term1730863);
        Class<? extends Object> term1734507 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1734506 = ((Class) term1734507).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1734506).setAccessible(true);
        Object enum3233 = ((Field) term1734506).get((Object) null);
        term1731081 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1731411 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1731081, term1731081.getClass(), "kind", enum3232);
        setField(term1731411, term1731411.getClass(), "kind", enum3233);
        setField(term1731411, term1731411.getClass(), "typeOfThis", null);
        setField(term1731081, term1731081.getClass(), "typeOfThis", term1731411);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1731081;
        try {
            callMethod(klass, "isSubtype", argTypes, term1730311, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


