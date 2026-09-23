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

public class JsonReader_beginArray_881593221515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247447;

    public JsonReader_beginArray_881593221515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term247447 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term246266 = (int[]) newIntArray(489);
        int[] term246757 = (int[]) newIntArray(490);
        setIntField(term247447, term247447.getClass(), "peeked", 6);
        setIntField(term247447, term247447.getClass(), "lineNumber", 0);
        setIntField(term247447, term247447.getClass(), "pos", 0);
        setIntField(term247447, term247447.getClass(), "lineStart", 0);
        setIntField(term247447, term247447.getClass(), "stackSize", 1);
        setIntElement(term246266, 0, 2);
        setField(term247447, term247447.getClass(), "stack", term246266);
        setIntElement(term246757, 0, 66);
        setIntElement(term246757, 1, 69);
        setIntElement(term246757, 2, 71);
        setIntElement(term246757, 3, 73);
        setIntElement(term246757, 4, 78);
        setIntElement(term246757, 5, 95);
        setIntElement(term246757, 6, 65);
        setIntElement(term246757, 7, 82);
        setIntElement(term246757, 8, 82);
        setIntElement(term246757, 9, 65);
        setIntElement(term246757, 10, 89);
        setField(term247447, term247447.getClass(), "pathIndices", term246757);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "beginArray", argTypes, term247447, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


