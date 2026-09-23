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

public class JsonWriter_name_1833069287135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38116;
     Object term38439;
     Object term38430;

    public JsonWriter_name_1833069287135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38116 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term38116, term38116.getClass(), "deferredName", null);
        setIntField(term38116, term38116.getClass(), "stackSize", -1);
        term38439 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term38439, term38439.getClass(), "out", null);
        setField(term38439, term38439.getClass(), "stack", null);
        setIntField(term38439, term38439.getClass(), "stackSize", -1);
        setField(term38439, term38439.getClass(), "indent", null);
        setField(term38439, term38439.getClass(), "separator", null);
        setBooleanField(term38439, term38439.getClass(), "lenient", false);
        setBooleanField(term38439, term38439.getClass(), "htmlSafe", false);
        setField(term38439, term38439.getClass(), "deferredName", "");
        setBooleanField(term38439, term38439.getClass(), "serializeNulls", false);
        term38430 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term38430, term38430.getClass(), "out", null);
        setField(term38430, term38430.getClass(), "stack", null);
        setIntField(term38430, term38430.getClass(), "stackSize", -1);
        setField(term38430, term38430.getClass(), "indent", null);
        setField(term38430, term38430.getClass(), "separator", null);
        setBooleanField(term38430, term38430.getClass(), "lenient", false);
        setBooleanField(term38430, term38430.getClass(), "htmlSafe", false);
        setField(term38430, term38430.getClass(), "deferredName", "");
        setBooleanField(term38430, term38430.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "name", argTypes, term38116, args);
        assertTrue(recursiveEquals(term38116, term38439));
        assertTrue(recursiveEquals(retValue, term38430));
    }

};


