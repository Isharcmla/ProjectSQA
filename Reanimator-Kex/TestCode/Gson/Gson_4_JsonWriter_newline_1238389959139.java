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

public class JsonWriter_newline_1238389959139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38522;
     Object term38720;

    public JsonWriter_newline_1238389959139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38522 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term38522, term38522.getClass(), "indent", null);
        term38720 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term38720, term38720.getClass(), "out", null);
        setField(term38720, term38720.getClass(), "stack", null);
        setIntField(term38720, term38720.getClass(), "stackSize", 0);
        setField(term38720, term38720.getClass(), "indent", null);
        setField(term38720, term38720.getClass(), "separator", null);
        setBooleanField(term38720, term38720.getClass(), "lenient", false);
        setBooleanField(term38720, term38720.getClass(), "htmlSafe", false);
        setField(term38720, term38720.getClass(), "deferredName", null);
        setBooleanField(term38720, term38720.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "newline", argTypes, term38522, args);
        assertTrue(recursiveEquals(term38522, term38720));
    }

};


