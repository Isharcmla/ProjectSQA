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

public class JsonWriter_string_294626227512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term461127;
     Object term629836;

    public JsonWriter_string_294626227512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term461127 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term461165 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term461127, term461127.getClass(), "htmlSafe", true);
        setField(term461127, term461127.getClass(), "out", term461165);
        term629836 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term629837 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term629837, term629837.getClass(), "closed", false);
        setField(term629837, term629837.getClass(), "writeBuffer", null);
        setField(term629837, term629837.getClass(), "lock", null);
        setField(term629836, term629836.getClass(), "out", term629837);
        setField(term629836, term629836.getClass(), "stack", null);
        setIntField(term629836, term629836.getClass(), "stackSize", 0);
        setField(term629836, term629836.getClass(), "indent", null);
        setField(term629836, term629836.getClass(), "separator", null);
        setBooleanField(term629836, term629836.getClass(), "lenient", false);
        setBooleanField(term629836, term629836.getClass(), "htmlSafe", true);
        setField(term629836, term629836.getClass(), "deferredName", null);
        setBooleanField(term629836, term629836.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "@\u0002\u0002\u0010\u0002\b @\u0001\b\u0002 \u0004 \b\u0001\u0001@ \u0004 \u0001\b\u0004\u0010\b\u0010 \u0002\u0004\u0004\u0001\u0010\b                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ";
        callMethod(klass, "string", argTypes, term461127, args);
        assertTrue(recursiveEquals(term461127, term629836));
    }

};


