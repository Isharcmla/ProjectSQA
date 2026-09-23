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

public class JsonReader_skipToEndOfLine_1281344651016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1435535;

    public JsonReader_skipToEndOfLine_1281344651016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1435535 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term1434642 = (char[]) newCharArray(256);
        Object term1435585 = newInstance(Class.forName("java.io.BufferedReader"));
        setIntField(term1435535, term1435535.getClass(), "pos", 2);
        setIntField(term1435535, term1435535.getClass(), "limit", 4);
        setField(term1435535, term1435535.getClass(), "buffer", term1434642);
        setIntField(term1435535, term1435535.getClass(), "lineStart", 0);
        setField(term1435535, term1435535.getClass(), "in", term1435585);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "skipToEndOfLine", argTypes, term1435535, args);
    }

};


