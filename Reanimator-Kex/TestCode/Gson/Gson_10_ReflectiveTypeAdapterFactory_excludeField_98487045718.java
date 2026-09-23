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

public class ReflectiveTypeAdapterFactory_excludeField_98487045718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5596;
     Object term5720;

    public ReflectiveTypeAdapterFactory_excludeField_98487045718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5596 = newInstance(Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory"));
        Object term5668 = newInstance(Class.forName("com.google.gson.internal.Excluder"));
        setDoubleField(term5668, term5668.getClass(), "version", 1.0);
        setField(term5596, term5596.getClass(), "excluder", term5668);
        Class<? extends Object> term6458 = Class.forName((String) "java.nio.charset.UnmappableCharacterException");
        term5720 = ((Class) term6458).getDeclaredField((String) "serialVersionUID");
        ((Field) term5720).setAccessible(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term5720;
        args[1] = false;
        try {
            callMethod(klass, "excludeField", argTypes, term5596, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


