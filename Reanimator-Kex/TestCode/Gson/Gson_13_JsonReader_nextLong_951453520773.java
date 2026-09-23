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

public class JsonReader_nextLong_951453520773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1268966;

    public JsonReader_nextLong_951453520773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1268966 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term1268723 = (int[]) newIntArray(41);
        setIntField(term1268966, term1268966.getClass(), "peeked", 6);
        setIntField(term1268966, term1268966.getClass(), "lineNumber", 0);
        setIntField(term1268966, term1268966.getClass(), "pos", 0);
        setIntField(term1268966, term1268966.getClass(), "lineStart", 0);
        setIntField(term1268966, term1268966.getClass(), "stackSize", 1);
        setIntElement(term1268723, 0, 69);
        setIntElement(term1268723, 1, 120);
        setIntElement(term1268723, 2, 112);
        setIntElement(term1268723, 3, 101);
        setIntElement(term1268723, 4, 99);
        setIntElement(term1268723, 5, 116);
        setIntElement(term1268723, 6, 101);
        setIntElement(term1268723, 7, 100);
        setIntElement(term1268723, 8, 32);
        setIntElement(term1268723, 9, 97);
        setIntElement(term1268723, 10, 32);
        setIntElement(term1268723, 11, 108);
        setIntElement(term1268723, 12, 111);
        setIntElement(term1268723, 13, 110);
        setIntElement(term1268723, 14, 103);
        setIntElement(term1268723, 15, 32);
        setIntElement(term1268723, 16, 98);
        setIntElement(term1268723, 17, 117);
        setIntElement(term1268723, 18, 116);
        setIntElement(term1268723, 19, 32);
        setIntElement(term1268723, 20, 119);
        setIntElement(term1268723, 21, 97);
        setIntElement(term1268723, 22, 115);
        setIntElement(term1268723, 23, 32);
        setField(term1268966, term1268966.getClass(), "stack", term1268723);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextLong", argTypes, term1268966, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


