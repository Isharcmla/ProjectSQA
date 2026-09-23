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

public class JsonReader_nextDouble_1411403318989 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1405133;

    public JsonReader_nextDouble_1411403318989() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1405133 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term1404775 = (int[]) newIntArray(73);
        setIntField(term1405133, term1405133.getClass(), "peeked", 4);
        setIntField(term1405133, term1405133.getClass(), "lineNumber", 0);
        setIntField(term1405133, term1405133.getClass(), "pos", 0);
        setIntField(term1405133, term1405133.getClass(), "lineStart", 0);
        setIntField(term1405133, term1405133.getClass(), "stackSize", 2);
        setIntElement(term1404775, 0, 8);
        setField(term1405133, term1405133.getClass(), "stack", term1404775);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextDouble", argTypes, term1405133, args);
    }

};


