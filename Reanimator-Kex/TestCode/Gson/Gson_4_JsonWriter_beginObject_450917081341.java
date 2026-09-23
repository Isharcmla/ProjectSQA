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

public class JsonWriter_beginObject_450917081341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194365;

    public JsonWriter_beginObject_450917081341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194365 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term193560 = (int[]) newIntArray(346);
        Object term194441 = newInstance(Class.forName("java.io.Writer$1"));
        setField(term194365, term194365.getClass(), "deferredName", "");
        setIntField(term194365, term194365.getClass(), "stackSize", -2080374784);
        setIntElement(term193560, -2080374785, 3);
        setField(term194365, term194365.getClass(), "stack", term193560);
        setField(term194365, term194365.getClass(), "indent", null);
        setBooleanField(term194365, term194365.getClass(), "htmlSafe", true);
        setField(term194365, term194365.getClass(), "out", term194441);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "beginObject", argTypes, term194365, args);
    }

};


