package com.google.gson.internal.bind;

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
import java.lang.NoClassDefFoundError;
import static com.google.gson.internal.bind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class ReflectiveTypeAdapterFactory_createBoundField_54139181415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4235;
     Object term4236;
     Object term4238;

    public ReflectiveTypeAdapterFactory_createBoundField_54139181415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4235 = newInstance(Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory"));
        setField(term4235, term4235.getClass(), "constructorConstructor", null);
        setField(term4235, term4235.getClass(), "fieldNamingPolicy", null);
        setField(term4235, term4235.getClass(), "excluder", null);
        term4236 = new Boolean(false);
        term4238 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.google.gson.Gson");
        argTypes[1] = Class.forName("java.lang.reflect.Field");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("com.google.gson.reflect.TypeToken");
        argTypes[4] = boolean.class;
        argTypes[5] = boolean.class;
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term4236;
        args[5] = term4238;
        try {
            callMethod(klass, "createBoundField", argTypes, term4235, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


