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

public class JsonWriter_value_1296217067380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192780;
     Object term192804;

    public JsonWriter_value_1296217067380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term192780 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term192137 = (int[]) newIntArray(489);
        setField(term192780, term192780.getClass(), "deferredName", null);
        setBooleanField(term192780, term192780.getClass(), "lenient", true);
        setIntField(term192780, term192780.getClass(), "stackSize", -1);
        setIntElement(term192137, 0, 106);
        setIntElement(term192137, 1, 97);
        setIntElement(term192137, 2, 118);
        setIntElement(term192137, 3, 97);
        setIntElement(term192137, 4, 46);
        setIntElement(term192137, 5, 108);
        setIntElement(term192137, 6, 97);
        setIntElement(term192137, 7, 110);
        setIntElement(term192137, 8, 103);
        setIntElement(term192137, 9, 46);
        setIntElement(term192137, 10, 67);
        setIntElement(term192137, 11, 108);
        setIntElement(term192137, 12, 97);
        setIntElement(term192137, 13, 115);
        setIntElement(term192137, 14, 115);
        setField(term192780, term192780.getClass(), "stack", term192137);
        term192804 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Number");
        Object[] args = new Object[1];
        args[0] = term192804;
        try {
            callMethod(klass, "value", argTypes, term192780, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


