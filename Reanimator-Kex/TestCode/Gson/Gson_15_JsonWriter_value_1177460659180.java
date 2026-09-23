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

public class JsonWriter_value_1177460659180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54752;
     Object term54889;
     Object term54884;

    public JsonWriter_value_1177460659180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54752 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term54752, term54752.getClass(), "deferredName", "");
        term54889 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term54889, term54889.getClass(), "out", null);
        setField(term54889, term54889.getClass(), "stack", null);
        setIntField(term54889, term54889.getClass(), "stackSize", 0);
        setField(term54889, term54889.getClass(), "indent", null);
        setField(term54889, term54889.getClass(), "separator", null);
        setBooleanField(term54889, term54889.getClass(), "lenient", false);
        setBooleanField(term54889, term54889.getClass(), "htmlSafe", false);
        setField(term54889, term54889.getClass(), "deferredName", null);
        setBooleanField(term54889, term54889.getClass(), "serializeNulls", false);
        term54884 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term54884, term54884.getClass(), "out", null);
        setField(term54884, term54884.getClass(), "stack", null);
        setIntField(term54884, term54884.getClass(), "stackSize", 0);
        setField(term54884, term54884.getClass(), "indent", null);
        setField(term54884, term54884.getClass(), "separator", null);
        setBooleanField(term54884, term54884.getClass(), "lenient", false);
        setBooleanField(term54884, term54884.getClass(), "htmlSafe", false);
        setField(term54884, term54884.getClass(), "deferredName", null);
        setBooleanField(term54884, term54884.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "value", argTypes, term54752, args);
        assertTrue(recursiveEquals(term54752, term54889));
        assertTrue(recursiveEquals(retValue, term54884));
    }

};


