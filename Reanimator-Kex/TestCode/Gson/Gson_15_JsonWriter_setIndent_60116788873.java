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

public class JsonWriter_setIndent_60116788873 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12938;
     Object term12988;

    public JsonWriter_setIndent_60116788873() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12938 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        term12988 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term12988, term12988.getClass(), "out", null);
        setField(term12988, term12988.getClass(), "stack", null);
        setIntField(term12988, term12988.getClass(), "stackSize", 0);
        setField(term12988, term12988.getClass(), "indent", null);
        setField(term12988, term12988.getClass(), "separator", ":");
        setBooleanField(term12988, term12988.getClass(), "lenient", false);
        setBooleanField(term12988, term12988.getClass(), "htmlSafe", false);
        setField(term12988, term12988.getClass(), "deferredName", null);
        setBooleanField(term12988, term12988.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        callMethod(klass, "setIndent", argTypes, term12938, args);
        assertTrue(recursiveEquals(term12938, term12988));
    }

};


