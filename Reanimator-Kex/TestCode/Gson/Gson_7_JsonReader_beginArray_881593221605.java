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

public class JsonReader_beginArray_881593221605 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279809;

    public JsonReader_beginArray_881593221605() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term279809 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term279612 = (int[]) newIntArray(2);
        setIntField(term279809, term279809.getClass(), "peeked", 14);
        setIntField(term279809, term279809.getClass(), "lineNumber", 0);
        setIntField(term279809, term279809.getClass(), "pos", 0);
        setIntField(term279809, term279809.getClass(), "lineStart", 0);
        setIntField(term279809, term279809.getClass(), "stackSize", 1);
        setIntElement(term279612, 0, 66);
        setIntElement(term279612, 1, 69);
        setField(term279809, term279809.getClass(), "stack", term279612);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "beginArray", argTypes, term279809, args);
    }

};


