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

public class ReflectiveTypeAdapterFactory_excludeField_98487045767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42187;
     Object term42311;

    public ReflectiveTypeAdapterFactory_excludeField_98487045767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42187 = newInstance(Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory"));
        Object term42259 = newInstance(Class.forName("com.google.gson.internal.Excluder"));
        setDoubleField(term42259, term42259.getClass(), "version", 0.0);
        setBooleanField(term42259, term42259.getClass(), "serializeInnerClasses", true);
        setField(term42187, term42187.getClass(), "excluder", term42259);
        Class<? extends Object> term43562 = Class.forName((String) "java.nio.file.attribute.UserPrincipalNotFoundException");
        term42311 = ((Class) term43562).getDeclaredField((String) "name");
        ((Field) term42311).setAccessible(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term42311;
        args[1] = false;
        try {
            callMethod(klass, "excludeField", argTypes, term42187, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


