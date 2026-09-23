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

public class JsonWriter_newline_1238389959487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318459;

    public JsonWriter_newline_1238389959487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term318459 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term318537 = newInstance(Class.forName("java.io.Console$3"));
        setField(term318459, term318459.getClass(), "indent", "");
        setField(term318459, term318459.getClass(), "out", term318537);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "newline", argTypes, term318459, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


