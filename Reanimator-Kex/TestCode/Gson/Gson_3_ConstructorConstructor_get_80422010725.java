package com.google.gson.internal;

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
import static com.google.gson.internal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class ConstructorConstructor_get_80422010725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11965;
     Object term12037;

    public ConstructorConstructor_get_80422010725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11965 = newInstance(Class.forName("com.google.gson.internal.ConstructorConstructor"));
        setField(term11965, term11965.getClass(), "instanceCreators", null);
        Class<? extends Object> term12073 = Class.forName((String) "java.util.regex.Pattern$LazyLoop");
        term12037 = newInstance(Class.forName("com.google.gson.reflect.TypeToken"));
        setField(term12037, term12037.getClass(), "type", term12073);
        setField(term12037, term12037.getClass(), "rawType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.ConstructorConstructor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.gson.reflect.TypeToken");
        Object[] args = new Object[1];
        args[0] = term12037;
        try {
            callMethod(klass, "get", argTypes, term11965, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


