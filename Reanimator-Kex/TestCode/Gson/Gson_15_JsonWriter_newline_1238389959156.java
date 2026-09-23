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
import static com.google.gson.stream.EqualityUtils.*;

public class JsonWriter_newline_1238389959156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42529;
     Object term42892;

    public JsonWriter_newline_1238389959156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42529 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term42529, term42529.getClass(), "indent", null);
        term42892 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term42892, term42892.getClass(), "out", null);
        setField(term42892, term42892.getClass(), "stack", null);
        setIntField(term42892, term42892.getClass(), "stackSize", 0);
        setField(term42892, term42892.getClass(), "indent", null);
        setField(term42892, term42892.getClass(), "separator", null);
        setBooleanField(term42892, term42892.getClass(), "lenient", false);
        setBooleanField(term42892, term42892.getClass(), "htmlSafe", false);
        setField(term42892, term42892.getClass(), "deferredName", null);
        setBooleanField(term42892, term42892.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "newline", argTypes, term42529, args);
        assertTrue(recursiveEquals(term42529, term42892));
    }

};


