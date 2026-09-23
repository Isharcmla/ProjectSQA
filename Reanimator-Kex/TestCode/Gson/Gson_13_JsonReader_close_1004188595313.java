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
import java.lang.Object;

public class JsonReader_close_1004188595313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term272866;

    public JsonReader_close_1004188595313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term272866 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term272522 = (int[]) newIntArray(256);
        Object term272916 = newInstance(Class.forName("java.io.BufferedReader"));
        setIntField(term272866, term272866.getClass(), "peeked", 0);
        setField(term272866, term272866.getClass(), "stack", term272522);
        setIntField(term272866, term272866.getClass(), "stackSize", 0);
        setField(term272866, term272866.getClass(), "in", term272916);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term272866, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


