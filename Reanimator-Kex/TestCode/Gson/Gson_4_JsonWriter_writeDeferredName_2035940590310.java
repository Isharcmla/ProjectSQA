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

public class JsonWriter_writeDeferredName_2035940590310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157767;

    public JsonWriter_writeDeferredName_2035940590310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157767 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term157665 = (int[]) newIntArray(0);
        Object term157895 = newInstance(Class.forName("java.io.CharArrayWriter"));
        setField(term157767, term157767.getClass(), "deferredName", "");
        setIntField(term157767, term157767.getClass(), "stackSize", -2113929216);
        setIntElement(term157665, -2113929217, 3);
        setField(term157767, term157767.getClass(), "stack", term157665);
        setField(term157767, term157767.getClass(), "indent", "");
        setField(term157767, term157767.getClass(), "out", term157895);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "writeDeferredName", argTypes, term157767, args);
    }

};


