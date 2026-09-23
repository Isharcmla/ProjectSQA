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

public class JsonAdapterAnnotationTypeAdapterFactory_create_5997240379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1042;
     Object term1114;

    public JsonAdapterAnnotationTypeAdapterFactory_create_5997240379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1042 = newInstance(Class.forName("com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory"));
        Class<? extends Object> term1150 = Class.forName((String) "java.util.JapaneseImperialCalendar");
        term1114 = newInstance(Class.forName("com.google.gson.reflect.TypeToken"));
        setField(term1114, term1114.getClass(), "rawType", term1150);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.gson.Gson");
        argTypes[1] = Class.forName("com.google.gson.reflect.TypeToken");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1114;
        try {
            callMethod(klass, "create", argTypes, term1042, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


