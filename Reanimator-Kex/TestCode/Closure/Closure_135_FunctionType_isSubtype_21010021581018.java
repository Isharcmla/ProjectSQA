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

public class FunctionType_isSubtype_21010021581018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1153053;
     Object term1153309;

    public FunctionType_isSubtype_21010021581018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1155555 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1155554 = ((Class) term1155555).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1155554).setAccessible(true);
        Object enum2150 = ((Field) term1155554).get((Object) null);
        term1153053 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1153053, term1153053.getClass(), "kind", enum2150);
        setField(term1153053, term1153053.getClass(), "typeOfThis", term1153053);
        Class<? extends Object> term1155855 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1155854 = ((Class) term1155855).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1155854).setAccessible(true);
        Object enum2151 = ((Field) term1155854).get((Object) null);
        term1153309 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1153787 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1153309, term1153309.getClass(), "kind", enum2151);
        setField(term1153787, term1153787.getClass(), "kind", enum2150);
        setField(term1153309, term1153309.getClass(), "typeOfThis", term1153787);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1153309;
        try {
            callMethod(klass, "isSubtype", argTypes, term1153053, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


