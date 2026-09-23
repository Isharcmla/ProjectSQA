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

public class JsonWriter_flush_2108505943429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229697;
     Object term231423;

    public JsonWriter_flush_2108505943429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term229697 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term229735 = newInstance(Class.forName("java.io.Writer$1"));
        setIntField(term229697, term229697.getClass(), "stackSize", -1);
        setField(term229697, term229697.getClass(), "out", term229735);
        term231423 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term231424 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term231424, term231424.getClass(), "closed", false);
        setField(term231424, term231424.getClass(), "writeBuffer", null);
        setField(term231424, term231424.getClass(), "lock", null);
        setField(term231423, term231423.getClass(), "out", term231424);
        setField(term231423, term231423.getClass(), "stack", null);
        setIntField(term231423, term231423.getClass(), "stackSize", -1);
        setField(term231423, term231423.getClass(), "indent", null);
        setField(term231423, term231423.getClass(), "separator", null);
        setBooleanField(term231423, term231423.getClass(), "lenient", false);
        setBooleanField(term231423, term231423.getClass(), "htmlSafe", false);
        setField(term231423, term231423.getClass(), "deferredName", null);
        setBooleanField(term231423, term231423.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "flush", argTypes, term229697, args);
        assertTrue(recursiveEquals(term229697, term231423));
    }

};


