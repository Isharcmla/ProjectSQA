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

public class JsonReader_nextBoolean_2075593930662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term390951;

    public JsonReader_nextBoolean_2075593930662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term390951 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term389767 = (int[]) newIntArray(490);
        setIntField(term390951, term390951.getClass(), "peeked", 1);
        setIntField(term390951, term390951.getClass(), "lineNumber", 0);
        setIntField(term390951, term390951.getClass(), "pos", 0);
        setIntField(term390951, term390951.getClass(), "lineStart", 0);
        setIntField(term390951, term390951.getClass(), "stackSize", 2);
        setIntElement(term389767, 0, 110);
        setIntElement(term389767, 1, 4);
        setField(term390951, term390951.getClass(), "stack", term389767);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextBoolean", argTypes, term390951, args);
    }

};


