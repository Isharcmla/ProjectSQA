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

public class JsonReader_skipToEndOfLine_128134465877 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1328496;
     Object term1328526;

    public JsonReader_skipToEndOfLine_128134465877() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1328496 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term1328394 = (char[]) newCharArray(8);
        setIntField(term1328496, term1328496.getClass(), "pos", 6);
        setIntField(term1328496, term1328496.getClass(), "limit", 7);
        setCharElement(term1328394, 0, (char) 10);
        setCharElement(term1328394, 1, (char) 10);
        setCharElement(term1328394, 2, (char) 10);
        setCharElement(term1328394, 3, (char) 10);
        setCharElement(term1328394, 4, (char) 10);
        setCharElement(term1328394, 5, (char) 10);
        setCharElement(term1328394, 6, (char) 10);
        setCharElement(term1328394, 7, (char) 10);
        setField(term1328496, term1328496.getClass(), "buffer", term1328394);
        term1328526 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term1328527 = (char[]) newCharArray(8);
        setField(term1328526, term1328526.getClass(), "in", null);
        setBooleanField(term1328526, term1328526.getClass(), "lenient", false);
        setCharElement(term1328527, 0, (char) 10);
        setCharElement(term1328527, 1, (char) 10);
        setCharElement(term1328527, 2, (char) 10);
        setCharElement(term1328527, 3, (char) 10);
        setCharElement(term1328527, 4, (char) 10);
        setCharElement(term1328527, 5, (char) 10);
        setCharElement(term1328527, 6, (char) 10);
        setCharElement(term1328527, 7, (char) 10);
        setField(term1328526, term1328526.getClass(), "buffer", term1328527);
        setIntField(term1328526, term1328526.getClass(), "pos", 7);
        setIntField(term1328526, term1328526.getClass(), "limit", 7);
        setIntField(term1328526, term1328526.getClass(), "lineNumber", 1);
        setIntField(term1328526, term1328526.getClass(), "lineStart", 7);
        setIntField(term1328526, term1328526.getClass(), "peeked", 0);
        setLongField(term1328526, term1328526.getClass(), "peekedLong", 0L);
        setIntField(term1328526, term1328526.getClass(), "peekedNumberLength", 0);
        setField(term1328526, term1328526.getClass(), "peekedString", null);
        setField(term1328526, term1328526.getClass(), "stack", null);
        setIntField(term1328526, term1328526.getClass(), "stackSize", 0);
        setField(term1328526, term1328526.getClass(), "pathNames", null);
        setField(term1328526, term1328526.getClass(), "pathIndices", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "skipToEndOfLine", argTypes, term1328496, args);
        assertTrue(recursiveEquals(term1328496, term1328526));
    }

};


