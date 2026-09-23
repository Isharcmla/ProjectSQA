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

public class JsonWriter_string_294626227404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1984671;
     Object term1993994;

    public JsonWriter_string_294626227404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1984671 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1984709 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1984671, term1984671.getClass(), "htmlSafe", true);
        setField(term1984671, term1984671.getClass(), "out", term1984709);
        term1993994 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1993995 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1993995, term1993995.getClass(), "closed", false);
        setField(term1993995, term1993995.getClass(), "writeBuffer", null);
        setField(term1993995, term1993995.getClass(), "lock", null);
        setField(term1993994, term1993994.getClass(), "out", term1993995);
        setField(term1993994, term1993994.getClass(), "stack", null);
        setIntField(term1993994, term1993994.getClass(), "stackSize", 0);
        setField(term1993994, term1993994.getClass(), "indent", null);
        setField(term1993994, term1993994.getClass(), "separator", null);
        setBooleanField(term1993994, term1993994.getClass(), "lenient", false);
        setBooleanField(term1993994, term1993994.getClass(), "htmlSafe", true);
        setField(term1993994, term1993994.getClass(), "deferredName", null);
        setBooleanField(term1993994, term1993994.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                            ";
        callMethod(klass, "string", argTypes, term1984671, args);
        assertTrue(recursiveEquals(term1984671, term1993994));
    }

};


