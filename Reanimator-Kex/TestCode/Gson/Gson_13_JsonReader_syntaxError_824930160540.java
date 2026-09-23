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
import java.lang.NullPointerException;
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JsonReader_syntaxError_824930160540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term917725;

    public JsonReader_syntaxError_824930160540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term917725 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term914096 = (int[]) newIntArray(495);
        int[] term915585 = (int[]) newIntArray(491);
        setIntField(term917725, term917725.getClass(), "lineNumber", 0);
        setIntField(term917725, term917725.getClass(), "pos", 0);
        setIntField(term917725, term917725.getClass(), "lineStart", 0);
        setIntField(term917725, term917725.getClass(), "stackSize", 7);
        setIntElement(term914096, 0, -752870423);
        setIntElement(term914096, 1, -1698809299);
        setIntElement(term914096, 2, 2);
        setIntElement(term914096, 5, 5);
        setField(term917725, term917725.getClass(), "stack", term914096);
        setIntElement(term915585, 0, 32);
        setIntElement(term915585, 1, 97);
        setIntElement(term915585, 2, 116);
        setIntElement(term915585, 3, 32);
        setIntElement(term915585, 4, 108);
        setIntElement(term915585, 5, 105);
        setIntElement(term915585, 6, 110);
        setIntElement(term915585, 7, 101);
        setIntElement(term915585, 8, 32);
        setField(term917725, term917725.getClass(), "pathIndices", term915585);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "syntaxError", argTypes, term917725, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


