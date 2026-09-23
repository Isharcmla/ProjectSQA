package com.google.gson.stream;

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
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JsonWriter_endObject_1591364441132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37654;

    public JsonWriter_endObject_1591364441132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37654 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term37555 = (int[]) newIntArray(8);
        setIntField(term37654, term37654.getClass(), "stackSize", 8);
        setIntElement(term37555, 0, 3);
        setIntElement(term37555, 1, 3);
        setIntElement(term37555, 2, 3);
        setIntElement(term37555, 3, 3);
        setIntElement(term37555, 4, 3);
        setIntElement(term37555, 5, 3);
        setIntElement(term37555, 6, 3);
        setIntElement(term37555, 7, 3);
        setField(term37654, term37654.getClass(), "stack", term37555);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "endObject", argTypes, term37654, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


