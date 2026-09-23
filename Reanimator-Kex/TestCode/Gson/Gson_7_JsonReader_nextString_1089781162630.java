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

public class JsonReader_nextString_1089781162630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315893;

    public JsonReader_nextString_1089781162630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term315893 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term315458 = (int[]) newIntArray(234);
        setIntField(term315893, term315893.getClass(), "peeked", 1);
        setIntField(term315893, term315893.getClass(), "lineNumber", 0);
        setIntField(term315893, term315893.getClass(), "pos", 0);
        setIntField(term315893, term315893.getClass(), "lineStart", 0);
        setIntField(term315893, term315893.getClass(), "stackSize", 1);
        setIntElement(term315458, 0, 8);
        setField(term315893, term315893.getClass(), "stack", term315458);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextString", argTypes, term315893, args);
    }

};


