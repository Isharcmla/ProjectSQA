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

public class JsonReader_nextBoolean_2075593930633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term319474;

    public JsonReader_nextBoolean_2075593930633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term319474 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term318783 = (int[]) newIntArray(490);
        setIntField(term319474, term319474.getClass(), "peeked", 9);
        setIntField(term319474, term319474.getClass(), "lineNumber", 0);
        setIntField(term319474, term319474.getClass(), "pos", 0);
        setIntField(term319474, term319474.getClass(), "lineStart", 0);
        setIntField(term319474, term319474.getClass(), "stackSize", 2);
        setIntElement(term318783, 0, 110);
        setField(term319474, term319474.getClass(), "stack", term318783);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextBoolean", argTypes, term319474, args);
    }

};


