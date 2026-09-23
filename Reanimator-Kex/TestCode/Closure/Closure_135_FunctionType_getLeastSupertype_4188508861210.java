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

public class FunctionType_getLeastSupertype_4188508861210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1478894;
     Object term1479372;

    public FunctionType_getLeastSupertype_4188508861210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1482490 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1482489 = ((Class) term1482490).getDeclaredField((String) "ORDINARY");
        ((Field) term1482489).setAccessible(true);
        Object enum2765 = ((Field) term1482489).get((Object) null);
        term1478894 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1479160 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term1479264 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term1478894, term1478894.getClass(), "kind", enum2765);
        setField(term1478894, term1478894.getClass(), "typeOfThis", term1479160);
        setField(term1478894, term1478894.getClass(), "registry", term1479264);
        Class<? extends Object> term1482781 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1482780 = ((Class) term1482781).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1482780).setAccessible(true);
        Object enum2766 = ((Field) term1482780).get((Object) null);
        term1479372 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1479372, term1479372.getClass(), "kind", enum2766);
        setField(term1479372, term1479372.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1479372;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term1478894, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


