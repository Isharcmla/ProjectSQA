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
import java.lang.Object;

public class JsonReader_nextInt_6776115551007 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1424546;

    public JsonReader_nextInt_6776115551007() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1424546 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term1424329 = (int[]) newIntArray(8);
        Object[] term1424339 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term1424546, term1424546.getClass(), "peeked", 4);
        setIntField(term1424546, term1424546.getClass(), "lineNumber", 0);
        setIntField(term1424546, term1424546.getClass(), "pos", 0);
        setIntField(term1424546, term1424546.getClass(), "lineStart", 0);
        setIntField(term1424546, term1424546.getClass(), "stackSize", 1);
        setIntElement(term1424329, 0, 5);
        setField(term1424546, term1424546.getClass(), "stack", term1424329);
        setField(term1424546, term1424546.getClass(), "pathNames", term1424339);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextInt", argTypes, term1424546, args);
    }

};


