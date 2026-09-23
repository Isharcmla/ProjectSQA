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

public class ReflectiveTypeAdapterFactory_excludeField_98487045754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31671;
     Object term31795;

    public ReflectiveTypeAdapterFactory_excludeField_98487045754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31671 = newInstance(Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory"));
        Object term31743 = newInstance(Class.forName("com.google.gson.internal.Excluder"));
        setDoubleField(term31743, term31743.getClass(), "version", 0.0);
        setBooleanField(term31743, term31743.getClass(), "serializeInnerClasses", true);
        setField(term31671, term31671.getClass(), "excluder", term31743);
        Class<? extends Object> term33505 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$MapReduceMappingsToLongTask");
        term31795 = ((Class) term33505).getDeclaredField((String) "reducer");
        ((Field) term31795).setAccessible(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term31795;
        args[1] = false;
        try {
            callMethod(klass, "excludeField", argTypes, term31671, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


