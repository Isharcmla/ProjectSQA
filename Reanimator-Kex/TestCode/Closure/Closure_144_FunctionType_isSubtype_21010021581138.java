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

public class FunctionType_isSubtype_21010021581138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1509466;
     Object term1510118;

    public FunctionType_isSubtype_21010021581138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1512967 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1512966 = ((Class) term1512967).getDeclaredField((String) "INTERFACE");
        ((Field) term1512966).setAccessible(true);
        Object enum2698 = ((Field) term1512966).get((Object) null);
        Class<? extends Object> term1513261 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1513260 = ((Class) term1513261).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1513260).setAccessible(true);
        Object enum2699 = ((Field) term1513260).get((Object) null);
        term1509466 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1510010 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1509466, term1509466.getClass(), "kind", enum2698);
        setField(term1510010, term1510010.getClass(), "kind", enum2699);
        setField(term1509466, term1509466.getClass(), "typeOfThis", term1510010);
        term1510118 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1510300 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1510118, term1510118.getClass(), "kind", enum2699);
        setField(term1510300, term1510300.getClass(), "kind", enum2698);
        setField(term1510118, term1510118.getClass(), "typeOfThis", term1510300);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1510118;
        try {
            callMethod(klass, "isSubtype", argTypes, term1509466, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


