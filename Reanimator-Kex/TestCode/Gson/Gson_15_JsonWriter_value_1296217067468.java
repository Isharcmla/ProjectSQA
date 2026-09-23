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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class JsonWriter_value_1296217067468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263156;
     Object term263180;

    public JsonWriter_value_1296217067468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term263156 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term262404 = (int[]) newIntArray(2);
        setField(term263156, term263156.getClass(), "deferredName", null);
        setBooleanField(term263156, term263156.getClass(), "lenient", false);
        setIntField(term263156, term263156.getClass(), "stackSize", -1);
        setIntElement(term262404, 0, 106);
        setIntElement(term262404, 1, 97);
        setField(term263156, term263156.getClass(), "stack", term262404);
        term263180 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Number");
        Object[] args = new Object[1];
        args[0] = term263180;
        try {
            callMethod(klass, "value", argTypes, term263156, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


