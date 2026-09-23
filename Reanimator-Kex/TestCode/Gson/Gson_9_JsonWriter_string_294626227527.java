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

public class JsonWriter_string_294626227527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term524524;
     Object term526838;

    public JsonWriter_string_294626227527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term524524 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term524562 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term524524, term524524.getClass(), "htmlSafe", true);
        setField(term524524, term524524.getClass(), "out", term524562);
        term526838 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term526839 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term526839, term526839.getClass(), "closed", false);
        setField(term526839, term526839.getClass(), "writeBuffer", null);
        setField(term526839, term526839.getClass(), "lock", null);
        setField(term526838, term526838.getClass(), "out", term526839);
        setField(term526838, term526838.getClass(), "stack", null);
        setIntField(term526838, term526838.getClass(), "stackSize", 0);
        setField(term526838, term526838.getClass(), "indent", null);
        setField(term526838, term526838.getClass(), "separator", null);
        setBooleanField(term526838, term526838.getClass(), "lenient", false);
        setBooleanField(term526838, term526838.getClass(), "htmlSafe", true);
        setField(term526838, term526838.getClass(), "deferredName", null);
        setBooleanField(term526838, term526838.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
        callMethod(klass, "string", argTypes, term524524, args);
        assertTrue(recursiveEquals(term524524, term526838));
    }

};


