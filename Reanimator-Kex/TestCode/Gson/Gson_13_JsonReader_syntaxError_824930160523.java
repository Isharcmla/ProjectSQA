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
import java.lang.Object;

public class JsonReader_syntaxError_824930160523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term881717;

    public JsonReader_syntaxError_824930160523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term881717 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term881435 = (int[]) newIntArray(14);
        Object[] term881541 = (Object[]) newArray("java.lang.String", 7);
        setIntField(term881717, term881717.getClass(), "lineNumber", 0);
        setIntField(term881717, term881717.getClass(), "pos", 0);
        setIntField(term881717, term881717.getClass(), "lineStart", 0);
        setIntField(term881717, term881717.getClass(), "stackSize", 7);
        setIntElement(term881435, 0, -752870423);
        setIntElement(term881435, 1, -1698809299);
        setIntElement(term881435, 2, 401512128);
        setIntElement(term881435, 3, -2069930777);
        setIntElement(term881435, 4, 8);
        setIntElement(term881435, 6, 4);
        setField(term881717, term881717.getClass(), "stack", term881435);
        setElement(term881541, 0, "");
        setElement(term881541, 1, " path ");
        setElement(term881541, 2, "");
        setElement(term881541, 3, "");
        setElement(term881541, 4, "");
        setElement(term881541, 5, "");
        setElement(term881541, 6, "");
        setField(term881717, term881717.getClass(), "pathNames", term881541);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "syntaxError", argTypes, term881717, args);
            assertTrue(false);
        }
        catch (MalformedJsonException e) {
        }

    }

};


