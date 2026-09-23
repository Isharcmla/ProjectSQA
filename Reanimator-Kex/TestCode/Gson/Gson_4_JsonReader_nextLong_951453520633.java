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

public class JsonReader_nextLong_951453520633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term358439;

    public JsonReader_nextLong_951453520633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term358439 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term356753 = (int[]) newIntArray(491);
        setIntField(term358439, term358439.getClass(), "peeked", 12);
        setIntField(term358439, term358439.getClass(), "lineNumber", 0);
        setIntField(term358439, term358439.getClass(), "pos", 0);
        setIntField(term358439, term358439.getClass(), "lineStart", 0);
        setIntField(term358439, term358439.getClass(), "stackSize", 3);
        setIntElement(term356753, 0, 66);
        setIntElement(term356753, 2, 5);
        setField(term358439, term358439.getClass(), "stack", term356753);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextLong", argTypes, term358439, args);
    }

};


