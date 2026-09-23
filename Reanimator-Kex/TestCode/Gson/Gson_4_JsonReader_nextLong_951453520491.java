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

public class JsonReader_nextLong_951453520491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221116;

    public JsonReader_nextLong_951453520491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term221116 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term220188 = (int[]) newIntArray(489);
        int[] term220679 = (int[]) newIntArray(233);
        setIntField(term221116, term221116.getClass(), "peeked", 12);
        setIntField(term221116, term221116.getClass(), "lineNumber", 0);
        setIntField(term221116, term221116.getClass(), "pos", 0);
        setIntField(term221116, term221116.getClass(), "lineStart", 0);
        setIntField(term221116, term221116.getClass(), "stackSize", 1);
        setIntElement(term220188, 0, 1);
        setField(term221116, term221116.getClass(), "stack", term220188);
        setIntElement(term220679, 0, 66);
        setIntElement(term220679, 1, 69);
        setIntElement(term220679, 2, 71);
        setIntElement(term220679, 3, 73);
        setIntElement(term220679, 4, 78);
        setIntElement(term220679, 5, 95);
        setIntElement(term220679, 6, 65);
        setIntElement(term220679, 7, 82);
        setIntElement(term220679, 8, 82);
        setIntElement(term220679, 9, 65);
        setIntElement(term220679, 10, 89);
        setField(term221116, term221116.getClass(), "pathIndices", term220679);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextLong", argTypes, term221116, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


