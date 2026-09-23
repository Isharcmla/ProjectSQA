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

public class JsonReader_isLiteral_1444957880393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140514;

    public JsonReader_isLiteral_1444957880393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140514 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setBooleanField(term140514, term140514.getClass(), "lenient", false);
        setIntField(term140514, term140514.getClass(), "lineNumber", 0);
        setIntField(term140514, term140514.getClass(), "pos", 0);
        setIntField(term140514, term140514.getClass(), "lineStart", 0);
        setIntField(term140514, term140514.getClass(), "stackSize", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 61;
        try {
            callMethod(klass, "isLiteral", argTypes, term140514, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


