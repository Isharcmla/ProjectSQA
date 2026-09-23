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

public class JsonWriter_setIndent_60116788886 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18795;
     Object term19000;

    public JsonWriter_setIndent_60116788886() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18795 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        term19000 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term19000, term19000.getClass(), "out", null);
        setField(term19000, term19000.getClass(), "stack", null);
        setIntField(term19000, term19000.getClass(), "stackSize", 0);
        setField(term19000, term19000.getClass(), "indent", null);
        setField(term19000, term19000.getClass(), "separator", ":");
        setBooleanField(term19000, term19000.getClass(), "lenient", false);
        setBooleanField(term19000, term19000.getClass(), "htmlSafe", false);
        setField(term19000, term19000.getClass(), "deferredName", null);
        setBooleanField(term19000, term19000.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        callMethod(klass, "setIndent", argTypes, term18795, args);
        assertTrue(recursiveEquals(term18795, term19000));
    }

};


