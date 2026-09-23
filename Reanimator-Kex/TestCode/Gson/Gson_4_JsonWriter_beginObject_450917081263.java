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

public class JsonWriter_beginObject_450917081263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117327;

    public JsonWriter_beginObject_450917081263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117327 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term117221 = (int[]) newIntArray(8);
        setField(term117327, term117327.getClass(), "deferredName", "");
        setIntField(term117327, term117327.getClass(), "stackSize", 8);
        setIntElement(term117221, 0, 3);
        setIntElement(term117221, 1, 3);
        setIntElement(term117221, 2, 3);
        setIntElement(term117221, 3, 3);
        setIntElement(term117221, 4, 3);
        setIntElement(term117221, 5, 3);
        setIntElement(term117221, 6, 3);
        setIntElement(term117221, 7, 3);
        setField(term117327, term117327.getClass(), "stack", term117221);
        setField(term117327, term117327.getClass(), "indent", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "beginObject", argTypes, term117327, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


