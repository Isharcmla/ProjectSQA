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

public class JsonWriter_beginObject_450917081307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139545;

    public JsonWriter_beginObject_450917081307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139545 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term139443 = (int[]) newIntArray(0);
        Object term139679 = newInstance(Class.forName("java.io.OutputStreamWriter"));
        setField(term139545, term139545.getClass(), "deferredName", "");
        setIntField(term139545, term139545.getClass(), "stackSize", -2113929216);
        setIntElement(term139443, -2113929217, 3);
        setField(term139545, term139545.getClass(), "stack", term139443);
        setField(term139545, term139545.getClass(), "indent", "");
        setField(term139545, term139545.getClass(), "out", term139679);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "beginObject", argTypes, term139545, args);
    }

};


