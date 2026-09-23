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

public class JsonWriter_value_1177460659440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term266367;
     Object term266581;

    public JsonWriter_value_1177460659440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term266367 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term266367, term266367.getClass(), "pendingName", "");
        term266581 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term266581, term266581.getClass(), "stack", null);
        setField(term266581, term266581.getClass(), "pendingName", null);
        setField(term266581, term266581.getClass(), "product", null);
        setField(term266581, term266581.getClass(), "out", null);
        setField(term266581, term266581.getClass(), "stack", null);
        setIntField(term266581, term266581.getClass(), "stackSize", 0);
        setField(term266581, term266581.getClass(), "indent", null);
        setField(term266581, term266581.getClass(), "separator", null);
        setBooleanField(term266581, term266581.getClass(), "lenient", false);
        setBooleanField(term266581, term266581.getClass(), "htmlSafe", false);
        setField(term266581, term266581.getClass(), "deferredName", null);
        setBooleanField(term266581, term266581.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "value", argTypes, term266367, args);
        assertTrue(recursiveEquals(term266367, term266581));
    }

};


