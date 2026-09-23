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

public class JsonReader_skipUnquotedValue_1444519302470 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201613;

    public JsonReader_skipUnquotedValue_1444519302470() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term201613 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setIntField(term201613, term201613.getClass(), "pos", 2134900735);
        setIntField(term201613, term201613.getClass(), "limit", -2134900736);
        setField(term201613, term201613.getClass(), "buffer", null);
        setIntField(term201613, term201613.getClass(), "lineStart", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "skipUnquotedValue", argTypes, term201613, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


