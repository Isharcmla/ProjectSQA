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

public class JsonReader_nextDouble_1411403318547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279823;

    public JsonReader_nextDouble_1411403318547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term279823 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term279723 = (char[]) newCharArray(1);
        setIntField(term279823, term279823.getClass(), "peeked", 10);
        setIntField(term279823, term279823.getClass(), "pos", -2147483648);
        setIntField(term279823, term279823.getClass(), "limit", -2147483648);
        setField(term279823, term279823.getClass(), "buffer", term279723);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextDouble", argTypes, term279823, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


