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
import com.google.gson.stream.MalformedJsonException;
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JsonReader_syntaxError_824930160304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term254189;

    public JsonReader_syntaxError_824930160304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term254189 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term253075 = (int[]) newIntArray(490);
        setIntField(term254189, term254189.getClass(), "lineNumber", 0);
        setIntField(term254189, term254189.getClass(), "pos", 0);
        setIntField(term254189, term254189.getClass(), "lineStart", 0);
        setIntField(term254189, term254189.getClass(), "stackSize", 2);
        setIntElement(term253075, 0, -752870423);
        setIntElement(term253075, 1, 6);
        setField(term254189, term254189.getClass(), "stack", term253075);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "syntaxError", argTypes, term254189, args);
            assertTrue(false);
        }
        catch (MalformedJsonException e) {
        }

    }

};


