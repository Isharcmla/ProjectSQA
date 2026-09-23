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

public class ReflectiveTypeAdapterFactory_excludeField_98487045742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22812;
     Object term22936;

    public ReflectiveTypeAdapterFactory_excludeField_98487045742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22812 = newInstance(Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory"));
        Object term22884 = newInstance(Class.forName("com.google.gson.internal.Excluder"));
        setDoubleField(term22884, term22884.getClass(), "version", 0.0);
        setBooleanField(term22884, term22884.getClass(), "serializeInnerClasses", false);
        setField(term22812, term22812.getClass(), "excluder", term22884);
        Class<? extends Object> term23696 = Class.forName((String) "java.lang.AbstractMethodError");
        term22936 = ((Class) term23696).getDeclaredField((String) "serialVersionUID");
        ((Field) term22936).setAccessible(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term22936;
        args[1] = false;
        try {
            callMethod(klass, "excludeField", argTypes, term22812, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


