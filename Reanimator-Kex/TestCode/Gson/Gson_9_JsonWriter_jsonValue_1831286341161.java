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

public class JsonWriter_jsonValue_1831286341161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46818;
     Object term47399;
     Object term47394;

    public JsonWriter_jsonValue_1831286341161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46818 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term46818, term46818.getClass(), "deferredName", "");
        term47399 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term47399, term47399.getClass(), "out", null);
        setField(term47399, term47399.getClass(), "stack", null);
        setIntField(term47399, term47399.getClass(), "stackSize", 0);
        setField(term47399, term47399.getClass(), "indent", null);
        setField(term47399, term47399.getClass(), "separator", null);
        setBooleanField(term47399, term47399.getClass(), "lenient", false);
        setBooleanField(term47399, term47399.getClass(), "htmlSafe", false);
        setField(term47399, term47399.getClass(), "deferredName", null);
        setBooleanField(term47399, term47399.getClass(), "serializeNulls", false);
        term47394 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term47394, term47394.getClass(), "out", null);
        setField(term47394, term47394.getClass(), "stack", null);
        setIntField(term47394, term47394.getClass(), "stackSize", 0);
        setField(term47394, term47394.getClass(), "indent", null);
        setField(term47394, term47394.getClass(), "separator", null);
        setBooleanField(term47394, term47394.getClass(), "lenient", false);
        setBooleanField(term47394, term47394.getClass(), "htmlSafe", false);
        setField(term47394, term47394.getClass(), "deferredName", null);
        setBooleanField(term47394, term47394.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "jsonValue", argTypes, term46818, args);
        assertTrue(recursiveEquals(term46818, term47399));
        assertTrue(recursiveEquals(retValue, term47394));
    }

};


