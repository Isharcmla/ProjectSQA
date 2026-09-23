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

public class JsonReader_nextName_1087370652527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215332;

    public JsonReader_nextName_1087370652527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term215332 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term215087 = (int[]) newIntArray(48);
        setIntField(term215332, term215332.getClass(), "peeked", 17);
        setIntField(term215332, term215332.getClass(), "lineNumber", 0);
        setIntField(term215332, term215332.getClass(), "pos", 0);
        setIntField(term215332, term215332.getClass(), "lineStart", 0);
        setIntField(term215332, term215332.getClass(), "stackSize", 1);
        setIntElement(term215087, 0, 110);
        setIntElement(term215087, 1, 117);
        setIntElement(term215087, 2, 108);
        setIntElement(term215087, 3, 108);
        setField(term215332, term215332.getClass(), "stack", term215087);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextName", argTypes, term215332, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


