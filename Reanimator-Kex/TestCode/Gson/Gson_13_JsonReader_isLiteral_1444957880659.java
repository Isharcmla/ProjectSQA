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

public class JsonReader_isLiteral_1444957880659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1228672;
     Object term1228686;

    public JsonReader_isLiteral_1444957880659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1228672 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setBooleanField(term1228672, term1228672.getClass(), "lenient", true);
        term1228686 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setField(term1228686, term1228686.getClass(), "in", null);
        setBooleanField(term1228686, term1228686.getClass(), "lenient", true);
        setField(term1228686, term1228686.getClass(), "buffer", null);
        setIntField(term1228686, term1228686.getClass(), "pos", 0);
        setIntField(term1228686, term1228686.getClass(), "limit", 0);
        setIntField(term1228686, term1228686.getClass(), "lineNumber", 0);
        setIntField(term1228686, term1228686.getClass(), "lineStart", 0);
        setIntField(term1228686, term1228686.getClass(), "peeked", 0);
        setLongField(term1228686, term1228686.getClass(), "peekedLong", 0L);
        setIntField(term1228686, term1228686.getClass(), "peekedNumberLength", 0);
        setField(term1228686, term1228686.getClass(), "peekedString", null);
        setField(term1228686, term1228686.getClass(), "stack", null);
        setIntField(term1228686, term1228686.getClass(), "stackSize", 0);
        setField(term1228686, term1228686.getClass(), "pathNames", null);
        setField(term1228686, term1228686.getClass(), "pathIndices", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 59;
        Object retValue = callMethod(klass, "isLiteral", argTypes, term1228672, args);
        assertTrue(recursiveEquals(term1228672, term1228686));
        assertTrue(recursiveEquals(retValue, false));
    }

};


