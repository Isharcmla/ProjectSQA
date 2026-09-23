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

public class JsonWriter_string_294626227515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term627215;
     Object term911554;

    public JsonWriter_string_294626227515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term627215 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term627253 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term627215, term627215.getClass(), "htmlSafe", true);
        setField(term627215, term627215.getClass(), "out", term627253);
        term911554 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term911555 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term911555, term911555.getClass(), "closed", false);
        setField(term911555, term911555.getClass(), "writeBuffer", null);
        setField(term911555, term911555.getClass(), "lock", null);
        setField(term911554, term911554.getClass(), "out", term911555);
        setField(term911554, term911554.getClass(), "stack", null);
        setIntField(term911554, term911554.getClass(), "stackSize", 0);
        setField(term911554, term911554.getClass(), "indent", null);
        setField(term911554, term911554.getClass(), "separator", null);
        setBooleanField(term911554, term911554.getClass(), "lenient", false);
        setBooleanField(term911554, term911554.getClass(), "htmlSafe", true);
        setField(term911554, term911554.getClass(), "deferredName", null);
        setBooleanField(term911554, term911554.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "\b\u0004@\u0001\u0010  \u0010\u0001\b \u0001\b@\b\b@@@\b\u0002@\u0002\u0010@\u0004@\u0010\u0004\u0001 \u0010@\u0010@\b \u0002\u0010@\u0010\u0001 \u0010\u0002\b\u0004\u0001\b \u0001\u0001\b\b\u0010@\b\u0004\u0004\u0001\u0001\b\u0004\b\b\u0010\b\u0010\u0010\u0004\u0001@\b\b\u0004\u0010\u0010\u0001\u0004\b\u0001\u0004\u0002@\u0004\u0010\u0004  \b\u0004\u0002\u0010@  \u0001\u0001@\b\u0010\u0002\b\u0004\u0004\u0002\u0002\u0002\u0002\u0002\u0002\u0001\u0001 \u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0002\u0004\u0004\b@\u0004\u0004 \u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0010\b\u0010\u0010\u0004\u0004\u0004\u0004\u0001\u0004@\u0004 \u0004 \u0004\u0010\u0002\b\b\b\u0004\u0004\u0004\u0004@\u0004@\u0004 \u0002\u0002\u0002\b\b\b\u0004\u0004\b \u0004\u0010\u0010\u0010\u0010\u0010\b\u0010\b\b\u0010\b@\u0002\u0010\u0010\u0010 \u0010\u0010\u0010\u0004 \u0010\b \u0002\u0010\u0010\u0002\b\u0002\u0002\u0010 @\u0001\u0010\b \u0010\u0010  \b\u0002  \u0002@\u0002\b\u0004\u0001\u0004\u0010\u0004   \u0002\u0002\b\b\u0004\u0004\b\u0004\b\u0004@\u0004\u0001\u0010 \u0001\u0002\u0002\u0002\u0010\u0004\b\u0004\u0010\u0004\u0001\u0002\b\b\u0002\u0002\u0002\u0004\u0004\u0002\u0010@\u0004@\u0002 \b\b\b\u0004               \u0010@@  \u0010\u0010\u0010\b\b\b\b\u0001\u0004\u0004\u0004@\b\b\u0004\b\b\u0004\u0004@\u0010\u0010\u0010\u0010                                                                                                                                                    ";
        callMethod(klass, "string", argTypes, term627215, args);
        assertTrue(recursiveEquals(term627215, term911554));
    }

};


