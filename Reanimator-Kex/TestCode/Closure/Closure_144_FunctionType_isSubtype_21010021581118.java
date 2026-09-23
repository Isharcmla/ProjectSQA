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

public class FunctionType_isSubtype_21010021581118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1472271;
     Object term1472925;

    public FunctionType_isSubtype_21010021581118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1475610 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1475609 = ((Class) term1475610).getDeclaredField((String) "INTERFACE");
        ((Field) term1475609).setAccessible(true);
        Object enum2636 = ((Field) term1475609).get((Object) null);
        term1472271 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1472815 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1472271, term1472271.getClass(), "kind", enum2636);
        setField(term1472271, term1472271.getClass(), "typeOfThis", term1472815);
        term1472925 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1473247 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1472925, term1472925.getClass(), "kind", enum2636);
        setField(term1472925, term1472925.getClass(), "typeOfThis", term1473247);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1472925;
        try {
            callMethod(klass, "isSubtype", argTypes, term1472271, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


