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

public class JsonWriter_string_294626227410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2152877;
     Object term2384463;

    public JsonWriter_string_294626227410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2152877 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term2152915 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term2152877, term2152877.getClass(), "htmlSafe", true);
        setField(term2152877, term2152877.getClass(), "out", term2152915);
        term2384463 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term2384464 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term2384464, term2384464.getClass(), "closed", false);
        setField(term2384464, term2384464.getClass(), "writeBuffer", null);
        setField(term2384464, term2384464.getClass(), "lock", null);
        setField(term2384463, term2384463.getClass(), "out", term2384464);
        setField(term2384463, term2384463.getClass(), "stack", null);
        setIntField(term2384463, term2384463.getClass(), "stackSize", 0);
        setField(term2384463, term2384463.getClass(), "indent", null);
        setField(term2384463, term2384463.getClass(), "separator", null);
        setBooleanField(term2384463, term2384463.getClass(), "lenient", false);
        setBooleanField(term2384463, term2384463.getClass(), "htmlSafe", true);
        setField(term2384463, term2384463.getClass(), "deferredName", null);
        setBooleanField(term2384463, term2384463.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "\u0002\u0004@\u0002\b\u0010 \u0001\u0010\u0002\u0010\u0010\u0004  \u0002\u0010\u0002@\u0004\b\u0001\b\u0002\b \u0002\u0004\u0004 \b\u0010\b\b\u0004\u0001\u0002\u0004\u0001\u0001@\u0004\u0002@\u0002\b  \u0002\u0010\u0001\u0001\u0001\u0002\u0002\u0002\b\b   \u0001\u0004 \u0004@\b \u0010\u0010\u0001\u0002 \u0010 @ \u0002\u0004@\u0002\b\u0002\u0002\u0001\u0004\u0002 \u0001\u0002\u0001\u0002\b\u0002\u0002\u0004\b@\u0010\u0001\b\u0004\u0002\u0002\u0002\u0002\u0002@\u0004\u0002\u0002 \u0004\u0004@\u0002 \u0002\u0004\u0002 \u0001\u0004\u0001\u0002\u0004\u0010\b\u0001\b\u0001\u0010\u0004\b\u0004\u0004\b\u0001\u0001\u0001\u0010\b\u0002\u0002\u0002\b\u0002\u0002\u0001\u0010\b\b\u0001\u0001\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010@  \u0010\u0001\b\b \u0002\u0010\u0010\u0004\u0001\u0010\u0010@  \u0010\u0004\u0002\u0002\u0002\u0004\u0010\b\u0010\u0001\u0010\u0002\u0002 @\u0010\u0004\u0010\u0002\u0002\u0002\b\u0001\b\b\u0004\b\u0002\u0010\b\u0004\u0010\u0002\b\b\u0010\b\u0002\u0002\b\u0002@\u0002\u0002\u0010\u0002 \b\u0004\b\u0004\u0004\u0004\u0002@ \u0002\u0004@ @\u0004@ @ \b\u0010\u0010\u0002\u0002\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010 \u0002\u0002\u0002\u0004 \u0010\u0010\u0002\u0010\u0001  \u0001 \u0010\u0002 \u0004\b\u0001 \u0010\u0004\u0001\u0010\b                                                                                                                                                                                                                ";
        callMethod(klass, "string", argTypes, term2152877, args);
        assertTrue(recursiveEquals(term2152877, term2384463));
    }

};


