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

public class JsonWriter_value_819762433332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152230;

    public JsonWriter_value_819762433332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term152230 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term152128 = (int[]) newIntArray(0);
        Object term152358 = newInstance(Class.forName("java.io.CharArrayWriter"));
        setField(term152230, term152230.getClass(), "deferredName", "");
        setIntField(term152230, term152230.getClass(), "stackSize", -2113929216);
        setIntElement(term152128, -2113929217, 3);
        setField(term152230, term152230.getClass(), "stack", term152128);
        setField(term152230, term152230.getClass(), "indent", "");
        setField(term152230, term152230.getClass(), "out", term152358);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 0.0;
        callMethod(klass, "value", argTypes, term152230, args);
    }

};


