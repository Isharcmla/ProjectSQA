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

public class ReflectiveTypeAdapterFactory_excludeField_98487045778 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51212;
     Object term51336;

    public ReflectiveTypeAdapterFactory_excludeField_98487045778() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51212 = newInstance(Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory"));
        Object term51284 = newInstance(Class.forName("com.google.gson.internal.Excluder"));
        setDoubleField(term51284, term51284.getClass(), "version", 1.0);
        setBooleanField(term51284, term51284.getClass(), "serializeInnerClasses", true);
        setField(term51212, term51212.getClass(), "excluder", term51284);
        Class<? extends Object> term52074 = Class.forName((String) "java.util.stream.Nodes$CollectorTask");
        term51336 = ((Class) term52074).getDeclaredField((String) "builderFactory");
        ((Field) term51336).setAccessible(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term51336;
        args[1] = false;
        try {
            callMethod(klass, "excludeField", argTypes, term51212, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


