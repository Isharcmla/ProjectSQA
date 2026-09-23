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
import java.util.ArrayList;
import java.lang.String;

public class ReflectiveTypeAdapterFactory_excludeField_98487045774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47952;
     Object term48128;

    public ReflectiveTypeAdapterFactory_excludeField_98487045774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term48076 = new ArrayList();
        term47952 = newInstance(Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory"));
        Object term48024 = newInstance(Class.forName("com.google.gson.internal.Excluder"));
        setDoubleField(term48024, term48024.getClass(), "version", 1.0);
        setBooleanField(term48024, term48024.getClass(), "serializeInnerClasses", false);
        setField(term48024, term48024.getClass(), "deserializationStrategies", term48076);
        setField(term47952, term47952.getClass(), "excluder", term48024);
        Class<? extends Object> term48886 = Class.forName((String) "java.util.ArraysParallelSortHelpers$FJObject$Merger");
        term48128 = ((Class) term48886).getDeclaredField((String) "a");
        ((Field) term48128).setAccessible(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term48128;
        args[1] = false;
        try {
            callMethod(klass, "excludeField", argTypes, term47952, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


