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

public class JsonReader_nextLong_951453520868 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1315123;

    public JsonReader_nextLong_951453520868() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1315123 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term1314430 = (int[]) newIntArray(489);
        setIntField(term1315123, term1315123.getClass(), "peeked", 13);
        setIntField(term1315123, term1315123.getClass(), "lineNumber", 0);
        setIntField(term1315123, term1315123.getClass(), "pos", 0);
        setIntField(term1315123, term1315123.getClass(), "lineStart", 0);
        setIntField(term1315123, term1315123.getClass(), "stackSize", 1);
        setIntElement(term1314430, 0, 69);
        setIntElement(term1314430, 1, 120);
        setIntElement(term1314430, 2, 112);
        setIntElement(term1314430, 3, 101);
        setIntElement(term1314430, 4, 99);
        setIntElement(term1314430, 5, 116);
        setIntElement(term1314430, 6, 101);
        setIntElement(term1314430, 7, 100);
        setIntElement(term1314430, 8, 32);
        setIntElement(term1314430, 9, 97);
        setIntElement(term1314430, 10, 32);
        setIntElement(term1314430, 11, 108);
        setIntElement(term1314430, 12, 111);
        setIntElement(term1314430, 13, 110);
        setIntElement(term1314430, 14, 103);
        setIntElement(term1314430, 15, 32);
        setIntElement(term1314430, 16, 98);
        setIntElement(term1314430, 17, 117);
        setIntElement(term1314430, 18, 116);
        setIntElement(term1314430, 19, 32);
        setIntElement(term1314430, 20, 119);
        setIntElement(term1314430, 21, 97);
        setIntElement(term1314430, 22, 115);
        setIntElement(term1314430, 23, 32);
        setField(term1315123, term1315123.getClass(), "stack", term1314430);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextLong", argTypes, term1315123, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


