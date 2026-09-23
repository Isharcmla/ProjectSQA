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

public class JsonReader_nextDouble_1411403318979 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1398389;

    public JsonReader_nextDouble_1411403318979() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1398389 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term1398030 = (int[]) newIntArray(73);
        setIntField(term1398389, term1398389.getClass(), "peeked", 4);
        setIntField(term1398389, term1398389.getClass(), "lineNumber", 0);
        setIntField(term1398389, term1398389.getClass(), "pos", 0);
        setIntField(term1398389, term1398389.getClass(), "lineStart", 0);
        setIntField(term1398389, term1398389.getClass(), "stackSize", 2);
        setIntElement(term1398030, 0, 66);
        setField(term1398389, term1398389.getClass(), "stack", term1398030);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextDouble", argTypes, term1398389, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


