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
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JsonReader_nextDouble_1411403318794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1276849;

    public JsonReader_nextDouble_1411403318794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1276849 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term1276156 = (int[]) newIntArray(489);
        setIntField(term1276849, term1276849.getClass(), "peeked", 5);
        setIntField(term1276849, term1276849.getClass(), "lineNumber", 0);
        setIntField(term1276849, term1276849.getClass(), "pos", 0);
        setIntField(term1276849, term1276849.getClass(), "lineStart", 0);
        setIntField(term1276849, term1276849.getClass(), "stackSize", 1);
        setIntElement(term1276156, 0, 66);
        setIntElement(term1276156, 1, 69);
        setIntElement(term1276156, 2, 71);
        setIntElement(term1276156, 3, 73);
        setIntElement(term1276156, 4, 78);
        setIntElement(term1276156, 5, 95);
        setIntElement(term1276156, 6, 65);
        setIntElement(term1276156, 7, 82);
        setIntElement(term1276156, 8, 82);
        setIntElement(term1276156, 9, 65);
        setIntElement(term1276156, 10, 89);
        setField(term1276849, term1276849.getClass(), "stack", term1276156);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextDouble", argTypes, term1276849, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


