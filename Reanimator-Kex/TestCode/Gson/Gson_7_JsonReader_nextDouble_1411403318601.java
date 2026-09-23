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

public class JsonReader_nextDouble_1411403318601 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276456;

    public JsonReader_nextDouble_1411403318601() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term276456 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term275765 = (int[]) newIntArray(489);
        setIntField(term276456, term276456.getClass(), "peeked", 4);
        setIntField(term276456, term276456.getClass(), "lineNumber", 0);
        setIntField(term276456, term276456.getClass(), "pos", 0);
        setIntField(term276456, term276456.getClass(), "lineStart", 0);
        setIntField(term276456, term276456.getClass(), "stackSize", 1);
        setIntElement(term275765, 0, 4);
        setField(term276456, term276456.getClass(), "stack", term275765);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextDouble", argTypes, term276456, args);
    }

};


