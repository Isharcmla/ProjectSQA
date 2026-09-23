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

public class JsonReader_syntaxError_824930160553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term959919;

    public JsonReader_syntaxError_824930160553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term959919 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term956811 = (int[]) newIntArray(491);
        int[] term958288 = (int[]) newIntArray(491);
        setIntField(term959919, term959919.getClass(), "lineNumber", 0);
        setIntField(term959919, term959919.getClass(), "pos", 0);
        setIntField(term959919, term959919.getClass(), "lineStart", 0);
        setIntField(term959919, term959919.getClass(), "stackSize", 7);
        setIntElement(term956811, 0, -752870423);
        setIntElement(term956811, 1, -1698809299);
        setIntElement(term956811, 2, 2);
        setIntElement(term956811, 4, 4);
        setIntElement(term956811, 128, 5480936);
        setField(term959919, term959919.getClass(), "stack", term956811);
        setIntElement(term958288, 0, 32);
        setIntElement(term958288, 1, 99);
        setIntElement(term958288, 2, 111);
        setIntElement(term958288, 3, 108);
        setIntElement(term958288, 4, 117);
        setIntElement(term958288, 5, 109);
        setIntElement(term958288, 6, 110);
        setIntElement(term958288, 7, 32);
        setField(term959919, term959919.getClass(), "pathIndices", term958288);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "syntaxError", argTypes, term959919, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


