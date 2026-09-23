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

public class JsonWriter_string_294626227531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1293855;
     Object term1362445;

    public JsonWriter_string_294626227531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1293855 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1293893 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1293855, term1293855.getClass(), "htmlSafe", true);
        setField(term1293855, term1293855.getClass(), "out", term1293893);
        term1362445 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1362446 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1362446, term1362446.getClass(), "closed", false);
        setField(term1362446, term1362446.getClass(), "writeBuffer", null);
        setField(term1362446, term1362446.getClass(), "lock", null);
        setField(term1362445, term1362445.getClass(), "out", term1362446);
        setField(term1362445, term1362445.getClass(), "stack", null);
        setIntField(term1362445, term1362445.getClass(), "stackSize", 0);
        setField(term1362445, term1362445.getClass(), "indent", null);
        setField(term1362445, term1362445.getClass(), "separator", null);
        setBooleanField(term1362445, term1362445.getClass(), "lenient", false);
        setBooleanField(term1362445, term1362445.getClass(), "htmlSafe", true);
        setField(term1362445, term1362445.getClass(), "deferredName", null);
        setBooleanField(term1362445, term1362445.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ";
        callMethod(klass, "string", argTypes, term1293855, args);
        assertTrue(recursiveEquals(term1293855, term1362445));
    }

};


