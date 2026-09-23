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

public class JsonReader_fillBuffer_136745690624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term308776;

    public JsonReader_fillBuffer_136745690624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term308776 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term308677 = (char[]) newCharArray(0);
        Object term308834 = newInstance(Class.forName("java.io.Console$LineReader"));
        setField(term308776, term308776.getClass(), "buffer", term308677);
        setIntField(term308776, term308776.getClass(), "lineStart", 0);
        setIntField(term308776, term308776.getClass(), "pos", 0);
        setIntField(term308776, term308776.getClass(), "limit", 0);
        setField(term308776, term308776.getClass(), "in", term308834);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        callMethod(klass, "fillBuffer", argTypes, term308776, args);
    }

};


