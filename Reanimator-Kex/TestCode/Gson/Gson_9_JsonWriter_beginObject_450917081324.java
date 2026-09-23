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

public class JsonWriter_beginObject_450917081324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155164;

    public JsonWriter_beginObject_450917081324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155164 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term154359 = (int[]) newIntArray(346);
        Object term155242 = newInstance(Class.forName("java.io.Console$3"));
        setField(term155164, term155164.getClass(), "deferredName", "");
        setIntField(term155164, term155164.getClass(), "stackSize", -2080374784);
        setIntElement(term154359, -2080374785, 3);
        setField(term155164, term155164.getClass(), "stack", term154359);
        setField(term155164, term155164.getClass(), "indent", null);
        setBooleanField(term155164, term155164.getClass(), "htmlSafe", true);
        setField(term155164, term155164.getClass(), "out", term155242);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "beginObject", argTypes, term155164, args);
    }

};


