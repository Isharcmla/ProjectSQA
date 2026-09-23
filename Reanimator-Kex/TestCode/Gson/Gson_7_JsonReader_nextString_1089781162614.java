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

public class JsonReader_nextString_1089781162614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292625;

    public JsonReader_nextString_1089781162614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292625 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term292037 = (int[]) newIntArray(384);
        setIntField(term292625, term292625.getClass(), "peeked", 2);
        setIntField(term292625, term292625.getClass(), "lineNumber", 0);
        setIntField(term292625, term292625.getClass(), "pos", 0);
        setIntField(term292625, term292625.getClass(), "lineStart", 0);
        setIntField(term292625, term292625.getClass(), "stackSize", 1);
        setIntElement(term292037, 0, 2);
        setIntElement(term292037, 4, -342217328);
        setField(term292625, term292625.getClass(), "stack", term292037);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextString", argTypes, term292625, args);
    }

};


