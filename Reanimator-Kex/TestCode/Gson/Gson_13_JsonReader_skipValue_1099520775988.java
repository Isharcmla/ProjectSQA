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
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JsonReader_skipValue_1099520775988 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1403839;

    public JsonReader_skipValue_1099520775988() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1403839 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term1403724 = (char[]) newCharArray(0);
        Object term1403877 = newInstance(Class.forName("java.io.Reader$1"));
        setIntField(term1403839, term1403839.getClass(), "peeked", 12);
        setField(term1403839, term1403839.getClass(), "buffer", term1403724);
        setIntField(term1403839, term1403839.getClass(), "pos", 0);
        setIntField(term1403839, term1403839.getClass(), "limit", 0);
        setIntField(term1403839, term1403839.getClass(), "lineStart", 0);
        setField(term1403839, term1403839.getClass(), "in", term1403877);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "skipValue", argTypes, term1403839, args);
    }

};


