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

public class JsonWriter_endObject_1591364441224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79774;

    public JsonWriter_endObject_1591364441224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79774 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term79673 = (int[]) newIntArray(0);
        Object term79818 = newInstance(Class.forName("java.io.PipedWriter"));
        setIntField(term79774, term79774.getClass(), "stackSize", -1965344904);
        setIntElement(term79673, -1965344905, 3);
        setField(term79774, term79774.getClass(), "stack", term79673);
        setField(term79774, term79774.getClass(), "deferredName", null);
        setField(term79774, term79774.getClass(), "out", term79818);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "endObject", argTypes, term79774, args);
    }

};


