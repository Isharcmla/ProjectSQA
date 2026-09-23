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

public class JsonReader_nextNonWhitespace_1315382714893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1336298;

    public JsonReader_nextNonWhitespace_1315382714893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1336298 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term1336195 = (char[]) newCharArray(0);
        Object term1336350 = newInstance(Class.forName("java.io.CharArrayReader"));
        setField(term1336298, term1336298.getClass(), "buffer", term1336195);
        setIntField(term1336298, term1336298.getClass(), "pos", 0);
        setIntField(term1336298, term1336298.getClass(), "limit", 0);
        setIntField(term1336298, term1336298.getClass(), "lineStart", 0);
        setField(term1336298, term1336298.getClass(), "in", term1336350);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        try {
            callMethod(klass, "nextNonWhitespace", argTypes, term1336298, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


