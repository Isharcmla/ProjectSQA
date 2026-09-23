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

public class JsonReader_skipQuotedValue_2132894879992 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1408437;

    public JsonReader_skipQuotedValue_2132894879992() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1408437 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term1408340 = (char[]) newCharArray(0);
        setField(term1408437, term1408437.getClass(), "buffer", term1408340);
        setIntField(term1408437, term1408437.getClass(), "pos", 0);
        setIntField(term1408437, term1408437.getClass(), "limit", 0);
        setIntField(term1408437, term1408437.getClass(), "lineStart", 0);
        setField(term1408437, term1408437.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 0;
        callMethod(klass, "skipQuotedValue", argTypes, term1408437, args);
    }

};


