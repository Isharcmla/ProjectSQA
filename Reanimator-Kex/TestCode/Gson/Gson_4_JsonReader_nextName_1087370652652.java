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

public class JsonReader_nextName_1087370652652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term379280;

    public JsonReader_nextName_1087370652652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term379280 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term378745 = (int[]) newIntArray(337);
        setIntField(term379280, term379280.getClass(), "peeked", 2);
        setIntField(term379280, term379280.getClass(), "lineNumber", 0);
        setIntField(term379280, term379280.getClass(), "pos", 0);
        setIntField(term379280, term379280.getClass(), "lineStart", 0);
        setIntField(term379280, term379280.getClass(), "stackSize", 1);
        setIntElement(term378745, 0, 69);
        setIntElement(term378745, 1, 120);
        setIntElement(term378745, 2, 112);
        setIntElement(term378745, 3, 101);
        setIntElement(term378745, 4, 99);
        setIntElement(term378745, 5, 116);
        setIntElement(term378745, 6, 101);
        setIntElement(term378745, 7, 100);
        setIntElement(term378745, 8, 32);
        setIntElement(term378745, 9, 97);
        setIntElement(term378745, 10, 32);
        setIntElement(term378745, 11, 110);
        setIntElement(term378745, 12, 97);
        setIntElement(term378745, 13, 109);
        setIntElement(term378745, 14, 101);
        setIntElement(term378745, 15, 32);
        setIntElement(term378745, 16, 98);
        setIntElement(term378745, 17, 117);
        setIntElement(term378745, 18, 116);
        setIntElement(term378745, 19, 32);
        setIntElement(term378745, 20, 119);
        setIntElement(term378745, 21, 97);
        setIntElement(term378745, 22, 115);
        setIntElement(term378745, 23, 32);
        setField(term379280, term379280.getClass(), "stack", term378745);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextName", argTypes, term379280, args);
    }

};


