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

public class JsonReader_nextString_1089781162591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260539;

    public JsonReader_nextString_1089781162591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term260539 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term259355 = (int[]) newIntArray(489);
        int[] term259846 = (int[]) newIntArray(489);
        setIntField(term260539, term260539.getClass(), "peeked", 5);
        setIntField(term260539, term260539.getClass(), "lineNumber", 0);
        setIntField(term260539, term260539.getClass(), "pos", 0);
        setIntField(term260539, term260539.getClass(), "lineStart", 0);
        setIntField(term260539, term260539.getClass(), "stackSize", 1);
        setIntElement(term259355, 0, 2);
        setField(term260539, term260539.getClass(), "stack", term259355);
        setIntElement(term259846, 0, 66);
        setIntElement(term259846, 1, 69);
        setIntElement(term259846, 2, 71);
        setIntElement(term259846, 3, 73);
        setIntElement(term259846, 4, 78);
        setIntElement(term259846, 5, 95);
        setIntElement(term259846, 6, 65);
        setIntElement(term259846, 7, 82);
        setIntElement(term259846, 8, 82);
        setIntElement(term259846, 9, 65);
        setIntElement(term259846, 10, 89);
        setField(term260539, term260539.getClass(), "pathIndices", term259846);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextString", argTypes, term260539, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


