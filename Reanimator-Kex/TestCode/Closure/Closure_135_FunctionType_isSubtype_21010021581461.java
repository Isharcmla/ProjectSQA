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

public class FunctionType_isSubtype_21010021581461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1902724;
     Object term1903476;

    public FunctionType_isSubtype_21010021581461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1905206 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1905205 = ((Class) term1905206).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1905205).setAccessible(true);
        Object enum3546 = ((Field) term1905205).get((Object) null);
        Class<? extends Object> term1905506 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1905505 = ((Class) term1905506).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1905505).setAccessible(true);
        Object enum3547 = ((Field) term1905505).get((Object) null);
        term1902724 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1903268 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1903368 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1902724, term1902724.getClass(), "kind", enum3546);
        setField(term1903268, term1903268.getClass(), "kind", enum3547);
        setField(term1903268, term1903268.getClass(), "typeOfThis", term1903368);
        setField(term1902724, term1902724.getClass(), "typeOfThis", term1903268);
        term1903476 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1903806 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1903916 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1903476, term1903476.getClass(), "kind", enum3546);
        setField(term1903806, term1903806.getClass(), "kind", enum3547);
        setField(term1903806, term1903806.getClass(), "typeOfThis", term1903916);
        setField(term1903476, term1903476.getClass(), "typeOfThis", term1903806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1903476;
        try {
            callMethod(klass, "isSubtype", argTypes, term1902724, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


