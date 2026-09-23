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

public class JsonReader_consumeNonExecutePrefix_1285217397423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156661;

    public JsonReader_consumeNonExecutePrefix_1285217397423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156661 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term156564 = (char[]) newCharArray(0);
        setField(term156661, term156661.getClass(), "buffer", term156564);
        setIntField(term156661, term156661.getClass(), "pos", 0);
        setIntField(term156661, term156661.getClass(), "limit", 0);
        setIntField(term156661, term156661.getClass(), "lineStart", 0);
        setField(term156661, term156661.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeNonExecutePrefix", argTypes, term156661, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


