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

public class JsonReader_isLiteral_1444957880172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52589;
     Object term53221;

    public JsonReader_isLiteral_1444957880172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52589 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        term53221 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setField(term53221, term53221.getClass(), "in", null);
        setBooleanField(term53221, term53221.getClass(), "lenient", false);
        setField(term53221, term53221.getClass(), "buffer", null);
        setIntField(term53221, term53221.getClass(), "pos", 0);
        setIntField(term53221, term53221.getClass(), "limit", 0);
        setIntField(term53221, term53221.getClass(), "lineNumber", 0);
        setIntField(term53221, term53221.getClass(), "lineStart", 0);
        setIntField(term53221, term53221.getClass(), "peeked", 0);
        setLongField(term53221, term53221.getClass(), "peekedLong", 0L);
        setIntField(term53221, term53221.getClass(), "peekedNumberLength", 0);
        setField(term53221, term53221.getClass(), "peekedString", null);
        setField(term53221, term53221.getClass(), "stack", null);
        setIntField(term53221, term53221.getClass(), "stackSize", 0);
        setField(term53221, term53221.getClass(), "pathNames", null);
        setField(term53221, term53221.getClass(), "pathIndices", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 58;
        Object retValue = callMethod(klass, "isLiteral", argTypes, term52589, args);
        assertTrue(recursiveEquals(term52589, term53221));
        assertTrue(recursiveEquals(retValue, false));
    }

};


