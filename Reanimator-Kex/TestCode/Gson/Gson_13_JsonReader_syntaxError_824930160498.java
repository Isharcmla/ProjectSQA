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
import com.google.gson.stream.MalformedJsonException;
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JsonReader_syntaxError_824930160498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term782482;

    public JsonReader_syntaxError_824930160498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term782482 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term778373 = (int[]) newIntArray(491);
        int[] term781326 = (int[]) newIntArray(494);
        setIntField(term782482, term782482.getClass(), "lineNumber", 0);
        setIntField(term782482, term782482.getClass(), "pos", 0);
        setIntField(term782482, term782482.getClass(), "lineStart", 0);
        setIntField(term782482, term782482.getClass(), "stackSize", 7);
        setIntElement(term778373, 0, -752870423);
        setIntElement(term778373, 1, -1698809299);
        setIntElement(term778373, 2, 401512128);
        setIntElement(term778373, 3, -2069930777);
        setIntElement(term778373, 4, 8);
        setIntElement(term778373, 5, 1);
        setIntElement(term778373, 6, 8);
        setField(term782482, term782482.getClass(), "stack", term778373);
        setIntElement(term781326, 0, 32);
        setIntElement(term781326, 1, 112);
        setIntElement(term781326, 2, 97);
        setIntElement(term781326, 3, 116);
        setIntElement(term781326, 4, 104);
        setIntElement(term781326, 5, 32);
        setField(term782482, term782482.getClass(), "pathIndices", term781326);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "syntaxError", argTypes, term782482, args);
            assertTrue(false);
        }
        catch (MalformedJsonException e) {
        }

    }

};


