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

public class JsonReader_nextInt_677611555618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term299536;

    public JsonReader_nextInt_677611555618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term299536 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term299331 = (int[]) newIntArray(6);
        setIntField(term299536, term299536.getClass(), "peeked", 10);
        setIntField(term299536, term299536.getClass(), "lineNumber", 0);
        setIntField(term299536, term299536.getClass(), "pos", 0);
        setIntField(term299536, term299536.getClass(), "lineStart", 0);
        setIntField(term299536, term299536.getClass(), "stackSize", 1);
        setIntElement(term299331, 0, 6);
        setField(term299536, term299536.getClass(), "stack", term299331);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextInt", argTypes, term299536, args);
    }

};


