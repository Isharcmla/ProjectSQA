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

public class JsonWriter_newline_1238389959419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223374;
     Object term223474;

    public JsonWriter_newline_1238389959419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223374 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term223450 = newInstance(Class.forName("java.io.Writer$1"));
        setField(term223374, term223374.getClass(), "indent", "");
        setField(term223374, term223374.getClass(), "out", term223450);
        setIntField(term223374, term223374.getClass(), "stackSize", 2);
        term223474 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term223475 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term223475, term223475.getClass(), "closed", false);
        setField(term223475, term223475.getClass(), "writeBuffer", null);
        setField(term223475, term223475.getClass(), "lock", null);
        setField(term223474, term223474.getClass(), "out", term223475);
        setField(term223474, term223474.getClass(), "stack", null);
        setIntField(term223474, term223474.getClass(), "stackSize", 2);
        setField(term223474, term223474.getClass(), "indent", "");
        setField(term223474, term223474.getClass(), "separator", null);
        setBooleanField(term223474, term223474.getClass(), "lenient", false);
        setBooleanField(term223474, term223474.getClass(), "htmlSafe", false);
        setField(term223474, term223474.getClass(), "deferredName", null);
        setBooleanField(term223474, term223474.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "newline", argTypes, term223374, args);
        assertTrue(recursiveEquals(term223374, term223474));
    }

};


