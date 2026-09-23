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

public class JsonWriter_beginObject_450917081237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93186;

    public JsonWriter_beginObject_450917081237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93186 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term92381 = (int[]) newIntArray(346);
        Object term93328 = newInstance(Class.forName("com.google.gson.internal.Streams$AppendableWriter"));
        setField(term93186, term93186.getClass(), "deferredName", "");
        setIntField(term93186, term93186.getClass(), "stackSize", -2080374784);
        setIntElement(term92381, -2080374785, 3);
        setField(term93186, term93186.getClass(), "stack", term92381);
        setField(term93186, term93186.getClass(), "indent", null);
        setBooleanField(term93186, term93186.getClass(), "htmlSafe", false);
        setField(term93186, term93186.getClass(), "out", term93328);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "beginObject", argTypes, term93186, args);
    }

};


