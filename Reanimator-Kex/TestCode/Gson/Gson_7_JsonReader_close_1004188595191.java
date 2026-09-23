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
import java.lang.NullPointerException;
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JsonReader_close_1004188595191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61557;

    public JsonReader_close_1004188595191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61557 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term61213 = (int[]) newIntArray(256);
        Object term61599 = newInstance(Class.forName("java.io.FileReader"));
        setIntField(term61557, term61557.getClass(), "peeked", 0);
        setField(term61557, term61557.getClass(), "stack", term61213);
        setIntField(term61557, term61557.getClass(), "stackSize", 0);
        setField(term61557, term61557.getClass(), "in", term61599);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term61557, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


