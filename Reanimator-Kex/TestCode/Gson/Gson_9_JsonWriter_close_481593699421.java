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

public class JsonWriter_close_481593699421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245362;
     Object term245424;

    public JsonWriter_close_481593699421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term245362 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term245414 = newInstance(Class.forName("java.io.CharArrayWriter"));
        setField(term245362, term245362.getClass(), "out", term245414);
        term245424 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term245425 = newInstance(Class.forName("java.io.CharArrayWriter"));
        setField(term245425, term245425.getClass(), "buf", null);
        setIntField(term245425, term245425.getClass(), "count", 0);
        setField(term245425, term245425.getClass(), "writeBuffer", null);
        setField(term245425, term245425.getClass(), "lock", null);
        setField(term245424, term245424.getClass(), "out", term245425);
        setField(term245424, term245424.getClass(), "stack", null);
        setIntField(term245424, term245424.getClass(), "stackSize", 0);
        setField(term245424, term245424.getClass(), "indent", null);
        setField(term245424, term245424.getClass(), "separator", null);
        setBooleanField(term245424, term245424.getClass(), "lenient", false);
        setBooleanField(term245424, term245424.getClass(), "htmlSafe", false);
        setField(term245424, term245424.getClass(), "deferredName", null);
        setBooleanField(term245424, term245424.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term245362, args);
        assertTrue(recursiveEquals(term245362, term245424));
    }

};


