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

public class JsonWriter_writeDeferredName_2035940590403 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210735;

    public JsonWriter_writeDeferredName_2035940590403() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210735 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term210633 = (int[]) newIntArray(0);
        Object term210861 = newInstance(Class.forName("java.io.BufferedWriter"));
        setField(term210735, term210735.getClass(), "deferredName", "");
        setIntField(term210735, term210735.getClass(), "stackSize", -2113929216);
        setIntElement(term210633, -2113929217, 3);
        setField(term210735, term210735.getClass(), "stack", term210633);
        setField(term210735, term210735.getClass(), "indent", "");
        setField(term210735, term210735.getClass(), "out", term210861);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "writeDeferredName", argTypes, term210735, args);
    }

};


