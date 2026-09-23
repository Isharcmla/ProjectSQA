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

public class JsonWriter_string_294626227535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term969633;
     Object term1289095;

    public JsonWriter_string_294626227535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term969633 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term969671 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term969633, term969633.getClass(), "htmlSafe", true);
        setField(term969633, term969633.getClass(), "out", term969671);
        term1289095 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1289096 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1289096, term1289096.getClass(), "closed", false);
        setField(term1289096, term1289096.getClass(), "writeBuffer", null);
        setField(term1289096, term1289096.getClass(), "lock", null);
        setField(term1289095, term1289095.getClass(), "out", term1289096);
        setField(term1289095, term1289095.getClass(), "stack", null);
        setIntField(term1289095, term1289095.getClass(), "stackSize", 0);
        setField(term1289095, term1289095.getClass(), "indent", null);
        setField(term1289095, term1289095.getClass(), "separator", null);
        setBooleanField(term1289095, term1289095.getClass(), "lenient", false);
        setBooleanField(term1289095, term1289095.getClass(), "htmlSafe", true);
        setField(term1289095, term1289095.getClass(), "deferredName", null);
        setBooleanField(term1289095, term1289095.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ";
        callMethod(klass, "string", argTypes, term969633, args);
        assertTrue(recursiveEquals(term969633, term1289095));
    }

};


