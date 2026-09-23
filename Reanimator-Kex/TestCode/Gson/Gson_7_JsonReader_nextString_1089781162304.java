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

public class JsonReader_nextString_1089781162304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99917;

    public JsonReader_nextString_1089781162304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99917 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term99717 = (int[]) newIntArray(1);
        setIntField(term99917, term99917.getClass(), "peeked", 5);
        setIntField(term99917, term99917.getClass(), "lineNumber", 0);
        setIntField(term99917, term99917.getClass(), "pos", 0);
        setIntField(term99917, term99917.getClass(), "lineStart", 0);
        setIntField(term99917, term99917.getClass(), "stackSize", 1);
        setIntElement(term99717, 0, 66);
        setField(term99917, term99917.getClass(), "stack", term99717);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextString", argTypes, term99917, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


