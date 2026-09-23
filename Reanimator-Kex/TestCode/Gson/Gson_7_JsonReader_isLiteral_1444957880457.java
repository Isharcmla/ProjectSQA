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
import java.lang.NullPointerException;
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JsonReader_isLiteral_1444957880457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174637;

    public JsonReader_isLiteral_1444957880457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174637 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setBooleanField(term174637, term174637.getClass(), "lenient", false);
        setIntField(term174637, term174637.getClass(), "lineNumber", 0);
        setIntField(term174637, term174637.getClass(), "pos", 0);
        setIntField(term174637, term174637.getClass(), "lineStart", 0);
        setIntField(term174637, term174637.getClass(), "stackSize", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 59;
        try {
            callMethod(klass, "isLiteral", argTypes, term174637, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


