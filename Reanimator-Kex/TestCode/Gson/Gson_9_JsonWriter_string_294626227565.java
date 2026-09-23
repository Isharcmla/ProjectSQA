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

public class JsonWriter_string_294626227565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3091956;
     Object term3300839;

    public JsonWriter_string_294626227565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3091956 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term3091994 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term3091956, term3091956.getClass(), "htmlSafe", true);
        setField(term3091956, term3091956.getClass(), "out", term3091994);
        term3300839 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term3300840 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term3300840, term3300840.getClass(), "closed", false);
        setField(term3300840, term3300840.getClass(), "writeBuffer", null);
        setField(term3300840, term3300840.getClass(), "lock", null);
        setField(term3300839, term3300839.getClass(), "out", term3300840);
        setField(term3300839, term3300839.getClass(), "stack", null);
        setIntField(term3300839, term3300839.getClass(), "stackSize", 0);
        setField(term3300839, term3300839.getClass(), "indent", null);
        setField(term3300839, term3300839.getClass(), "separator", null);
        setBooleanField(term3300839, term3300839.getClass(), "lenient", false);
        setBooleanField(term3300839, term3300839.getClass(), "htmlSafe", true);
        setField(term3300839, term3300839.getClass(), "deferredName", null);
        setBooleanField(term3300839, term3300839.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "\u0001\u0001@\u0010\b\u0002\u0004\u0002\u0002\u0010\u0004 \u0001\u0001\u0010\u0004\u0001@\b@ \u0001\u0001\u0010\u0002@@\b\u0010\u0010 @\u0004\b\u0001\u0002\u0001\u0002\u0001\u0010\b\u0001\u0001\u0002\u0002\u0001\u0001\u0004    \u0001\u0002\b\u0001\u0001\b\u0002\u0010\u0001\b\b\u0010\u0001\b\u0002\u0001\u0001\u0002\u0002\u0002\u0004\u0002\u0002@\u0002\u0002\u0002\u0001@\b\u0002\u0001\u0004\u0010\u0001\u0004\b \b\u0002\u0001 @\u0001 \u0001\u0002\b\u0002\u0010\u0004\u0002\u0004@\u0010\u0001 \u0001 @@\b@ \u0001@\u0002\u0002\u0010\u0001\u0001\u0002\u0004\u0004\u0004\b @\u0004\u0004\u0004\u0001\u0004\u0004\u0004\u0001\u0004\u0001\u0004\u0010\u0010\b\b\b\u0004\u0004\u0004\u0001\u0001@\u0004 \u0004 \u0004\u0010\u0010\b\u0002\b\u0004\u0004\u0004\u0010\u0001\u0004@\u0004 \u0004\u0010\u0010\b\u0004\u0010\u0004\u0002 \u0010\u0004@\u0004\u0010\u0001\u0004 \u0010\u0004@\u0002\u0010\u0004\u0004 \u0010\b\u0001\u0001@\u0001\u0001\u0001\u0001\u0001\u0001\u0001 \u0001\u0001\u0001@\u0001\u0001\u0001\u0002\u0001\u0001\u0001\u0001\u0002\u0002\u0001 \u0002\u0001\u0001\u0001\u0001 \u0001\u0004\u0001\u0001\u0010@\u0001\u0001\u0001 \u0001\u0001\u0001@\u0001\u0001    \u0001\u0001@\b\u0001\u0001@\u0010\u0004\u0001\u0001\b\u0010\u0001\u0004@@\u0004\u0004\u0001\u0010 \u0002\b\u0010 \u0010\u0002\u0010 \u0010\b\u0010 \u0010\b\u0010 \u0010\b\u0010 \u0010\b\u0010  \b             \u0004                 \u0002\u0001   @  \u0004  @\u0004\u0004\u0004\u0004\u0002\u0001                                                                                                                                                                   ";
        callMethod(klass, "string", argTypes, term3091956, args);
        assertTrue(recursiveEquals(term3091956, term3300839));
    }

};


