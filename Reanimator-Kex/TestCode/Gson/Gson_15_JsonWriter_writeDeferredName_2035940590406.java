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

public class JsonWriter_writeDeferredName_2035940590406 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214313;

    public JsonWriter_writeDeferredName_2035940590406() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term214313 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term213508 = (int[]) newIntArray(346);
        Object term214389 = newInstance(Class.forName("java.io.Writer$1"));
        setField(term214313, term214313.getClass(), "deferredName", "");
        setIntField(term214313, term214313.getClass(), "stackSize", -2080374784);
        setIntElement(term213508, -2080374785, 3);
        setField(term214313, term214313.getClass(), "stack", term213508);
        setField(term214313, term214313.getClass(), "indent", null);
        setBooleanField(term214313, term214313.getClass(), "htmlSafe", true);
        setField(term214313, term214313.getClass(), "out", term214389);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "writeDeferredName", argTypes, term214313, args);
    }

};


