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

public class JsonWriter_peek_195109985248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1203;

    public JsonWriter_peek_195109985248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1203 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term1204 = (int[]) newIntArray(3);
        setField(term1203, term1203.getClass(), "out", null);
        setIntElement(term1204, 0, 1551099402);
        setIntElement(term1204, 1, -2027534003);
        setIntElement(term1204, 2, 1063420942);
        setField(term1203, term1203.getClass(), "stack", term1204);
        setIntField(term1203, term1203.getClass(), "stackSize", 1375330971);
        setField(term1203, term1203.getClass(), "indent", "GzFkzHGYFt");
        setField(term1203, term1203.getClass(), "separator", "tShwQLRGNe");
        setBooleanField(term1203, term1203.getClass(), "lenient", true);
        setBooleanField(term1203, term1203.getClass(), "htmlSafe", true);
        setField(term1203, term1203.getClass(), "deferredName", "LvtrsXUliU");
        setBooleanField(term1203, term1203.getClass(), "serializeNulls", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "peek", argTypes, term1203, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


