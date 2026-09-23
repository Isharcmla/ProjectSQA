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

public class FunctionType_getGreatestSubtype_679591709919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1123471;
     Object term1123949;

    public FunctionType_getGreatestSubtype_679591709919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1125456 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1125455 = ((Class) term1125456).getDeclaredField((String) "ORDINARY");
        ((Field) term1125455).setAccessible(true);
        Object enum2022 = ((Field) term1125455).get((Object) null);
        term1123471 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1123729 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1123839 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1123471, term1123471.getClass(), "kind", enum2022);
        setField(term1123729, term1123729.getClass(), "kind", enum2022);
        setField(term1123729, term1123729.getClass(), "typeOfThis", term1123839);
        setField(term1123471, term1123471.getClass(), "typeOfThis", term1123729);
        Class<? extends Object> term1125747 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1125746 = ((Class) term1125747).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1125746).setAccessible(true);
        Object enum2023 = ((Field) term1125746).get((Object) null);
        term1123949 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1124131 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1124379 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1123949, term1123949.getClass(), "kind", enum2022);
        setField(term1124131, term1124131.getClass(), "kind", enum2023);
        setField(term1124131, term1124131.getClass(), "typeOfThis", term1124379);
        setField(term1123949, term1123949.getClass(), "typeOfThis", term1124131);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1123949;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1123471, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


