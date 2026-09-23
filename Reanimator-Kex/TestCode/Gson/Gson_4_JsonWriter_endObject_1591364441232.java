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

public class JsonWriter_endObject_1591364441232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94436;

    public JsonWriter_endObject_1591364441232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94436 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term94336 = (int[]) newIntArray(0);
        setIntField(term94436, term94436.getClass(), "stackSize", -1965344904);
        setIntElement(term94336, -1965344905, 5);
        setField(term94436, term94436.getClass(), "stack", term94336);
        setField(term94436, term94436.getClass(), "deferredName", null);
        setField(term94436, term94436.getClass(), "indent", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "endObject", argTypes, term94436, args);
    }

};


