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

public class JsonReader_skipQuotedValue_2132894879507 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201292;

    public JsonReader_skipQuotedValue_2132894879507() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term201292 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term201189 = (char[]) newCharArray(0);
        Object term201342 = newInstance(Class.forName("java.io.PushbackReader"));
        setField(term201292, term201292.getClass(), "buffer", term201189);
        setIntField(term201292, term201292.getClass(), "pos", 0);
        setIntField(term201292, term201292.getClass(), "limit", 0);
        setIntField(term201292, term201292.getClass(), "lineStart", 0);
        setField(term201292, term201292.getClass(), "in", term201342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 0;
        try {
            callMethod(klass, "skipQuotedValue", argTypes, term201292, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


