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
import java.lang.NullPointerException;
import static com.google.gson.internal.bind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class ReflectiveTypeAdapterFactory_excludeField_98487045790 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60221;
     Object term60345;

    public ReflectiveTypeAdapterFactory_excludeField_98487045790() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60221 = newInstance(Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory"));
        Object term60293 = newInstance(Class.forName("com.google.gson.internal.Excluder"));
        setDoubleField(term60293, term60293.getClass(), "version", -4.6161896180547584E18);
        setBooleanField(term60293, term60293.getClass(), "serializeInnerClasses", true);
        setField(term60221, term60221.getClass(), "excluder", term60293);
        Class<? extends Object> term61104 = Class.forName((String) "java.io.ObjectInputFilter$Config$Global");
        term60345 = ((Class) term61104).getDeclaredField((String) "maxDepth");
        ((Field) term60345).setAccessible(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term60345;
        args[1] = false;
        try {
            callMethod(klass, "excludeField", argTypes, term60221, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


