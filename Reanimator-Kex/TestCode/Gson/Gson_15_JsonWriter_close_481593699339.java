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

public class JsonWriter_close_481593699339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154561;
     Object term154609;

    public JsonWriter_close_481593699339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154561 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term154599 = newInstance(Class.forName("java.io.Writer$1"));
        setField(term154561, term154561.getClass(), "out", term154599);
        term154609 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term154610 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term154610, term154610.getClass(), "closed", true);
        setField(term154610, term154610.getClass(), "writeBuffer", null);
        setField(term154610, term154610.getClass(), "lock", null);
        setField(term154609, term154609.getClass(), "out", term154610);
        setField(term154609, term154609.getClass(), "stack", null);
        setIntField(term154609, term154609.getClass(), "stackSize", 0);
        setField(term154609, term154609.getClass(), "indent", null);
        setField(term154609, term154609.getClass(), "separator", null);
        setBooleanField(term154609, term154609.getClass(), "lenient", false);
        setBooleanField(term154609, term154609.getClass(), "htmlSafe", false);
        setField(term154609, term154609.getClass(), "deferredName", null);
        setBooleanField(term154609, term154609.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term154561, args);
        assertTrue(recursiveEquals(term154561, term154609));
    }

};


