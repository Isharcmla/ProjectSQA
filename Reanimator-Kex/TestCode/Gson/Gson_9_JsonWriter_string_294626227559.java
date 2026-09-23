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

public class JsonWriter_string_294626227559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2597410;
     Object term2903991;

    public JsonWriter_string_294626227559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2597410 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term2597448 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term2597410, term2597410.getClass(), "htmlSafe", true);
        setField(term2597410, term2597410.getClass(), "out", term2597448);
        term2903991 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term2903992 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term2903992, term2903992.getClass(), "closed", false);
        setField(term2903992, term2903992.getClass(), "writeBuffer", null);
        setField(term2903992, term2903992.getClass(), "lock", null);
        setField(term2903991, term2903991.getClass(), "out", term2903992);
        setField(term2903991, term2903991.getClass(), "stack", null);
        setIntField(term2903991, term2903991.getClass(), "stackSize", 0);
        setField(term2903991, term2903991.getClass(), "indent", null);
        setField(term2903991, term2903991.getClass(), "separator", null);
        setBooleanField(term2903991, term2903991.getClass(), "lenient", false);
        setBooleanField(term2903991, term2903991.getClass(), "htmlSafe", true);
        setField(term2903991, term2903991.getClass(), "deferredName", null);
        setBooleanField(term2903991, term2903991.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "\u0010\u0002\u0001\u0010\u0001\u0002\b\u0001\b\u0004\u0010\u0010@\u0004\b @@\u0002\u0001\u0004@@ \u0010\b\u0002\u0004\u0002\b\u0002\u0004\u0002\u0004 @@\u0010@\u0001\u0010\u0001\u0001@ \u0002 \u0002@\b\b\u0001\u0004\u0004\u0004\u0002\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004 \u0001\u0002@\u0001\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0010\b\u0004\b\u0004@\u0004\u0002\u0004\u0001\u0004@\u0004 \u0004\u0010\u0010\b\b\b\u0004\u0004\u0002\u0002 \u0002 \u0002\u0010\u0004\b\b\b\u0002\u0002\u0002\b@\u0002@\b \u0002\u0010\u0004\u0010\b\b\b\b\b\b\b\b\b\b\b\b\b\u0004@\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\b                                                                                    ";
        callMethod(klass, "string", argTypes, term2597410, args);
        assertTrue(recursiveEquals(term2597410, term2903991));
    }

};


