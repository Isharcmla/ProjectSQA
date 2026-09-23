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

public class JsonWriter_newline_1238389959359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169190;
     Object term169278;

    public JsonWriter_newline_1238389959359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169190 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term169266 = newInstance(Class.forName("java.io.Writer$1"));
        setField(term169190, term169190.getClass(), "indent", "");
        setField(term169190, term169190.getClass(), "out", term169266);
        term169278 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term169279 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term169279, term169279.getClass(), "closed", false);
        setField(term169279, term169279.getClass(), "writeBuffer", null);
        setField(term169279, term169279.getClass(), "lock", null);
        setField(term169278, term169278.getClass(), "out", term169279);
        setField(term169278, term169278.getClass(), "stack", null);
        setIntField(term169278, term169278.getClass(), "stackSize", 0);
        setField(term169278, term169278.getClass(), "indent", "");
        setField(term169278, term169278.getClass(), "separator", null);
        setBooleanField(term169278, term169278.getClass(), "lenient", false);
        setBooleanField(term169278, term169278.getClass(), "htmlSafe", false);
        setField(term169278, term169278.getClass(), "deferredName", null);
        setBooleanField(term169278, term169278.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "newline", argTypes, term169190, args);
        assertTrue(recursiveEquals(term169190, term169278));
    }

};


