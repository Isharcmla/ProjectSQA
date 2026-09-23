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

public class JsonReader_endArray_1917304595639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term363936;

    public JsonReader_endArray_1917304595639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term363936 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term362748 = (int[]) newIntArray(490);
        setIntField(term363936, term363936.getClass(), "peeked", 7);
        setIntField(term363936, term363936.getClass(), "lineNumber", 0);
        setIntField(term363936, term363936.getClass(), "pos", 0);
        setIntField(term363936, term363936.getClass(), "lineStart", 0);
        setIntField(term363936, term363936.getClass(), "stackSize", 9);
        setIntElement(term362748, 0, 66);
        setField(term363936, term363936.getClass(), "stack", term362748);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "endArray", argTypes, term363936, args);
    }

};


