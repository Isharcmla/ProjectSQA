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

public class JsonWriter_peek_1951099852112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26590;
     Object term26969;

    public JsonWriter_peek_1951099852112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26590 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term26495 = (int[]) newIntArray(8);
        setIntField(term26590, term26590.getClass(), "stackSize", 8);
        setField(term26590, term26590.getClass(), "stack", term26495);
        term26969 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term26970 = (int[]) newIntArray(8);
        setField(term26969, term26969.getClass(), "out", null);
        setField(term26969, term26969.getClass(), "stack", term26970);
        setIntField(term26969, term26969.getClass(), "stackSize", 8);
        setField(term26969, term26969.getClass(), "indent", null);
        setField(term26969, term26969.getClass(), "separator", null);
        setBooleanField(term26969, term26969.getClass(), "lenient", false);
        setBooleanField(term26969, term26969.getClass(), "htmlSafe", false);
        setField(term26969, term26969.getClass(), "deferredName", null);
        setBooleanField(term26969, term26969.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "peek", argTypes, term26590, args);
        assertTrue(recursiveEquals(term26590, term26969));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


