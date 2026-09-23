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
import java.lang.Boolean;

public class JsonWriter_value_102520660654 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1819;
     Object term1862;

    public JsonWriter_value_102520660654() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1819 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term1820 = (int[]) newIntArray(1);
        setField(term1819, term1819.getClass(), "out", null);
        setIntElement(term1820, 0, -1210583429);
        setField(term1819, term1819.getClass(), "stack", term1820);
        setIntField(term1819, term1819.getClass(), "stackSize", -663691365);
        setField(term1819, term1819.getClass(), "indent", "bLPjGVBhlX");
        setField(term1819, term1819.getClass(), "separator", "whBvTVIIlC");
        setBooleanField(term1819, term1819.getClass(), "lenient", true);
        setBooleanField(term1819, term1819.getClass(), "htmlSafe", true);
        setField(term1819, term1819.getClass(), "deferredName", "IgRJUzaCwW");
        setBooleanField(term1819, term1819.getClass(), "serializeNulls", true);
        term1862 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1862;
        try {
            callMethod(klass, "value", argTypes, term1819, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


