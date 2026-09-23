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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JsonReader_skipQuotedValue_2132894879475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181347;

    public JsonReader_skipQuotedValue_2132894879475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181347 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term181258 = (char[]) newCharArray(0);
        setField(term181347, term181347.getClass(), "buffer", term181258);
        setIntField(term181347, term181347.getClass(), "pos", -2147483648);
        setIntField(term181347, term181347.getClass(), "limit", -2147483647);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 0;
        try {
            callMethod(klass, "skipQuotedValue", argTypes, term181347, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


