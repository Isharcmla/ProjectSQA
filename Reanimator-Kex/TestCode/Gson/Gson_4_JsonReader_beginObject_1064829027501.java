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

public class JsonReader_beginObject_1064829027501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230380;

    public JsonReader_beginObject_1064829027501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term230380 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term229692 = (int[]) newIntArray(492);
        setIntField(term230380, term230380.getClass(), "peeked", 8);
        setIntField(term230380, term230380.getClass(), "lineNumber", 0);
        setIntField(term230380, term230380.getClass(), "pos", 0);
        setIntField(term230380, term230380.getClass(), "lineStart", 0);
        setIntField(term230380, term230380.getClass(), "stackSize", 1);
        setIntElement(term229692, 0, 5);
        setField(term230380, term230380.getClass(), "stack", term229692);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "beginObject", argTypes, term230380, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


