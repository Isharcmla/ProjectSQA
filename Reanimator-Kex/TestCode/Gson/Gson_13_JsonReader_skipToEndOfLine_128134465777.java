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

public class JsonReader_skipToEndOfLine_128134465777 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1270042;

    public JsonReader_skipToEndOfLine_128134465777() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1270042 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term1269912 = (char[]) newCharArray(8);
        Object term1270100 = newInstance(Class.forName("java.io.Console$LineReader"));
        setIntField(term1270042, term1270042.getClass(), "pos", 2);
        setIntField(term1270042, term1270042.getClass(), "limit", 3);
        setField(term1270042, term1270042.getClass(), "buffer", term1269912);
        setIntField(term1270042, term1270042.getClass(), "lineStart", 0);
        setField(term1270042, term1270042.getClass(), "in", term1270100);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "skipToEndOfLine", argTypes, term1270042, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


