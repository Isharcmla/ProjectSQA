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

public class JsonReader_nextString_1089781162575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242171;

    public JsonReader_nextString_1089781162575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term242171 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term241466 = (int[]) newIntArray(505);
        setIntField(term242171, term242171.getClass(), "peeked", 1);
        setIntField(term242171, term242171.getClass(), "lineNumber", 0);
        setIntField(term242171, term242171.getClass(), "pos", 0);
        setIntField(term242171, term242171.getClass(), "lineStart", 0);
        setIntField(term242171, term242171.getClass(), "stackSize", 1);
        setIntElement(term241466, 0, 66);
        setIntElement(term241466, 1, 69);
        setIntElement(term241466, 2, 71);
        setIntElement(term241466, 3, 73);
        setIntElement(term241466, 4, 78);
        setIntElement(term241466, 5, 95);
        setIntElement(term241466, 6, 79);
        setIntElement(term241466, 7, 66);
        setIntElement(term241466, 8, 74);
        setIntElement(term241466, 9, 69);
        setIntElement(term241466, 10, 67);
        setIntElement(term241466, 11, 84);
        setField(term242171, term242171.getClass(), "stack", term241466);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextString", argTypes, term242171, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


