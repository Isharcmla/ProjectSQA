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

public class JsonWriter_flush_2108505943132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33828;
     Object term34270;

    public JsonWriter_flush_2108505943132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33828 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term33874 = newInstance(Class.forName("java.io.StringWriter"));
        setIntField(term33828, term33828.getClass(), "stackSize", -1);
        setField(term33828, term33828.getClass(), "out", term33874);
        term34270 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term34271 = newInstance(Class.forName("java.io.StringWriter"));
        setField(term34271, term34271.getClass(), "buf", null);
        setField(term34271, term34271.getClass(), "writeBuffer", null);
        setField(term34271, term34271.getClass(), "lock", null);
        setField(term34270, term34270.getClass(), "out", term34271);
        setField(term34270, term34270.getClass(), "stack", null);
        setIntField(term34270, term34270.getClass(), "stackSize", -1);
        setField(term34270, term34270.getClass(), "indent", null);
        setField(term34270, term34270.getClass(), "separator", null);
        setBooleanField(term34270, term34270.getClass(), "lenient", false);
        setBooleanField(term34270, term34270.getClass(), "htmlSafe", false);
        setField(term34270, term34270.getClass(), "deferredName", null);
        setBooleanField(term34270, term34270.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "flush", argTypes, term33828, args);
        assertTrue(recursiveEquals(term33828, term34270));
    }

};


