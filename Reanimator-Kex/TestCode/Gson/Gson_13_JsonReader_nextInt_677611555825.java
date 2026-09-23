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

public class JsonReader_nextInt_677611555825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1292517;

    public JsonReader_nextInt_677611555825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1292517 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term1291826 = (int[]) newIntArray(489);
        setIntField(term1292517, term1292517.getClass(), "peeked", 11);
        setIntField(term1292517, term1292517.getClass(), "lineNumber", 0);
        setIntField(term1292517, term1292517.getClass(), "pos", 0);
        setIntField(term1292517, term1292517.getClass(), "lineStart", 0);
        setIntField(term1292517, term1292517.getClass(), "stackSize", 1);
        setIntElement(term1291826, 0, 69);
        setIntElement(term1291826, 1, 120);
        setIntElement(term1291826, 2, 112);
        setIntElement(term1291826, 3, 101);
        setIntElement(term1291826, 4, 99);
        setIntElement(term1291826, 5, 116);
        setIntElement(term1291826, 6, 101);
        setIntElement(term1291826, 7, 100);
        setIntElement(term1291826, 8, 32);
        setIntElement(term1291826, 9, 97);
        setIntElement(term1291826, 10, 110);
        setIntElement(term1291826, 11, 32);
        setIntElement(term1291826, 12, 105);
        setIntElement(term1291826, 13, 110);
        setIntElement(term1291826, 14, 116);
        setIntElement(term1291826, 15, 32);
        setIntElement(term1291826, 16, 98);
        setIntElement(term1291826, 17, 117);
        setIntElement(term1291826, 18, 116);
        setIntElement(term1291826, 19, 32);
        setIntElement(term1291826, 20, 119);
        setIntElement(term1291826, 21, 97);
        setIntElement(term1291826, 22, 115);
        setIntElement(term1291826, 23, 32);
        setField(term1292517, term1292517.getClass(), "stack", term1291826);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextInt", argTypes, term1292517, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


