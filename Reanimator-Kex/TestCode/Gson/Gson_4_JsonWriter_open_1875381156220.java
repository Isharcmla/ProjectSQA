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

public class JsonWriter_open_1875381156220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87151;

    public JsonWriter_open_1875381156220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87151 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term85069 = (int[]) newIntArray(245);
        Object term87195 = newInstance(Class.forName("java.io.PrintWriter"));
        setIntField(term87151, term87151.getClass(), "stackSize", 245);
        setIntElement(term85069, 244, 6);
        setField(term87151, term87151.getClass(), "stack", term85069);
        setBooleanField(term87151, term87151.getClass(), "lenient", false);
        setField(term87151, term87151.getClass(), "out", term87195);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = null;
        try {
            callMethod(klass, "open", argTypes, term87151, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


