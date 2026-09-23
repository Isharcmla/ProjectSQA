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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JsonReader_syntaxError_824930160567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1035590;

    public JsonReader_syntaxError_824930160567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1035590 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term1035294 = (int[]) newIntArray(14);
        Object[] term1035415 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term1035590, term1035590.getClass(), "lineNumber", 0);
        setIntField(term1035590, term1035590.getClass(), "pos", 0);
        setIntField(term1035590, term1035590.getClass(), "lineStart", 0);
        setIntField(term1035590, term1035590.getClass(), "stackSize", 14);
        setIntElement(term1035294, 0, -752870423);
        setIntElement(term1035294, 1, -1698809299);
        setIntElement(term1035294, 2, 401512128);
        setIntElement(term1035294, 3, -2069930777);
        setIntElement(term1035294, 4, 7);
        setIntElement(term1035294, 7, 5);
        setField(term1035590, term1035590.getClass(), "stack", term1035294);
        setField(term1035590, term1035590.getClass(), "pathNames", term1035415);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "syntaxError", argTypes, term1035590, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


