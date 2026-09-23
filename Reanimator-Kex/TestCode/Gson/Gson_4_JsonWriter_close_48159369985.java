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
import java.lang.Object;

public class JsonWriter_close_48159369985 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18667;
     Object term18987;

    public JsonWriter_close_48159369985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18667 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term18707 = newInstance(Class.forName("java.io.Console$3"));
        setField(term18667, term18667.getClass(), "out", term18707);
        term18987 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term18988 = newInstance(Class.forName("java.io.Console$3"));
        setField(term18988, term18988.getClass(), "this$0", null);
        setField(term18988, term18988.getClass(), "out", null);
        setBooleanField(term18988, term18988.getClass(), "autoFlush", false);
        setBooleanField(term18988, term18988.getClass(), "trouble", false);
        setField(term18988, term18988.getClass(), "formatter", null);
        setField(term18988, term18988.getClass(), "psOut", null);
        setField(term18988, term18988.getClass(), "writeBuffer", null);
        setField(term18988, term18988.getClass(), "lock", null);
        setField(term18987, term18987.getClass(), "out", term18988);
        setField(term18987, term18987.getClass(), "stack", null);
        setIntField(term18987, term18987.getClass(), "stackSize", 0);
        setField(term18987, term18987.getClass(), "indent", null);
        setField(term18987, term18987.getClass(), "separator", null);
        setBooleanField(term18987, term18987.getClass(), "lenient", false);
        setBooleanField(term18987, term18987.getClass(), "htmlSafe", false);
        setField(term18987, term18987.getClass(), "deferredName", null);
        setBooleanField(term18987, term18987.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term18667, args);
        assertTrue(recursiveEquals(term18667, term18987));
    }

};


