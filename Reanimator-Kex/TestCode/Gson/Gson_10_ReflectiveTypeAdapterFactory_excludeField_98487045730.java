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
import java.lang.NullPointerException;
import static com.google.gson.internal.bind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class ReflectiveTypeAdapterFactory_excludeField_98487045730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13853;
     Object term13977;

    public ReflectiveTypeAdapterFactory_excludeField_98487045730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13853 = newInstance(Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory"));
        Object term13925 = newInstance(Class.forName("com.google.gson.internal.Excluder"));
        setDoubleField(term13925, term13925.getClass(), "version", -4.6161896180547584E18);
        setBooleanField(term13925, term13925.getClass(), "serializeInnerClasses", false);
        setField(term13853, term13853.getClass(), "excluder", term13925);
        Class<? extends Object> term14697 = Class.forName((String) "java.util.stream.ReduceOps$4ReducingSink");
        term13977 = ((Class) term14697).getDeclaredField((String) "val$accumulator");
        ((Field) term13977).setAccessible(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term13977;
        args[1] = false;
        try {
            callMethod(klass, "excludeField", argTypes, term13853, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


