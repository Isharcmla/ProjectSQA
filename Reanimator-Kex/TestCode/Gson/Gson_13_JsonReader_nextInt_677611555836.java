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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JsonReader_nextInt_677611555836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1299733;

    public JsonReader_nextInt_677611555836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1299733 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term1299524 = (int[]) newIntArray(1);
        setIntField(term1299733, term1299733.getClass(), "peeked", 4);
        setIntField(term1299733, term1299733.getClass(), "lineNumber", 0);
        setIntField(term1299733, term1299733.getClass(), "pos", 0);
        setIntField(term1299733, term1299733.getClass(), "lineStart", 0);
        setIntField(term1299733, term1299733.getClass(), "stackSize", 2);
        setIntElement(term1299524, 0, 8);
        setField(term1299733, term1299733.getClass(), "stack", term1299524);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextInt", argTypes, term1299733, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


