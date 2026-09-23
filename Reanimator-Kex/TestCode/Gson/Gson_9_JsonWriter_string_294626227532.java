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

public class JsonWriter_string_294626227532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term739407;
     Object term974080;

    public JsonWriter_string_294626227532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term739407 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term739445 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term739407, term739407.getClass(), "htmlSafe", true);
        setField(term739407, term739407.getClass(), "out", term739445);
        term974080 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term974081 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term974081, term974081.getClass(), "closed", false);
        setField(term974081, term974081.getClass(), "writeBuffer", null);
        setField(term974081, term974081.getClass(), "lock", null);
        setField(term974080, term974080.getClass(), "out", term974081);
        setField(term974080, term974080.getClass(), "stack", null);
        setIntField(term974080, term974080.getClass(), "stackSize", 0);
        setField(term974080, term974080.getClass(), "indent", null);
        setField(term974080, term974080.getClass(), "separator", null);
        setBooleanField(term974080, term974080.getClass(), "lenient", false);
        setBooleanField(term974080, term974080.getClass(), "htmlSafe", true);
        setField(term974080, term974080.getClass(), "deferredName", null);
        setBooleanField(term974080, term974080.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "\b\u0001\u0010\u0004@\u0001\b\u0010\b\u0001\u0002\u0010\u0002\u0010\u0004\u0001\u0001@@\b\u0001 \u0002\u0001\u0001\u0001\u0001\u0001 @\u0010\u0002\u0001\u0001\u0004\u0010\u0004\u0002\u0001\u0002\u0010\u0002  \u0004\u0001\u0002\u0001  \u0010\u0001 \u0010 \u0001\b\b\b\u0010@\u0004\b@\b\u0001\u0004 \b\u0001\b\u0004\b\u0010\b\u0001\u0001\u0002\u0001\u0002\u0002\u0004\u0001\u0004@\b\u0004\u0001 @@@ \u0002\u0010\u0010 @ \u0010 @\u0002@\u0001@@\u0010  \b\u0001\u0010\u0010\u0010\u0010\u0010\u0010\u0004\u0010\u0010\u0010\u0004\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0004\u0010\u0010\u0010@\u0010\u0010\b\u0010\u0010\b\b\u0002\u0002\u0002\u0002\u0004\u0001\u0004\u0004\u0002\u0002\u0001\u0004\u0010\u0002\u0002                                                                  ";
        callMethod(klass, "string", argTypes, term739407, args);
        assertTrue(recursiveEquals(term739407, term974080));
    }

};


