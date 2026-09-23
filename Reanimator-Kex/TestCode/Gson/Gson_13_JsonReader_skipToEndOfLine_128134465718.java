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

public class JsonReader_skipToEndOfLine_128134465718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1249758;

    public JsonReader_skipToEndOfLine_128134465718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1249758 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term1249660 = (char[]) newCharArray(8);
        setIntField(term1249758, term1249758.getClass(), "pos", 6);
        setIntField(term1249758, term1249758.getClass(), "limit", 7);
        setField(term1249758, term1249758.getClass(), "buffer", term1249660);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "skipToEndOfLine", argTypes, term1249758, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


