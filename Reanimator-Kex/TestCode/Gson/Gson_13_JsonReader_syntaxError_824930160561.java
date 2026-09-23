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

public class JsonReader_syntaxError_824930160561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1010791;

    public JsonReader_syntaxError_824930160561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1010791 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term1003146 = (int[]) newIntArray(495);
        setIntField(term1010791, term1010791.getClass(), "lineNumber", 0);
        setIntField(term1010791, term1010791.getClass(), "pos", 0);
        setIntField(term1010791, term1010791.getClass(), "lineStart", 0);
        setIntField(term1010791, term1010791.getClass(), "stackSize", 31);
        setIntElement(term1003146, 0, -752870423);
        setIntElement(term1003146, 1, -1698809299);
        setIntElement(term1003146, 2, 401512128);
        setIntElement(term1003146, 3, -2069930777);
        setIntElement(term1003146, 4, 7);
        setIntElement(term1003146, 12, 7);
        setIntElement(term1003146, 13, 7);
        setField(term1010791, term1010791.getClass(), "stack", term1003146);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "syntaxError", argTypes, term1010791, args);
            assertTrue(false);
        }
        catch (MalformedJsonException e) {
        }

    }

};


