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

public class FunctionType_isSubtype_21010021581173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1410204;
     Object term1410982;

    public FunctionType_isSubtype_21010021581173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1413963 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1413962 = ((Class) term1413963).getDeclaredField((String) "INTERFACE");
        ((Field) term1413962).setAccessible(true);
        Object enum2639 = ((Field) term1413962).get((Object) null);
        term1410204 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1410756 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1410874 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term1410204, term1410204.getClass(), "kind", enum2639);
        setField(term1410756, term1410756.getClass(), "kind", enum2639);
        setField(term1410756, term1410756.getClass(), "typeOfThis", term1410874);
        setField(term1410204, term1410204.getClass(), "typeOfThis", term1410756);
        Class<? extends Object> term1414257 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1414256 = ((Class) term1414257).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1414256).setAccessible(true);
        Object enum2640 = ((Field) term1414256).get((Object) null);
        term1410982 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1411164 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1410982, term1410982.getClass(), "kind", enum2640);
        setField(term1411164, term1411164.getClass(), "kind", enum2639);
        setField(term1411164, term1411164.getClass(), "typeOfThis", null);
        setField(term1410982, term1410982.getClass(), "typeOfThis", term1411164);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1410982;
        try {
            callMethod(klass, "isSubtype", argTypes, term1410204, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


