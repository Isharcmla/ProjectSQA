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

public class FunctionType_isSubtype_21010021581220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1497732;
     Object term1498386;

    public FunctionType_isSubtype_21010021581220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1501279 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1501278 = ((Class) term1501279).getDeclaredField((String) "INTERFACE");
        ((Field) term1501278).setAccessible(true);
        Object enum2800 = ((Field) term1501278).get((Object) null);
        term1497732 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1498276 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1497732, term1497732.getClass(), "kind", enum2800);
        setField(term1497732, term1497732.getClass(), "typeOfThis", term1498276);
        Class<? extends Object> term1501573 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1501572 = ((Class) term1501573).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1501572).setAccessible(true);
        Object enum2801 = ((Field) term1501572).get((Object) null);
        term1498386 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1498568 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1498386, term1498386.getClass(), "kind", enum2801);
        setField(term1498386, term1498386.getClass(), "typeOfThis", term1498568);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1498386;
        try {
            callMethod(klass, "isSubtype", argTypes, term1497732, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


