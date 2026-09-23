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
import java.lang.Object;

public class JsonReader_nextNonWhitespace_1315382714596 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267627;

    public JsonReader_nextNonWhitespace_1315382714596() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term267627 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term267524 = (char[]) newCharArray(0);
        Object term267665 = newInstance(Class.forName("java.io.Reader$1"));
        setField(term267627, term267627.getClass(), "buffer", term267524);
        setIntField(term267627, term267627.getClass(), "pos", 0);
        setIntField(term267627, term267627.getClass(), "limit", 0);
        setIntField(term267627, term267627.getClass(), "lineStart", 0);
        setField(term267627, term267627.getClass(), "in", term267665);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        callMethod(klass, "nextNonWhitespace", argTypes, term267627, args);
    }

};


