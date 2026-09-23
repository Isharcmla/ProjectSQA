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

public class JsonReader_nextDouble_14114033181012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1433699;

    public JsonReader_nextDouble_14114033181012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1433699 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term1433488 = (int[]) newIntArray(2);
        setIntField(term1433699, term1433699.getClass(), "peeked", 5);
        setIntField(term1433699, term1433699.getClass(), "lineNumber", 0);
        setIntField(term1433699, term1433699.getClass(), "pos", 0);
        setIntField(term1433699, term1433699.getClass(), "lineStart", 0);
        setIntField(term1433699, term1433699.getClass(), "stackSize", 1);
        setIntElement(term1433488, 0, 4);
        setField(term1433699, term1433699.getClass(), "stack", term1433488);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextDouble", argTypes, term1433699, args);
    }

};


