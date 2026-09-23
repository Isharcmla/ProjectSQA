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

public class JsonReader_nextName_1087370652598 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270519;

    public JsonReader_nextName_1087370652598() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term270519 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term270219 = (int[]) newIntArray(105);
        setIntField(term270519, term270519.getClass(), "peeked", 11);
        setIntField(term270519, term270519.getClass(), "lineNumber", 0);
        setIntField(term270519, term270519.getClass(), "pos", 0);
        setIntField(term270519, term270519.getClass(), "lineStart", 0);
        setIntField(term270519, term270519.getClass(), "stackSize", 1);
        setIntElement(term270219, 0, 69);
        setIntElement(term270219, 1, 120);
        setIntElement(term270219, 2, 112);
        setIntElement(term270219, 3, 101);
        setIntElement(term270219, 4, 99);
        setIntElement(term270219, 5, 116);
        setIntElement(term270219, 6, 101);
        setIntElement(term270219, 7, 100);
        setIntElement(term270219, 8, 32);
        setIntElement(term270219, 9, 97);
        setIntElement(term270219, 10, 32);
        setIntElement(term270219, 11, 110);
        setIntElement(term270219, 12, 97);
        setIntElement(term270219, 13, 109);
        setIntElement(term270219, 14, 101);
        setIntElement(term270219, 15, 32);
        setIntElement(term270219, 16, 98);
        setIntElement(term270219, 17, 117);
        setIntElement(term270219, 18, 116);
        setIntElement(term270219, 19, 32);
        setIntElement(term270219, 20, 119);
        setIntElement(term270219, 21, 97);
        setIntElement(term270219, 22, 115);
        setIntElement(term270219, 23, 32);
        setField(term270519, term270519.getClass(), "stack", term270219);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextName", argTypes, term270519, args);
    }

};


