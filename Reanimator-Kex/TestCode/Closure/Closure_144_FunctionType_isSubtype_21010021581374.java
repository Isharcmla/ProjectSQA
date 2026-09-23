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

public class FunctionType_isSubtype_21010021581374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1939362;
     Object term1940016;

    public FunctionType_isSubtype_21010021581374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1943161 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1943160 = ((Class) term1943161).getDeclaredField((String) "ORDINARY");
        ((Field) term1943160).setAccessible(true);
        Object enum3443 = ((Field) term1943160).get((Object) null);
        Class<? extends Object> term1943452 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1943451 = ((Class) term1943452).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1943451).setAccessible(true);
        Object enum3444 = ((Field) term1943451).get((Object) null);
        term1939362 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1939906 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1939362, term1939362.getClass(), "kind", enum3443);
        setField(term1939906, term1939906.getClass(), "kind", enum3444);
        setField(term1939906, term1939906.getClass(), "typeOfThis", null);
        setField(term1939362, term1939362.getClass(), "typeOfThis", term1939906);
        term1940016 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1940348 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1940436 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1940016, term1940016.getClass(), "kind", enum3443);
        setField(term1940348, term1940348.getClass(), "kind", enum3443);
        setField(term1940348, term1940348.getClass(), "typeOfThis", term1940436);
        setField(term1940016, term1940016.getClass(), "typeOfThis", term1940348);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1940016;
        try {
            callMethod(klass, "isSubtype", argTypes, term1939362, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


