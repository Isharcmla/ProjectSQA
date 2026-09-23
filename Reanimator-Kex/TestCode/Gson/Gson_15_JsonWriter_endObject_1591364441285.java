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

public class JsonWriter_endObject_1591364441285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116140;

    public JsonWriter_endObject_1591364441285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116140 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term116039 = (int[]) newIntArray(0);
        Object term116244 = newInstance(Class.forName("com.google.gson.internal.Streams$AppendableWriter"));
        setIntField(term116140, term116140.getClass(), "stackSize", -1965344904);
        setIntElement(term116039, -1965344905, 5);
        setField(term116140, term116140.getClass(), "stack", term116039);
        setField(term116140, term116140.getClass(), "deferredName", null);
        setField(term116140, term116140.getClass(), "indent", null);
        setField(term116140, term116140.getClass(), "out", term116244);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "endObject", argTypes, term116140, args);
    }

};


