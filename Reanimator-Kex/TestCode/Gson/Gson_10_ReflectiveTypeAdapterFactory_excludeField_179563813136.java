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

public class ReflectiveTypeAdapterFactory_excludeField_179563813136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17283;
     Object term17355;

    public ReflectiveTypeAdapterFactory_excludeField_179563813136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18881 = Class.forName((String) "java.util.concurrent.locks.AbstractQueuedLongSynchronizer");
        term17283 = ((Class) term18881).getDeclaredField((String) "serialVersionUID");
        ((Field) term17283).setAccessible(false);
        term17355 = newInstance(Class.forName("com.google.gson.internal.Excluder"));
        setDoubleField(term17355, term17355.getClass(), "version", 4.6116860184273879E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("com.google.gson.internal.Excluder");
        Object[] args = new Object[3];
        args[0] = term17283;
        args[1] = false;
        args[2] = term17355;
        try {
            callMethod(klass, "excludeField", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


