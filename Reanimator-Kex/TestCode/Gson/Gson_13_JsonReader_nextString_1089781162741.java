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

public class JsonReader_nextString_1089781162741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1254045;

    public JsonReader_nextString_1089781162741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1254045 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term1253949 = (char[]) newCharArray(1);
        setIntField(term1254045, term1254045.getClass(), "peeked", 10);
        setIntField(term1254045, term1254045.getClass(), "pos", -2147483648);
        setIntField(term1254045, term1254045.getClass(), "limit", -2147483648);
        setField(term1254045, term1254045.getClass(), "buffer", term1253949);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextString", argTypes, term1254045, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


