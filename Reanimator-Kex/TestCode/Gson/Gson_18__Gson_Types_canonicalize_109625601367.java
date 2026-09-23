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

public class _Gson_Types_canonicalize_109625601367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7962;
     Object term8241;
     Object term8239;

    public _Gson_Types_canonicalize_109625601367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7962 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        term8241 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        setField(term8241, term8241.getClass(), "componentType", null);
        term8239 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        setField(term8239, term8239.getClass(), "componentType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.$Gson$Types");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.reflect.Type");
        Object[] args = new Object[1];
        args[0] = term7962;
        Object retValue = callMethod(klass, "canonicalize", argTypes, null, args);
        assertTrue(recursiveEquals(term7962, term8241));
        assertTrue(recursiveEquals(retValue, term8239));
    }

};


