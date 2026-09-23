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

public class FunctionType_isSubtype_21010021581019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1295876;
     Object term1296530;

    public FunctionType_isSubtype_21010021581019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1300260 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1300259 = ((Class) term1300260).getDeclaredField((String) "ORDINARY");
        ((Field) term1300259).setAccessible(true);
        Object enum2333 = ((Field) term1300259).get((Object) null);
        Class<? extends Object> term1300551 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1300550 = ((Class) term1300551).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1300550).setAccessible(true);
        Object enum2334 = ((Field) term1300550).get((Object) null);
        term1295876 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1296420 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1295876, term1295876.getClass(), "kind", enum2333);
        setField(term1296420, term1296420.getClass(), "kind", enum2334);
        setField(term1295876, term1295876.getClass(), "typeOfThis", term1296420);
        term1296530 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1296862 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1296530, term1296530.getClass(), "kind", enum2333);
        setField(term1296530, term1296530.getClass(), "typeOfThis", term1296862);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1296530;
        try {
            callMethod(klass, "isSubtype", argTypes, term1295876, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


