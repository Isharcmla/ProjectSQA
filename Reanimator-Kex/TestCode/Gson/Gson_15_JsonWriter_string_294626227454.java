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

public class JsonWriter_string_294626227454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242539;
     Object term249268;

    public JsonWriter_string_294626227454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term242539 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term242577 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term242539, term242539.getClass(), "htmlSafe", true);
        setField(term242539, term242539.getClass(), "out", term242577);
        term249268 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term249269 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term249269, term249269.getClass(), "closed", false);
        setField(term249269, term249269.getClass(), "writeBuffer", null);
        setField(term249269, term249269.getClass(), "lock", null);
        setField(term249268, term249268.getClass(), "out", term249269);
        setField(term249268, term249268.getClass(), "stack", null);
        setIntField(term249268, term249268.getClass(), "stackSize", 0);
        setField(term249268, term249268.getClass(), "indent", null);
        setField(term249268, term249268.getClass(), "separator", null);
        setBooleanField(term249268, term249268.getClass(), "lenient", false);
        setBooleanField(term249268, term249268.getClass(), "htmlSafe", true);
        setField(term249268, term249268.getClass(), "deferredName", null);
        setBooleanField(term249268, term249268.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ";
        callMethod(klass, "string", argTypes, term242539, args);
        assertTrue(recursiveEquals(term242539, term249268));
    }

};


