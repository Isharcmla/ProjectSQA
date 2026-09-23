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

public class JsonWriter_beforeName_1433433393204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73640;

    public JsonWriter_beforeName_1433433393204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73640 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term73541 = (int[]) newIntArray(8);
        setIntField(term73640, term73640.getClass(), "stackSize", 8);
        setIntElement(term73541, 0, 5);
        setIntElement(term73541, 1, 5);
        setIntElement(term73541, 2, 5);
        setIntElement(term73541, 3, 5);
        setIntElement(term73541, 4, 5);
        setIntElement(term73541, 5, 5);
        setIntElement(term73541, 6, 5);
        setIntElement(term73541, 7, 5);
        setField(term73640, term73640.getClass(), "stack", term73541);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "beforeName", argTypes, term73640, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


