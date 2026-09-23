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
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JsonReader_skipValue_1099520775631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316229;

    public JsonReader_skipValue_1099520775631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term316229 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term316131 = (int[]) newIntArray(0);
        setIntField(term316229, term316229.getClass(), "peeked", 4);
        setIntField(term316229, term316229.getClass(), "stackSize", 0);
        setField(term316229, term316229.getClass(), "stack", term316131);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "skipValue", argTypes, term316229, args);
    }

};


