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

public class _Gson_Types_resolve_1298521219124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21676;
     Object term21971;
     Object term21969;

    public _Gson_Types_resolve_1298521219124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21676 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term21796 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        setField(term21676, term21676.getClass(), "componentType", term21796);
        term21971 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term21972 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        setField(term21972, term21972.getClass(), "componentType", null);
        setField(term21971, term21971.getClass(), "componentType", term21972);
        term21969 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term21970 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        setField(term21970, term21970.getClass(), "componentType", null);
        setField(term21969, term21969.getClass(), "componentType", term21970);
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
        args[2] = term21676;
        Object retValue = callMethod(klass, "resolve", argTypes, null, args);
        assertTrue(recursiveEquals(term21676, term21971));
        assertTrue(recursiveEquals(retValue, term21969));
    }

};


