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

public class FunctionType_isSubtype_21010021581246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1707466;
     Object term1708080;

    public FunctionType_isSubtype_21010021581246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1711168 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1711167 = ((Class) term1711168).getDeclaredField((String) "ORDINARY");
        ((Field) term1711167).setAccessible(true);
        Object enum3050 = ((Field) term1711167).get((Object) null);
        Class<? extends Object> term1711459 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1711458 = ((Class) term1711459).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1711458).setAccessible(true);
        Object enum3051 = ((Field) term1711458).get((Object) null);
        term1707466 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1707714 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1708316 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1707466, term1707466.getClass(), "kind", enum3050);
        setField(term1707714, term1707714.getClass(), "kind", enum3051);
        setField(term1707714, term1707714.getClass(), "typeOfThis", term1708316);
        setField(term1707466, term1707466.getClass(), "typeOfThis", term1707714);
        term1708080 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1708262 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1708080, term1708080.getClass(), "kind", enum3050);
        setField(term1708262, term1708262.getClass(), "kind", enum3050);
        setField(term1708262, term1708262.getClass(), "typeOfThis", term1708316);
        setField(term1708080, term1708080.getClass(), "typeOfThis", term1708262);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1708080;
        try {
            callMethod(klass, "isSubtype", argTypes, term1707466, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


