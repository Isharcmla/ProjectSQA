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
import java.lang.Object;

public class JsonReader_nextString_1089781162874 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1321930;

    public JsonReader_nextString_1089781162874() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1321930 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term1319743 = (char[]) newCharArray(513);
        Object term1321968 = newInstance(Class.forName("java.io.Reader$1"));
        int[] term1321290 = (int[]) newIntArray(489);
        setIntField(term1321930, term1321930.getClass(), "peeked", 10);
        setIntField(term1321930, term1321930.getClass(), "pos", 0);
        setIntField(term1321930, term1321930.getClass(), "limit", 0);
        setField(term1321930, term1321930.getClass(), "buffer", term1319743);
        setIntField(term1321930, term1321930.getClass(), "lineStart", 0);
        setField(term1321930, term1321930.getClass(), "in", term1321968);
        setField(term1321930, term1321930.getClass(), "pathIndices", term1321290);
        setIntField(term1321930, term1321930.getClass(), "stackSize", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextString", argTypes, term1321930, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


