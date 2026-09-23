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
import java.lang.Float;

public class JsonWriter_value_1296217067339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188394;
     Object term188416;

    public JsonWriter_value_1296217067339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188394 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term187751 = (int[]) newIntArray(489);
        setField(term188394, term188394.getClass(), "deferredName", null);
        setBooleanField(term188394, term188394.getClass(), "lenient", true);
        setIntField(term188394, term188394.getClass(), "stackSize", -1);
        setIntElement(term187751, 0, 106);
        setIntElement(term187751, 1, 97);
        setIntElement(term187751, 2, 118);
        setIntElement(term187751, 3, 97);
        setIntElement(term187751, 4, 46);
        setIntElement(term187751, 5, 108);
        setIntElement(term187751, 6, 97);
        setIntElement(term187751, 7, 110);
        setIntElement(term187751, 8, 103);
        setIntElement(term187751, 9, 46);
        setIntElement(term187751, 10, 67);
        setIntElement(term187751, 11, 108);
        setIntElement(term187751, 12, 97);
        setIntElement(term187751, 13, 115);
        setIntElement(term187751, 14, 115);
        setField(term188394, term188394.getClass(), "stack", term187751);
        term188416 = new Float(0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Number");
        Object[] args = new Object[1];
        args[0] = term188416;
        try {
            callMethod(klass, "value", argTypes, term188394, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


