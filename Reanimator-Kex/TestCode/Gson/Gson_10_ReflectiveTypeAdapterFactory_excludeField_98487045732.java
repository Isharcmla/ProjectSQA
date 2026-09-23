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

public class ReflectiveTypeAdapterFactory_excludeField_98487045732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15344;
     Object term15468;

    public ReflectiveTypeAdapterFactory_excludeField_98487045732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15344 = newInstance(Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory"));
        Object term15416 = newInstance(Class.forName("com.google.gson.internal.Excluder"));
        setDoubleField(term15416, term15416.getClass(), "version", -4.6161896180547584E18);
        setBooleanField(term15416, term15416.getClass(), "serializeInnerClasses", true);
        setField(term15344, term15344.getClass(), "excluder", term15416);
        Class<? extends Object> term16196 = Class.forName((String) "java.lang.PublicMethods$MethodList");
        term15468 = ((Class) term16196).getDeclaredField((String) "method");
        ((Field) term15468).setAccessible(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term15468;
        args[1] = false;
        try {
            callMethod(klass, "excludeField", argTypes, term15344, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


