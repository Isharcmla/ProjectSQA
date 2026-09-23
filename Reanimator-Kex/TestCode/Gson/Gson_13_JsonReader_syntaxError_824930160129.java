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

public class JsonReader_syntaxError_824930160129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45996;

    public JsonReader_syntaxError_824930160129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45996 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term43366 = (int[]) newIntArray(495);
        setIntField(term45996, term45996.getClass(), "lineNumber", 0);
        setIntField(term45996, term45996.getClass(), "pos", 0);
        setIntField(term45996, term45996.getClass(), "lineStart", 0);
        setIntField(term45996, term45996.getClass(), "stackSize", 7);
        setIntElement(term43366, 0, -752870423);
        setIntElement(term43366, 1, -1698809299);
        setIntElement(term43366, 2, 401512128);
        setIntElement(term43366, 3, -2069930777);
        setIntElement(term43366, 4, 8);
        setField(term45996, term45996.getClass(), "stack", term43366);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "syntaxError", argTypes, term45996, args);
            assertTrue(false);
        }
        catch (MalformedJsonException e) {
        }

    }

};


