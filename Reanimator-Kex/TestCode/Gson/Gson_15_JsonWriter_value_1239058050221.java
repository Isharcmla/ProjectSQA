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

public class JsonWriter_value_1239058050221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82708;
     Object term82760;
     Object term82755;

    public JsonWriter_value_1239058050221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82708 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term82708, term82708.getClass(), "deferredName", "");
        term82760 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term82760, term82760.getClass(), "out", null);
        setField(term82760, term82760.getClass(), "stack", null);
        setIntField(term82760, term82760.getClass(), "stackSize", 0);
        setField(term82760, term82760.getClass(), "indent", null);
        setField(term82760, term82760.getClass(), "separator", null);
        setBooleanField(term82760, term82760.getClass(), "lenient", false);
        setBooleanField(term82760, term82760.getClass(), "htmlSafe", false);
        setField(term82760, term82760.getClass(), "deferredName", null);
        setBooleanField(term82760, term82760.getClass(), "serializeNulls", false);
        term82755 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term82755, term82755.getClass(), "out", null);
        setField(term82755, term82755.getClass(), "stack", null);
        setIntField(term82755, term82755.getClass(), "stackSize", 0);
        setField(term82755, term82755.getClass(), "indent", null);
        setField(term82755, term82755.getClass(), "separator", null);
        setBooleanField(term82755, term82755.getClass(), "lenient", false);
        setBooleanField(term82755, term82755.getClass(), "htmlSafe", false);
        setField(term82755, term82755.getClass(), "deferredName", null);
        setBooleanField(term82755, term82755.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "value", argTypes, term82708, args);
        assertTrue(recursiveEquals(term82708, term82760));
        assertTrue(recursiveEquals(retValue, term82755));
    }

};


