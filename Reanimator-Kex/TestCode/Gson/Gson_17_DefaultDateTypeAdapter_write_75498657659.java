package com.google.gson;

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
import static com.google.gson.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.gson.EqualityUtils.*;

public class DefaultDateTypeAdapter_write_75498657659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16014;
     Object term16086;
     Object term16878;
     Object term16879;

    public DefaultDateTypeAdapter_write_75498657659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16014 = newInstance(Class.forName("com.google.gson.DefaultDateTypeAdapter"));
        term16086 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term16086, term16086.getClass(), "deferredName", "");
        term16878 = newInstance(Class.forName("com.google.gson.DefaultDateTypeAdapter"));
        setField(term16878, term16878.getClass(), "dateType", null);
        setField(term16878, term16878.getClass(), "enUsFormat", null);
        setField(term16878, term16878.getClass(), "localFormat", null);
        term16879 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term16879, term16879.getClass(), "out", null);
        setField(term16879, term16879.getClass(), "stack", null);
        setIntField(term16879, term16879.getClass(), "stackSize", 0);
        setField(term16879, term16879.getClass(), "indent", null);
        setField(term16879, term16879.getClass(), "separator", null);
        setBooleanField(term16879, term16879.getClass(), "lenient", false);
        setBooleanField(term16879, term16879.getClass(), "htmlSafe", false);
        setField(term16879, term16879.getClass(), "deferredName", null);
        setBooleanField(term16879, term16879.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.DefaultDateTypeAdapter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.gson.stream.JsonWriter");
        argTypes[1] = Class.forName("java.util.Date");
        Object[] args = new Object[2];
        args[0] = term16086;
        args[1] = null;
        callMethod(klass, "write", argTypes, term16014, args);
        assertTrue(recursiveEquals(term16014, term16878));
        assertTrue(recursiveEquals(term16086, term16879));
    }

};


