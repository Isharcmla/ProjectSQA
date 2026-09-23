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

public class JsonReader_nextName_1087370652599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term272097;

    public JsonReader_nextName_1087370652599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term272097 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term271797 = (int[]) newIntArray(105);
        setIntField(term272097, term272097.getClass(), "peeked", 9);
        setIntField(term272097, term272097.getClass(), "lineNumber", 0);
        setIntField(term272097, term272097.getClass(), "pos", 0);
        setIntField(term272097, term272097.getClass(), "lineStart", 0);
        setIntField(term272097, term272097.getClass(), "stackSize", 1);
        setIntElement(term271797, 0, 69);
        setIntElement(term271797, 1, 120);
        setIntElement(term271797, 2, 112);
        setIntElement(term271797, 3, 101);
        setIntElement(term271797, 4, 99);
        setIntElement(term271797, 5, 116);
        setIntElement(term271797, 6, 101);
        setIntElement(term271797, 7, 100);
        setIntElement(term271797, 8, 32);
        setIntElement(term271797, 9, 97);
        setIntElement(term271797, 10, 32);
        setIntElement(term271797, 11, 110);
        setIntElement(term271797, 12, 97);
        setIntElement(term271797, 13, 109);
        setIntElement(term271797, 14, 101);
        setIntElement(term271797, 15, 32);
        setIntElement(term271797, 16, 98);
        setIntElement(term271797, 17, 117);
        setIntElement(term271797, 18, 116);
        setIntElement(term271797, 19, 32);
        setIntElement(term271797, 20, 119);
        setIntElement(term271797, 21, 97);
        setIntElement(term271797, 22, 115);
        setIntElement(term271797, 23, 32);
        setField(term272097, term272097.getClass(), "stack", term271797);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextName", argTypes, term272097, args);
    }

};


