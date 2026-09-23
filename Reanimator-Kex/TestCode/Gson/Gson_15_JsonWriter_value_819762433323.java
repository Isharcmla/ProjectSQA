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

public class JsonWriter_value_819762433323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147198;

    public JsonWriter_value_819762433323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147198 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term146393 = (int[]) newIntArray(346);
        Object term147286 = newInstance(Class.forName("java.io.BufferedWriter"));
        setField(term147198, term147198.getClass(), "deferredName", "");
        setIntField(term147198, term147198.getClass(), "stackSize", -2080374784);
        setIntElement(term146393, -2080374785, 3);
        setField(term147198, term147198.getClass(), "stack", term146393);
        setField(term147198, term147198.getClass(), "indent", null);
        setBooleanField(term147198, term147198.getClass(), "htmlSafe", true);
        setField(term147198, term147198.getClass(), "out", term147286);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 0.0;
        callMethod(klass, "value", argTypes, term147198, args);
    }

};


