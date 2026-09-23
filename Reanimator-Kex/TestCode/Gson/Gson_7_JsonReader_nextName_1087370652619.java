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

public class JsonReader_nextName_1087370652619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term300932;

    public JsonReader_nextName_1087370652619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term300932 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term300715 = (int[]) newIntArray(18);
        setIntField(term300932, term300932.getClass(), "peeked", 17);
        setIntField(term300932, term300932.getClass(), "lineNumber", 0);
        setIntField(term300932, term300932.getClass(), "pos", 0);
        setIntField(term300932, term300932.getClass(), "lineStart", 0);
        setIntField(term300932, term300932.getClass(), "stackSize", 1);
        setIntElement(term300715, 0, 7);
        setField(term300932, term300932.getClass(), "stack", term300715);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextName", argTypes, term300932, args);
    }

};


