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

public class JsonReader_nextInt_6776115551023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1443535;

    public JsonReader_nextInt_6776115551023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1443535 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term1442344 = (int[]) newIntArray(489);
        setIntField(term1443535, term1443535.getClass(), "peeked", 4);
        setIntField(term1443535, term1443535.getClass(), "lineNumber", 0);
        setIntField(term1443535, term1443535.getClass(), "pos", 0);
        setIntField(term1443535, term1443535.getClass(), "lineStart", 0);
        setIntField(term1443535, term1443535.getClass(), "stackSize", 2);
        setIntElement(term1442344, 0, 69);
        setIntElement(term1442344, 1, 8);
        setField(term1443535, term1443535.getClass(), "stack", term1442344);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextInt", argTypes, term1443535, args);
    }

};


