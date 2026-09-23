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

public class _Gson_Types_resolve_136647717100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14416;
     Object term14437;
     Object term14436;

    public _Gson_Types_resolve_136647717100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14416 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        term14437 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        setField(term14437, term14437.getClass(), "componentType", null);
        term14436 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        setField(term14436, term14436.getClass(), "componentType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.$Gson$Types");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.reflect.Type");
        argTypes[1] = Class.forName("java.lang.Class");
        argTypes[2] = Class.forName("java.lang.reflect.Type");
        argTypes[3] = Class.forName("java.util.Collection");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term14416;
        args[3] = null;
        Object retValue = callMethod(klass, "resolve", argTypes, null, args);
        assertTrue(recursiveEquals(term14416, null));
        assertTrue(recursiveEquals(retValue, term14436));
    }

};


