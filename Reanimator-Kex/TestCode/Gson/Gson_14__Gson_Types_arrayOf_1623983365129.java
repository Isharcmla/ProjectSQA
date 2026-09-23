package com.google.gson.internal;

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
import static com.google.gson.internal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.gson.internal.EqualityUtils.*;
import java.lang.Object;

public class _Gson_Types_arrayOf_1623983365129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22635;
     Object term22781;
     Object term22778;

    public _Gson_Types_arrayOf_1623983365129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22635 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term22755 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        setField(term22635, term22635.getClass(), "componentType", term22755);
        term22781 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term22782 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        setField(term22782, term22782.getClass(), "componentType", null);
        setField(term22781, term22781.getClass(), "componentType", term22782);
        term22778 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term22779 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term22780 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        setField(term22780, term22780.getClass(), "componentType", null);
        setField(term22779, term22779.getClass(), "componentType", term22780);
        setField(term22778, term22778.getClass(), "componentType", term22779);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.$Gson$Types");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.reflect.Type");
        Object[] args = new Object[1];
        args[0] = term22635;
        Object retValue = callMethod(klass, "arrayOf", argTypes, null, args);
        assertTrue(recursiveEquals(term22635, term22781));
        assertTrue(recursiveEquals(retValue, term22778));
    }

};


