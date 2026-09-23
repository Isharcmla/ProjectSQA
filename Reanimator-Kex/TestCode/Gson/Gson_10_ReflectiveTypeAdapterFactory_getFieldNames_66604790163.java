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
import java.lang.reflect.InaccessibleObjectException;
import static com.google.gson.internal.bind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class ReflectiveTypeAdapterFactory_getFieldNames_66604790163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38882;
     Object term39010;

    public ReflectiveTypeAdapterFactory_getFieldNames_66604790163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term40537 = Class.forName((String) "com.google.gson.FieldNamingPolicy");
        Field term40536 = ((Class) term40537).getDeclaredField((String) "IDENTITY");
        ((Field) term40536).setAccessible(true);
        Object enum10 = ((Field) term40536).get((Object) null);
        term38882 = newInstance(Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory"));
        setField(term38882, term38882.getClass(), "fieldNamingPolicy", enum10);
        Class<? extends Object> term40732 = Class.forName((String) "java.lang.ProcessEnvironment$ExternalData");
        term39010 = ((Class) term40732).getDeclaredField((String) "bytes");
        ((Field) term39010).setAccessible(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        Object[] args = new Object[1];
        args[0] = term39010;
        try {
            callMethod(klass, "getFieldNames", argTypes, term38882, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


