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
import java.lang.Object;

public class JsonReader_consumeNonExecutePrefix_1285217397603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326653;

    public JsonReader_consumeNonExecutePrefix_1285217397603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term326653 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term326550 = (char[]) newCharArray(0);
        Object term326703 = newInstance(Class.forName("java.io.BufferedReader"));
        setField(term326653, term326653.getClass(), "buffer", term326550);
        setIntField(term326653, term326653.getClass(), "pos", 0);
        setIntField(term326653, term326653.getClass(), "limit", 0);
        setIntField(term326653, term326653.getClass(), "lineStart", 0);
        setField(term326653, term326653.getClass(), "in", term326703);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeNonExecutePrefix", argTypes, term326653, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


