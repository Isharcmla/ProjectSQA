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

public class JsonReader_syntaxError_824930160367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term373748;

    public JsonReader_syntaxError_824930160367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term373748 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term370618 = (int[]) newIntArray(495);
        setIntField(term373748, term373748.getClass(), "lineNumber", 0);
        setIntField(term373748, term373748.getClass(), "pos", 0);
        setIntField(term373748, term373748.getClass(), "lineStart", 0);
        setIntField(term373748, term373748.getClass(), "stackSize", 7);
        setIntElement(term370618, 0, -752870423);
        setIntElement(term370618, 1, -1698809299);
        setIntElement(term370618, 2, 401512128);
        setIntElement(term370618, 3, 6);
        setIntElement(term370618, 5, 5);
        setField(term373748, term373748.getClass(), "stack", term370618);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "syntaxError", argTypes, term373748, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


