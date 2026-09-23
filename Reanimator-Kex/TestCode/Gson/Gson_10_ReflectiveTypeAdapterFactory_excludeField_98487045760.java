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

public class ReflectiveTypeAdapterFactory_excludeField_98487045760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36549;
     Object term36673;

    public ReflectiveTypeAdapterFactory_excludeField_98487045760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36549 = newInstance(Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory"));
        Object term36621 = newInstance(Class.forName("com.google.gson.internal.Excluder"));
        setDoubleField(term36621, term36621.getClass(), "version", 1.0);
        setBooleanField(term36621, term36621.getClass(), "serializeInnerClasses", true);
        setField(term36549, term36549.getClass(), "excluder", term36621);
        Class<? extends Object> term38186 = Class.forName((String) "java.lang.module.ModuleDescriptor$Builder");
        term36673 = ((Class) term38186).getDeclaredField((String) "rawVersionString");
        ((Field) term36673).setAccessible(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term36673;
        args[1] = false;
        try {
            callMethod(klass, "excludeField", argTypes, term36549, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


