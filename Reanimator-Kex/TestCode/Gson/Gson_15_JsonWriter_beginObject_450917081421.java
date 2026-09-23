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
import java.lang.Object;

public class JsonWriter_beginObject_450917081421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223734;

    public JsonWriter_beginObject_450917081421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223734 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term223619 = (int[]) newIntArray(9);
        Object term223876 = newInstance(Class.forName("com.google.gson.internal.Streams$AppendableWriter"));
        Object term223918 = newInstance(Class.forName("java.io.FileWriter"));
        setField(term223734, term223734.getClass(), "deferredName", "");
        setIntField(term223734, term223734.getClass(), "stackSize", -536870912);
        setIntElement(term223619, 0, 5);
        setIntElement(term223619, 1, 5);
        setIntElement(term223619, 2, 5);
        setIntElement(term223619, 3, 5);
        setIntElement(term223619, 4, 5);
        setIntElement(term223619, 5, 5);
        setIntElement(term223619, 6, 5);
        setIntElement(term223619, 7, 5);
        setIntElement(term223619, 8, 5);
        setIntElement(term223619, -536870913, 5);
        setField(term223734, term223734.getClass(), "stack", term223619);
        setField(term223876, term223876.getClass(), "appendable", term223918);
        setField(term223734, term223734.getClass(), "out", term223876);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "beginObject", argTypes, term223734, args);
    }

};


