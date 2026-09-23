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

public class FunctionType_isSubtype_21010021581095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1434270;
     Object term1435030;

    public FunctionType_isSubtype_21010021581095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1436448 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1436447 = ((Class) term1436448).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1436447).setAccessible(true);
        Object enum2573 = ((Field) term1436447).get((Object) null);
        term1434270 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1434814 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1434922 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1434270, term1434270.getClass(), "kind", enum2573);
        setField(term1434814, term1434814.getClass(), "kind", enum2573);
        setField(term1434814, term1434814.getClass(), "typeOfThis", term1434922);
        setField(term1434270, term1434270.getClass(), "typeOfThis", term1434814);
        Class<? extends Object> term1436748 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1436747 = ((Class) term1436748).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1436747).setAccessible(true);
        Object enum2574 = ((Field) term1436747).get((Object) null);
        term1435030 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1435214 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1435312 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term1435030, term1435030.getClass(), "kind", enum2574);
        setField(term1435214, term1435214.getClass(), "kind", enum2574);
        setField(term1435214, term1435214.getClass(), "typeOfThis", term1435312);
        setField(term1435030, term1435030.getClass(), "typeOfThis", term1435214);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1435030;
        try {
            callMethod(klass, "isSubtype", argTypes, term1434270, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


