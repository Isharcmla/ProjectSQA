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

public class JsonWriter_string_294626227414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2320720;
     Object term2687170;

    public JsonWriter_string_294626227414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2320720 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term2320758 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term2320720, term2320720.getClass(), "htmlSafe", true);
        setField(term2320720, term2320720.getClass(), "out", term2320758);
        term2687170 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term2687171 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term2687171, term2687171.getClass(), "closed", false);
        setField(term2687171, term2687171.getClass(), "writeBuffer", null);
        setField(term2687171, term2687171.getClass(), "lock", null);
        setField(term2687170, term2687170.getClass(), "out", term2687171);
        setField(term2687170, term2687170.getClass(), "stack", null);
        setIntField(term2687170, term2687170.getClass(), "stackSize", 0);
        setField(term2687170, term2687170.getClass(), "indent", null);
        setField(term2687170, term2687170.getClass(), "separator", null);
        setBooleanField(term2687170, term2687170.getClass(), "lenient", false);
        setBooleanField(term2687170, term2687170.getClass(), "htmlSafe", true);
        setField(term2687170, term2687170.getClass(), "deferredName", null);
        setBooleanField(term2687170, term2687170.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "\u0002\u0010\u0010 @ \u0002\u0001\b@\u0004 \u0004\u0004 \u0004 \u0004\u0004@\u0001\u0004@\b\u0004@\u0002\u0004 \u0004`\u0010\u0002 \u0004\u0004\u0010\u0002\u0001\u0002@\u0010\u0001\u0010\u0010\u0010\u0001@\b\b\u0004\u0001@@\b\u0002\u0001\"@\u0010\u0003\u0010\u0001  \b\u0002\u0010\u0004\u0002\u0001  @\u0002\u0001\u0001@\u0001\u0001\u0010\u0001\u0004\u0002  \u0002\b\b \b\u0002 \u0001\u0004\u0004\u0010\u0010@\u0001\u0004\u0002P\u0004\u0010@ \u0001\u0010\u0004\b@\u0004\u0004\u0004@@\u0001\u0001\u0002@ \u0002\u0001 @ \b \b\u0001\u0002\u0001\u0010\u0001\u0010\b\b\u0010\u0004\u0002\u0002\u0002\u0002\u0010\u0004\u0002\u0002\u0001\u0002\u0002\u0010 \u0004\u0001\u0010\b\u0004\u0001\u0001\u0001\u0004\u0001 \u0010@\u0010\u0001\u0002\u0001\u0004\u0004\u0002\u0002\u0002\u0010\b\u0004@\u0002\u0001@\b\b\u0004\u0004\u0004\u0004\b@\b\u0001\u0002\u0001\u0004\b\u0001\u0001\u0010\u0002@\u0004\u0010\b\u0002 @ @\u0002\b\u0002\u0002\u0001 \u0004\b\b\u0001\u0002\b\u0010\u0004   @\b\b @@\u0001\u0001@\b\u0010\u0010\u0010\u0010\b\u0001  \u0001\u0001\u0010\u0004\u0004\b\u0010\u0010\u0002\u0001\u0001 \u0001\u0002\u0004\u0004@\u0001\u0010\u0004\b\u0004 @\u0001 @\u0010\u0010\b \u0001@\u0001\u0002\u0002\u0001\b \u0010\u0002\u0001  \u0010\u0004@@\u0010\b  \u0004\b@\u0002 \u0010\u0002\u0004\u0001\u0004\u0002\u0004\u0002\u0004\b                                                                                                                                                                                                 ";
        callMethod(klass, "string", argTypes, term2320720, args);
        assertTrue(recursiveEquals(term2320720, term2687170));
    }

};


