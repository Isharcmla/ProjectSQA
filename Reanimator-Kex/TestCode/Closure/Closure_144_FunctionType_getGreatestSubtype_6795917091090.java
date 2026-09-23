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

public class FunctionType_getGreatestSubtype_6795917091090 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1425239;
     Object term1425901;

    public FunctionType_getGreatestSubtype_6795917091090() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1428025 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1428024 = ((Class) term1428025).getDeclaredField((String) "ORDINARY");
        ((Field) term1428024).setAccessible(true);
        Object enum2558 = ((Field) term1428024).get((Object) null);
        term1425239 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1426029 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1425239, term1425239.getClass(), "kind", enum2558);
        setField(term1426029, term1426029.getClass(), "kind", enum2558);
        setField(term1426029, term1426029.getClass(), "typeOfThis", null);
        setField(term1425239, term1425239.getClass(), "typeOfThis", term1426029);
        Class<? extends Object> term1428316 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1428315 = ((Class) term1428316).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1428315).setAccessible(true);
        Object enum2559 = ((Field) term1428315).get((Object) null);
        term1425901 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1425901, term1425901.getClass(), "kind", enum2559);
        setField(term1425901, term1425901.getClass(), "typeOfThis", term1426029);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1425901;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1425239, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


