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

public class JsonWriter_beginObject_450917081322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145961;

    public JsonWriter_beginObject_450917081322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145961 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term145156 = (int[]) newIntArray(346);
        Object term146041 = newInstance(Class.forName("java.io.FileWriter"));
        setField(term145961, term145961.getClass(), "deferredName", "");
        setIntField(term145961, term145961.getClass(), "stackSize", -2080374784);
        setIntElement(term145156, -2080374785, 3);
        setField(term145961, term145961.getClass(), "stack", term145156);
        setField(term145961, term145961.getClass(), "indent", null);
        setBooleanField(term145961, term145961.getClass(), "htmlSafe", true);
        setField(term145961, term145961.getClass(), "out", term146041);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "beginObject", argTypes, term145961, args);
    }

};


