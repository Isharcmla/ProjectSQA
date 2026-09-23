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

public class JsonWriter_close_481593699333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159499;
     Object term159797;

    public JsonWriter_close_481593699333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159499 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term159537 = newInstance(Class.forName("java.io.Writer$1"));
        setField(term159499, term159499.getClass(), "out", term159537);
        term159797 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term159798 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term159798, term159798.getClass(), "closed", true);
        setField(term159798, term159798.getClass(), "writeBuffer", null);
        setField(term159798, term159798.getClass(), "lock", null);
        setField(term159797, term159797.getClass(), "out", term159798);
        setField(term159797, term159797.getClass(), "stack", null);
        setIntField(term159797, term159797.getClass(), "stackSize", 0);
        setField(term159797, term159797.getClass(), "indent", null);
        setField(term159797, term159797.getClass(), "separator", null);
        setBooleanField(term159797, term159797.getClass(), "lenient", false);
        setBooleanField(term159797, term159797.getClass(), "htmlSafe", false);
        setField(term159797, term159797.getClass(), "deferredName", null);
        setBooleanField(term159797, term159797.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term159499, args);
        assertTrue(recursiveEquals(term159499, term159797));
    }

};


