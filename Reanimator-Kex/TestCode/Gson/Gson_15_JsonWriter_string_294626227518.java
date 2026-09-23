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

public class JsonWriter_string_294626227518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term908787;
     Object term958678;

    public JsonWriter_string_294626227518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term908787 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term908825 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term908787, term908787.getClass(), "htmlSafe", true);
        setField(term908787, term908787.getClass(), "out", term908825);
        term958678 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term958679 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term958679, term958679.getClass(), "closed", false);
        setField(term958679, term958679.getClass(), "writeBuffer", null);
        setField(term958679, term958679.getClass(), "lock", null);
        setField(term958678, term958678.getClass(), "out", term958679);
        setField(term958678, term958678.getClass(), "stack", null);
        setIntField(term958678, term958678.getClass(), "stackSize", 0);
        setField(term958678, term958678.getClass(), "indent", null);
        setField(term958678, term958678.getClass(), "separator", null);
        setBooleanField(term958678, term958678.getClass(), "lenient", false);
        setBooleanField(term958678, term958678.getClass(), "htmlSafe", true);
        setField(term958678, term958678.getClass(), "deferredName", null);
        setBooleanField(term958678, term958678.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
        callMethod(klass, "string", argTypes, term908787, args);
        assertTrue(recursiveEquals(term908787, term958678));
    }

};


