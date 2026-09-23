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

public class JsonReader_syntaxError_824930160316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277822;

    public JsonReader_syntaxError_824930160316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277822 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term275193 = (int[]) newIntArray(495);
        setIntField(term277822, term277822.getClass(), "lineNumber", 0);
        setIntField(term277822, term277822.getClass(), "pos", 0);
        setIntField(term277822, term277822.getClass(), "lineStart", 0);
        setIntField(term277822, term277822.getClass(), "stackSize", 7);
        setIntElement(term275193, 0, -752870423);
        setIntElement(term275193, 1, -1698809299);
        setIntElement(term275193, 2, 401512128);
        setIntElement(term275193, 3, 8);
        setIntElement(term275193, 4, 6);
        setField(term277822, term277822.getClass(), "stack", term275193);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "syntaxError", argTypes, term277822, args);
            assertTrue(false);
        }
        catch (MalformedJsonException e) {
        }

    }

};


