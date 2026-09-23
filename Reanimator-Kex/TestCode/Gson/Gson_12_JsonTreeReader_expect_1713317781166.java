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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.gson.internal.bind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JsonTreeReader_expect_1713317781166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39371;

    public JsonTreeReader_expect_1713317781166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39371 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term39262 = (Object[]) newArray("java.lang.Object", 489);
        setIntField(term39371, term39371.getClass(), "stackSize", 1073741825);
        setField(term39371, term39371.getClass(), "stack", term39262);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.gson.stream.JsonToken");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "expect", argTypes, term39371, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


