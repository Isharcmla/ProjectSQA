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

public class JsonWriter_string_294626227380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term423664;
     Object term427580;

    public JsonWriter_string_294626227380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term423664 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term423702 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term423664, term423664.getClass(), "htmlSafe", true);
        setField(term423664, term423664.getClass(), "out", term423702);
        term427580 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term427581 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term427581, term427581.getClass(), "closed", false);
        setField(term427581, term427581.getClass(), "writeBuffer", null);
        setField(term427581, term427581.getClass(), "lock", null);
        setField(term427580, term427580.getClass(), "out", term427581);
        setField(term427580, term427580.getClass(), "stack", null);
        setIntField(term427580, term427580.getClass(), "stackSize", 0);
        setField(term427580, term427580.getClass(), "indent", null);
        setField(term427580, term427580.getClass(), "separator", null);
        setBooleanField(term427580, term427580.getClass(), "lenient", false);
        setBooleanField(term427580, term427580.getClass(), "htmlSafe", true);
        setField(term427580, term427580.getClass(), "deferredName", null);
        setBooleanField(term427580, term427580.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "\u0004\u0004\u0010\u0010\b\u0001\b\u0010\u0001\u0002\u0002\u0002\b\u0004\u0002\u0001\b\b\b\b\u0004\u0001\u0001\b\u0010\b\u0010\u0002\u0001\u0002\b\u0001\b\u0001\u0002\u0010\u0010\b\u0002\u0004\u0004\u0010\u0001\u0001\u0004\b\u0002\u0002\b\u0010\u0001\u0002\u0001\b\u0010\u0001\u0001\u0010\u0001\u0004\u0004\u0001\u0004\u0001\b\u0002\u0001\u0004\u0004\u0002\u0004\b\u0002\u0001\u0002\u0002\u0001\u0002\u0010\u0004\u0001\b\u0002\u0002\u0010\u0010\u0002\u0002\u0001\b\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0001\u0001\u0002\u0002\u0001\u0001\u0001\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0001\u0002\u0002\u0004\u0002\u0010\u0001\u0002\u0010\u0004\u0004\b\u0002\u0010\u0002\b\u0001\u0002\u0010\b\u0002\u0001\u0001\b\u0002\u0002\u0010\b\u0002\u0001\u0004\u0010\u0004\u0002\u0004\u0001\b\u0004\u0002\u0010\u0002\u0004\u0010\u0002\u0004\u0002\b\b\u0002\b\b\b\b\b\b\u0004\u0002\u0002\b\u0010\u0004\u0010\u0002\b\u0002\u0002\u0002\b\b\u0004\u0001\b\u0002\b\u0010\u0004\u0004\u0002\b\u0002\u0002\u0002\u0004\u0002\u0002\u0002\u0002\u0010\u0004\u0002\u0001\u0001\u0004\u0010\u0002\u0002\u0002\u0010\b\u0010\u0001\u0002\u0010\u0002\u0001\u0002\b\u0002\u0010\b\u0002\u0002\u0010\u0004\u0010\b\u0002\u0002\u0010\b\u0010\b\u0010\u0010\u0004\b\u0004\u0002\u0001\u0001\u0002\u0002\u0010\u0002\u0004\u0002\u0010\u0002\u0002\u0002\b\u0001\u0010\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0010\u0004\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\b\b\b\u0004\u0002\u0004\u0004\u0004\b\u0004\u0004\u0002\u0004\u0004\u0004\u0002\u0004\b\u0002\u0004\u0004\u0004\u0002\u0004\u0004                                                                                                                                                                                                        ";
        callMethod(klass, "string", argTypes, term423664, args);
        assertTrue(recursiveEquals(term423664, term427580));
    }

};


