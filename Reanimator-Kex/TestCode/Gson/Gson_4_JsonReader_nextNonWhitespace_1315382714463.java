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

public class JsonReader_nextNonWhitespace_1315382714463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193204;

    public JsonReader_nextNonWhitespace_1315382714463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term193204 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term193107 = (char[]) newCharArray(0);
        setField(term193204, term193204.getClass(), "buffer", term193107);
        setIntField(term193204, term193204.getClass(), "pos", 0);
        setIntField(term193204, term193204.getClass(), "limit", 0);
        setIntField(term193204, term193204.getClass(), "lineStart", 0);
        setField(term193204, term193204.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        try {
            callMethod(klass, "nextNonWhitespace", argTypes, term193204, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


