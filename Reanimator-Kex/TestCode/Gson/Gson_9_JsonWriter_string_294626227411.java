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

public class JsonWriter_string_294626227411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221444;
     Object term221533;

    public JsonWriter_string_294626227411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term221444 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term221482 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term221444, term221444.getClass(), "htmlSafe", true);
        setField(term221444, term221444.getClass(), "out", term221482);
        term221533 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term221534 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term221534, term221534.getClass(), "closed", false);
        setField(term221534, term221534.getClass(), "writeBuffer", null);
        setField(term221534, term221534.getClass(), "lock", null);
        setField(term221533, term221533.getClass(), "out", term221534);
        setField(term221533, term221533.getClass(), "stack", null);
        setIntField(term221533, term221533.getClass(), "stackSize", 0);
        setField(term221533, term221533.getClass(), "indent", null);
        setField(term221533, term221533.getClass(), "separator", null);
        setBooleanField(term221533, term221533.getClass(), "lenient", false);
        setBooleanField(term221533, term221533.getClass(), "htmlSafe", true);
        setField(term221533, term221533.getClass(), "deferredName", null);
        setBooleanField(term221533, term221533.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        callMethod(klass, "string", argTypes, term221444, args);
        assertTrue(recursiveEquals(term221444, term221533));
    }

};


