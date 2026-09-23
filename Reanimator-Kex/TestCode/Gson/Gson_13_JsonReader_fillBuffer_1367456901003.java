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

public class JsonReader_fillBuffer_1367456901003 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1420883;

    public JsonReader_fillBuffer_1367456901003() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1420883 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term1420784 = (char[]) newCharArray(0);
        Object term1420937 = newInstance(Class.forName("java.io.LineNumberReader"));
        setField(term1420883, term1420883.getClass(), "buffer", term1420784);
        setIntField(term1420883, term1420883.getClass(), "lineStart", 0);
        setIntField(term1420883, term1420883.getClass(), "pos", 0);
        setIntField(term1420883, term1420883.getClass(), "limit", 0);
        setField(term1420883, term1420883.getClass(), "in", term1420937);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        callMethod(klass, "fillBuffer", argTypes, term1420883, args);
    }

};


