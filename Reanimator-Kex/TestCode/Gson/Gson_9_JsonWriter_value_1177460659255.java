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

public class JsonWriter_value_1177460659255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100778;
     Object term101082;
     Object term101077;

    public JsonWriter_value_1177460659255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100778 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term100778, term100778.getClass(), "deferredName", "");
        term101082 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term101082, term101082.getClass(), "out", null);
        setField(term101082, term101082.getClass(), "stack", null);
        setIntField(term101082, term101082.getClass(), "stackSize", 0);
        setField(term101082, term101082.getClass(), "indent", null);
        setField(term101082, term101082.getClass(), "separator", null);
        setBooleanField(term101082, term101082.getClass(), "lenient", false);
        setBooleanField(term101082, term101082.getClass(), "htmlSafe", false);
        setField(term101082, term101082.getClass(), "deferredName", null);
        setBooleanField(term101082, term101082.getClass(), "serializeNulls", false);
        term101077 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term101077, term101077.getClass(), "out", null);
        setField(term101077, term101077.getClass(), "stack", null);
        setIntField(term101077, term101077.getClass(), "stackSize", 0);
        setField(term101077, term101077.getClass(), "indent", null);
        setField(term101077, term101077.getClass(), "separator", null);
        setBooleanField(term101077, term101077.getClass(), "lenient", false);
        setBooleanField(term101077, term101077.getClass(), "htmlSafe", false);
        setField(term101077, term101077.getClass(), "deferredName", null);
        setBooleanField(term101077, term101077.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "value", argTypes, term100778, args);
        assertTrue(recursiveEquals(term100778, term101082));
        assertTrue(recursiveEquals(retValue, term101077));
    }

};


