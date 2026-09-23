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

public class ReflectiveTypeAdapterFactory_excludeField_98487045759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35765;
     Object term35889;

    public ReflectiveTypeAdapterFactory_excludeField_98487045759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35765 = newInstance(Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory"));
        Object term35837 = newInstance(Class.forName("com.google.gson.internal.Excluder"));
        setDoubleField(term35837, term35837.getClass(), "version", 1.0);
        setBooleanField(term35837, term35837.getClass(), "serializeInnerClasses", false);
        setField(term35765, term35765.getClass(), "excluder", term35837);
        Class<? extends Object> term37483 = Class.forName((String) "java.util.BitSet");
        term35889 = ((Class) term37483).getDeclaredField((String) "BIT_INDEX_MASK");
        ((Field) term35889).setAccessible(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term35889;
        args[1] = true;
        try {
            callMethod(klass, "excludeField", argTypes, term35765, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


