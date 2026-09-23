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

public class ReflectiveTypeAdapterFactory_getFieldNames_66604790153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30670;
     Object term30798;

    public ReflectiveTypeAdapterFactory_getFieldNames_66604790153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32513 = Class.forName((String) "com.google.gson.FieldNamingPolicy");
        Field term32512 = ((Class) term32513).getDeclaredField((String) "IDENTITY");
        ((Field) term32512).setAccessible(true);
        Object enum8 = ((Field) term32512).get((Object) null);
        term30670 = newInstance(Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory"));
        setField(term30670, term30670.getClass(), "fieldNamingPolicy", enum8);
        Class<? extends Object> term32708 = Class.forName((String) "java.util.concurrent.locks.StampedLock$WNode");
        term30798 = ((Class) term32708).getDeclaredField((String) "next");
        ((Field) term30798).setAccessible(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        Object[] args = new Object[1];
        args[0] = term30798;
        try {
            callMethod(klass, "getFieldNames", argTypes, term30670, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


