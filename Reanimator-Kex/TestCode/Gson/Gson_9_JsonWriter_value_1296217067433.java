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

public class JsonWriter_value_1296217067433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259829;
     Object term259853;

    public JsonWriter_value_1296217067433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term259829 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term259186 = (int[]) newIntArray(489);
        setField(term259829, term259829.getClass(), "deferredName", null);
        setBooleanField(term259829, term259829.getClass(), "lenient", true);
        setIntField(term259829, term259829.getClass(), "stackSize", -1);
        setIntElement(term259186, 0, 106);
        setIntElement(term259186, 1, 97);
        setIntElement(term259186, 2, 118);
        setIntElement(term259186, 3, 97);
        setIntElement(term259186, 4, 46);
        setIntElement(term259186, 5, 108);
        setIntElement(term259186, 6, 97);
        setIntElement(term259186, 7, 110);
        setIntElement(term259186, 8, 103);
        setIntElement(term259186, 9, 46);
        setIntElement(term259186, 10, 67);
        setIntElement(term259186, 11, 108);
        setIntElement(term259186, 12, 97);
        setIntElement(term259186, 13, 115);
        setIntElement(term259186, 14, 115);
        setField(term259829, term259829.getClass(), "stack", term259186);
        term259853 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Number");
        Object[] args = new Object[1];
        args[0] = term259853;
        try {
            callMethod(klass, "value", argTypes, term259829, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


