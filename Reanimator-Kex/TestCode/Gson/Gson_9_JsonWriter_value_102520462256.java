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
import java.lang.Long;

public class JsonWriter_value_102520462256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1987;
     Object term2032;

    public JsonWriter_value_102520462256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1987 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term1988 = (int[]) newIntArray(3);
        setField(term1987, term1987.getClass(), "out", null);
        setIntElement(term1988, 0, -1963434938);
        setIntElement(term1988, 1, 906181092);
        setIntElement(term1988, 2, 1045657203);
        setField(term1987, term1987.getClass(), "stack", term1988);
        setIntField(term1987, term1987.getClass(), "stackSize", 1386130016);
        setField(term1987, term1987.getClass(), "indent", "MAcUBcBckh");
        setField(term1987, term1987.getClass(), "separator", "oVgzLbrsFr");
        setBooleanField(term1987, term1987.getClass(), "lenient", false);
        setBooleanField(term1987, term1987.getClass(), "htmlSafe", false);
        setField(term1987, term1987.getClass(), "deferredName", "vQVyKLdtaz");
        setBooleanField(term1987, term1987.getClass(), "serializeNulls", false);
        term2032 = new Long(2442117782898005296L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term2032;
        try {
            callMethod(klass, "value", argTypes, term1987, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


