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

public class JsonWriter_string_294626227384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term681461;
     Object term861595;

    public JsonWriter_string_294626227384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term681461 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term681499 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term681461, term681461.getClass(), "htmlSafe", true);
        setField(term681461, term681461.getClass(), "out", term681499);
        term861595 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term861596 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term861596, term861596.getClass(), "closed", false);
        setField(term861596, term861596.getClass(), "writeBuffer", null);
        setField(term861596, term861596.getClass(), "lock", null);
        setField(term861595, term861595.getClass(), "out", term861596);
        setField(term861595, term861595.getClass(), "stack", null);
        setIntField(term861595, term861595.getClass(), "stackSize", 0);
        setField(term861595, term861595.getClass(), "indent", null);
        setField(term861595, term861595.getClass(), "separator", null);
        setBooleanField(term861595, term861595.getClass(), "lenient", false);
        setBooleanField(term861595, term861595.getClass(), "htmlSafe", true);
        setField(term861595, term861595.getClass(), "deferredName", null);
        setBooleanField(term861595, term861595.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ";
        callMethod(klass, "string", argTypes, term681461, args);
        assertTrue(recursiveEquals(term681461, term861595));
    }

};


