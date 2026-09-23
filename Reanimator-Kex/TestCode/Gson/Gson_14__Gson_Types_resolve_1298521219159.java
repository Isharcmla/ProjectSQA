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

public class _Gson_Types_resolve_1298521219159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30895;
     Object term31164;
     Object term31161;

    public _Gson_Types_resolve_1298521219159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30895 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term31007 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$WildcardTypeImpl"));
        Object term31127 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        setField(term31007, term31007.getClass(), "lowerBound", null);
        setField(term31007, term31007.getClass(), "upperBound", term31127);
        setField(term30895, term30895.getClass(), "componentType", term31007);
        term31164 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term31165 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$WildcardTypeImpl"));
        Object term31166 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        setField(term31166, term31166.getClass(), "componentType", null);
        setField(term31165, term31165.getClass(), "upperBound", term31166);
        setField(term31165, term31165.getClass(), "lowerBound", null);
        setField(term31164, term31164.getClass(), "componentType", term31165);
        term31161 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term31162 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$WildcardTypeImpl"));
        Object term31163 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        setField(term31163, term31163.getClass(), "componentType", null);
        setField(term31162, term31162.getClass(), "upperBound", term31163);
        setField(term31162, term31162.getClass(), "lowerBound", null);
        setField(term31161, term31161.getClass(), "componentType", term31162);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.$Gson$Types");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.reflect.Type");
        argTypes[1] = Class.forName("java.lang.Class");
        argTypes[2] = Class.forName("java.lang.reflect.Type");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term30895;
        Object retValue = callMethod(klass, "resolve", argTypes, null, args);
        assertTrue(recursiveEquals(term30895, term31164));
        assertTrue(recursiveEquals(retValue, term31161));
    }

};


