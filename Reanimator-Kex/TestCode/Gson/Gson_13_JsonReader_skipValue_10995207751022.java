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
import java.lang.Object;

public class JsonReader_skipValue_10995207751022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1440581;

    public JsonReader_skipValue_10995207751022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1440581 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term1440467 = (char[]) newCharArray(0);
        Object term1440679 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader$1"));
        setIntField(term1440581, term1440581.getClass(), "peeked", 8);
        setField(term1440581, term1440581.getClass(), "buffer", term1440467);
        setIntField(term1440581, term1440581.getClass(), "pos", 0);
        setIntField(term1440581, term1440581.getClass(), "limit", 0);
        setIntField(term1440581, term1440581.getClass(), "lineStart", 0);
        setField(term1440581, term1440581.getClass(), "in", term1440679);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "skipValue", argTypes, term1440581, args);
    }

};


