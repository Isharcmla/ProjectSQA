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

public class JsonReader_nextDouble_1411403318629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term314049;

    public JsonReader_nextDouble_1411403318629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term314049 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term313614 = (int[]) newIntArray(234);
        setIntField(term314049, term314049.getClass(), "peeked", 1);
        setIntField(term314049, term314049.getClass(), "lineNumber", 0);
        setIntField(term314049, term314049.getClass(), "pos", 0);
        setIntField(term314049, term314049.getClass(), "lineStart", 0);
        setIntField(term314049, term314049.getClass(), "stackSize", 1);
        setIntElement(term313614, 0, 8);
        setField(term314049, term314049.getClass(), "stack", term313614);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextDouble", argTypes, term314049, args);
    }

};


