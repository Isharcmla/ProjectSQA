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

public class JsonWriter_beginObject_450917081335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180095;

    public JsonWriter_beginObject_450917081335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180095 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term179993 = (int[]) newIntArray(0);
        Object term180215 = newInstance(Class.forName("java.io.PrintWriter"));
        setField(term180095, term180095.getClass(), "deferredName", "");
        setIntField(term180095, term180095.getClass(), "stackSize", -2113929216);
        setIntElement(term179993, -2113929217, 3);
        setField(term180095, term180095.getClass(), "stack", term179993);
        setField(term180095, term180095.getClass(), "indent", "");
        setField(term180095, term180095.getClass(), "out", term180215);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "beginObject", argTypes, term180095, args);
    }

};


