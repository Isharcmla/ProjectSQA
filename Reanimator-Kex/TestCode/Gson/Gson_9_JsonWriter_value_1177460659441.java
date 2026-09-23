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
import java.util.ArrayList;
import java.lang.Object;

public class JsonWriter_value_1177460659441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term266516;
     Object term266596;

    public JsonWriter_value_1177460659441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term266568 = new ArrayList();
        term266516 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term266516, term266516.getClass(), "pendingName", null);
        setField(term266516, term266516.getClass(), "stack", term266568);
        ArrayList term266597 = new ArrayList();
        term266596 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term266599 = newInstance(Class.forName("com.google.gson.JsonNull"));
        setField(term266596, term266596.getClass(), "stack", term266597);
        setField(term266596, term266596.getClass(), "pendingName", null);
        setField(term266596, term266596.getClass(), "product", term266599);
        setField(term266596, term266596.getClass(), "out", null);
        setField(term266596, term266596.getClass(), "stack", null);
        setIntField(term266596, term266596.getClass(), "stackSize", 0);
        setField(term266596, term266596.getClass(), "indent", null);
        setField(term266596, term266596.getClass(), "separator", null);
        setBooleanField(term266596, term266596.getClass(), "lenient", false);
        setBooleanField(term266596, term266596.getClass(), "htmlSafe", false);
        setField(term266596, term266596.getClass(), "deferredName", null);
        setBooleanField(term266596, term266596.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "value", argTypes, term266516, args);
        assertTrue(recursiveEquals(term266516, term266596));
    }

};


