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

public class JsonReader_skipToEndOfLine_128134465680 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1238147;

    public JsonReader_skipToEndOfLine_128134465680() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1238147 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term1238046 = (char[]) newCharArray(0);
        Object term1238199 = newInstance(Class.forName("java.io.CharArrayReader"));
        setIntField(term1238147, term1238147.getClass(), "pos", 0);
        setIntField(term1238147, term1238147.getClass(), "limit", 0);
        setField(term1238147, term1238147.getClass(), "buffer", term1238046);
        setIntField(term1238147, term1238147.getClass(), "lineStart", 0);
        setField(term1238147, term1238147.getClass(), "in", term1238199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "skipToEndOfLine", argTypes, term1238147, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


