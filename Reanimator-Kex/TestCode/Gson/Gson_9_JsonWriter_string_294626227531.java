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
import java.lang.Object;

public class JsonWriter_string_294626227531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term701848;
     Object term972141;

    public JsonWriter_string_294626227531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term701848 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term701886 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term701848, term701848.getClass(), "htmlSafe", true);
        setField(term701848, term701848.getClass(), "out", term701886);
        term972141 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term972142 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term972142, term972142.getClass(), "closed", false);
        setField(term972142, term972142.getClass(), "writeBuffer", null);
        setField(term972142, term972142.getClass(), "lock", null);
        setField(term972141, term972141.getClass(), "out", term972142);
        setField(term972141, term972141.getClass(), "stack", null);
        setIntField(term972141, term972141.getClass(), "stackSize", 0);
        setField(term972141, term972141.getClass(), "indent", null);
        setField(term972141, term972141.getClass(), "separator", null);
        setBooleanField(term972141, term972141.getClass(), "lenient", false);
        setBooleanField(term972141, term972141.getClass(), "htmlSafe", true);
        setField(term972141, term972141.getClass(), "deferredName", null);
        setBooleanField(term972141, term972141.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
        callMethod(klass, "string", argTypes, term701848, args);
        assertTrue(recursiveEquals(term701848, term972141));
    }

};


