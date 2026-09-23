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

public class JsonReader_nextString_1089781162914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1348127;

    public JsonReader_nextString_1089781162914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1348127 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term1348008 = (char[]) newCharArray(2);
        Object term1348165 = newInstance(Class.forName("java.io.Reader$1"));
        setIntField(term1348127, term1348127.getClass(), "peeked", 10);
        setIntField(term1348127, term1348127.getClass(), "pos", 0);
        setIntField(term1348127, term1348127.getClass(), "limit", 0);
        setField(term1348127, term1348127.getClass(), "buffer", term1348008);
        setIntField(term1348127, term1348127.getClass(), "lineStart", 0);
        setField(term1348127, term1348127.getClass(), "in", term1348165);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextString", argTypes, term1348127, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


