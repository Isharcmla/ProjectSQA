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

public class JsonReader_nextLong_9514535201002 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1420780;

    public JsonReader_nextLong_9514535201002() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1420780 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term1420576 = (int[]) newIntArray(1);
        setIntField(term1420780, term1420780.getClass(), "peeked", 13);
        setIntField(term1420780, term1420780.getClass(), "lineNumber", 0);
        setIntField(term1420780, term1420780.getClass(), "pos", 0);
        setIntField(term1420780, term1420780.getClass(), "lineStart", 0);
        setIntField(term1420780, term1420780.getClass(), "stackSize", 1);
        setIntElement(term1420576, 0, 5);
        setField(term1420780, term1420780.getClass(), "stack", term1420576);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextLong", argTypes, term1420780, args);
    }

};


