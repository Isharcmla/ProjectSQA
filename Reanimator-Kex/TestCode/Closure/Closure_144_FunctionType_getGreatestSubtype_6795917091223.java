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

public class FunctionType_getGreatestSubtype_6795917091223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1665874;
     Object term1666472;

    public FunctionType_getGreatestSubtype_6795917091223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1668080 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1668079 = ((Class) term1668080).getDeclaredField((String) "ORDINARY");
        ((Field) term1668079).setAccessible(true);
        Object enum2977 = ((Field) term1668079).get((Object) null);
        Class<? extends Object> term1668371 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1668370 = ((Class) term1668371).getDeclaredField((String) "INTERFACE");
        ((Field) term1668370).setAccessible(true);
        Object enum2978 = ((Field) term1668370).get((Object) null);
        term1665874 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1666110 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term1666362 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term1665874, term1665874.getClass(), "kind", enum2977);
        setField(term1666110, term1666110.getClass(), "kind", enum2978);
        setField(term1665874, term1665874.getClass(), "typeOfThis", term1666110);
        setField(term1665874, term1665874.getClass(), "registry", term1666362);
        Class<? extends Object> term1668665 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1668664 = ((Class) term1668665).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1668664).setAccessible(true);
        Object enum2979 = ((Field) term1668664).get((Object) null);
        term1666472 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1666634 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1666472, term1666472.getClass(), "kind", enum2978);
        setField(term1666634, term1666634.getClass(), "kind", enum2979);
        setField(term1666472, term1666472.getClass(), "typeOfThis", term1666634);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1666472;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1665874, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


