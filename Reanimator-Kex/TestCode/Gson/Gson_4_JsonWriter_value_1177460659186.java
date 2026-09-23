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

public class JsonWriter_value_1177460659186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64233;
     Object term66985;
     Object term66980;

    public JsonWriter_value_1177460659186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64233 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term64233, term64233.getClass(), "deferredName", "");
        term66985 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term66985, term66985.getClass(), "out", null);
        setField(term66985, term66985.getClass(), "stack", null);
        setIntField(term66985, term66985.getClass(), "stackSize", 0);
        setField(term66985, term66985.getClass(), "indent", null);
        setField(term66985, term66985.getClass(), "separator", null);
        setBooleanField(term66985, term66985.getClass(), "lenient", false);
        setBooleanField(term66985, term66985.getClass(), "htmlSafe", false);
        setField(term66985, term66985.getClass(), "deferredName", null);
        setBooleanField(term66985, term66985.getClass(), "serializeNulls", false);
        term66980 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term66980, term66980.getClass(), "out", null);
        setField(term66980, term66980.getClass(), "stack", null);
        setIntField(term66980, term66980.getClass(), "stackSize", 0);
        setField(term66980, term66980.getClass(), "indent", null);
        setField(term66980, term66980.getClass(), "separator", null);
        setBooleanField(term66980, term66980.getClass(), "lenient", false);
        setBooleanField(term66980, term66980.getClass(), "htmlSafe", false);
        setField(term66980, term66980.getClass(), "deferredName", null);
        setBooleanField(term66980, term66980.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "value", argTypes, term64233, args);
        assertTrue(recursiveEquals(term64233, term66985));
        assertTrue(recursiveEquals(retValue, term66980));
    }

};


