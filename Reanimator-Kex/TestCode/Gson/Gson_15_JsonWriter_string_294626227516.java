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

public class JsonWriter_string_294626227516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term670644;
     Object term913248;

    public JsonWriter_string_294626227516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term670644 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term670682 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term670644, term670644.getClass(), "htmlSafe", true);
        setField(term670644, term670644.getClass(), "out", term670682);
        term913248 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term913249 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term913249, term913249.getClass(), "closed", false);
        setField(term913249, term913249.getClass(), "writeBuffer", null);
        setField(term913249, term913249.getClass(), "lock", null);
        setField(term913248, term913248.getClass(), "out", term913249);
        setField(term913248, term913248.getClass(), "stack", null);
        setIntField(term913248, term913248.getClass(), "stackSize", 0);
        setField(term913248, term913248.getClass(), "indent", null);
        setField(term913248, term913248.getClass(), "separator", null);
        setBooleanField(term913248, term913248.getClass(), "lenient", false);
        setBooleanField(term913248, term913248.getClass(), "htmlSafe", true);
        setField(term913248, term913248.getClass(), "deferredName", null);
        setBooleanField(term913248, term913248.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                         ";
        callMethod(klass, "string", argTypes, term670644, args);
        assertTrue(recursiveEquals(term670644, term913248));
    }

};


