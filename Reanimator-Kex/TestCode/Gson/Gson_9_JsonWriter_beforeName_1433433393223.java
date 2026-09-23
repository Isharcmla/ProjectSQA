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

public class JsonWriter_beforeName_1433433393223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79379;

    public JsonWriter_beforeName_1433433393223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79379 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term79280 = (int[]) newIntArray(8);
        setIntField(term79379, term79379.getClass(), "stackSize", 8);
        setIntElement(term79280, 0, 5);
        setIntElement(term79280, 1, 5);
        setIntElement(term79280, 2, 5);
        setIntElement(term79280, 3, 5);
        setIntElement(term79280, 4, 5);
        setIntElement(term79280, 5, 5);
        setIntElement(term79280, 6, 5);
        setIntElement(term79280, 7, 5);
        setField(term79379, term79379.getClass(), "stack", term79280);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "beforeName", argTypes, term79379, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


