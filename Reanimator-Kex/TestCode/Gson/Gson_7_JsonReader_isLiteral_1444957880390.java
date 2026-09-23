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

public class JsonReader_isLiteral_1444957880390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138683;
     Object term139027;

    public JsonReader_isLiteral_1444957880390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138683 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setBooleanField(term138683, term138683.getClass(), "lenient", true);
        term139027 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setField(term139027, term139027.getClass(), "in", null);
        setBooleanField(term139027, term139027.getClass(), "lenient", true);
        setField(term139027, term139027.getClass(), "buffer", null);
        setIntField(term139027, term139027.getClass(), "pos", 0);
        setIntField(term139027, term139027.getClass(), "limit", 0);
        setIntField(term139027, term139027.getClass(), "lineNumber", 0);
        setIntField(term139027, term139027.getClass(), "lineStart", 0);
        setIntField(term139027, term139027.getClass(), "peeked", 0);
        setLongField(term139027, term139027.getClass(), "peekedLong", 0L);
        setIntField(term139027, term139027.getClass(), "peekedNumberLength", 0);
        setField(term139027, term139027.getClass(), "peekedString", null);
        setField(term139027, term139027.getClass(), "stack", null);
        setIntField(term139027, term139027.getClass(), "stackSize", 0);
        setField(term139027, term139027.getClass(), "pathNames", null);
        setField(term139027, term139027.getClass(), "pathIndices", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 92;
        Object retValue = callMethod(klass, "isLiteral", argTypes, term138683, args);
        assertTrue(recursiveEquals(term138683, term139027));
        assertTrue(recursiveEquals(retValue, false));
    }

};


