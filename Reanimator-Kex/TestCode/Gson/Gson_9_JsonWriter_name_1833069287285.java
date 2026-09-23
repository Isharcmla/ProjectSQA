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

public class JsonWriter_name_1833069287285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123448;
     Object term123499;
     Object term123490;

    public JsonWriter_name_1833069287285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123448 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term123448, term123448.getClass(), "deferredName", null);
        setIntField(term123448, term123448.getClass(), "stackSize", -1);
        term123499 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term123499, term123499.getClass(), "out", null);
        setField(term123499, term123499.getClass(), "stack", null);
        setIntField(term123499, term123499.getClass(), "stackSize", -1);
        setField(term123499, term123499.getClass(), "indent", null);
        setField(term123499, term123499.getClass(), "separator", null);
        setBooleanField(term123499, term123499.getClass(), "lenient", false);
        setBooleanField(term123499, term123499.getClass(), "htmlSafe", false);
        setField(term123499, term123499.getClass(), "deferredName", "");
        setBooleanField(term123499, term123499.getClass(), "serializeNulls", false);
        term123490 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term123490, term123490.getClass(), "out", null);
        setField(term123490, term123490.getClass(), "stack", null);
        setIntField(term123490, term123490.getClass(), "stackSize", -1);
        setField(term123490, term123490.getClass(), "indent", null);
        setField(term123490, term123490.getClass(), "separator", null);
        setBooleanField(term123490, term123490.getClass(), "lenient", false);
        setBooleanField(term123490, term123490.getClass(), "htmlSafe", false);
        setField(term123490, term123490.getClass(), "deferredName", "");
        setBooleanField(term123490, term123490.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "name", argTypes, term123448, args);
        assertTrue(recursiveEquals(term123448, term123499));
        assertTrue(recursiveEquals(retValue, term123490));
    }

};


