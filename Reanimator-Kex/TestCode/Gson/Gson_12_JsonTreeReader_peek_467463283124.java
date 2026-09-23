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

public class JsonTreeReader_peek_467463283124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27876;

    public JsonTreeReader_peek_467463283124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27876 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term27768 = (Object[]) newArray("java.lang.Object", 489);
        setIntField(term27876, term27876.getClass(), "stackSize", -1);
        setField(term27876, term27876.getClass(), "stack", term27768);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "peek", argTypes, term27876, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


