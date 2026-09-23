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

public class JsonReader_isLiteral_1444957880611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288424;

    public JsonReader_isLiteral_1444957880611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288424 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setBooleanField(term288424, term288424.getClass(), "lenient", false);
        setIntField(term288424, term288424.getClass(), "lineNumber", 0);
        setIntField(term288424, term288424.getClass(), "pos", 0);
        setIntField(term288424, term288424.getClass(), "lineStart", 0);
        setIntField(term288424, term288424.getClass(), "stackSize", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 35;
        callMethod(klass, "isLiteral", argTypes, term288424, args);
    }

};


