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

public class JsonReader_nextInt_677611555636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term361361;

    public JsonReader_nextInt_677611555636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term361361 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setIntField(term361361, term361361.getClass(), "peeked", 15);
        setLongField(term361361, term361361.getClass(), "peekedLong", -9223372034707292160L);
        setIntField(term361361, term361361.getClass(), "lineNumber", 0);
        setIntField(term361361, term361361.getClass(), "pos", 0);
        setIntField(term361361, term361361.getClass(), "lineStart", 0);
        setIntField(term361361, term361361.getClass(), "stackSize", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextInt", argTypes, term361361, args);
    }

};


