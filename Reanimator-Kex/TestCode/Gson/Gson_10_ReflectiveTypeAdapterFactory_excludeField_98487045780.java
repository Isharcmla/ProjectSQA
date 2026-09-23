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

public class ReflectiveTypeAdapterFactory_excludeField_98487045780 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52769;
     Object term52893;

    public ReflectiveTypeAdapterFactory_excludeField_98487045780() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52769 = newInstance(Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory"));
        Object term52841 = newInstance(Class.forName("com.google.gson.internal.Excluder"));
        setDoubleField(term52841, term52841.getClass(), "version", 0.0);
        setBooleanField(term52841, term52841.getClass(), "serializeInnerClasses", false);
        setField(term52769, term52769.getClass(), "excluder", term52841);
        Class<? extends Object> term53689 = Class.forName((String) "kex.java.util.LinkedHashMap$LinkedKeySet");
        term52893 = ((Class) term53689).getDeclaredField((String) "this$0");
        ((Field) term52893).setAccessible(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term52893;
        args[1] = false;
        try {
            callMethod(klass, "excludeField", argTypes, term52769, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


