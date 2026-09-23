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

public class JsonReader_endArray_1917304595519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term257739;

    public JsonReader_endArray_1917304595519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term257739 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term257039 = (int[]) newIntArray(504);
        setIntField(term257739, term257739.getClass(), "peeked", 7);
        setIntField(term257739, term257739.getClass(), "lineNumber", 0);
        setIntField(term257739, term257739.getClass(), "pos", 0);
        setIntField(term257739, term257739.getClass(), "lineStart", 0);
        setIntField(term257739, term257739.getClass(), "stackSize", 1);
        setIntElement(term257039, 0, 7);
        setField(term257739, term257739.getClass(), "stack", term257039);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "endArray", argTypes, term257739, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


