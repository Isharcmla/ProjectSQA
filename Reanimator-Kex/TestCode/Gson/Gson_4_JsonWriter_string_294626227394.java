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

public class JsonWriter_string_294626227394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1246546;
     Object term1253102;

    public JsonWriter_string_294626227394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1246546 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1246584 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1246546, term1246546.getClass(), "htmlSafe", true);
        setField(term1246546, term1246546.getClass(), "out", term1246584);
        term1253102 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1253103 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1253103, term1253103.getClass(), "closed", false);
        setField(term1253103, term1253103.getClass(), "writeBuffer", null);
        setField(term1253103, term1253103.getClass(), "lock", null);
        setField(term1253102, term1253102.getClass(), "out", term1253103);
        setField(term1253102, term1253102.getClass(), "stack", null);
        setIntField(term1253102, term1253102.getClass(), "stackSize", 0);
        setField(term1253102, term1253102.getClass(), "indent", null);
        setField(term1253102, term1253102.getClass(), "separator", null);
        setBooleanField(term1253102, term1253102.getClass(), "lenient", false);
        setBooleanField(term1253102, term1253102.getClass(), "htmlSafe", true);
        setField(term1253102, term1253102.getClass(), "deferredName", null);
        setBooleanField(term1253102, term1253102.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                         ";
        callMethod(klass, "string", argTypes, term1246546, args);
        assertTrue(recursiveEquals(term1246546, term1253102));
    }

};


