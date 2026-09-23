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

public class JsonReader_beginObject_1064829027547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term940190;

    public JsonReader_beginObject_1064829027547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term940190 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term939503 = (int[]) newIntArray(489);
        setIntField(term940190, term940190.getClass(), "peeked", 6);
        setIntField(term940190, term940190.getClass(), "lineNumber", 0);
        setIntField(term940190, term940190.getClass(), "pos", 0);
        setIntField(term940190, term940190.getClass(), "lineStart", 0);
        setIntField(term940190, term940190.getClass(), "stackSize", 1);
        setIntElement(term939503, 0, 83);
        setIntElement(term939503, 1, 84);
        setIntElement(term939503, 2, 82);
        setIntElement(term939503, 3, 73);
        setIntElement(term939503, 4, 78);
        setIntElement(term939503, 5, 71);
        setField(term940190, term940190.getClass(), "stack", term939503);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "beginObject", argTypes, term940190, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


