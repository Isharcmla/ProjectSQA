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

public class JsonWriter_close_481593699329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171743;
     Object term177004;

    public JsonWriter_close_481593699329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term171743 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term171789 = newInstance(Class.forName("java.io.StringWriter"));
        setField(term171743, term171743.getClass(), "out", term171789);
        term177004 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term177005 = newInstance(Class.forName("java.io.StringWriter"));
        setField(term177005, term177005.getClass(), "buf", null);
        setField(term177005, term177005.getClass(), "writeBuffer", null);
        setField(term177005, term177005.getClass(), "lock", null);
        setField(term177004, term177004.getClass(), "out", term177005);
        setField(term177004, term177004.getClass(), "stack", null);
        setIntField(term177004, term177004.getClass(), "stackSize", 0);
        setField(term177004, term177004.getClass(), "indent", null);
        setField(term177004, term177004.getClass(), "separator", null);
        setBooleanField(term177004, term177004.getClass(), "lenient", false);
        setBooleanField(term177004, term177004.getClass(), "htmlSafe", false);
        setField(term177004, term177004.getClass(), "deferredName", null);
        setBooleanField(term177004, term177004.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term171743, args);
        assertTrue(recursiveEquals(term171743, term177004));
    }

};


