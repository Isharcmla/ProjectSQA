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

public class JsonWriter_writeDeferredName_2035940590321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153556;

    public JsonWriter_writeDeferredName_2035940590321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153556 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term152751 = (int[]) newIntArray(346);
        Object term153638 = newInstance(Class.forName("java.io.PrintWriter"));
        setField(term153556, term153556.getClass(), "deferredName", "");
        setIntField(term153556, term153556.getClass(), "stackSize", -2080374784);
        setIntElement(term152751, -2080374785, 3);
        setField(term153556, term153556.getClass(), "stack", term152751);
        setField(term153556, term153556.getClass(), "indent", null);
        setBooleanField(term153556, term153556.getClass(), "htmlSafe", false);
        setField(term153556, term153556.getClass(), "out", term153638);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "writeDeferredName", argTypes, term153556, args);
    }

};


