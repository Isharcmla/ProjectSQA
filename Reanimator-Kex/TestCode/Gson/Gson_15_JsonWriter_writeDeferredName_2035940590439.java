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

public class JsonWriter_writeDeferredName_2035940590439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233164;

    public JsonWriter_writeDeferredName_2035940590439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233164 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term233049 = (int[]) newIntArray(9);
        Object term233306 = newInstance(Class.forName("com.google.gson.internal.Streams$AppendableWriter"));
        Object term233356 = newInstance(Class.forName("java.io.BufferedWriter"));
        setField(term233164, term233164.getClass(), "deferredName", "");
        setIntField(term233164, term233164.getClass(), "stackSize", -536870912);
        setIntElement(term233049, 0, 5);
        setIntElement(term233049, 1, 5);
        setIntElement(term233049, 2, 5);
        setIntElement(term233049, 3, 5);
        setIntElement(term233049, 4, 5);
        setIntElement(term233049, 5, 5);
        setIntElement(term233049, 6, 5);
        setIntElement(term233049, 7, 5);
        setIntElement(term233049, 8, 5);
        setIntElement(term233049, -536870913, 5);
        setField(term233164, term233164.getClass(), "stack", term233049);
        setField(term233306, term233306.getClass(), "appendable", term233356);
        setField(term233164, term233164.getClass(), "out", term233306);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "writeDeferredName", argTypes, term233164, args);
    }

};


