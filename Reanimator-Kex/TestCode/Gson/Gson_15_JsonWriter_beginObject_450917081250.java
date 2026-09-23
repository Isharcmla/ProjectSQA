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

public class JsonWriter_beginObject_450917081250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89266;

    public JsonWriter_beginObject_450917081250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89266 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term89160 = (int[]) newIntArray(8);
        setField(term89266, term89266.getClass(), "deferredName", "");
        setIntField(term89266, term89266.getClass(), "stackSize", 8);
        setIntElement(term89160, 0, 3);
        setIntElement(term89160, 1, 3);
        setIntElement(term89160, 2, 3);
        setIntElement(term89160, 3, 3);
        setIntElement(term89160, 4, 3);
        setIntElement(term89160, 5, 3);
        setIntElement(term89160, 6, 3);
        setIntElement(term89160, 7, 3);
        setField(term89266, term89266.getClass(), "stack", term89160);
        setField(term89266, term89266.getClass(), "indent", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "beginObject", argTypes, term89266, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


