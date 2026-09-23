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
import java.lang.NullPointerException;
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JsonReader_nextBoolean_2075593930364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term365714;

    public JsonReader_nextBoolean_2075593930364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term365714 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setIntField(term365714, term365714.getClass(), "peeked", 1);
        setIntField(term365714, term365714.getClass(), "lineNumber", 0);
        setIntField(term365714, term365714.getClass(), "pos", 0);
        setIntField(term365714, term365714.getClass(), "lineStart", 0);
        setIntField(term365714, term365714.getClass(), "stackSize", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextBoolean", argTypes, term365714, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


