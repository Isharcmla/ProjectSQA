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

public class JsonReader_nextDouble_1411403318600 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274083;

    public JsonReader_nextDouble_1411403318600() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term274083 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term273377 = (int[]) newIntArray(504);
        setIntField(term274083, term274083.getClass(), "peeked", 7);
        setIntField(term274083, term274083.getClass(), "lineNumber", 0);
        setIntField(term274083, term274083.getClass(), "pos", 0);
        setIntField(term274083, term274083.getClass(), "lineStart", 0);
        setIntField(term274083, term274083.getClass(), "stackSize", 1);
        setIntElement(term273377, 0, 6);
        setField(term274083, term274083.getClass(), "stack", term273377);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextDouble", argTypes, term274083, args);
    }

};


