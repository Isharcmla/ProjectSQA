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

public class JsonWriter_beginObject_450917081321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145037;

    public JsonWriter_beginObject_450917081321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145037 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term144935 = (int[]) newIntArray(0);
        Object term145151 = newInstance(Class.forName("java.io.Writer$1"));
        setField(term145037, term145037.getClass(), "deferredName", "");
        setIntField(term145037, term145037.getClass(), "stackSize", -2113929216);
        setIntElement(term144935, -2113929217, 3);
        setField(term145037, term145037.getClass(), "stack", term144935);
        setField(term145037, term145037.getClass(), "indent", "");
        setField(term145037, term145037.getClass(), "out", term145151);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "beginObject", argTypes, term145037, args);
    }

};


