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

public class JsonWriter_string_294626227542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1648777;
     Object term1653477;

    public JsonWriter_string_294626227542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1648777 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1648815 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1648777, term1648777.getClass(), "htmlSafe", true);
        setField(term1648777, term1648777.getClass(), "out", term1648815);
        term1653477 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1653478 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1653478, term1653478.getClass(), "closed", false);
        setField(term1653478, term1653478.getClass(), "writeBuffer", null);
        setField(term1653478, term1653478.getClass(), "lock", null);
        setField(term1653477, term1653477.getClass(), "out", term1653478);
        setField(term1653477, term1653477.getClass(), "stack", null);
        setIntField(term1653477, term1653477.getClass(), "stackSize", 0);
        setField(term1653477, term1653477.getClass(), "indent", null);
        setField(term1653477, term1653477.getClass(), "separator", null);
        setBooleanField(term1653477, term1653477.getClass(), "lenient", false);
        setBooleanField(term1653477, term1653477.getClass(), "htmlSafe", true);
        setField(term1653477, term1653477.getClass(), "deferredName", null);
        setBooleanField(term1653477, term1653477.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ";
        callMethod(klass, "string", argTypes, term1648777, args);
        assertTrue(recursiveEquals(term1648777, term1653477));
    }

};


