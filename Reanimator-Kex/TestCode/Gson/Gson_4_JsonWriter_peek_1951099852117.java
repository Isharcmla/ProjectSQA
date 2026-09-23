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
import static com.google.gson.stream.EqualityUtils.*;

public class JsonWriter_peek_1951099852117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35305;
     Object term35593;

    public JsonWriter_peek_1951099852117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35305 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term35210 = (int[]) newIntArray(8);
        setIntField(term35305, term35305.getClass(), "stackSize", 8);
        setField(term35305, term35305.getClass(), "stack", term35210);
        term35593 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term35594 = (int[]) newIntArray(8);
        setField(term35593, term35593.getClass(), "out", null);
        setField(term35593, term35593.getClass(), "stack", term35594);
        setIntField(term35593, term35593.getClass(), "stackSize", 8);
        setField(term35593, term35593.getClass(), "indent", null);
        setField(term35593, term35593.getClass(), "separator", null);
        setBooleanField(term35593, term35593.getClass(), "lenient", false);
        setBooleanField(term35593, term35593.getClass(), "htmlSafe", false);
        setField(term35593, term35593.getClass(), "deferredName", null);
        setBooleanField(term35593, term35593.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "peek", argTypes, term35305, args);
        assertTrue(recursiveEquals(term35305, term35593));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


