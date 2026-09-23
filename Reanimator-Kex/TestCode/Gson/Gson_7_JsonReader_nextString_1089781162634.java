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

public class JsonReader_nextString_1089781162634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term320659;

    public JsonReader_nextString_1089781162634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term320659 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term320442 = (int[]) newIntArray(8);
        Object[] term320452 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term320659, term320659.getClass(), "peeked", 5);
        setIntField(term320659, term320659.getClass(), "lineNumber", 0);
        setIntField(term320659, term320659.getClass(), "pos", 0);
        setIntField(term320659, term320659.getClass(), "lineStart", 0);
        setIntField(term320659, term320659.getClass(), "stackSize", 1);
        setIntElement(term320442, 0, 3);
        setField(term320659, term320659.getClass(), "stack", term320442);
        setField(term320659, term320659.getClass(), "pathNames", term320452);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextString", argTypes, term320659, args);
    }

};


