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

public class JsonWriter_peek_1951099852104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25208;
     Object term25376;

    public JsonWriter_peek_1951099852104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25208 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term25113 = (int[]) newIntArray(8);
        setIntField(term25208, term25208.getClass(), "stackSize", 8);
        setField(term25208, term25208.getClass(), "stack", term25113);
        term25376 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term25377 = (int[]) newIntArray(8);
        setField(term25376, term25376.getClass(), "out", null);
        setField(term25376, term25376.getClass(), "stack", term25377);
        setIntField(term25376, term25376.getClass(), "stackSize", 8);
        setField(term25376, term25376.getClass(), "indent", null);
        setField(term25376, term25376.getClass(), "separator", null);
        setBooleanField(term25376, term25376.getClass(), "lenient", false);
        setBooleanField(term25376, term25376.getClass(), "htmlSafe", false);
        setField(term25376, term25376.getClass(), "deferredName", null);
        setBooleanField(term25376, term25376.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "peek", argTypes, term25208, args);
        assertTrue(recursiveEquals(term25208, term25376));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


