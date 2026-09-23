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

public class JsonReader_nextString_1089781162577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1078817;

    public JsonReader_nextString_1089781162577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1078817 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term1078612 = (int[]) newIntArray(1);
        setIntField(term1078817, term1078817.getClass(), "peeked", 12);
        setIntField(term1078817, term1078817.getClass(), "lineNumber", 0);
        setIntField(term1078817, term1078817.getClass(), "pos", 0);
        setIntField(term1078817, term1078817.getClass(), "lineStart", 0);
        setIntField(term1078817, term1078817.getClass(), "stackSize", 1);
        setIntElement(term1078612, 0, 3);
        setField(term1078817, term1078817.getClass(), "stack", term1078612);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextString", argTypes, term1078817, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


