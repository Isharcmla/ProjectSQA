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

public class JsonWriter_writeDeferredName_2035940590392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203480;

    public JsonWriter_writeDeferredName_2035940590392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term203480 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term202675 = (int[]) newIntArray(346);
        Object term203568 = newInstance(Class.forName("java.io.BufferedWriter"));
        setField(term203480, term203480.getClass(), "deferredName", "");
        setIntField(term203480, term203480.getClass(), "stackSize", -2080374784);
        setIntElement(term202675, -2080374785, 3);
        setField(term203480, term203480.getClass(), "stack", term202675);
        setField(term203480, term203480.getClass(), "indent", null);
        setBooleanField(term203480, term203480.getClass(), "htmlSafe", true);
        setField(term203480, term203480.getClass(), "out", term203568);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "writeDeferredName", argTypes, term203480, args);
    }

};


