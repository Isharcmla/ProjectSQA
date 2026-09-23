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

public class JsonWriter_string_294626227560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2720573;
     Object term2906341;

    public JsonWriter_string_294626227560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2720573 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term2720611 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term2720573, term2720573.getClass(), "htmlSafe", true);
        setField(term2720573, term2720573.getClass(), "out", term2720611);
        term2906341 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term2906342 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term2906342, term2906342.getClass(), "closed", false);
        setField(term2906342, term2906342.getClass(), "writeBuffer", null);
        setField(term2906342, term2906342.getClass(), "lock", null);
        setField(term2906341, term2906341.getClass(), "out", term2906342);
        setField(term2906341, term2906341.getClass(), "stack", null);
        setIntField(term2906341, term2906341.getClass(), "stackSize", 0);
        setField(term2906341, term2906341.getClass(), "indent", null);
        setField(term2906341, term2906341.getClass(), "separator", null);
        setBooleanField(term2906341, term2906341.getClass(), "lenient", false);
        setBooleanField(term2906341, term2906341.getClass(), "htmlSafe", true);
        setField(term2906341, term2906341.getClass(), "deferredName", null);
        setBooleanField(term2906341, term2906341.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
        callMethod(klass, "string", argTypes, term2720573, args);
        assertTrue(recursiveEquals(term2720573, term2906341));
    }

};


