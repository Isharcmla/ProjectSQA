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

public class JsonWriter_close_481593699418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223224;
     Object term223460;

    public JsonWriter_close_481593699418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223224 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term223276 = newInstance(Class.forName("java.io.CharArrayWriter"));
        setField(term223224, term223224.getClass(), "out", term223276);
        term223460 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term223461 = newInstance(Class.forName("java.io.CharArrayWriter"));
        setField(term223461, term223461.getClass(), "buf", null);
        setIntField(term223461, term223461.getClass(), "count", 0);
        setField(term223461, term223461.getClass(), "writeBuffer", null);
        setField(term223461, term223461.getClass(), "lock", null);
        setField(term223460, term223460.getClass(), "out", term223461);
        setField(term223460, term223460.getClass(), "stack", null);
        setIntField(term223460, term223460.getClass(), "stackSize", 0);
        setField(term223460, term223460.getClass(), "indent", null);
        setField(term223460, term223460.getClass(), "separator", null);
        setBooleanField(term223460, term223460.getClass(), "lenient", false);
        setBooleanField(term223460, term223460.getClass(), "htmlSafe", false);
        setField(term223460, term223460.getClass(), "deferredName", null);
        setBooleanField(term223460, term223460.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term223224, args);
        assertTrue(recursiveEquals(term223224, term223460));
    }

};


