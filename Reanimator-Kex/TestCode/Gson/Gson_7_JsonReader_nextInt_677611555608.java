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

public class JsonReader_nextInt_677611555608 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282707;

    public JsonReader_nextInt_677611555608() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term282707 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term282484 = (int[]) newIntArray(18);
        setIntField(term282707, term282707.getClass(), "peeked", 3);
        setIntField(term282707, term282707.getClass(), "lineNumber", 0);
        setIntField(term282707, term282707.getClass(), "pos", 0);
        setIntField(term282707, term282707.getClass(), "lineStart", 0);
        setIntField(term282707, term282707.getClass(), "stackSize", 2);
        setIntElement(term282484, 0, 66);
        setField(term282707, term282707.getClass(), "stack", term282484);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextInt", argTypes, term282707, args);
    }

};


