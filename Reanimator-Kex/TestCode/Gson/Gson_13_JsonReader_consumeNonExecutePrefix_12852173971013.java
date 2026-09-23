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

public class JsonReader_consumeNonExecutePrefix_12852173971013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1433806;

    public JsonReader_consumeNonExecutePrefix_12852173971013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1433806 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term1433703 = (char[]) newCharArray(0);
        Object term1433844 = newInstance(Class.forName("java.io.Reader$1"));
        setField(term1433806, term1433806.getClass(), "buffer", term1433703);
        setIntField(term1433806, term1433806.getClass(), "pos", 0);
        setIntField(term1433806, term1433806.getClass(), "limit", 0);
        setIntField(term1433806, term1433806.getClass(), "lineStart", 0);
        setField(term1433806, term1433806.getClass(), "in", term1433844);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "consumeNonExecutePrefix", argTypes, term1433806, args);
    }

};


