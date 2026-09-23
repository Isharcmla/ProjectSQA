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
import java.lang.Object;
import java.lang.String;

public class ReflectiveTypeAdapterFactory_excludeField_98487045756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34297;
     Object term34421;

    public ReflectiveTypeAdapterFactory_excludeField_98487045756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34297 = newInstance(Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory"));
        Object term34369 = newInstance(Class.forName("com.google.gson.internal.Excluder"));
        setDoubleField(term34369, term34369.getClass(), "version", 0.0);
        setField(term34297, term34297.getClass(), "excluder", term34369);
        Class<? extends Object> term35095 = Class.forName((String) "java.lang.ProcessHandleImpl");
        term34421 = ((Class) term35095).getDeclaredField((String) "pid");
        ((Field) term34421).setAccessible(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term34421;
        args[1] = false;
        try {
            callMethod(klass, "excludeField", argTypes, term34297, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


