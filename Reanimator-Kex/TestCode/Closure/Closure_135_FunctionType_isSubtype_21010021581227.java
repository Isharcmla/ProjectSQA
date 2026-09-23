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

public class FunctionType_isSubtype_21010021581227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1509367;
     Object term1510019;

    public FunctionType_isSubtype_21010021581227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1513951 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1513950 = ((Class) term1513951).getDeclaredField((String) "INTERFACE");
        ((Field) term1513950).setAccessible(true);
        Object enum2826 = ((Field) term1513950).get((Object) null);
        term1509367 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1509911 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1509367, term1509367.getClass(), "kind", enum2826);
        setField(term1509367, term1509367.getClass(), "typeOfThis", term1509911);
        Class<? extends Object> term1514245 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1514244 = ((Class) term1514245).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1514244).setAccessible(true);
        Object enum2827 = ((Field) term1514244).get((Object) null);
        term1510019 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1510201 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1510019, term1510019.getClass(), "kind", enum2827);
        setField(term1510019, term1510019.getClass(), "typeOfThis", term1510201);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1510019;
        try {
            callMethod(klass, "isSubtype", argTypes, term1509367, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


