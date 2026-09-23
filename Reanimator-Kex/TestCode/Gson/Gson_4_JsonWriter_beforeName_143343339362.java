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

public class JsonWriter_beforeName_143343339362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2501;

    public JsonWriter_beforeName_143343339362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2501 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term2502 = (int[]) newIntArray(2);
        setField(term2501, term2501.getClass(), "out", null);
        setIntElement(term2502, 0, -1388471422);
        setIntElement(term2502, 1, -1498296052);
        setField(term2501, term2501.getClass(), "stack", term2502);
        setIntField(term2501, term2501.getClass(), "stackSize", 2098647989);
        setField(term2501, term2501.getClass(), "indent", "jiKYgYHqIS");
        setField(term2501, term2501.getClass(), "separator", "DfISiziTgG");
        setBooleanField(term2501, term2501.getClass(), "lenient", true);
        setBooleanField(term2501, term2501.getClass(), "htmlSafe", true);
        setField(term2501, term2501.getClass(), "deferredName", "XqgfKFvPSD");
        setBooleanField(term2501, term2501.getClass(), "serializeNulls", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "beforeName", argTypes, term2501, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


