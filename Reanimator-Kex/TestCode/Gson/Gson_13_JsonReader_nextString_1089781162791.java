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

public class JsonReader_nextString_1089781162791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1274813;

    public JsonReader_nextString_1089781162791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1274813 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term1274637 = (char[]) newCharArray(32);
        Object term1274851 = newInstance(Class.forName("java.io.Reader$1"));
        setIntField(term1274813, term1274813.getClass(), "peeked", 10);
        setIntField(term1274813, term1274813.getClass(), "pos", 0);
        setIntField(term1274813, term1274813.getClass(), "limit", 0);
        setField(term1274813, term1274813.getClass(), "buffer", term1274637);
        setIntField(term1274813, term1274813.getClass(), "lineStart", 0);
        setField(term1274813, term1274813.getClass(), "in", term1274851);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextString", argTypes, term1274813, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


