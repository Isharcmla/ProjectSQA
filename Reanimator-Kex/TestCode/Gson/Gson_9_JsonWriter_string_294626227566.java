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

public class JsonWriter_string_294626227566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3158951;
     Object term3304703;

    public JsonWriter_string_294626227566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3158951 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term3158989 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term3158951, term3158951.getClass(), "htmlSafe", true);
        setField(term3158951, term3158951.getClass(), "out", term3158989);
        term3304703 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term3304704 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term3304704, term3304704.getClass(), "closed", false);
        setField(term3304704, term3304704.getClass(), "writeBuffer", null);
        setField(term3304704, term3304704.getClass(), "lock", null);
        setField(term3304703, term3304703.getClass(), "out", term3304704);
        setField(term3304703, term3304703.getClass(), "stack", null);
        setIntField(term3304703, term3304703.getClass(), "stackSize", 0);
        setField(term3304703, term3304703.getClass(), "indent", null);
        setField(term3304703, term3304703.getClass(), "separator", null);
        setBooleanField(term3304703, term3304703.getClass(), "lenient", false);
        setBooleanField(term3304703, term3304703.getClass(), "htmlSafe", true);
        setField(term3304703, term3304703.getClass(), "deferredName", null);
        setBooleanField(term3304703, term3304703.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
        callMethod(klass, "string", argTypes, term3158951, args);
        assertTrue(recursiveEquals(term3158951, term3304703));
    }

};


