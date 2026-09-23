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

public class JsonWriter_flush_210850594358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2149;

    public JsonWriter_flush_210850594358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2149 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term2150 = (int[]) newIntArray(6);
        setField(term2149, term2149.getClass(), "out", null);
        setIntElement(term2150, 0, 1107176718);
        setIntElement(term2150, 1, 480137250);
        setIntElement(term2150, 2, -341152642);
        setIntElement(term2150, 3, -2015854073);
        setIntElement(term2150, 4, 538259104);
        setIntElement(term2150, 5, 96566506);
        setField(term2149, term2149.getClass(), "stack", term2150);
        setIntField(term2149, term2149.getClass(), "stackSize", -343325701);
        setField(term2149, term2149.getClass(), "indent", "VgZnGoIFwQ");
        setField(term2149, term2149.getClass(), "separator", "jUbSRrkrYZ");
        setBooleanField(term2149, term2149.getClass(), "lenient", true);
        setBooleanField(term2149, term2149.getClass(), "htmlSafe", false);
        setField(term2149, term2149.getClass(), "deferredName", "bWWfajKbEX");
        setBooleanField(term2149, term2149.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "flush", argTypes, term2149, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


