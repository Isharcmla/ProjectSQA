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

public class JsonReader_syntaxError_824930160426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term489169;

    public JsonReader_syntaxError_824930160426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term489169 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term485538 = (int[]) newIntArray(495);
        setIntField(term489169, term489169.getClass(), "lineNumber", 0);
        setIntField(term489169, term489169.getClass(), "pos", 0);
        setIntField(term489169, term489169.getClass(), "lineStart", 0);
        setIntField(term489169, term489169.getClass(), "stackSize", 7);
        setIntElement(term485538, 0, -752870423);
        setIntElement(term485538, 1, -1698809299);
        setIntElement(term485538, 2, 401512128);
        setIntElement(term485538, 3, 8);
        setIntElement(term485538, 4, 6);
        setIntElement(term485538, 6, 4);
        setField(term489169, term489169.getClass(), "stack", term485538);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "syntaxError", argTypes, term489169, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


