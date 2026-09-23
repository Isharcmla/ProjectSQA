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

public class JsonWriter_value_819762433253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90792;

    public JsonWriter_value_819762433253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90792 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term89987 = (int[]) newIntArray(346);
        Object term90928 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter$1"));
        setField(term90792, term90792.getClass(), "deferredName", "");
        setIntField(term90792, term90792.getClass(), "stackSize", -2080374784);
        setIntElement(term89987, -2080374785, 3);
        setField(term90792, term90792.getClass(), "stack", term89987);
        setField(term90792, term90792.getClass(), "indent", null);
        setBooleanField(term90792, term90792.getClass(), "htmlSafe", false);
        setField(term90792, term90792.getClass(), "out", term90928);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 0.0;
        callMethod(klass, "value", argTypes, term90792, args);
    }

};


