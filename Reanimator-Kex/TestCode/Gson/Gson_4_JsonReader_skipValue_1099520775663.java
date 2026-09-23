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

public class JsonReader_skipValue_1099520775663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term391555;

    public JsonReader_skipValue_1099520775663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term391555 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term391444 = (char[]) newCharArray(0);
        setIntField(term391555, term391555.getClass(), "peeked", 13);
        setField(term391555, term391555.getClass(), "buffer", term391444);
        setIntField(term391555, term391555.getClass(), "pos", 0);
        setIntField(term391555, term391555.getClass(), "limit", 0);
        setIntField(term391555, term391555.getClass(), "lineStart", 0);
        setField(term391555, term391555.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "skipValue", argTypes, term391555, args);
    }

};


