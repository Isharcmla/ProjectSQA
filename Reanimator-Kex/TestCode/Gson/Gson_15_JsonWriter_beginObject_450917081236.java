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

public class JsonWriter_beginObject_450917081236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86475;

    public JsonWriter_beginObject_450917081236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86475 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term85670 = (int[]) newIntArray(346);
        Object term86611 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter$1"));
        setField(term86475, term86475.getClass(), "deferredName", "");
        setIntField(term86475, term86475.getClass(), "stackSize", -2080374784);
        setIntElement(term85670, -2080374785, 3);
        setField(term86475, term86475.getClass(), "stack", term85670);
        setField(term86475, term86475.getClass(), "indent", null);
        setBooleanField(term86475, term86475.getClass(), "htmlSafe", false);
        setField(term86475, term86475.getClass(), "out", term86611);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "beginObject", argTypes, term86475, args);
    }

};


