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

public class JsonReader_skipTo_118842840628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term351494;

    public JsonReader_skipTo_118842840628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term351494 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term351386 = (char[]) newCharArray(0);
        Object term351532 = newInstance(Class.forName("java.io.Reader$1"));
        setIntField(term351494, term351494.getClass(), "pos", 1026);
        setIntField(term351494, term351494.getClass(), "limit", 1026);
        setField(term351494, term351494.getClass(), "buffer", term351386);
        setIntField(term351494, term351494.getClass(), "lineStart", 0);
        setField(term351494, term351494.getClass(), "in", term351532);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = " ";
        callMethod(klass, "skipTo", argTypes, term351494, args);
    }

};


