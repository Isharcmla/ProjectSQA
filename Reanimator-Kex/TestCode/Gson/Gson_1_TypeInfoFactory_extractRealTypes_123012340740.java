package com.google.gson;

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
import static com.google.gson.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class TypeInfoFactory_extractRealTypes_123012340740 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8413;

    public TypeInfoFactory_extractRealTypes_123012340740() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8564 = Class.forName((String) "java.lang.NoSuchMethodException");
        term8413 = (Object[]) newArray("java.lang.reflect.Type", 4);
        Object term8528 = newInstance(Class.forName("com.google.gson.ParameterizedTypeImpl"));
        Object[] term8417 = (Object[]) newArray("java.lang.reflect.Type", 0);
        setField(term8528, term8528.getClass(), "owner", term8564);
        setField(term8528, term8528.getClass(), "actualTypeArguments", term8417);
        setElement(term8413, 0, term8528);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.TypeInfoFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.reflect.Type"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.reflect.Type");
        argTypes[2] = Class.forName("java.lang.Class");
        Object[] args = new Object[3];
        args[0] = term8413;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "extractRealTypes", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};
