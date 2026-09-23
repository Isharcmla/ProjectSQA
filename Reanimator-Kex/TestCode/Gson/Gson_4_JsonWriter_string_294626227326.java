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

public class JsonWriter_string_294626227326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169773;
     Object term174386;

    public JsonWriter_string_294626227326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169773 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term169811 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term169773, term169773.getClass(), "htmlSafe", true);
        setField(term169773, term169773.getClass(), "out", term169811);
        term174386 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term174387 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term174387, term174387.getClass(), "closed", false);
        setField(term174387, term174387.getClass(), "writeBuffer", null);
        setField(term174387, term174387.getClass(), "lock", null);
        setField(term174386, term174386.getClass(), "out", term174387);
        setField(term174386, term174386.getClass(), "stack", null);
        setIntField(term174386, term174386.getClass(), "stackSize", 0);
        setField(term174386, term174386.getClass(), "indent", null);
        setField(term174386, term174386.getClass(), "separator", null);
        setBooleanField(term174386, term174386.getClass(), "lenient", false);
        setBooleanField(term174386, term174386.getClass(), "htmlSafe", true);
        setField(term174386, term174386.getClass(), "deferredName", null);
        setBooleanField(term174386, term174386.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ";
        callMethod(klass, "string", argTypes, term169773, args);
        assertTrue(recursiveEquals(term169773, term174386));
    }

};


