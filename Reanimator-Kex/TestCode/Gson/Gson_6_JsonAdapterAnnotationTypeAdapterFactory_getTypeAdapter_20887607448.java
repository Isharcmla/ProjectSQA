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
import org.mockito.Mockito;

public class JsonAdapterAnnotationTypeAdapterFactory_getTypeAdapter_20887607448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term688;

    public JsonAdapterAnnotationTypeAdapterFactory_getTypeAdapter_20887607448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term688 = Mockito.mock(Class.forName("com.google.gson.annotations.JsonAdapter"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.gson.internal.ConstructorConstructor");
        argTypes[1] = Class.forName("com.google.gson.Gson");
        argTypes[2] = Class.forName("com.google.gson.reflect.TypeToken");
        argTypes[3] = Class.forName("com.google.gson.annotations.JsonAdapter");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term688;
        try {
            callMethod(klass, "getTypeAdapter", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


