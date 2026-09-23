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

public class JsonReader_beginObject_1064829027365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129209;

    public JsonReader_beginObject_1064829027365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129209 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term128910 = (int[]) newIntArray(105);
        setIntField(term129209, term129209.getClass(), "peeked", 8);
        setIntField(term129209, term129209.getClass(), "lineNumber", 0);
        setIntField(term129209, term129209.getClass(), "pos", 0);
        setIntField(term129209, term129209.getClass(), "lineStart", 0);
        setIntField(term129209, term129209.getClass(), "stackSize", 1);
        setIntElement(term128910, 0, 66);
        setIntElement(term128910, 1, 69);
        setIntElement(term128910, 2, 71);
        setIntElement(term128910, 3, 73);
        setIntElement(term128910, 4, 78);
        setIntElement(term128910, 5, 95);
        setIntElement(term128910, 6, 79);
        setIntElement(term128910, 7, 66);
        setIntElement(term128910, 8, 74);
        setIntElement(term128910, 9, 69);
        setIntElement(term128910, 10, 67);
        setIntElement(term128910, 11, 84);
        setField(term129209, term129209.getClass(), "stack", term128910);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "beginObject", argTypes, term129209, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


