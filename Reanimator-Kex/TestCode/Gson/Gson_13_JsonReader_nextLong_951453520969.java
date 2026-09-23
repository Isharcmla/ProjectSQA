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

public class JsonReader_nextLong_951453520969 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1391723;

    public JsonReader_nextLong_951453520969() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1391723 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term1391519 = (int[]) newIntArray(1);
        setIntField(term1391723, term1391723.getClass(), "peeked", 13);
        setIntField(term1391723, term1391723.getClass(), "lineNumber", 0);
        setIntField(term1391723, term1391723.getClass(), "pos", 0);
        setIntField(term1391723, term1391723.getClass(), "lineStart", 0);
        setIntField(term1391723, term1391723.getClass(), "stackSize", 1);
        setIntElement(term1391519, 0, 7);
        setField(term1391723, term1391723.getClass(), "stack", term1391519);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextLong", argTypes, term1391723, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


