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
import java.lang.Object;

public class JsonWriter_flush_2108505943302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135554;
     Object term135667;

    public JsonWriter_flush_2108505943302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135554 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term135658 = newInstance(Class.forName("com.google.gson.internal.Streams$AppendableWriter"));
        setIntField(term135554, term135554.getClass(), "stackSize", -1);
        setField(term135554, term135554.getClass(), "out", term135658);
        term135667 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term135668 = newInstance(Class.forName("com.google.gson.internal.Streams$AppendableWriter"));
        setField(term135668, term135668.getClass(), "appendable", null);
        setField(term135668, term135668.getClass(), "currentWrite", null);
        setField(term135668, term135668.getClass(), "writeBuffer", null);
        setField(term135668, term135668.getClass(), "lock", null);
        setField(term135667, term135667.getClass(), "out", term135668);
        setField(term135667, term135667.getClass(), "stack", null);
        setIntField(term135667, term135667.getClass(), "stackSize", -1);
        setField(term135667, term135667.getClass(), "indent", null);
        setField(term135667, term135667.getClass(), "separator", null);
        setBooleanField(term135667, term135667.getClass(), "lenient", false);
        setBooleanField(term135667, term135667.getClass(), "htmlSafe", false);
        setField(term135667, term135667.getClass(), "deferredName", null);
        setBooleanField(term135667, term135667.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "flush", argTypes, term135554, args);
        assertTrue(recursiveEquals(term135554, term135667));
    }

};


