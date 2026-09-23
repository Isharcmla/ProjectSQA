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

public class JsonWriter_newline_1238389959166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47603;
     Object term47987;

    public JsonWriter_newline_1238389959166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47603 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term47603, term47603.getClass(), "indent", null);
        term47987 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term47987, term47987.getClass(), "out", null);
        setField(term47987, term47987.getClass(), "stack", null);
        setIntField(term47987, term47987.getClass(), "stackSize", 0);
        setField(term47987, term47987.getClass(), "indent", null);
        setField(term47987, term47987.getClass(), "separator", null);
        setBooleanField(term47987, term47987.getClass(), "lenient", false);
        setBooleanField(term47987, term47987.getClass(), "htmlSafe", false);
        setField(term47987, term47987.getClass(), "deferredName", null);
        setBooleanField(term47987, term47987.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "newline", argTypes, term47603, args);
        assertTrue(recursiveEquals(term47603, term47987));
    }

};


