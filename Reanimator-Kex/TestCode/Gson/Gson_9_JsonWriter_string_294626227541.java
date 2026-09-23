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

public class JsonWriter_string_294626227541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1428651;
     Object term1669312;

    public JsonWriter_string_294626227541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1428651 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1428689 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1428651, term1428651.getClass(), "htmlSafe", true);
        setField(term1428651, term1428651.getClass(), "out", term1428689);
        term1669312 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1669313 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1669313, term1669313.getClass(), "closed", false);
        setField(term1669313, term1669313.getClass(), "writeBuffer", null);
        setField(term1669313, term1669313.getClass(), "lock", null);
        setField(term1669312, term1669312.getClass(), "out", term1669313);
        setField(term1669312, term1669312.getClass(), "stack", null);
        setIntField(term1669312, term1669312.getClass(), "stackSize", 0);
        setField(term1669312, term1669312.getClass(), "indent", null);
        setField(term1669312, term1669312.getClass(), "separator", null);
        setBooleanField(term1669312, term1669312.getClass(), "lenient", false);
        setBooleanField(term1669312, term1669312.getClass(), "htmlSafe", true);
        setField(term1669312, term1669312.getClass(), "deferredName", null);
        setBooleanField(term1669312, term1669312.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "\u0010\u0002\b\u0004\u0010\u0001\u0004@@\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0010@@\u0001\u0010\b@\u0002\b@\u0002\u0001\u0001@\u0001  \u0001@\b \u0010\b\b \u0010@@\u0001\u0010\u0004 \u0010@\u0004\u0010\b\u0004\b@\u0010\b\u0004\b\u0002\u0001\u0001\b \u0004 \b\u0002\u0004\u0004\u0004\b \b \u0010\u0004\b\u0010\u0001\u0001\u0002 @\b@\u0002  \u0002\u0010\u0010@@\u0002@\u0002\u0010\u0010\u0001\u0002@\b \u0010\u0001\b\u0010\u0004 @\u0001@\b\u0002\u0002\u0010@\b \b@\u0010\u0002\u0002\u0001\u0004\u0002\u0002\u0010\u0002\u0002\u0004\u0004@\u0002@\u0001\u0010\b\u0010\u0001@\b\u0002\u0002 \u0002 \b  \u0004 \u0010\u0002\u0010\u0001@\u0004\u0002\u0002\u0002@\u0010\u0010 \u0001\u0010\u0001\u0010\u0001\u0002\u0002\u0001@@\u0001\u0010\u0004\u0010@\b@\u0002 \u0004\u0004\u0001\b\u0002\b \u0004\b\u0002\b\u0001\u0002@ \u0004\b\b\b\u0004\u0004 \u0002@\u0002 \u0002\b\b\b\u0004\u0004\u0004\u0010\u0004\u0002\u0001\u0002@\u0002 \u0010 \u0002\b@\b\u0010\b\b\b\u0004\u0002\u0010\b\u0004\u0010\u0002@\b \u0002\u0010 \b\u0004  \b\u0010\u0001\u0001\u0001 \b\b\u0010\u0002 \u0002\u0001\u0002 \b \u0001@@\b@\u0004\u0010\u0001\u0004\u0004\b\u0002 @\u0010\b  @\u0002\u0010\u0010\u0010\b\u0010\u0010\u0002\u0001     \u0010\u0010\u0004 @   \u0004@ \u0001 @\u0010\u0004\u0001\u0001\u0010\u0001\u0010@\u0001@\u0010\u0002\u0001@\u0010\u0001\u0001\u0004\u0004\u0002\u0010\u0001 @@\u0001 @\u0001@\u0010                                 ";
        callMethod(klass, "string", argTypes, term1428651, args);
        assertTrue(recursiveEquals(term1428651, term1669312));
    }

};


