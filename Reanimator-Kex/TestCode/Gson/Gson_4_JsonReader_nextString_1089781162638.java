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

public class JsonReader_nextString_1089781162638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term361548;

    public JsonReader_nextString_1089781162638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term361548 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term361455 = (char[]) newCharArray(0);
        setIntField(term361548, term361548.getClass(), "peeked", 10);
        setIntField(term361548, term361548.getClass(), "pos", -2147483648);
        setIntField(term361548, term361548.getClass(), "limit", -2147483648);
        setField(term361548, term361548.getClass(), "buffer", term361455);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextString", argTypes, term361548, args);
    }

};


