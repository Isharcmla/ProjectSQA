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

public class JsonWriter_string_294626227548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1707522;
     Object term2096211;

    public JsonWriter_string_294626227548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1707522 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1707560 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1707522, term1707522.getClass(), "htmlSafe", true);
        setField(term1707522, term1707522.getClass(), "out", term1707560);
        term2096211 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term2096212 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term2096212, term2096212.getClass(), "closed", false);
        setField(term2096212, term2096212.getClass(), "writeBuffer", null);
        setField(term2096212, term2096212.getClass(), "lock", null);
        setField(term2096211, term2096211.getClass(), "out", term2096212);
        setField(term2096211, term2096211.getClass(), "stack", null);
        setIntField(term2096211, term2096211.getClass(), "stackSize", 0);
        setField(term2096211, term2096211.getClass(), "indent", null);
        setField(term2096211, term2096211.getClass(), "separator", null);
        setBooleanField(term2096211, term2096211.getClass(), "lenient", false);
        setBooleanField(term2096211, term2096211.getClass(), "htmlSafe", true);
        setField(term2096211, term2096211.getClass(), "deferredName", null);
        setBooleanField(term2096211, term2096211.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "        \u0010   \u0010\u0001 \u0004\u0004    \u0001  \u0010  \u0004@     \n   \u0004    \"\u0002  \u0010\u0004@       \b\u0010 \u0002             @ \u0002\u0002  \b \u0014 \u0001 \u0010     \u0002     $\u0001      \u0004 \u0001   @ \u0004  \u0001\u0001    \u0002       \u0001\b\u0010\b\t           \u0004   \b  \u0002  \u0002        \u0002\u0002\u0010\b\u0010 \u0010\u0004\u0001 \u0004\u0010\u0010\u0004\b\b\u0010\u0002\u0002\u0001\u0001 \u0004\b\u0002\u0001\u0002\u0010\u0004\u0002\b                                                          ";
        callMethod(klass, "string", argTypes, term1707522, args);
        assertTrue(recursiveEquals(term1707522, term2096211));
    }

};


