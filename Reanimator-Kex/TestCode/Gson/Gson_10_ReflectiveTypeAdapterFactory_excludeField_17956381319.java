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
import java.lang.Boolean;

public class ReflectiveTypeAdapterFactory_excludeField_17956381319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term361;
     Object term494;
     Object term496;

    public ReflectiveTypeAdapterFactory_excludeField_17956381319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3571 = Class.forName((String) "java.util.PriorityQueue");
        term361 = ((Class) term3571).getDeclaredField((String) "MAX_ARRAY_SIZE");
        ((Field) term361).setAccessible(true);
        term494 = new Boolean(false);
        term496 = newInstance(Class.forName("com.google.gson.internal.Excluder"));
        Object term501 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setDoubleField(term496, term496.getClass(), "version", -1.0);
        setIntField(term496, term496.getClass(), "modifiers", 136);
        setBooleanField(term496, term496.getClass(), "serializeInnerClasses", true);
        setBooleanField(term496, term496.getClass(), "requireExpose", true);
        setIntField(term501, term501.getClass(), "modCount", 0);
        setField(term496, term496.getClass(), "serializationStrategies", term501);
        setField(term496, term496.getClass(), "deserializationStrategies", term501);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("com.google.gson.internal.Excluder");
        Object[] args = new Object[3];
        args[0] = term361;
        args[1] = term494;
        args[2] = term496;
        try {
            callMethod(klass, "excludeField", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


