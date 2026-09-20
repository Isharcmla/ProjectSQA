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

public class TypeInfoFactory_getActualType_63538312577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18017;

    public TypeInfoFactory_getActualType_63538312577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18133 = Class.forName((String) "com.google.gson.RecursiveFieldNamingPolicy");
        term18017 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term18097 = newInstance(Class.forName("com.google.gson.ParameterizedTypeImpl"));
        Object[] term17912 = (Object[]) newArray("java.lang.reflect.Type", 9);
        setField(term18097, term18097.getClass(), "owner", null);
        setElement(term17912, 0, term18133);
        setElement(term17912, 1, term18133);
        setElement(term17912, 2, term18133);
        setElement(term17912, 3, term18133);
        setElement(term17912, 4, term18133);
        setElement(term17912, 5, term18133);
        setElement(term17912, 6, term18133);
        setElement(term17912, 7, term18133);
        setElement(term17912, 8, term18133);
        setField(term18097, term18097.getClass(), "actualTypeArguments", term17912);
        setField(term18017, term18017.getClass(), "genericComponentType", term18097);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.TypeInfoFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.reflect.Type");
        argTypes[1] = Class.forName("java.lang.reflect.Type");
        argTypes[2] = Class.forName("java.lang.Class");
        Object[] args = new Object[3];
        args[0] = term18017;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "getActualType", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};
