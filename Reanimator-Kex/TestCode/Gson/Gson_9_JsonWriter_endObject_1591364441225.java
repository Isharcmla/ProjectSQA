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

public class JsonWriter_endObject_1591364441225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79922;

    public JsonWriter_endObject_1591364441225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79922 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term79822 = (int[]) newIntArray(0);
        setIntField(term79922, term79922.getClass(), "stackSize", -1965344904);
        setIntElement(term79822, -1965344905, 5);
        setField(term79922, term79922.getClass(), "stack", term79822);
        setField(term79922, term79922.getClass(), "deferredName", null);
        setField(term79922, term79922.getClass(), "indent", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "endObject", argTypes, term79922, args);
    }

};


