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

public class JsonWriter_endObject_1591364441202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73752;

    public JsonWriter_endObject_1591364441202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73752 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term73651 = (int[]) newIntArray(0);
        Object term73798 = newInstance(Class.forName("java.io.StringWriter"));
        setIntField(term73752, term73752.getClass(), "stackSize", -1965344904);
        setIntElement(term73651, -1965344905, 3);
        setField(term73752, term73752.getClass(), "stack", term73651);
        setField(term73752, term73752.getClass(), "deferredName", null);
        setField(term73752, term73752.getClass(), "out", term73798);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "endObject", argTypes, term73752, args);
    }

};


