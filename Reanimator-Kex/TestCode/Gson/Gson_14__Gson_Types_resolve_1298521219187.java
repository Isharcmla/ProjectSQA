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

public class _Gson_Types_resolve_1298521219187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41154;
     Object term41423;
     Object term41420;

    public _Gson_Types_resolve_1298521219187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41154 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term41274 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term41386 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$WildcardTypeImpl"));
        setField(term41274, term41274.getClass(), "componentType", term41386);
        setField(term41154, term41154.getClass(), "componentType", term41274);
        term41423 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term41424 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term41425 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$WildcardTypeImpl"));
        setField(term41425, term41425.getClass(), "upperBound", null);
        setField(term41425, term41425.getClass(), "lowerBound", null);
        setField(term41424, term41424.getClass(), "componentType", term41425);
        setField(term41423, term41423.getClass(), "componentType", term41424);
        term41420 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term41421 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term41422 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$WildcardTypeImpl"));
        setField(term41422, term41422.getClass(), "upperBound", null);
        setField(term41422, term41422.getClass(), "lowerBound", null);
        setField(term41421, term41421.getClass(), "componentType", term41422);
        setField(term41420, term41420.getClass(), "componentType", term41421);
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
        args[2] = term41154;
        Object retValue = callMethod(klass, "resolve", argTypes, null, args);
        assertTrue(recursiveEquals(term41154, term41423));
        assertTrue(recursiveEquals(retValue, term41420));
    }

};


