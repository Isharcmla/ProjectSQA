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

public class JsonWriter_string_294626227481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term299666;
     Object term320811;

    public JsonWriter_string_294626227481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term299666 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term299704 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term299666, term299666.getClass(), "htmlSafe", true);
        setField(term299666, term299666.getClass(), "out", term299704);
        term320811 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term320812 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term320812, term320812.getClass(), "closed", false);
        setField(term320812, term320812.getClass(), "writeBuffer", null);
        setField(term320812, term320812.getClass(), "lock", null);
        setField(term320811, term320811.getClass(), "out", term320812);
        setField(term320811, term320811.getClass(), "stack", null);
        setIntField(term320811, term320811.getClass(), "stackSize", 0);
        setField(term320811, term320811.getClass(), "indent", null);
        setField(term320811, term320811.getClass(), "separator", null);
        setBooleanField(term320811, term320811.getClass(), "lenient", false);
        setBooleanField(term320811, term320811.getClass(), "htmlSafe", true);
        setField(term320811, term320811.getClass(), "deferredName", null);
        setBooleanField(term320811, term320811.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ";
        callMethod(klass, "string", argTypes, term299666, args);
        assertTrue(recursiveEquals(term299666, term320811));
    }

};


