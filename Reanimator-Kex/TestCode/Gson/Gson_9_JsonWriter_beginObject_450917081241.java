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

public class JsonWriter_beginObject_450917081241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96394;

    public JsonWriter_beginObject_450917081241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96394 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term96288 = (int[]) newIntArray(8);
        setField(term96394, term96394.getClass(), "deferredName", "");
        setIntField(term96394, term96394.getClass(), "stackSize", 8);
        setIntElement(term96288, 0, 3);
        setIntElement(term96288, 1, 3);
        setIntElement(term96288, 2, 3);
        setIntElement(term96288, 3, 3);
        setIntElement(term96288, 4, 3);
        setIntElement(term96288, 5, 3);
        setIntElement(term96288, 6, 3);
        setIntElement(term96288, 7, 3);
        setField(term96394, term96394.getClass(), "stack", term96288);
        setField(term96394, term96394.getClass(), "indent", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "beginObject", argTypes, term96394, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


