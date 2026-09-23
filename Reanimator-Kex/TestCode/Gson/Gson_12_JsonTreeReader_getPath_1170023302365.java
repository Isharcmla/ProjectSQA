package com.google.gson.internal.bind;

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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.gson.internal.bind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.StringBuilder;

public class JsonTreeReader_getPath_1170023302365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145861;

    public JsonTreeReader_getPath_1170023302365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term146119 = new StringBuilder();
        term145861 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term145051 = (Object[]) newArray("java.lang.Object", 494);
        Object term145919 = newInstance(Class.forName("com.google.gson.JsonObject"));
        char[] term144551 = (char[]) newCharArray(497);
        Object term145977 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term146059 = newInstance(Class.forName("java.util.zip.ZipFile$ZipEntryIterator"));
        Object term146175 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term146213 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term145861, term145861.getClass(), "stackSize", 32774);
        setElement(term145051, 0, term145919);
        setElement(term145051, 1, term144551);
        setElement(term145051, 2, term145977);
        setElement(term145051, 4, term146059);
        setElement(term145051, 5, term146119);
        setElement(term145051, 7, term146175);
        setElement(term145051, 256, term146213);
        setField(term145861, term145861.getClass(), "stack", term145051);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getPath", argTypes, term145861, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


