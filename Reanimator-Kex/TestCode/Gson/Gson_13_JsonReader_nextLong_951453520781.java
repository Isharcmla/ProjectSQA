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

public class JsonReader_nextLong_951453520781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1272633;

    public JsonReader_nextLong_951453520781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1272633 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term1272532 = (char[]) newCharArray(1);
        setIntField(term1272633, term1272633.getClass(), "peeked", 10);
        setIntField(term1272633, term1272633.getClass(), "pos", -2147483648);
        setIntField(term1272633, term1272633.getClass(), "limit", -2147483648);
        setField(term1272633, term1272633.getClass(), "buffer", term1272532);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextLong", argTypes, term1272633, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


