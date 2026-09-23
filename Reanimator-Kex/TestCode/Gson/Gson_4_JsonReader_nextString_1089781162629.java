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

public class JsonReader_nextString_1089781162629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term353434;

    public JsonReader_nextString_1089781162629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term353434 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term352746 = (int[]) newIntArray(489);
        setIntField(term353434, term353434.getClass(), "peeked", 13);
        setIntField(term353434, term353434.getClass(), "lineNumber", 0);
        setIntField(term353434, term353434.getClass(), "pos", 0);
        setIntField(term353434, term353434.getClass(), "lineStart", 0);
        setIntField(term353434, term353434.getClass(), "stackSize", 1);
        setIntElement(term352746, 0, 66);
        setIntElement(term352746, 1, 69);
        setIntElement(term352746, 2, 71);
        setIntElement(term352746, 3, 73);
        setIntElement(term352746, 4, 78);
        setIntElement(term352746, 5, 95);
        setIntElement(term352746, 6, 79);
        setIntElement(term352746, 7, 66);
        setIntElement(term352746, 8, 74);
        setIntElement(term352746, 9, 69);
        setIntElement(term352746, 10, 67);
        setIntElement(term352746, 11, 84);
        setField(term353434, term353434.getClass(), "stack", term352746);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextString", argTypes, term353434, args);
    }

};


